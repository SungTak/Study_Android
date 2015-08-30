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
        webView.loadData("����", "text/html", "UTF-8");
        webView.loadUrl("http://m.naver.com");
    }

    /**
     * �ȵ���̵忡�� �� ��ư Ŭ���� �̺�Ʈ �߻�
     */
    @Override
    public void onBackPressed() {
        // ���信�� �ڷΰ� ���������� �ִٸ�
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            // �ڷΰ� �������� ���ٸ� ���� �ּ�ȭ? ����� �ƴ�
            super.onBackPressed();
        }
    }
}
