package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.GetBillingConfigParams;
import com.android.billingclient.api.InAppMessageParams;
import com.android.billingclient.api.InAppMessageResponseListener;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class MethodCallHandlerImpl implements Application.ActivityLifecycleCallbacks, InAppPurchaseApi {
    static final String ACTIVITY_UNAVAILABLE = "ACTIVITY_UNAVAILABLE";
    private static final String LOAD_PRODUCT_DOC_URL = "https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale";
    static final PlatformReplacementMode REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE;
    private static final String TAG = "InAppPurchasePlugin";
    private Activity activity;
    private final Context applicationContext;
    private BillingClient billingClient;
    private final BillingClientFactory billingClientFactory;
    private final HashMap<String, ProductDetails> cachedProducts = new HashMap<>();
    final InAppPurchaseCallbackApi callbackApi;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    MethodCallHandlerImpl(Activity activity, Context context, InAppPurchaseCallbackApi inAppPurchaseCallbackApi, BillingClientFactory billingClientFactory) {
        this.billingClientFactory = billingClientFactory;
        this.applicationContext = context;
        this.activity = activity;
        this.callbackApi = inAppPurchaseCallbackApi;
    }

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.activity != activity || (context = this.applicationContext) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        endBillingClientConnection();
    }

    void onDetachedFromActivity() {
        endBillingClientConnection();
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void showAlternativeBillingOnlyInformationDialog(final Function1<? super Result<PlatformBillingResult>, Unit> function1) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        Activity activity = this.activity;
        if (activity == null) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(ACTIVITY_UNAVAILABLE, "Not attempting to show dialog", null));
            return;
        }
        try {
            billingClient.showAlternativeBillingOnlyInformationDialog(activity, new AlternativeBillingOnlyInformationDialogListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda6
                @Override // com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener
                public final void onAlternativeBillingOnlyInformationDialogResponse(BillingResult billingResult) {
                    ResultCompat.success(TranslatorKt.fromBillingResult(billingResult), function1);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void createAlternativeBillingOnlyReportingDetailsAsync(final Function1<? super Result<PlatformAlternativeBillingOnlyReportingDetailsResponse>, Unit> function1) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        try {
            billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new AlternativeBillingOnlyReportingDetailsListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
                public final void onAlternativeBillingOnlyTokenResponse(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
                    ResultCompat.success(TranslatorKt.fromAlternativeBillingOnlyReportingDetails(billingResult, alternativeBillingOnlyReportingDetails), function1);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void isAlternativeBillingOnlyAvailableAsync(final Function1<? super Result<PlatformBillingResult>, Unit> function1) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        try {
            billingClient.isAlternativeBillingOnlyAvailableAsync(new AlternativeBillingOnlyAvailabilityListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda8
                @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
                public final void onAlternativeBillingOnlyAvailabilityResponse(BillingResult billingResult) {
                    ResultCompat.success(TranslatorKt.fromBillingResult(billingResult), function1);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void showInAppMessages(final Function1<? super Result<PlatformInAppMessageResult>, Unit> function1) {
        if (this.billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        if (this.activity == null) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(ACTIVITY_UNAVAILABLE, "Not attempting to show dialog", null));
            return;
        }
        try {
            this.billingClient.showInAppMessages(this.activity, InAppMessageParams.newBuilder().addAllInAppMessageCategoriesToShow().build(), new InAppMessageResponseListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda2
                @Override // com.android.billingclient.api.InAppMessageResponseListener
                public final void onInAppMessageResponse(InAppMessageResult inAppMessageResult) {
                    ResultCompat.success(TranslatorKt.fromInAppMessageResult(inAppMessageResult), function1);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void getBillingConfigAsync(final Function1<? super Result<PlatformBillingConfigResponse>, Unit> function1) {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        try {
            billingClient.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new BillingConfigResponseListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda1
                @Override // com.android.billingclient.api.BillingConfigResponseListener
                public final void onBillingConfigResponse(BillingResult billingResult, BillingConfig billingConfig) {
                    ResultCompat.success(TranslatorKt.fromBillingConfig(billingResult, billingConfig), function1);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void endConnection() {
        endBillingClientConnection();
    }

    private void endBillingClientConnection() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.endConnection();
            this.billingClient = null;
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public boolean isReady() {
        BillingClient billingClient = this.billingClient;
        if (billingClient == null) {
            throw getNullBillingClientError();
        }
        return billingClient.isReady();
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void queryProductDetailsAsync(List<PlatformQueryProduct> list, final Function1<? super Result<PlatformProductDetailsResponse>, Unit> function1) {
        if (this.billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        try {
            this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(TranslatorKt.toProductList(list)).build(), new ProductDetailsResponseListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda7
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                    this.f$0.lambda$queryProductDetailsAsync$5(function1, billingResult, queryProductDetailsResult);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryProductDetailsAsync$5(Function1 function1, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        updateCachedProducts(queryProductDetailsResult.getProductDetailsList());
        ResultCompat.success(new PlatformProductDetailsResponse(TranslatorKt.fromBillingResult(billingResult), TranslatorKt.fromProductDetailsList(queryProductDetailsResult.getProductDetailsList()), TranslatorKt.fromUnfetchedProductList(queryProductDetailsResult.getUnfetchedProductList())), function1);
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public PlatformBillingResult launchBillingFlow(PlatformBillingFlowParams platformBillingFlowParams) {
        if (this.billingClient == null) {
            throw getNullBillingClientError();
        }
        ProductDetails productDetails = this.cachedProducts.get(platformBillingFlowParams.getProduct());
        if (productDetails == null) {
            throw new FlutterError("NOT_FOUND", "Details for product " + platformBillingFlowParams.getProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails != null) {
            Iterator<ProductDetails.SubscriptionOfferDetails> it = subscriptionOfferDetails.iterator();
            while (true) {
                if (it.hasNext()) {
                    ProductDetails.SubscriptionOfferDetails next = it.next();
                    if (platformBillingFlowParams.getOfferToken() != null && platformBillingFlowParams.getOfferToken().equals(next.getOfferToken())) {
                        break;
                    }
                } else {
                    throw new FlutterError("INVALID_OFFER_TOKEN", "Offer token " + platformBillingFlowParams.getOfferToken() + " for product " + platformBillingFlowParams.getProduct() + " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
                }
            }
        }
        if (platformBillingFlowParams.getOldProduct() == null && platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY) {
            throw new FlutterError("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (platformBillingFlowParams.getOldProduct() != null && !this.cachedProducts.containsKey(platformBillingFlowParams.getOldProduct())) {
            throw new FlutterError("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", "Details for product " + platformBillingFlowParams.getOldProduct() + " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale", null);
        }
        if (this.activity == null) {
            throw new FlutterError(ACTIVITY_UNAVAILABLE, "Details for product " + platformBillingFlowParams.getProduct() + " are not available. This method must be run with the app in foreground.", null);
        }
        BillingFlowParams.ProductDetailsParams.Builder builderNewBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
        builderNewBuilder.setProductDetails(productDetails);
        if (platformBillingFlowParams.getOfferToken() != null) {
            builderNewBuilder.setOfferToken(platformBillingFlowParams.getOfferToken());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(builderNewBuilder.build());
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList);
        if (platformBillingFlowParams.getAccountId() != null && !platformBillingFlowParams.getAccountId().isEmpty()) {
            productDetailsParamsList.setObfuscatedAccountId(platformBillingFlowParams.getAccountId());
        }
        if (platformBillingFlowParams.getObfuscatedProfileId() != null && !platformBillingFlowParams.getObfuscatedProfileId().isEmpty()) {
            productDetailsParamsList.setObfuscatedProfileId(platformBillingFlowParams.getObfuscatedProfileId());
        }
        BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder2 = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
        if (platformBillingFlowParams.getOldProduct() != null && !platformBillingFlowParams.getOldProduct().isEmpty() && platformBillingFlowParams.getPurchaseToken() != null) {
            builderNewBuilder2.setOldPurchaseToken(platformBillingFlowParams.getPurchaseToken());
            if (platformBillingFlowParams.getReplacementMode() != REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY) {
                builderNewBuilder2.setSubscriptionReplacementMode(TranslatorKt.toReplacementMode(platformBillingFlowParams.getReplacementMode()));
            }
            productDetailsParamsList.setSubscriptionUpdateParams(builderNewBuilder2.build());
        }
        return TranslatorKt.fromBillingResult(this.billingClient.launchBillingFlow(this.activity, productDetailsParamsList.build()));
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void consumeAsync(String str, final Function1<? super Result<PlatformBillingResult>, Unit> function1) {
        if (this.billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        try {
            ConsumeResponseListener consumeResponseListener = new ConsumeResponseListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda5
                @Override // com.android.billingclient.api.ConsumeResponseListener
                public final void onConsumeResponse(BillingResult billingResult, String str2) {
                    ResultCompat.success(TranslatorKt.fromBillingResult(billingResult), function1);
                }
            };
            this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str).build(), consumeResponseListener);
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void queryPurchasesAsync(PlatformProductType platformProductType, final Function1<? super Result<PlatformPurchasesResponse>, Unit> function1) {
        if (this.billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        try {
            QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
            builderNewBuilder.setProductType(TranslatorKt.toProductTypeString(platformProductType));
            this.billingClient.queryPurchasesAsync(builderNewBuilder.build(), new PurchasesResponseListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda3
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    ResultCompat.success(new PlatformPurchasesResponse(TranslatorKt.fromBillingResult(billingResult), TranslatorKt.fromPurchasesList(list)), function1);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void startConnection(long j, PlatformBillingChoiceMode platformBillingChoiceMode, PlatformPendingPurchasesParams platformPendingPurchasesParams, Function1<? super Result<PlatformBillingResult>, Unit> function1) {
        if (this.billingClient == null) {
            this.billingClient = this.billingClientFactory.createBillingClient(this.applicationContext, this.callbackApi, platformBillingChoiceMode, platformPendingPurchasesParams);
        }
        try {
            this.billingClient.startConnection(new AnonymousClass1(function1, j));
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$1, reason: invalid class name */
    class AnonymousClass1 implements BillingClientStateListener {
        private boolean alreadyFinished = false;
        final /* synthetic */ Function1 val$callback;
        final /* synthetic */ long val$handle;

        AnonymousClass1(Function1 function1, long j) {
            this.val$callback = function1;
            this.val$handle = j;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (this.alreadyFinished) {
                Log.d(MethodCallHandlerImpl.TAG, "Tried to call onBillingSetupFinished multiple times.");
            } else {
                this.alreadyFinished = true;
                ResultCompat.success(TranslatorKt.fromBillingResult(billingResult), this.val$callback);
            }
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            MethodCallHandlerImpl.this.callbackApi.onBillingServiceDisconnected(this.val$handle, ResultCompat.asCompatCallback(new Function1() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MethodCallHandlerImpl.AnonymousClass1.lambda$onBillingServiceDisconnected$0((ResultCompat) obj);
                }
            }));
        }

        static /* synthetic */ Unit lambda$onBillingServiceDisconnected$0(ResultCompat resultCompat) {
            Throwable exception = resultCompat.getException();
            if (exception != null) {
                io.flutter.Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + exception);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public void acknowledgePurchase(String str, final Function1<? super Result<PlatformBillingResult>, Unit> function1) {
        if (this.billingClient == null) {
            ResultUtilsKt.completeWithError(function1, getNullBillingClientError());
            return;
        }
        try {
            this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str).build(), new AcknowledgePurchaseResponseListener() { // from class: io.flutter.plugins.inapppurchase.MethodCallHandlerImpl$$ExternalSyntheticLambda4
                @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                    ResultCompat.success(TranslatorKt.fromBillingResult(billingResult), function1);
                }
            });
        } catch (RuntimeException e) {
            ResultUtilsKt.completeWithError(function1, new FlutterError(Constant.PARAM_ERROR, e.getMessage(), Log.getStackTraceString(e)));
        }
    }

    protected void updateCachedProducts(List<ProductDetails> list) {
        if (list == null) {
            return;
        }
        for (ProductDetails productDetails : list) {
            this.cachedProducts.put(productDetails.getProductId(), productDetails);
        }
    }

    private FlutterError getNullBillingClientError() {
        return new FlutterError("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    @Override // io.flutter.plugins.inapppurchase.InAppPurchaseApi
    public boolean isFeatureSupported(PlatformBillingClientFeature platformBillingClientFeature) {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            return billingClient.isFeatureSupported(TranslatorKt.toBillingClientFeature(platformBillingClientFeature)).getResponseCode() == 0;
        }
        throw getNullBillingClientError();
    }
}
