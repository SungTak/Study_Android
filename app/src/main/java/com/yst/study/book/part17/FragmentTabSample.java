package com.yst.study.book.part17;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.yst.study.R;
import com.yst.study.sample.splash.SplashSample;

import java.util.zip.Inflater;

/**
 * v4를 이용하려면 SDK매니저에서 support liberary다운로드
 * build.gradle의 디펜던시에 compile 'com.android.support:appcompat-v7:22.2.1'를 적음
 *
 * Created by Naver on 2015-08-30.
 */
public class FragmentTabSample extends FragmentActivity {
    private TabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tab_layout);

        // 메인 로딩이미지 띄움
        startActivity(new Intent(this, SplashSample.class));

        tabHost = (TabHost)findViewById(android.R.id.tabhost);
        tabHost.setup();

        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(R.layout.frame_main_board, tabHost.getTabContentView(), true);

        ////// String List View
        Intent listViewIntent = new Intent(this, com.yst.study.book.part12.ListViewSample.class);
        listViewIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        tabHost.addTab(tabHost.newTabSpec("tag")
                .setIndicator("normal")
                .setContent(listViewIntent));

        Intent webViewIntent = new Intent(this, com.yst.study.sample.webview.WebViewSample.class);
        webViewIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        tabHost.addTab(tabHost.newTabSpec("tag")
                .setIndicator("normal")
                .setContent(webViewIntent));

        ////// Custom List View
        Intent customListViewIntent = new Intent(this, com.yst.study.book.part12.ListCustomViewSample.class);
        customListViewIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        tabHost.addTab(tabHost.newTabSpec("tag")
                .setIndicator("Custom View")
                .setContent(customListViewIntent));

        /////// Tab Test
        tabHost.addTab(tabHost.newTabSpec("tag")
                .setIndicator("normal")
                .setContent(R.id.first_part_layout));

        tabHost.addTab(tabHost.newTabSpec("tag")
                .setIndicator("complier")
                .setContent(R.id.second_part_layout));

        tabHost.addTab(tabHost.newTabSpec("tag")
                .setIndicator("linker")
                .setContent(R.id.third_part_layout));
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("종료하시겠습니까?")
                .setPositiveButton("종료", closeAppEvent)
                .setNegativeButton("취소", cancelCloseAppEvent)
                .show();
    }

    private DialogInterface.OnClickListener closeAppEvent = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            finish();
        }
    };

    private DialogInterface.OnClickListener cancelCloseAppEvent = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
        }
    };
}
