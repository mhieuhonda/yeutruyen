.class public final synthetic Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetailsListener;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onAlternativeBillingOnlyTokenResponse(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->lambda$createAlternativeBillingOnlyReportingDetailsAsync$1(Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V

    return-void
.end method
