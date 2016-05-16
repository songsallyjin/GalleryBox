package com.example.songjin.gallerybox;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TabHost;

/**
 * Created by songjin on 16-4-5.*/

public class MainPageActivity extends TabActivity{
        public static final String TAG=MainPageActivity.class.getSimpleName();

        private RadioGroup mTabButtonGroup;
        private TabHost mTabHost;

        public static final String TAB_MAIN="MAIN_PAGE_ACTIVITY";
        public static final String TAB_NOTE="NOTE_PAGE_ACTIVITY";
        public static final String TAB_RECOMMENDATION="RECOMMENDATION_PAGE_ACTIVITY";
        public static final String TAB_COFFEE_TIME="COFFEE_TIME_ACTIVITY";

        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_page);
            mTabHost=getTabHost();
            findViewById();
            initView();
        }

        private void findViewById(){

            mTabButtonGroup=(RadioGroup)findViewById(R.id.main_radio);

        }

        private void initView(){


            Intent i_main=new Intent(this,MainActivity.class);
            Intent i_note=new Intent(this,NoteActivity.class);
            Intent i_recommendation=new Intent(this,RecommondationActivity.class);
            Intent i_coffee_time=new Intent(this,CoffeeTimePageActivity.class);

            mTabHost.addTab(mTabHost.newTabSpec(TAB_MAIN)
                    .setContent(i_main));
            mTabHost.addTab(mTabHost.newTabSpec(TAB_NOTE)
                    .setContent(i_note));
            mTabHost.addTab(mTabHost.newTabSpec(TAB_RECOMMENDATION)
                    .setContent(i_recommendation));
            mTabHost.addTab(mTabHost.newTabSpec(TAB_COFFEE_TIME)
                    .setContent(i_coffee_time));

            mTabHost.setCurrentTabByTag(TAB_MAIN);

            mTabButtonGroup
                    .setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                     @Override
                     public void onCheckedChanged(RadioGroup group, int checkedId) {
                           switch (checkedId){
                            case R.id.radio_button0:
                                 mTabHost.setCurrentTabByTag(TAB_MAIN);
                                 break;
                            case R.id.radio_button1:
                                 mTabHost.setCurrentTabByTag(TAB_NOTE);
                                 break;
                            case R.id.radio_button2:
                                 mTabHost.setCurrentTabByTag(TAB_RECOMMENDATION);
                                 break;
                            case R.id.radio_button3:
                                 mTabHost.setCurrentTabByTag(TAB_COFFEE_TIME);
                                 break;

                            default:
                                 break;
                           }
                     }
                    });

        }



 }