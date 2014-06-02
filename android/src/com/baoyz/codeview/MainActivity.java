package com.baoyz.codeview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
