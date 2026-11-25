.class Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;
.super Ljava/lang/Object;
.source "MethodCallHandlerImpl.java"

# interfaces
.implements Lcom/android/billingclient/api/BillingClientStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->startConnection(JLio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private alreadyFinished:Z

.field final synthetic this$0:Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;

.field final synthetic val$callback:Lkotlin/jvm/functions/Function1;

.field final synthetic val$handle:J


# direct methods
.method constructor <init>(Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;Lkotlin/jvm/functions/Function1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 450
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->this$0:Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;

    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->val$callback:Lkotlin/jvm/functions/Function1;

    iput-wide p3, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->val$handle:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 451
    iput-boolean p1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->alreadyFinished:Z

    return-void
.end method

.method static synthetic lambda$onBillingServiceDisconnected$0(Lio/flutter/plugins/inapppurchase/ResultCompat;)Lkotlin/Unit;
    .locals 2

    .line 471
    invoke-virtual {p0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->exceptionOrNull()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 473
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onBillingServiceDisconnected handler error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "IN_APP_PURCHASE"

    invoke-static {v0, p0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public onBillingServiceDisconnected()V
    .locals 4

    .line 467
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->this$0:Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;

    iget-object v0, v0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl;->callbackApi:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;

    iget-wide v1, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->val$handle:J

    new-instance v3, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1$$ExternalSyntheticLambda0;

    invoke-direct {v3}, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1$$ExternalSyntheticLambda0;-><init>()V

    .line 469
    invoke-static {v3}, Lio/flutter/plugins/inapppurchase/ResultCompat;->asCompatCallback(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v3

    .line 467
    invoke-virtual {v0, v1, v2, v3}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->onBillingServiceDisconnected(JLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onBillingSetupFinished(Lcom/android/billingclient/api/BillingResult;)V
    .locals 1

    .line 455
    iget-boolean v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->alreadyFinished:Z

    if-eqz v0, :cond_0

    .line 456
    const-string p1, "InAppPurchasePlugin"

    const-string v0, "Tried to call onBillingSetupFinished multiple times."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 459
    iput-boolean v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->alreadyFinished:Z

    .line 462
    invoke-static {p1}, Lio/flutter/plugins/inapppurchase/TranslatorKt;->fromBillingResult(Lcom/android/billingclient/api/BillingResult;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/MethodCallHandlerImpl$1;->val$callback:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lio/flutter/plugins/inapppurchase/ResultCompat;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
