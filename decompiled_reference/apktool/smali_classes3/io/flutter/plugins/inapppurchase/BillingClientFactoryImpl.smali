.class final Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl;
.super Ljava/lang/Object;
.source "BillingClientFactoryImpl.java"

# interfaces
.implements Lio/flutter/plugins/inapppurchase/BillingClientFactory;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$createUserChoiceBillingListener$0(Lio/flutter/plugins/inapppurchase/ResultCompat;)Lkotlin/Unit;
    .locals 2

    .line 58
    invoke-virtual {p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->exceptionOrNull()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "userSelectedalternativeBilling handler error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "IN_APP_PURCHASE"

    invoke-static {v0, p0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static synthetic lambda$createUserChoiceBillingListener$1(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;Lcom/android/billingclient/api/UserChoiceDetails;)V
    .locals 1

    .line 55
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromUserChoiceDetails(Lcom/android/billingclient/api/UserChoiceDetails;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$$ExternalSyntheticLambda0;-><init>()V

    .line 56
    invoke-static {v0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->asCompatCallback(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    .line 54
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->userSelectedalternativeBilling(Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public createBillingClient(Landroid/content/Context;Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;)Lcom/android/billingclient/api/BillingClient;
    .locals 1

    .line 28
    invoke-static {p1}, Lcom/android/billingclient/api/BillingClient;->newBuilder(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    .line 29
    invoke-static {p4}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->toPendingPurchasesParams(Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;)Lcom/android/billingclient/api/PendingPurchasesParams;

    move-result-object p4

    invoke-virtual {p1, p4}, Lcom/android/billingclient/api/BillingClient$Builder;->enablePendingPurchases(Lcom/android/billingclient/api/PendingPurchasesParams;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    .line 30
    sget-object p4, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$1;->$SwitchMap$io$flutter$plugins$inapppurchase$PlatformBillingChoiceMode:[I

    invoke-virtual {p3}, Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;->ordinal()I

    move-result v0

    aget p4, p4, v0

    const/4 v0, 0x1

    if-eq p4, v0, :cond_1

    const/4 v0, 0x2

    if-eq p4, v0, :cond_0

    const/4 v0, 0x3

    if-eq p4, v0, :cond_2

    .line 42
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Unknown BillingChoiceMode "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p3

    const-string p4, ", Defaulting to PLAY_BILLING_ONLY"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "BillingClientFactoryImpl"

    invoke-static {p4, p3}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl;->createUserChoiceBillingListener(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;)Lcom/android/billingclient/api/UserChoiceBillingListener;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/android/billingclient/api/BillingClient$Builder;->enableUserChoiceBilling(Lcom/android/billingclient/api/UserChoiceBillingListener;)Lcom/android/billingclient/api/BillingClient$Builder;

    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingClient$Builder;->enableAlternativeBillingOnly()Lcom/android/billingclient/api/BillingClient$Builder;

    .line 47
    :cond_2
    :goto_0
    new-instance p3, Lio/flutter/plugins/inapppurchase/PluginPurchaseListener;

    invoke-direct {p3, p2}, Lio/flutter/plugins/inapppurchase/PluginPurchaseListener;-><init>(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;)V

    invoke-virtual {p1, p3}, Lcom/android/billingclient/api/BillingClient$Builder;->setListener(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingClient$Builder;->build()Lcom/android/billingclient/api/BillingClient;

    move-result-object p1

    return-object p1
.end method

.method createUserChoiceBillingListener(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;)Lcom/android/billingclient/api/UserChoiceBillingListener;
    .locals 1

    .line 53
    new-instance v0, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$$ExternalSyntheticLambda1;-><init>(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;)V

    return-object v0
.end method
