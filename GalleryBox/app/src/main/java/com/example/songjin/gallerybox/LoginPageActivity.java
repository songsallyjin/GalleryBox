package com.example.songjin.gallerybox;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

/**
 * Created by songjin on 15-11-8.
 */
public class LoginPageActivity extends Activity{

     public void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
         setContentView(R.layout.loginlayout);
         final ImageView img1=(ImageView)findViewById(R.id.imageView1);
         final Bitmap bm= BitmapFactory.decodeResource(getResources(),
                 R.drawable.icon3);
         Bitmap resized=Bitmap.createScaledBitmap(bm, 400, 400, true);
         Bitmap conv_bm=getRoundedRectBitmap(resized, 650);
         img1.setImageBitmap(conv_bm);

         // TODO Auto-generated method stub
     }
    public static Bitmap getRoundedRectBitmap(Bitmap bitmap, int pixels) {
        Bitmap result = null;
        try {
            result = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(result);

            int color = 0xff424242;
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, 600 , 600);

            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(color);
            canvas.drawCircle(200, 200, 200, paint);
            paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);

        } catch (NullPointerException e) {
           throw e;
        } catch (OutOfMemoryError o) {
           throw o;
        }
        return result;
    }

}



