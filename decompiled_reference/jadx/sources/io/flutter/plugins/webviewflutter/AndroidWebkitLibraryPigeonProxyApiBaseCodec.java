package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;", "registrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "readValueOfType", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final class AndroidWebkitLibraryPigeonProxyApiBaseCodec extends AndroidWebkitLibraryPigeonCodec {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar registrar;

    public AndroidWebkitLibraryPigeonProxyApiBaseCodec(AndroidWebkitLibraryPigeonProxyApiRegistrar registrar) {
        Intrinsics.checkNotNullParameter(registrar, "registrar");
        this.registrar = registrar;
    }

    public final AndroidWebkitLibraryPigeonProxyApiRegistrar getRegistrar() {
        return this.registrar;
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (type == -128) {
            Object value = readValue(buffer);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) value).longValue();
            Object androidWebkitLibraryPigeonInstanceManager = this.registrar.getInstanceManager().getInstance(jLongValue);
            if (androidWebkitLibraryPigeonInstanceManager == null) {
                Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
            }
            return androidWebkitLibraryPigeonInstanceManager;
        }
        return super.readValueOfType(type, buffer);
    }

    @Override // io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonCodec, io.flutter.plugin.common.StandardMessageCodec
    protected void writeValue(ByteArrayOutputStream stream, final Object value) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if ((value instanceof Boolean) || (value instanceof byte[]) || (value instanceof Double) || (value instanceof double[]) || (value instanceof float[]) || (value instanceof Integer) || (value instanceof int[]) || (value instanceof List) || (value instanceof Long) || (value instanceof long[]) || (value instanceof Map) || (value instanceof String) || (value instanceof FileChooserMode) || (value instanceof ConsoleMessageLevel) || (value instanceof OverScrollMode) || (value instanceof SslErrorType) || (value instanceof MixedContentMode) || (value instanceof WindowInsetsType) || value == null) {
            super.writeValue(stream, value);
            return;
        }
        if (value instanceof WebResourceRequest) {
            this.registrar.getPigeonApiWebResourceRequest().pigeon_newInstance((WebResourceRequest) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$0(value, (Result) obj);
                }
            });
        } else if (value instanceof WebResourceResponse) {
            this.registrar.getPigeonApiWebResourceResponse().pigeon_newInstance((WebResourceResponse) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$1(value, (Result) obj);
                }
            });
        } else if (value instanceof WebResourceError) {
            this.registrar.getPigeonApiWebResourceError().pigeon_newInstance((WebResourceError) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$2(value, (Result) obj);
                }
            });
        } else if (value instanceof WebResourceErrorCompat) {
            this.registrar.getPigeonApiWebResourceErrorCompat().pigeon_newInstance((WebResourceErrorCompat) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$3(value, (Result) obj);
                }
            });
        } else if (value instanceof WebViewPoint) {
            this.registrar.getPigeonApiWebViewPoint().pigeon_newInstance((WebViewPoint) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$4(value, (Result) obj);
                }
            });
        } else if (value instanceof ConsoleMessage) {
            this.registrar.getPigeonApiConsoleMessage().pigeon_newInstance((ConsoleMessage) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$5(value, (Result) obj);
                }
            });
        } else if (value instanceof CookieManager) {
            this.registrar.getPigeonApiCookieManager().pigeon_newInstance((CookieManager) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$6(value, (Result) obj);
                }
            });
        } else if (value instanceof WebView) {
            this.registrar.getPigeonApiWebView().pigeon_newInstance((WebView) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$7(value, (Result) obj);
                }
            });
        } else if (value instanceof WebSettings) {
            this.registrar.getPigeonApiWebSettings().pigeon_newInstance((WebSettings) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$8(value, (Result) obj);
                }
            });
        } else if (value instanceof JavaScriptChannel) {
            this.registrar.getPigeonApiJavaScriptChannel().pigeon_newInstance((JavaScriptChannel) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$9(value, (Result) obj);
                }
            });
        } else if (value instanceof WebViewClient) {
            this.registrar.getPigeonApiWebViewClient().pigeon_newInstance((WebViewClient) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$10(value, (Result) obj);
                }
            });
        } else if (value instanceof DownloadListener) {
            this.registrar.getPigeonApiDownloadListener().pigeon_newInstance((DownloadListener) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$11(value, (Result) obj);
                }
            });
        } else if (value instanceof WebChromeClientProxyApi.WebChromeClientImpl) {
            this.registrar.getPigeonApiWebChromeClient().pigeon_newInstance((WebChromeClientProxyApi.WebChromeClientImpl) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$12(value, (Result) obj);
                }
            });
        } else if (value instanceof FlutterAssetManager) {
            this.registrar.getPigeonApiFlutterAssetManager().pigeon_newInstance((FlutterAssetManager) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$13(value, (Result) obj);
                }
            });
        } else if (value instanceof WebStorage) {
            this.registrar.getPigeonApiWebStorage().pigeon_newInstance((WebStorage) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$14(value, (Result) obj);
                }
            });
        } else if (value instanceof WebChromeClient.FileChooserParams) {
            this.registrar.getPigeonApiFileChooserParams().pigeon_newInstance((WebChromeClient.FileChooserParams) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$15(value, (Result) obj);
                }
            });
        } else if (value instanceof PermissionRequest) {
            this.registrar.getPigeonApiPermissionRequest().pigeon_newInstance((PermissionRequest) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$16(value, (Result) obj);
                }
            });
        } else if (value instanceof WebChromeClient.CustomViewCallback) {
            this.registrar.getPigeonApiCustomViewCallback().pigeon_newInstance((WebChromeClient.CustomViewCallback) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$17(value, (Result) obj);
                }
            });
        } else if (value instanceof View) {
            this.registrar.getPigeonApiView().pigeon_newInstance((View) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$18(value, (Result) obj);
                }
            });
        } else if (value instanceof GeolocationPermissions.Callback) {
            this.registrar.getPigeonApiGeolocationPermissionsCallback().pigeon_newInstance((GeolocationPermissions.Callback) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$19(value, (Result) obj);
                }
            });
        } else if (value instanceof HttpAuthHandler) {
            this.registrar.getPigeonApiHttpAuthHandler().pigeon_newInstance((HttpAuthHandler) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$20(value, (Result) obj);
                }
            });
        } else if (value instanceof Message) {
            this.registrar.getPigeonApiAndroidMessage().pigeon_newInstance((Message) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$21(value, (Result) obj);
                }
            });
        } else if (value instanceof ClientCertRequest) {
            this.registrar.getPigeonApiClientCertRequest().pigeon_newInstance((ClientCertRequest) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$22(value, (Result) obj);
                }
            });
        } else if (value instanceof PrivateKey) {
            this.registrar.getPigeonApiPrivateKey().pigeon_newInstance((PrivateKey) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$23(value, (Result) obj);
                }
            });
        } else if (value instanceof X509Certificate) {
            this.registrar.getPigeonApiX509Certificate().pigeon_newInstance((X509Certificate) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$24(value, (Result) obj);
                }
            });
        } else if (value instanceof SslErrorHandler) {
            this.registrar.getPigeonApiSslErrorHandler().pigeon_newInstance((SslErrorHandler) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$25(value, (Result) obj);
                }
            });
        } else if (value instanceof SslError) {
            this.registrar.getPigeonApiSslError().pigeon_newInstance((SslError) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$26(value, (Result) obj);
                }
            });
        } else if (value instanceof SslCertificate.DName) {
            this.registrar.getPigeonApiSslCertificateDName().pigeon_newInstance((SslCertificate.DName) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$27(value, (Result) obj);
                }
            });
        } else if (value instanceof SslCertificate) {
            this.registrar.getPigeonApiSslCertificate().pigeon_newInstance((SslCertificate) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$28(value, (Result) obj);
                }
            });
        } else if (value instanceof Certificate) {
            this.registrar.getPigeonApiCertificate().pigeon_newInstance((Certificate) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$29(value, (Result) obj);
                }
            });
        } else if (value instanceof WebSettingsCompat) {
            this.registrar.getPigeonApiWebSettingsCompat().pigeon_newInstance((WebSettingsCompat) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$30(value, (Result) obj);
                }
            });
        } else if (value instanceof WebViewFeature) {
            this.registrar.getPigeonApiWebViewFeature().pigeon_newInstance((WebViewFeature) value, new Function1() { // from class: io.flutter.plugins.webviewflutter.AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(value, (Result) obj);
                }
            });
        }
        if (this.registrar.getInstanceManager().containsInstance(value)) {
            stream.write(128);
            writeValue(stream, this.registrar.getInstanceManager().getIdentifierForStrongReference(value));
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + value + "' of type '" + value.getClass().getName() + "'");
        }
    }

    private static final void writeValue$logNewInstanceFailure(String str, Object obj, Throwable th) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th);
    }

    static final Unit writeValue$lambda$0(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceRequest", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$1(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceResponse", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$2(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceError", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$3(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebResourceErrorCompat", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$4(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebViewPoint", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$5(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("ConsoleMessage", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$6(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("CookieManager", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$7(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebView", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$8(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebSettings", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$9(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("JavaScriptChannel", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$10(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebViewClient", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$11(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("DownloadListener", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$12(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebChromeClient", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$13(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("FlutterAssetManager", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$14(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebStorage", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$15(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("FileChooserParams", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$16(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("PermissionRequest", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$17(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("CustomViewCallback", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$18(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("View", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$19(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("GeolocationPermissionsCallback", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$20(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("HttpAuthHandler", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$21(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("AndroidMessage", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$22(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("ClientCertRequest", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$23(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("PrivateKey", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$24(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("X509Certificate", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$25(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslErrorHandler", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$26(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslError", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$27(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslCertificateDName", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$28(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("SslCertificate", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$29(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("Certificate", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$30(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebSettingsCompat", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }

    static final Unit writeValue$lambda$31(Object obj, Result result) {
        if (Result.m416isFailureimpl(result.getValue())) {
            writeValue$logNewInstanceFailure("WebViewFeature", obj, Result.m413exceptionOrNullimpl(result.getValue()));
        }
        return Unit.INSTANCE;
    }
}
