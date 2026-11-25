package io.flutter.plugins.webviewflutter;

import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&J*\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u000b0\u0012H&J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H&J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\t2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0004\u0012\u00020\u000b0\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "instance", "Landroid/webkit/CookieManager;", "setCookie", "", "pigeon_instance", ImagesContract.URL, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "removeAllCookies", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "", "setAcceptThirdPartyCookies", "webView", "Landroid/webkit/WebView;", "accept", "getCookies", "pigeon_newInstance", "pigeon_instanceArg", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class PigeonApiCookieManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract String getCookies(CookieManager pigeon_instance, String url);

    public abstract CookieManager instance();

    public abstract void removeAllCookies(CookieManager pigeon_instance, Function1<? super Result<Boolean>, Unit> callback);

    public abstract void setAcceptThirdPartyCookies(CookieManager pigeon_instance, WebView webView, boolean accept);

    public abstract void setCookie(CookieManager pigeon_instance, String url, String value);

    public PigeonApiCookieManager(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    /* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager$Companion;", "", "<init>", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager;", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiCookieManager api) {
            AndroidWebkitLibraryPigeonCodec androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (api == null || (pigeonRegistrar = api.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCookieManager$Companion$$ExternalSyntheticLambda1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$0$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCookieManager$Companion$$ExternalSyntheticLambda2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCookieManager$Companion$$ExternalSyntheticLambda3
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$2$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCookieManager$Companion$$ExternalSyntheticLambda4
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$3$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.getCookies", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCookieManager$Companion$$ExternalSyntheticLambda5
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$4$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$0$0(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                pigeonApiCookieManager.getPigeonRegistrar().getInstanceManager().addDartCreatedInstance(pigeonApiCookieManager.instance(), ((Long) obj2).longValue());
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$1$0(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            try {
                pigeonApiCookieManager.setCookie(cookieManager, str, (String) obj4);
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$2$0(PigeonApiCookieManager pigeonApiCookieManager, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            pigeonApiCookieManager.removeAllCookies((CookieManager) obj2, new Function1() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCookieManager$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$2$0$0(reply, (Result) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUpMessageHandlers$lambda$2$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapResult((Boolean) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$3$0(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj3;
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                pigeonApiCookieManager.setAcceptThirdPartyCookies(cookieManager, webView, ((Boolean) obj4).booleanValue());
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$4$0(PigeonApiCookieManager pigeonApiCookieManager, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                listWrapError = CollectionsKt.listOf(pigeonApiCookieManager.getCookies(cookieManager, (String) obj3));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }
    }

    public final void pigeon_newInstance(CookieManager pigeon_instanceArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCookieManager$$ExternalSyntheticLambda0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiCookieManager.pigeon_newInstance$lambda$0(callback, str, obj);
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
}
