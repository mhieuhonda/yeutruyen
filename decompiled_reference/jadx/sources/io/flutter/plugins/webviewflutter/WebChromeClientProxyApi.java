package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class WebChromeClientProxyApi extends PigeonApiWebChromeClient {

    public static class WebChromeClientImpl extends SecureWebChromeClient {
        private static final String TAG = "WebChromeClientImpl";
        private final WebChromeClientProxyApi api;
        private boolean returnValueForOnShowFileChooser = false;
        private boolean returnValueForOnConsoleMessage = false;
        private boolean returnValueForOnJsAlert = false;
        private boolean returnValueForOnJsConfirm = false;
        private boolean returnValueForOnJsPrompt = false;

        static /* synthetic */ Unit lambda$onConsoleMessage$7(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onGeolocationPermissionsHidePrompt$4(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onGeolocationPermissionsShowPrompt$3(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onHideCustomView$2(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onPermissionRequest$6(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onProgressChanged$0(Result result) {
            return null;
        }

        static /* synthetic */ Unit lambda$onShowCustomView$1(Result result) {
            return null;
        }

        public WebChromeClientImpl(WebChromeClientProxyApi webChromeClientProxyApi) {
            this.api = webChromeClientProxyApi;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            this.api.onProgressChanged(this, webView, i, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onProgressChanged$0((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.api.onShowCustomView(this, view, customViewCallback, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onShowCustomView$1((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.api.onHideCustomView(this, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onHideCustomView$2((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.api.onGeolocationPermissionsShowPrompt(this, str, callback, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onGeolocationPermissionsShowPrompt$3((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.api.onGeolocationPermissionsHidePrompt(this, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onGeolocationPermissionsHidePrompt$4((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z = this.returnValueForOnShowFileChooser;
            this.api.onShowFileChooser(this, webView, fileChooserParams, ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.lambda$onShowFileChooser$5(z, valueCallback, (ResultCompat) obj);
                }
            }));
            return z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onShowFileChooser$5(boolean z, ValueCallback valueCallback, ResultCompat resultCompat) {
            if (resultCompat.getIsFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.getException()));
                return null;
            }
            List list = (List) Objects.requireNonNull((List) resultCompat.getOrNull());
            if (z) {
                Uri[] uriArr = new Uri[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    uriArr[i] = Uri.parse((String) list.get(i));
                }
                valueCallback.onReceiveValue(uriArr);
            }
            return null;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.api.onPermissionRequest(this, permissionRequest, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onPermissionRequest$6((Result) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.api.onConsoleMessage(this, consoleMessage, new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebChromeClientProxyApi.WebChromeClientImpl.lambda$onConsoleMessage$7((Result) obj);
                }
            });
            return this.returnValueForOnConsoleMessage;
        }

        public void setReturnValueForOnShowFileChooser(boolean z) {
            this.returnValueForOnShowFileChooser = z;
        }

        public void setReturnValueForOnConsoleMessage(boolean z) {
            this.returnValueForOnConsoleMessage = z;
        }

        public void setReturnValueForOnJsAlert(boolean z) {
            this.returnValueForOnJsAlert = z;
        }

        public void setReturnValueForOnJsConfirm(boolean z) {
            this.returnValueForOnJsConfirm = z;
        }

        public void setReturnValueForOnJsPrompt(boolean z) {
            this.returnValueForOnJsPrompt = z;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.returnValueForOnJsAlert) {
                return false;
            }
            this.api.onJsAlert(this, webView, str, str2, ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.lambda$onJsAlert$8(jsResult, (ResultCompat) obj);
                }
            }));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onJsAlert$8(JsResult jsResult, ResultCompat resultCompat) {
            if (resultCompat.getIsFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.getException()));
                return null;
            }
            jsResult.confirm();
            return null;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.returnValueForOnJsConfirm) {
                return false;
            }
            this.api.onJsConfirm(this, webView, str, str2, ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.lambda$onJsConfirm$9(jsResult, (ResultCompat) obj);
                }
            }));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onJsConfirm$9(JsResult jsResult, ResultCompat resultCompat) {
            if (resultCompat.getIsFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.getException()));
                return null;
            }
            if (Boolean.TRUE.equals(resultCompat.getOrNull())) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
            return null;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
            if (!this.returnValueForOnJsPrompt) {
                return false;
            }
            this.api.onJsPrompt(this, webView, str, str2, str3, ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.lambda$onJsPrompt$10(jsPromptResult, (ResultCompat) obj);
                }
            }));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$onJsPrompt$10(JsPromptResult jsPromptResult, ResultCompat resultCompat) {
            if (resultCompat.getIsFailure()) {
                this.api.getPigeonRegistrar().logError(TAG, (Throwable) Objects.requireNonNull(resultCompat.getException()));
                return null;
            }
            String str = (String) resultCompat.getOrNull();
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
            return null;
        }
    }

    public static class SecureWebChromeClient extends WebChromeClient {
        WebViewClient webViewClient;

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            return onCreateWindow(webView, message, new WebView(webView.getContext()));
        }

        boolean onCreateWindow(final WebView webView, Message message, WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.SecureWebChromeClient.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(webViewClient);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            this.webViewClient = webViewClient;
        }
    }

    public WebChromeClientProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public WebChromeClientImpl pigeon_defaultConstructor() {
        return new WebChromeClientImpl(this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnShowFileChooser(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnShowFileChooser(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnConsoleMessage(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnConsoleMessage(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsAlert(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsAlert(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsConfirm(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsConfirm(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public void setSynchronousReturnValueForOnJsPrompt(WebChromeClientImpl webChromeClientImpl, boolean z) {
        webChromeClientImpl.setReturnValueForOnJsPrompt(z);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
