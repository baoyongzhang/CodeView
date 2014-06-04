package com.baoyz.codeview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView webView = (WebView) findViewById(R.id.webview);
		webView.setHorizontalScrollbarOverlay(false);
		webView.setHorizontalFadingEdgeEnabled(false);
		webView.setHorizontalScrollBarEnabled(true);
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true);
		webView.loadUrl("file:///android_asset/template");

	}

	final class InJavaScriptLocalObj {
		public void showSource(String html) {
			System.out.println(html);
		}
	}
}
