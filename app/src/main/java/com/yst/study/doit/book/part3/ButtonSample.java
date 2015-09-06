package com.yst.study.doit.book.part3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.yst.study.R;

/**
 * Created by Naver on 2015-09-06.
 */
public class ButtonSample extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_part3_buttons);
    }

    public void onClickOpenNaver(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void onClickCalling(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
    }

    public void onClickNewActivity(View v) {
        Intent intent = new Intent(getApplicationContext(), NewActivitySample.class);
        startActivity(intent);
    }
}
