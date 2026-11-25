package io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewClientProxyApi extends PigeonApiWebViewClient {

    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientProxyApi api;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        static /* synthetic */ Unit lambda$doUpdateVisitedHistory$10(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onFormResubmission$14(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onLoadResource$16(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageCommitVisible$18(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageFinished$2(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPageStarted$0(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedClientCertRequest$20(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedError$6(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedHttpAuthRequest$12(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedHttpError$4(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedLoginRequest$22(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onReceivedSslError$24(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onScaleChanged$26(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$shouldOverrideUrlLoading$8(Result result) {
            return null;
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public WebViewClientImpl(WebViewClientProxyApi webViewClientProxyApi) {
            this.api = webViewClientProxyApi;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(final WebView webView, final String str, Bitmap bitmap) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onPageStarted$1(webView, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageStarted$1(WebView webView, String str) {
            this.api.onPageStarted(this, webView, str, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onPageStarted$0((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(final WebView webView, final String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onPageFinished$3(webView, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageFinished$3(WebView webView, String str) {
            this.api.onPageFinished(this, webView, str, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onPageFinished$2((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onReceivedHttpError$5(webView, webResourceRequest, webResourceResponse);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            this.api.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedHttpError$4((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onReceivedError$7(webView, webResourceRequest, webResourceError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.api.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedError$6((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$shouldOverrideUrlLoading$9(webView, webResourceRequest);
                }
            });
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shouldOverrideUrlLoading$9(WebView webView, WebResourceRequest webResourceRequest) {
            this.api.requestLoading(this, webView, webResourceRequest, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$shouldOverrideUrlLoading$8((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$doUpdateVisitedHistory$11(webView, str, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doUpdateVisitedHistory$11(WebView webView, String str, boolean z) {
            this.api.doUpdateVisitedHistory(this, webView, str, z, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$doUpdateVisitedHistory$10((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onReceivedHttpAuthRequest$13(webView, httpAuthHandler, str, str2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedHttpAuthRequest$13(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.api.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedHttpAuthRequest$12((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onFormResubmission$15(webView, message, message2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFormResubmission$15(WebView webView, Message message, Message message2) {
            this.api.onFormResubmission(this, webView, message, message2, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onFormResubmission$14((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(final WebView webView, final String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onLoadResource$17(webView, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadResource$17(WebView webView, String str) {
            this.api.onLoadResource(this, webView, str, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onLoadResource$16((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(final WebView webView, final String str) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onPageCommitVisible$19(webView, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageCommitVisible$19(WebView webView, String str) {
            this.api.onPageCommitVisible(this, webView, str, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onPageCommitVisible$18((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onReceivedClientCertRequest$21(webView, clientCertRequest);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedClientCertRequest$21(WebView webView, ClientCertRequest clientCertRequest) {
            this.api.onReceivedClientCertRequest(this, webView, clientCertRequest, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedClientCertRequest$20((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(final WebView webView, final String str, final String str2, final String str3) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onReceivedLoginRequest$23(webView, str, str2, str3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedLoginRequest$23(WebView webView, String str, String str2, String str3) {
            this.api.onReceivedLoginRequest(this, webView, str, str2, str3, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedLoginRequest$22((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onReceivedSslError$25(webView, sslErrorHandler, sslError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceivedSslError$25(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            this.api.onReceivedSslError(this, webView, sslErrorHandler, sslError, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedSslError$24((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(final WebView webView, final float f, final float f2) {
            this.api.getPigeonRegistrar().runOnMainThread(new Runnable() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onScaleChanged$27(webView, f, f2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onScaleChanged$27(WebView webView, float f, float f2) {
            this.api.onScaleChanged(this, webView, f, f2, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebViewClientProxyApi.WebViewClientImpl.lambda$onScaleChanged$26((Result) obj);
                }
            });
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z) {
            this.returnValueForShouldOverrideUrlLoading = z;
        }
    }

    public WebViewClientProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public WebViewClient pigeon_defaultConstructor() {
        return new WebViewClientImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public void setSynchronousReturnValueForShouldOverrideUrlLoading(WebViewClient webViewClient, boolean z) {
        if (webViewClient instanceof WebViewClientImpl) {
            ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(z);
            return;
        }
        throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewClient
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
