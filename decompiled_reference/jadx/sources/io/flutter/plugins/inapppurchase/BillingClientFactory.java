package io.flutter.plugins.inapppurchase;

import android.content.Context;
import com.android.billingclient.api.BillingClient;

/* JADX INFO: loaded from: classes3.dex */
interface BillingClientFactory {
    BillingClient createBillingClient(Context context, InAppPurchaseCallbackApi inAppPurchaseCallbackApi, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams);
}
