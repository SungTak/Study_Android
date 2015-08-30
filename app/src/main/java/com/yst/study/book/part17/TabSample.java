package com.yst.study.book.part17;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

import com.yst.study.R;

/**
 * Created by Naver on 2015-08-14.
 */
public class TabSample extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TabHost tab = getTabHost();

        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(R.layout.frame_main_board, tab.getTabContentView(), true);

        ////// String List View
        Intent listViewIntent = new Intent(this, com.yst.study.book.part12.ListViewSample.class);
        listViewIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        tab.addTab(tab.newTabSpec("tag")
                .setIndicator("normal")
                .setContent(listViewIntent));

        Intent webViewIntent = new Intent(this, com.yst.study.sample.webview.WebViewSample.class);
        webViewIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        tab.addTab(tab.newTabSpec("tag")
                .setIndicator("normal")
                .setContent(webViewIntent));

        ////// Custom List View
        Intent customListViewIntent = new Intent(this, com.yst.study.book.part12.ListCustomViewSample.class);
        customListViewIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

        tab.addTab(tab.newTabSpec("tag")
                .setIndicator("Custom View")
                .setContent(customListViewIntent));

        /////// Tab Test
        tab.addTab(tab.newTabSpec("tag")
                .setIndicator("normal")
                .setContent(R.id.first_part_layout));

        tab.addTab(tab.newTabSpec("tag")
                .setIndicator("complier")
                .setContent(R.id.second_part_layout));

        tab.addTab(tab.newTabSpec("tag")
            .setIndicator("linker")
            .setContent(R.id.third_part_layout));
    }
}
