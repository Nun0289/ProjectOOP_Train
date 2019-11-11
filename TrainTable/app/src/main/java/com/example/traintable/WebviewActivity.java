package com.example.traintable;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewActivity extends Activity {
    private WebView webView;
    @Override
    public void onCreate(Bundle savedInstanceState){
        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        webView = (WebView)findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
