.class Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;
.super Ljava/lang/Object;
.source "MethodCallHandlerImpl.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Lio/flutter/plugins/inapppurchase/InAppPurchaseApi;


# static fields
.field static final ACTIVITY_UNAVAILABLE:Ljava/lang/String; = "ACTIVITY_UNAVAILABLE"

.field private static final LOAD_PRODUCT_DOC_URL:Ljava/lang/String; = "https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"

.field static final REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

.field private static final TAG:Ljava/lang/String; = "InAppPurchasePlugin"


# instance fields
.field private activity:Landroid/app/Activity;

.field private final applicationContext:Landroid/content/Context;

.field private billingClient:Lcom/android/billingclient/api/BillingClient;

.field private final billingClientFactory:Lio/flutter/plugins/inapppurchase/BillingClientFactory;

.field private final cachedProducts:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;"
        }
    .end annotation
.end field

.field final callbackApi:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;


# direct methods
.method public static synthetic $r8$lambda$mIovjdaPIDmoGJWhEoE4o8jzW5A(Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/QueryProductDetailsResult;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->lambda$queryProductDetailsAsync$5(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/QueryProductDetailsResult;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 51
    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->UNKNOWN_REPLACEMENT_MODE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    sput-object v0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Landroid/content/Context;Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;Lio/flutter/plugins/inapppurchase/BillingClientFactory;)V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->cachedProducts:Ljava/util/HashMap;

    .line 74
    iput-object p4, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClientFactory:Lio/flutter/plugins/inapppurchase/BillingClientFactory;

    .line 75
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->applicationContext:Landroid/content/Context;

    .line 76
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    .line 77
    iput-object p3, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->callbackApi:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;

    return-void
.end method

.method private endBillingClientConnection()V
    .locals 1

    .line 229
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-eqz v0, :cond_0

    .line 230
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient;->endConnection()V

    const/4 v0, 0x0

    .line 231
    iput-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    :cond_0
    return-void
.end method

.method private getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;
    .locals 4

    .line 518
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    const-string v1, "BillingClient is unset. Try reconnecting."

    const/4 v2, 0x0

    const-string v3, "UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method static synthetic lambda$acknowledgePurchase$8(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;)V
    .locals 0

    .line 500
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$consumeAsync$6(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V
    .locals 0

    .line 396
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$createAlternativeBillingOnlyReportingDetailsAsync$1(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V
    .locals 0

    .line 153
    invoke-static {p1, p2}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromAlternativeBillingOnlyReportingDetails(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;

    move-result-object p1

    .line 152
    invoke-static {p1, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$getBillingConfigAsync$4(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)V
    .locals 0

    .line 216
    invoke-static {p1, p2}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingConfig(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/BillingConfig;)Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$isAlternativeBillingOnlyAvailableAsync$2(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;)V
    .locals 0

    .line 171
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic lambda$queryProductDetailsAsync$5(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/QueryProductDetailsResult;)V
    .locals 2

    .line 258
    invoke-virtual {p3}, Lcom/android/billingclient/api/QueryProductDetailsResult;->getProductDetailsList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->updateCachedProducts(Ljava/util/List;)V

    .line 259
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;

    .line 261
    invoke-static {p2}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p2

    .line 262
    invoke-virtual {p3}, Lcom/android/billingclient/api/QueryProductDetailsResult;->getProductDetailsList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromProductDetailsList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 263
    invoke-virtual {p3}, Lcom/android/billingclient/api/QueryProductDetailsResult;->getUnfetchedProductList()Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromUnfetchedProductList(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v0, p2, v1, p3}, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;-><init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;)V

    .line 264
    invoke-static {v0, p1}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$queryPurchasesAsync$7(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    .line 425
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    .line 427
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    invoke-static {p2}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromPurchasesList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;-><init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)V

    .line 428
    invoke-static {v0, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$showAlternativeBillingOnlyInformationDialog$0(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;)V
    .locals 0

    .line 133
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$showInAppMessages$3(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/InAppMessageResult;)V
    .locals 0

    .line 198
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromInAppMessageResult(Lcom/android/billingclient/api/InAppMessageResult;)Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public acknowledgePurchase(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 491
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 492
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    invoke-static {p2, p1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 497
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/android/billingclient/api/AcknowledgePurchaseParams;->newBuilder()Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;->setPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/AcknowledgePurchaseParams$Builder;->build()Lcom/android/billingclient/api/AcknowledgePurchaseParams;

    move-result-object p1

    .line 498
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    new-instance v1, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda4;

    invoke-direct {v1, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, v1}, Lcom/android/billingclient/api/BillingClient;->acknowledgePurchase(Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lcom/android/billingclient/api/AcknowledgePurchaseResponseListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 502
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 503
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "error"

    invoke-direct {v0, v2, v1, p1}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 502
    invoke-static {p2, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public consumeAsync(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 388
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 389
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    invoke-static {p2, p1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 394
    :cond_0
    :try_start_0
    new-instance v0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda5;

    invoke-direct {v0, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 398
    invoke-static {}, Lcom/android/billingclient/api/ConsumeParams;->newBuilder()Lcom/android/billingclient/api/ConsumeParams$Builder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/android/billingclient/api/ConsumeParams$Builder;->setPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/ConsumeParams$Builder;

    move-result-object p1

    .line 399
    invoke-virtual {p1}, Lcom/android/billingclient/api/ConsumeParams$Builder;->build()Lcom/android/billingclient/api/ConsumeParams;

    move-result-object p1

    .line 401
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {v1, p1, v0}, Lcom/android/billingclient/api/BillingClient;->consumeAsync(Lcom/android/billingclient/api/ConsumeParams;Lcom/android/billingclient/api/ConsumeResponseListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 403
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 404
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "error"

    invoke-direct {v0, v2, v1, p1}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 403
    invoke-static {p2, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public createAlternativeBillingOnlyReportingDetailsAsync(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 146
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 150
    :cond_0
    :try_start_0
    new-instance v1, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingClient;->createAlternativeBillingOnlyReportingDetailsAsync(Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 157
    new-instance v1, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 158
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "error"

    invoke-direct {v1, v3, v2, v0}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    invoke-static {p1, v1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public endConnection()V
    .locals 0

    .line 225
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->endBillingClientConnection()V

    return-void
.end method

.method public getBillingConfigAsync(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 209
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 214
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/android/billingclient/api/GetBillingConfigParams;->newBuilder()Lcom/android/billingclient/api/GetBillingConfigParams$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/GetBillingConfigParams$Builder;->build()Lcom/android/billingclient/api/GetBillingConfigParams;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda1;

    invoke-direct {v2, p1}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 213
    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/BillingClient;->getBillingConfigAsync(Lcom/android/billingclient/api/GetBillingConfigParams;Lcom/android/billingclient/api/BillingConfigResponseListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 218
    new-instance v1, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 219
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "error"

    invoke-direct {v1, v3, v2, v0}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 218
    invoke-static {p1, v1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public isAlternativeBillingOnlyAvailableAsync(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 166
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 170
    :cond_0
    :try_start_0
    new-instance v1, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda8;

    invoke-direct {v1, p1}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda8;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingClient;->isAlternativeBillingOnlyAvailableAsync(Lcom/android/billingclient/api/AlternativeBillingOnlyAvailabilityListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 173
    new-instance v1, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 174
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "error"

    invoke-direct {v1, v3, v2, v0}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 173
    invoke-static {p1, v1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public isFeatureSupported(Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;)Z
    .locals 1

    .line 523
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-eqz v0, :cond_1

    .line 526
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->toBillingClientFeature(Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/BillingClient;->isFeatureSupported(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    move-result-object p1

    .line 527
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 524
    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    throw p1
.end method

.method public isReady()Z
    .locals 1

    .line 237
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-eqz v0, :cond_0

    .line 240
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient;->isReady()Z

    move-result v0

    return v0

    .line 238
    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object v0

    throw v0
.end method

.method public launchBillingFlow(Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
    .locals 7

    .line 275
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-eqz v0, :cond_e

    .line 279
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->cachedProducts:Ljava/util/HashMap;

    .line 280
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getProduct()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/ProductDetails;

    .line 281
    const-string v1, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"

    const-string v2, "Details for product "

    const/4 v3, 0x0

    if-eqz v0, :cond_d

    .line 295
    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails;->getSubscriptionOfferDetails()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 298
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    .line 299
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOfferToken()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 300
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOfferToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getOfferToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 306
    :cond_1
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Offer token "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOfferToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for product "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 311
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getProduct()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "INVALID_OFFER_TOKEN"

    invoke-direct {v0, v1, p1, v3}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw v0

    .line 320
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOldProduct()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    .line 321
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getReplacementMode()Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    move-result-object v4

    sget-object v5, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    if-ne v4, v5, :cond_3

    goto :goto_1

    .line 323
    :cond_3
    new-instance p1, Lio/flutter/plugins/inapppurchase/FlutterError;

    const-string v0, "IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT"

    const-string v1, "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode."

    invoke-direct {p1, v0, v1, v3}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw p1

    .line 328
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOldProduct()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->cachedProducts:Ljava/util/HashMap;

    .line 329
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOldProduct()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    .line 330
    :cond_5
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOldProduct()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "IN_APP_PURCHASE_INVALID_OLD_PRODUCT"

    invoke-direct {v0, v1, p1, v3}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw v0

    .line 341
    :cond_6
    :goto_2
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    if-eqz v1, :cond_c

    .line 351
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    move-result-object v1

    .line 352
    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->setProductDetails(Lcom/android/billingclient/api/ProductDetails;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    .line 353
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOfferToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 354
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOfferToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->setOfferToken(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;

    .line 357
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 358
    invoke-virtual {v1}, Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 361
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setProductDetailsParamsList(Ljava/util/List;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    move-result-object v0

    .line 362
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getAccountId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getAccountId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    .line 363
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getAccountId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setObfuscatedAccountId(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    .line 365
    :cond_8
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getObfuscatedProfileId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getObfuscatedProfileId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 366
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getObfuscatedProfileId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setObfuscatedProfileId(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    .line 369
    :cond_9
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;

    move-result-object v1

    .line 370
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOldProduct()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 371
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getOldProduct()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    .line 372
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getPurchaseToken()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 373
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getPurchaseToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;->setOldPurchaseToken(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;

    .line 374
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getReplacementMode()Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    move-result-object v2

    sget-object v3, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->REPLACEMENT_MODE_UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    if-eq v2, v3, :cond_a

    .line 377
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getReplacementMode()Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->toReplacementMode(Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;)I

    move-result p1

    .line 376
    invoke-virtual {v1, p1}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;->setSubscriptionReplacementMode(I)Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;

    .line 379
    :cond_a
    invoke-virtual {v1}, Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSubscriptionUpdateParams(Lcom/android/billingclient/api/BillingFlowParams$SubscriptionUpdateParams;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    .line 381
    :cond_b
    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/android/billingclient/api/BillingClient;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)Lcom/android/billingclient/api/BillingResult;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    return-object p1

    .line 342
    :cond_c
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getProduct()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " are not available. This method must be run with the app in foreground."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ACTIVITY_UNAVAILABLE"

    invoke-direct {v0, v1, p1, v3}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw v0

    .line 282
    :cond_d
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    invoke-virtual {p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->getProduct()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "NOT_FOUND"

    invoke-direct {v0, v1, p1, v3}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw v0

    .line 276
    :cond_e
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    throw p1
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->applicationContext:Landroid/content/Context;

    if-eqz p1, :cond_0

    .line 106
    check-cast p1, Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 107
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->endBillingClientConnection()V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method onDetachedFromActivity()V
    .locals 0

    .line 115
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->endBillingClientConnection()V

    return-void
.end method

.method public queryProductDetailsAsync(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 247
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 248
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    invoke-static {p2, p1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 254
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/android/billingclient/api/QueryProductDetailsParams;->newBuilder()Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;

    move-result-object v0

    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->toProductList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;->setProductList(Ljava/util/List;)Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/QueryProductDetailsParams$Builder;->build()Lcom/android/billingclient/api/QueryProductDetailsParams;

    move-result-object p1

    .line 255
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    new-instance v1, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda7;

    invoke-direct {v1, p0, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda7;-><init>(Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, v1}, Lcom/android/billingclient/api/BillingClient;->queryProductDetailsAsync(Lcom/android/billingclient/api/QueryProductDetailsParams;Lcom/android/billingclient/api/ProductDetailsResponseListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 267
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 268
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "error"

    invoke-direct {v0, v2, v1, p1}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 267
    invoke-static {p2, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public queryPurchasesAsync(Lio/flutter/plugins/inapppurchase/PlatformProductType;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/inapppurchase/PlatformProductType;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 412
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 413
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    invoke-static {p2, p1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 420
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/android/billingclient/api/QueryPurchasesParams;->newBuilder()Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    move-result-object v0

    .line 421
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->toProductTypeString(Lio/flutter/plugins/inapppurchase/PlatformProductType;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->setProductType(Ljava/lang/String;)Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    .line 422
    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    .line 423
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->build()Lcom/android/billingclient/api/QueryPurchasesParams;

    move-result-object v0

    new-instance v1, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda3;

    invoke-direct {v1, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 422
    invoke-virtual {p1, v0, v1}, Lcom/android/billingclient/api/BillingClient;->queryPurchasesAsync(Lcom/android/billingclient/api/QueryPurchasesParams;Lcom/android/billingclient/api/PurchasesResponseListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 431
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 432
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "error"

    invoke-direct {v0, v2, v1, p1}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 431
    invoke-static {p2, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method setActivity(Landroid/app/Activity;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    return-void
.end method

.method public showAlternativeBillingOnlyInformationDialog(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 122
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 125
    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    if-nez v1, :cond_1

    .line 126
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    const-string v1, "Not attempting to show dialog"

    const/4 v2, 0x0

    const-string v3, "ACTIVITY_UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 131
    :cond_1
    :try_start_0
    new-instance v2, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda6;

    invoke-direct {v2, p1}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/BillingClient;->showAlternativeBillingOnlyInformationDialog(Landroid/app/Activity;Lcom/android/billingclient/api/AlternativeBillingOnlyInformationDialogListener;)Lcom/android/billingclient/api/BillingResult;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 135
    new-instance v1, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 136
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "error"

    invoke-direct {v1, v3, v2, v0}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    invoke-static {p1, v1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public showInAppMessages(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 183
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 184
    invoke-direct {p0}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->getNullBillingClientError()Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 188
    new-instance v0, Lio/flutter/plugins/inapppurchase/FlutterError;

    const-string v1, "Not attempting to show dialog"

    const/4 v2, 0x0

    const-string v3, "ACTIVITY_UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    .line 194
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/android/billingclient/api/InAppMessageParams;->newBuilder()Lcom/android/billingclient/api/InAppMessageParams$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/InAppMessageParams$Builder;->addAllInAppMessageCategoriesToShow()Lcom/android/billingclient/api/InAppMessageParams$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/InAppMessageParams$Builder;->build()Lcom/android/billingclient/api/InAppMessageParams;

    move-result-object v0

    .line 195
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->activity:Landroid/app/Activity;

    new-instance v3, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda2;

    invoke-direct {v3, p1}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/android/billingclient/api/BillingClient;->showInAppMessages(Landroid/app/Activity;Lcom/android/billingclient/api/InAppMessageParams;Lcom/android/billingclient/api/InAppMessageResponseListener;)Lcom/android/billingclient/api/BillingResult;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 200
    new-instance v1, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 201
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "error"

    invoke-direct {v1, v3, v2, v0}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 200
    invoke-static {p1, v1}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public startConnection(JLio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;",
            "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 442
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    if-nez v0, :cond_0

    .line 443
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClientFactory:Lio/flutter/plugins/inapppurchase/BillingClientFactory;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->applicationContext:Landroid/content/Context;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->callbackApi:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;

    .line 444
    invoke-interface {v0, v1, v2, p3, p4}, Lio/flutter/plugins/inapppurchase/BillingClientFactory;->createBillingClient(Landroid/content/Context;Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;)Lcom/android/billingclient/api/BillingClient;

    move-result-object p3

    iput-object p3, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    .line 449
    :cond_0
    :try_start_0
    iget-object p3, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->billingClient:Lcom/android/billingclient/api/BillingClient;

    new-instance p4, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;

    invoke-direct {p4, p0, p5, p1, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;-><init>(Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;Lkotlin/jvm/functions/Function1;J)V

    invoke-virtual {p3, p4}, Lcom/android/billingclient/api/BillingClient;->startConnection(Lcom/android/billingclient/api/BillingClientStateListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 482
    new-instance p2, Lio/flutter/plugins/inapppurchase/FlutterError;

    .line 483
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string p4, "error"

    invoke-direct {p2, p4, p3, p1}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 482
    invoke-static {p5, p2}, Lio/flutter/plugins/inapppurchase/ResultUtilsKt;->completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected updateCachedProducts(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_1

    .line 512
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/ProductDetails;

    .line 513
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->cachedProducts:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails;->getProductId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
