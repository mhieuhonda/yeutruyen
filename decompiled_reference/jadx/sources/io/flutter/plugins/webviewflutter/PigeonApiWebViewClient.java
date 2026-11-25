package io.flutter.plugins.webviewflutter;

import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.webkit.WebResourceErrorCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b&\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J8\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J8\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J@\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J@\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J@\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020#2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J8\u0010$\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J8\u0010%\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J@\u0010&\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012JH\u0010(\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00182\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J@\u0010-\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J8\u00102\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J8\u00103\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J8\u00104\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u0002052\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012JJ\u00106\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00182\b\u00107\u001a\u0004\u0018\u00010\u00182\u0006\u00108\u001a\u00020\u00182\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J@\u00109\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010)\u001a\u00020:2\u0006\u0010 \u001a\u00020;2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J@\u0010<\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00162\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006A"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "pigeon_defaultConstructor", "Landroid/webkit/WebViewClient;", "setSynchronousReturnValueForShouldOverrideUrlLoading", "", "pigeon_instance", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "pigeon_newInstance", "pigeon_instanceArg", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "onPageStarted", "webViewArg", "Landroid/webkit/WebView;", "urlArg", "", "onPageFinished", "onReceivedHttpError", "requestArg", "Landroid/webkit/WebResourceRequest;", "responseArg", "Landroid/webkit/WebResourceResponse;", "onReceivedRequestError", "errorArg", "Landroid/webkit/WebResourceError;", "onReceivedRequestErrorCompat", "Landroidx/webkit/WebResourceErrorCompat;", "requestLoading", "urlLoading", "doUpdateVisitedHistory", "isReloadArg", "onReceivedHttpAuthRequest", "handlerArg", "Landroid/webkit/HttpAuthHandler;", "hostArg", "realmArg", "onFormResubmission", "viewArg", "dontResendArg", "Landroid/os/Message;", "resendArg", "onLoadResource", "onPageCommitVisible", "onReceivedClientCertRequest", "Landroid/webkit/ClientCertRequest;", "onReceivedLoginRequest", "accountArg", "argsArg", "onReceivedSslError", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onScaleChanged", "oldScaleArg", "", "newScaleArg", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class PigeonApiWebViewClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract WebViewClient pigeon_defaultConstructor();

    public abstract void setSynchronousReturnValueForShouldOverrideUrlLoading(WebViewClient pigeon_instance, boolean value);

    public PigeonApiWebViewClient(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    /* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient$Companion;", "", "<init>", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiWebViewClient api) {
            AndroidWebkitLibraryPigeonCodec androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (api == null || (pigeonRegistrar = api.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$Companion$$ExternalSyntheticLambda0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$0$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$Companion$$ExternalSyntheticLambda1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$1$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$0$0(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiWebViewClient.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiWebViewClient.pigeon_defaultConstructor(), ((Long) obj2).longValue());
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$0(PigeonApiWebViewClient pigeonApiWebViewClient, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
            WebViewClient webViewClient = (WebViewClient) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiWebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading(webViewClient, ((Boolean) obj3).booleanValue());
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }
    }

    public final void pigeon_newInstance(WebViewClient pigeon_instanceArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda14
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.pigeon_newInstance$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void pigeon_newInstance$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onPageStarted(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda6
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onPageStarted$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onPageStarted$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onPageFinished(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda11
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onPageFinished$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onPageFinished$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onReceivedHttpError(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceResponse responseArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(requestArg, "requestArg");
        Intrinsics.checkNotNullParameter(responseArg, "responseArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, requestArg, responseArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda3
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedHttpError$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onReceivedHttpError$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onReceivedRequestError(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceError errorArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(requestArg, "requestArg");
        Intrinsics.checkNotNullParameter(errorArg, "errorArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, requestArg, errorArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda10
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedRequestError$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onReceivedRequestError$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onReceivedRequestErrorCompat(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, WebResourceErrorCompat errorArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(requestArg, "requestArg");
        Intrinsics.checkNotNullParameter(errorArg, "errorArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestErrorCompat` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, requestArg, errorArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedRequestErrorCompat$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onReceivedRequestErrorCompat$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void requestLoading(WebViewClient pigeon_instanceArg, WebView webViewArg, WebResourceRequest requestArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(requestArg, "requestArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, requestArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda8
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.requestLoading$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void requestLoading$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void urlLoading(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.urlLoading` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.urlLoading$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void urlLoading$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void doUpdateVisitedHistory(WebViewClient pigeon_instanceArg, WebView webViewArg, String urlArg, boolean isReloadArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, urlArg, Boolean.valueOf(isReloadArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda2
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.doUpdateVisitedHistory$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void doUpdateVisitedHistory$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onReceivedHttpAuthRequest(WebViewClient pigeon_instanceArg, WebView webViewArg, HttpAuthHandler handlerArg, String hostArg, String realmArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(handlerArg, "handlerArg");
        Intrinsics.checkNotNullParameter(hostArg, "hostArg");
        Intrinsics.checkNotNullParameter(realmArg, "realmArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, handlerArg, hostArg, realmArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda12
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedHttpAuthRequest$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onReceivedHttpAuthRequest$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onFormResubmission(WebViewClient pigeon_instanceArg, WebView viewArg, Message dontResendArg, Message resendArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(dontResendArg, "dontResendArg");
        Intrinsics.checkNotNullParameter(resendArg, "resendArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, dontResendArg, resendArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda13
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onFormResubmission$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onFormResubmission$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onLoadResource(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda4
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onLoadResource$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onLoadResource$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onPageCommitVisible(WebViewClient pigeon_instanceArg, WebView viewArg, String urlArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, urlArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda9
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onPageCommitVisible$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onPageCommitVisible$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onReceivedClientCertRequest(WebViewClient pigeon_instanceArg, WebView viewArg, ClientCertRequest requestArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(requestArg, "requestArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, requestArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda7
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedClientCertRequest$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onReceivedClientCertRequest$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onReceivedLoginRequest(WebViewClient pigeon_instanceArg, WebView viewArg, String realmArg, String accountArg, String argsArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(realmArg, "realmArg");
        Intrinsics.checkNotNullParameter(argsArg, "argsArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, realmArg, accountArg, argsArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda5
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedLoginRequest$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onReceivedLoginRequest$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onReceivedSslError(WebViewClient pigeon_instanceArg, WebView viewArg, SslErrorHandler handlerArg, SslError errorArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(handlerArg, "handlerArg");
        Intrinsics.checkNotNullParameter(errorArg, "errorArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, handlerArg, errorArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda15
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onReceivedSslError$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onReceivedSslError$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onScaleChanged(WebViewClient pigeon_instanceArg, WebView viewArg, double oldScaleArg, double newScaleArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (!getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, Double.valueOf(oldScaleArg), Double.valueOf(newScaleArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiWebViewClient$$ExternalSyntheticLambda16
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiWebViewClient.onScaleChanged$lambda$0(callback, str, obj);
                }
            });
        }
    }

    static final void onScaleChanged$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }
}
