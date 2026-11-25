package io.flutter.plugins.webviewflutter;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.security.cert.Certificate;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0004\u0012\u00020\r0\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiCertificate;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "getEncoded", "", "pigeon_instance", "Ljava/security/cert/Certificate;", "pigeon_newInstance", "", "pigeon_instanceArg", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class PigeonApiCertificate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract byte[] getEncoded(Certificate pigeon_instance);

    public PigeonApiCertificate(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    /* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiCertificate$Companion;", "", "<init>", "()V", "setUpMessageHandlers", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/webviewflutter/PigeonApiCertificate;", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void setUpMessageHandlers(BinaryMessenger binaryMessenger, final PigeonApiCertificate api) {
            AndroidWebkitLibraryPigeonCodec androidWebkitLibraryPigeonCodec;
            AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            if (api == null || (pigeonRegistrar = api.getPigeonRegistrar()) == null || (androidWebkitLibraryPigeonCodec = pigeonRegistrar.getCodec()) == null) {
                androidWebkitLibraryPigeonCodec = new AndroidWebkitLibraryPigeonCodec();
            }
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", androidWebkitLibraryPigeonCodec);
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCertificate$Companion$$ExternalSyntheticLambda0
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        PigeonApiCertificate.Companion.setUpMessageHandlers$lambda$0$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUpMessageHandlers$lambda$0$0(PigeonApiCertificate pigeonApiCertificate, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.security.cert.Certificate");
            try {
                listWrapError = CollectionsKt.listOf(pigeonApiCertificate.getEncoded((Certificate) obj2));
            } catch (Throwable th) {
                listWrapError = AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }
    }

    public final void pigeon_newInstance(Certificate pigeon_instanceArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance";
            new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg))), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiCertificate$$ExternalSyntheticLambda0
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(Object obj) {
                    PigeonApiCertificate.pigeon_newInstance$lambda$0(callback, str, obj);
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
