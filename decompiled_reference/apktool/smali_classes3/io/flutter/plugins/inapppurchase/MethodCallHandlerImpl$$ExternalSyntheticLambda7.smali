.class public final synthetic Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/ProductDetailsResponseListener;


# instance fields
.field public final synthetic f$0:Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda7;->f$0:Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;

    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda7;->f$1:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onProductDetailsResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/QueryProductDetailsResult;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda7;->f$0:Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda7;->f$1:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->$r8$lambda$mIovjdaPIDmoGJWhEoE4o8jzW5A(Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/QueryProductDetailsResult;)V

    return-void
.end method
