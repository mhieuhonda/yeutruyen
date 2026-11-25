package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadListenerProxyApi extends PigeonApiDownloadListener {

    public static class DownloadListenerImpl implements DownloadListener {
        private final DownloadListenerProxyApi api;

        static /* synthetic */ Unit lambda$onDownloadStart$0(Result result) {
            return null;
        }

        public DownloadListenerImpl(DownloadListenerProxyApi downloadListenerProxyApi) {
            this.api = downloadListenerProxyApi;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.DownloadListenerProxyApi$DownloadListenerImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onDownloadStart$1(str, str2, str3, str4, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStart$1(String str, String str2, String str3, String str4, long j) {
            this.api.onDownloadStart(this, str, str2, str3, str4, j, new Function1() { // from class: io.flutter.plugins.webviewflutter.DownloadListenerProxyApi$DownloadListenerImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DownloadListenerProxyApi.DownloadListenerImpl.lambda$onDownloadStart$0((Result) obj);
                }
            });
        }
    }

    public DownloadListenerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    public DownloadListener pigeon_defaultConstructor() {
        return new DownloadListenerImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiDownloadListener
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
