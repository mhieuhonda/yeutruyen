package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0004\u0012\u00020\t0\rJ(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0004\u0012\u00020\t0\rJ(\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "messageChannelSuffix", "", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "onBillingServiceDisconnected", "", "callbackHandleArg", "", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "onPurchasesUpdated", "updateArg", "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;", "userSelectedalternativeBilling", "detailsArg", "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class InAppPurchaseCallbackApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<MessagesPigeonCodec> codec$delegate = LazyKt.lazy(new Function0() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseCallbackApi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InAppPurchaseCallbackApi.codec_delegate$lambda$0();
        }
    });
    private final BinaryMessenger binaryMessenger;
    private final String messageChannelSuffix;

    public InAppPurchaseCallbackApi(BinaryMessenger binaryMessenger, String messageChannelSuffix) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
        this.binaryMessenger = binaryMessenger;
        this.messageChannelSuffix = messageChannelSuffix;
    }

    public /* synthetic */ InAppPurchaseCallbackApi(BinaryMessenger binaryMessenger, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(binaryMessenger, (i & 2) != 0 ? "" : str);
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MessageCodec<Object> getCodec() {
            return (MessageCodec) InAppPurchaseCallbackApi.codec$delegate.getValue();
        }
    }

    static final MessagesPigeonCodec codec_delegate$lambda$0() {
        return new MessagesPigeonCodec();
    }

    public final void onBillingServiceDisconnected(long callbackHandleArg, final Function1<? super Result<Unit>, Unit> callback) {
        String str;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final String str2 = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected" + str;
        new BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(CollectionsKt.listOf(Long.valueOf(callbackHandleArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseCallbackApi$$ExternalSyntheticLambda2
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                InAppPurchaseCallbackApi.onBillingServiceDisconnected$lambda$0(callback, str2, obj);
            }
        });
    }

    static final void onBillingServiceDisconnected$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new FlutterError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(MessagesPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void onPurchasesUpdated(PlatformPurchasesResponse updateArg, final Function1<? super Result<Unit>, Unit> callback) {
        String str;
        Intrinsics.checkNotNullParameter(updateArg, "updateArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final String str2 = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated" + str;
        new BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(CollectionsKt.listOf(updateArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseCallbackApi$$ExternalSyntheticLambda1
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                InAppPurchaseCallbackApi.onPurchasesUpdated$lambda$0(callback, str2, obj);
            }
        });
    }

    static final void onPurchasesUpdated$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new FlutterError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(MessagesPigeonUtils.INSTANCE.createConnectionError(str)))));
    }

    public final void userSelectedalternativeBilling(PlatformUserChoiceDetails detailsArg, final Function1<? super Result<Unit>, Unit> callback) {
        String str;
        Intrinsics.checkNotNullParameter(detailsArg, "detailsArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final String str2 = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling" + str;
        new BasicMessageChannel(this.binaryMessenger, str2, INSTANCE.getCodec()).send(CollectionsKt.listOf(detailsArg), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseCallbackApi$$ExternalSyntheticLambda3
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                InAppPurchaseCallbackApi.userSelectedalternativeBilling$lambda$0(callback, str2, obj);
            }
        });
    }

    static final void userSelectedalternativeBilling$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new FlutterError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(MessagesPigeonUtils.INSTANCE.createConnectionError(str)))));
    }
}
