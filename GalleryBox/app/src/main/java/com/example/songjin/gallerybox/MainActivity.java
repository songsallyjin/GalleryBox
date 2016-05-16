package com.example.songjin.gallerybox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by songjin on 16-4-5.
 */
public class MainActivity extends Activity {
    //声明TabHost对象
   /** TabHost mTabHost;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintabs);
        TabHost tabHost=(TabHost)findViewById(R.id.tabhost);
        tabHost.setup();
        //取得TabHost对象
        tabHost=getTabHost();

        /**/
        /*为TabHost添加标签*/
        //新建一个newTabSpec(newTabSpec）
        //设置其标签和图标（setIndicator)
        //设置内容(setContent)
      /*  tabHost.addTab(tabHost.newTabSpec("首页")
                .setIndicator("首页 tab", getResources().getDrawable(R.drawable.icon802)));
    }*/
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main_tab_page_layout);
        LinearLayout ll;
        ll=(LinearLayout)findViewById(R.id.main_tab_page);
    }

}
