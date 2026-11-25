.class public final synthetic Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesResponseListener;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda3;->f$0:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onQueryPurchasesResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda3;->f$0:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->lambda$queryPurchasesAsync$7(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
