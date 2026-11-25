package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import androidx.webkit.WebSettingsCompat;

/* JADX INFO: loaded from: classes3.dex */
public class WebSettingsCompatProxyApi extends PigeonApiWebSettingsCompat {
    public WebSettingsCompatProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat
    public void setPaymentRequestEnabled(WebSettings webSettings, boolean z) {
        WebSettingsCompat.setPaymentRequestEnabled(webSettings, z);
    }
}
