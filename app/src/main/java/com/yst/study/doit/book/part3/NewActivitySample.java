package com.yst.study.doit.book.part3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yst.study.R;

/**
 * ActionBarAcivity는 Deprecated 안됨 -_- 어이없음...
 * AppCompatAcivity가 대체함
 *
 * Created by Naver on 2015-09-06.
 */
public class NewActivitySample extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doit_part3_new_layout);
    }

    public void onClickClose(View v) {
        Toast.makeText(getApplicationContext(), "정민이는 천재다", Toast.LENGTH_LONG).show();
        finish();
    }
}
