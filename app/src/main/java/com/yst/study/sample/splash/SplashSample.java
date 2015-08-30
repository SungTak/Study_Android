package com.yst.study.sample.splash;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import com.yst.study.R;

/**
 * Created by Naver on 2015-08-30.
 */
public class SplashSample extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_loading_layout);

        // 2.5초 뒤에 메인 로딩 이미지를 종료함
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2500);
    }
}
