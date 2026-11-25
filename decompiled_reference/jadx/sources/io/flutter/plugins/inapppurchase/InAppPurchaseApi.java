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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 ,2\u00020\u0001:\u0001,J\b\u0010\u0002\u001a\u00020\u0003H&J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\b\u0010\u0010\u001a\u00020\u0005H&J\"\u0010\u0011\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H&J*\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J*\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J*\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J0\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\"\u0010&\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\"\u0010'\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\"\u0010(\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\"\u0010*\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u000e\u0012\u0004\u0012\u00020\u00050\rH&¨\u0006-À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/inapppurchase/InAppPurchaseApi;", "", "isReady", "", "startConnection", "", "callbackHandle", "", "billingMode", "Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;", "pendingPurchasesParams", "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;", "endConnection", "getBillingConfigAsync", "Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;", "launchBillingFlow", "params", "Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;", "acknowledgePurchase", "purchaseToken", "", "consumeAsync", "queryPurchasesAsync", "productType", "Lio/flutter/plugins/inapppurchase/PlatformProductType;", "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;", "queryProductDetailsAsync", "products", "", "Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;", "Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;", "isFeatureSupported", "feature", "Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;", "isAlternativeBillingOnlyAvailableAsync", "showAlternativeBillingOnlyInformationDialog", "createAlternativeBillingOnlyReportingDetailsAsync", "Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;", "showInAppMessages", "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface InAppPurchaseApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void acknowledgePurchase(String purchaseToken, Function1<? super Result<PlatformBillingResult>, Unit> callback);

    void consumeAsync(String purchaseToken, Function1<? super Result<PlatformBillingResult>, Unit> callback);

    void createAlternativeBillingOnlyReportingDetailsAsync(Function1<? super Result<PlatformAlternativeBillingOnlyReportingDetailsResponse>, Unit> callback);

    void endConnection();

    void getBillingConfigAsync(Function1<? super Result<PlatformBillingConfigResponse>, Unit> callback);

    void isAlternativeBillingOnlyAvailableAsync(Function1<? super Result<PlatformBillingResult>, Unit> callback);

    boolean isFeatureSupported(PlatformBillingClientFeature feature);

    boolean isReady();

    PlatformBillingResult launchBillingFlow(PlatformBillingFlowParams params);

    void queryProductDetailsAsync(List<PlatformQueryProduct> products, Function1<? super Result<PlatformProductDetailsResponse>, Unit> callback);

    void queryPurchasesAsync(PlatformProductType productType, Function1<? super Result<PlatformPurchasesResponse>, Unit> callback);

    void showAlternativeBillingOnlyInformationDialog(Function1<? super Result<PlatformBillingResult>, Unit> callback);

    void showInAppMessages(Function1<? super Result<PlatformInAppMessageResult>, Unit> callback);

    void startConnection(long callbackHandle, PlatformBillingChoiceMode billingMode, PlatformPendingPurchasesParams pendingPurchasesParams, Function1<? super Result<PlatformBillingResult>, Unit> callback);

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/flutter/plugins/inapppurchase/InAppPurchaseApi$Companion;", "", "<init>", "()V", "codec", "Lio/flutter/plugin/common/MessageCodec;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Lkotlin/Lazy;", "setUp", "", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "api", "Lio/flutter/plugins/inapppurchase/InAppPurchaseApi;", "messageChannelSuffix", "", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: codec$delegate, reason: from kotlin metadata */
        private static final Lazy<MessagesPigeonCodec> codec = LazyKt.lazy(new Function0() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppPurchaseApi.Companion.codec_delegate$lambda$0();
            }
        });

        public final void setUp(BinaryMessenger binaryMessenger, InAppPurchaseApi inAppPurchaseApi) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            setUp$default(this, binaryMessenger, inAppPurchaseApi, null, 4, null);
        }

        private Companion() {
        }

        static final MessagesPigeonCodec codec_delegate$lambda$0() {
            return new MessagesPigeonCodec();
        }

        public final MessageCodec<Object> getCodec() {
            return codec.getValue();
        }

        public static /* synthetic */ void setUp$default(Companion companion, BinaryMessenger binaryMessenger, InAppPurchaseApi inAppPurchaseApi, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            companion.setUp(binaryMessenger, inAppPurchaseApi, str);
        }

        public final void setUp(BinaryMessenger binaryMessenger, final InAppPurchaseApi api, String messageChannelSuffix) {
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
            String str = messageChannelSuffix.length() > 0 ? "." + messageChannelSuffix : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady" + str, getCodec());
            if (api != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda24
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$0$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection" + str, getCodec());
            if (api != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda5
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$1$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection" + str, getCodec());
            if (api != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda6
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$2$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync" + str, getCodec());
            if (api != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda7
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$3$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow" + str, getCodec());
            if (api != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda8
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$4$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase" + str, getCodec());
            if (api != null) {
                basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda9
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$5$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync" + str, getCodec());
            if (api != null) {
                basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda10
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$6$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync" + str, getCodec());
            if (api != null) {
                basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda12
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$7$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync" + str, getCodec());
            if (api != null) {
                basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda13
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$8$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported" + str, getCodec());
            if (api != null) {
                basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda14
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$9$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync" + str, getCodec());
            if (api != null) {
                basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$10$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog" + str, getCodec());
            if (api != null) {
                basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda2
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$11$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync" + str, getCodec());
            if (api != null) {
                basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda3
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$12$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showInAppMessages" + str, getCodec());
            if (api != null) {
                basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda4
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        InAppPurchaseApi.Companion.setUp$lambda$13$0(api, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$0$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(inAppPurchaseApi.isReady()));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$1$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj2).longValue();
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
            inAppPurchaseApi.startConnection(jLongValue, (PlatformBillingChoiceMode) obj3, (PlatformPendingPurchasesParams) obj4, new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return InAppPurchaseApi.Companion.setUp$lambda$1$0$0(reply, (Result) obj5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$1$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$2$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            try {
                inAppPurchaseApi.endConnection();
                listWrapError = CollectionsKt.listOf((Object) null);
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$3$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            inAppPurchaseApi.getBillingConfigAsync(new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InAppPurchaseApi.Companion.setUp$lambda$3$0$0(reply, (Result) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$3$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingConfigResponse) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$4$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
            try {
                listWrapError = CollectionsKt.listOf(inAppPurchaseApi.launchBillingFlow((PlatformBillingFlowParams) obj2));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$5$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            inAppPurchaseApi.acknowledgePurchase((String) obj2, new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return InAppPurchaseApi.Companion.setUp$lambda$5$0$0(reply, (Result) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$5$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$6$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            inAppPurchaseApi.consumeAsync((String) obj2, new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return InAppPurchaseApi.Companion.setUp$lambda$6$0$0(reply, (Result) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$6$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$7$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
            inAppPurchaseApi.queryPurchasesAsync((PlatformProductType) obj2, new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return InAppPurchaseApi.Companion.setUp$lambda$7$0$0(reply, (Result) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$7$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformPurchasesResponse) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$8$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
            inAppPurchaseApi.queryProductDetailsAsync((List) obj2, new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return InAppPurchaseApi.Companion.setUp$lambda$8$0$0(reply, (Result) obj3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$8$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformProductDetailsResponse) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$9$0(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
            List<Object> listWrapError;
            Intrinsics.checkNotNullParameter(reply, "reply");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
            try {
                listWrapError = CollectionsKt.listOf(Boolean.valueOf(inAppPurchaseApi.isFeatureSupported((PlatformBillingClientFeature) obj2)));
            } catch (Throwable th) {
                listWrapError = MessagesPigeonUtils.INSTANCE.wrapError(th);
            }
            reply.reply(listWrapError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$10$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            inAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync(new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InAppPurchaseApi.Companion.setUp$lambda$10$0$0(reply, (Result) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$10$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$11$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            inAppPurchaseApi.showAlternativeBillingOnlyInformationDialog(new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InAppPurchaseApi.Companion.setUp$lambda$11$0$0(reply, (Result) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$11$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformBillingResult) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$12$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            inAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync(new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InAppPurchaseApi.Companion.setUp$lambda$12$0$0(reply, (Result) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$12$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformAlternativeBillingOnlyReportingDetailsResponse) value));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setUp$lambda$13$0(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
            Intrinsics.checkNotNullParameter(reply, "reply");
            inAppPurchaseApi.showInAppMessages(new Function1() { // from class: io.flutter.plugins.inapppurchase.InAppPurchaseApi$Companion$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InAppPurchaseApi.Companion.setUp$lambda$13$0$0(reply, (Result) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setUp$lambda$13$0$0(BasicMessageChannel.Reply reply, Result result) {
            Throwable thM413exceptionOrNullimpl = Result.m413exceptionOrNullimpl(result.getValue());
            if (thM413exceptionOrNullimpl != null) {
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapError(thM413exceptionOrNullimpl));
            } else {
                Object value = result.getValue();
                if (Result.m416isFailureimpl(value)) {
                    value = null;
                }
                reply.reply(MessagesPigeonUtils.INSTANCE.wrapResult((PlatformInAppMessageResult) value));
            }
            return Unit.INSTANCE;
        }
    }
}
