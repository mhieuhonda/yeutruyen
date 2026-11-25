package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewFlutterAndroidExternalApi {
    static WebView getWebView(FlutterPlugin.FlutterPluginBinding flutterPluginBinding, long j) {
        return getWebViewFromPlugin((WebViewFlutterPlugin) flutterPluginBinding.getPlugin(WebViewFlutterPlugin.class), j);
    }

    @Deprecated
    static WebView getWebView(FlutterEngine flutterEngine, long j) {
        return getWebViewFromPlugin((WebViewFlutterPlugin) flutterEngine.getPlugins().get(WebViewFlutterPlugin.class), j);
    }

    private static WebView getWebViewFromPlugin(WebViewFlutterPlugin webViewFlutterPlugin, long j) {
        if (webViewFlutterPlugin == null || webViewFlutterPlugin.getInstanceManager() == null) {
            return null;
        }
        Object androidWebkitLibraryPigeonInstanceManager = webViewFlutterPlugin.getInstanceManager().getInstance(j);
        if (androidWebkitLibraryPigeonInstanceManager instanceof WebView) {
            return (WebView) androidWebkitLibraryPigeonInstanceManager;
        }
        return null;
    }
}
