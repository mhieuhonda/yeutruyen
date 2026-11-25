.class public final synthetic Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/UserChoiceBillingListener;


# instance fields
.field public final synthetic f$0:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$$ExternalSyntheticLambda1;->f$0:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;

    return-void
.end method


# virtual methods
.method public final userSelectedAlternativeBilling(Lcom/android/billingclient/api/UserChoiceDetails;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl$$ExternalSyntheticLambda1;->f$0:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;

    invoke-static {v0, p1}, Lio/flutter/plugins/inapppurchase/BillingClientFactoryImpl;->lambda$createUserChoiceBillingListener$1(Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;Lcom/android/billingclient/api/UserChoiceDetails;)V

    return-void
.end method
