.class public interface abstract Lio/flutter/plugins/inapppurchase/InAppPurchaseApi;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/InAppPurchaseApi$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000 ,2\u00020\u0001:\u0001,J\u0008\u0010\u0002\u001a\u00020\u0003H&J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\u0008\u0010\u0010\u001a\u00020\u0005H&J\"\u0010\u0011\u001a\u00020\u00052\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H&J*\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J*\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J*\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J0\u0010\u001e\u001a\u00020\u00052\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 2\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\"0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\"\u0010&\u001a\u00020\u00052\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\"\u0010\'\u001a\u00020\u00052\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\"\u0010(\u001a\u00020\u00052\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020)0\u000e\u0012\u0004\u0012\u00020\u00050\rH&J\"\u0010*\u001a\u00020\u00052\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020+0\u000e\u0012\u0004\u0012\u00020\u00050\rH&\u00a8\u0006-\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/InAppPurchaseApi;",
        "",
        "isReady",
        "",
        "startConnection",
        "",
        "callbackHandle",
        "",
        "billingMode",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;",
        "pendingPurchasesParams",
        "Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;",
        "callback",
        "Lkotlin/Function1;",
        "Lkotlin/Result;",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
        "endConnection",
        "getBillingConfigAsync",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;",
        "launchBillingFlow",
        "params",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;",
        "acknowledgePurchase",
        "purchaseToken",
        "",
        "consumeAsync",
        "queryPurchasesAsync",
        "productType",
        "Lio/flutter/plugins/inapppurchase/PlatformProductType;",
        "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;",
        "queryProductDetailsAsync",
        "products",
        "",
        "Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;",
        "Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;",
        "isFeatureSupported",
        "feature",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;",
        "isAlternativeBillingOnlyAvailableAsync",
        "showAlternativeBillingOnlyInformationDialog",
        "createAlternativeBillingOnlyReportingDetailsAsync",
        "Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;",
        "showInAppMessages",
        "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;",
        "Companion",
        "in_app_purchase_android_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/flutter/plugins/inapppurchase/InAppPurchaseApi$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/flutter/plugins/inapppurchase/InAppPurchaseApi$Companion;->$$INSTANCE:Lio/flutter/plugins/inapppurchase/InAppPurchaseApi$Companion;

    sput-object v0, Lio/flutter/plugins/inapppurchase/InAppPurchaseApi;->Companion:Lio/flutter/plugins/inapppurchase/InAppPurchaseApi$Companion;

    return-void
.end method


# virtual methods
.method public abstract acknowledgePurchase(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract consumeAsync(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract createAlternativeBillingOnlyReportingDetailsAsync(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract endConnection()V
.end method

.method public abstract getBillingConfigAsync(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract isAlternativeBillingOnlyAvailableAsync(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract isFeatureSupported(Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;)Z
.end method

.method public abstract isReady()Z
.end method

.method public abstract launchBillingFlow(Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
.end method

.method public abstract queryProductDetailsAsync(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract queryPurchasesAsync(Lio/flutter/plugins/inapppurchase/PlatformProductType;Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract showAlternativeBillingOnlyInformationDialog(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract showInAppMessages(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract startConnection(JLio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;Lkotlin/jvm/functions/Function1;)V
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
.end method
