package com.androidwebviewapp.advait;
	
	import android.content.Intent;
	import android.net.Uri;
	import android.webkit.WebView;
	import android.webkit.WebViewClient;
	
	/**
	* Created by Advait's on 19/5/2015.
	*/
	public class MyAppWebViewClient extends WebViewClient {
	
	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
	if(Uri.parse(url).getHost().endsWith(".androidtechfreakat.blogspot.in")) {
	return false;
	}
	
	Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
	view.getContext().startActivity(intent);
	return true;
	}
	}
