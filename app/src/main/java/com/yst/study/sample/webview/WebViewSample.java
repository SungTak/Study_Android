package com.yst.study.sample.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yst.study.R;

/**
 * Created by Naver on 2015-08-21.
 */
public class WebViewSample extends Activity {
    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceStat) {
        super.onCreate(savedInstanceStat);
        setContentView(R.layout.webview_layout);

        webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.loadData("제목입니다", "text/html", "UTF-8");
        webView.loadUrl("http://m.naver.com");
    }

    /**
     * 뒤로가기 클릭시 뒤페이지로 이동하거나 종료
     */
    @Override
    public void onBackPressed() {
        // 뒤페이지로 이동
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            // 앱 종료
            super.onBackPressed();
        }
    }
}
