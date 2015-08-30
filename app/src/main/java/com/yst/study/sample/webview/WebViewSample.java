package com.yst.study.sample.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
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
        webView.loadData("제목", "text/html", "UTF-8");
        webView.loadUrl("http://m.naver.com");
    }

    /**
     * 안드로이드에서 백 버튼 클릭시 이벤트 발생
     */
    @Override
    public void onBackPressed() {
        // 웹뷰에서 뒤로갈 웹페이지가 있다면
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            // 뒤로갈 페이지가 없다면 앱을 최소화? 종료는 아님
            super.onBackPressed();
        }
    }
}
