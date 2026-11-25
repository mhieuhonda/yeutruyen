.class Lio/flutter/plugins/inapppurchase/PluginPurchaseListener;
.super Ljava/lang/Object;
.source "PluginPurchaseListener.java"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesUpdatedListener;


# instance fields
.field private final callbackApi:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;


# direct methods
.method constructor <init>(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/PluginPurchaseListener;->callbackApi:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;

    return-void
.end method

.method static synthetic lambda$onPurchasesUpdated$0(Lio/flutter/plugins/inapppurchase/ResultCompat;)Lkotlin/Unit;
    .locals 2

    .line 36
    invoke-virtual {p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->exceptionOrNull()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onPurchaseUpdated handler error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "IN_APP_PURCHASE"

    invoke-static {v0, p0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 29
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    .line 31
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    invoke-static {p2}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromPurchasesList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;-><init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)V

    .line 32
    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PluginPurchaseListener;->callbackApi:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;

    new-instance p2, Lio/flutter/plugins/inapppurchase/PluginPurchaseListener$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lio/flutter/plugins/inapppurchase/PluginPurchaseListener$$ExternalSyntheticLambda0;-><init>()V

    .line 34
    invoke-static {p2}, Lio/flutter/plugins/inapppurchase/ResultCompat;->asCompatCallback(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    .line 32
    invoke-virtual {p1, v0, p2}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->onPurchasesUpdated(Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
