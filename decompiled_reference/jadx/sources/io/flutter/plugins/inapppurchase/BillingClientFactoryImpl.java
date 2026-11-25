package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.android.billingclient.api.UserChoiceDetails;
import io.flutter.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
final class BillingClientFactoryImpl implements BillingClientFactory {
    BillingClientFactoryImpl() {
    }

    @Override // io.flutter.plugins.inapppurchase.BillingClientFactory
    public BillingClient createBillingClient(Context context, InAppPurchaseCallbackApi inAppPurchaseCallbackApi, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        BillingClient.Builder builderEnablePendingPurchases = BillingClient.newBuilder(context).enablePendingPurchases(TranslatorKt.toPendingPurchasesParams(platformPendingPurchasesParams));
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode[platformBillingChoiceMode.ordinal()];
        if (i == 1) {
            builderEnablePendingPurchases.enableAlternativeBillingOnly();
        } else if (i == 2) {
            builderEnablePendingPurchases.enableUserChoiceBilling(createUserChoiceBillingListener(inAppPurchaseCallbackApi));
        } else if (i != 3) {
            Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + platformBillingChoiceMode + ", Defaulting to PLAY_BILLING_ONLY");
        }
        return builderEnablePendingPurchases.setListener(new PluginPurchaseListener(inAppPurchaseCallbackApi)).build();
    }

    /* JADX INFO: renamed from: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode;

        static {
            int[] iArr = new int[PlatformBillingChoiceMode.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode = iArr;
            try {
                iArr[PlatformBillingChoiceMode.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode[PlatformBillingChoiceMode.USER_CHOICE_BILLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode[PlatformBillingChoiceMode.PLAY_BILLING_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    UserChoiceBillingListener createUserChoiceBillingListener(final InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        return new UserChoiceBillingListener() { // from class: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.UserChoiceBillingListener
            public final void userSelectedAlternativeBilling(UserChoiceDetails userChoiceDetails) {
                inAppPurchaseCallbackApi.userSelectedalternativeBilling(TranslatorKt.fromUserChoiceDetails(userChoiceDetails), ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.inapppurchase.BillingClientFactoryImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BillingClientFactoryImpl.lambda$createUserChoiceBillingListener$0((ResultCompat) obj);
                    }
                }));
            }
        };
    }

    static /* synthetic */ Unit lambda$createUserChoiceBillingListener$0(ResultCompat resultCompat) {
        Throwable exception = resultCompat.getException();
        if (exception != null) {
            Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + exception);
        }
        return Unit.INSTANCE;
    }
}
