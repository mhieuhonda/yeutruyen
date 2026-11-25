package io.flutter.plugins.inapppurchase;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import io.flutter.Log;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class PluginPurchaseListener implements PurchasesUpdatedListener {
    private final InAppPurchaseCallbackApi callbackApi;

    PluginPurchaseListener(InAppPurchaseCallbackApi inAppPurchaseCallbackApi) {
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        this.callbackApi.onPurchasesUpdated(new PlatformPurchasesResponse(TranslatorKt.fromBillingResult(billingResult), TranslatorKt.fromPurchasesList(list)), ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.inapppurchase.PluginPurchaseListener$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PluginPurchaseListener.lambda$onPurchasesUpdated$0((ResultCompat) obj);
            }
        }));
    }

    static /* synthetic */ Unit lambda$onPurchasesUpdated$0(ResultCompat resultCompat) {
        Throwable exception = resultCompat.getException();
        if (exception != null) {
            Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + exception);
        }
        return Unit.INSTANCE;
    }
}
