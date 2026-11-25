.class public final Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0004\u0012\u00020\t0\rJ(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0004\u0012\u00020\t0\rJ(\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;",
        "",
        "binaryMessenger",
        "Lio/flutter/plugin/common/BinaryMessenger;",
        "messageChannelSuffix",
        "",
        "<init>",
        "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V",
        "onBillingServiceDisconnected",
        "",
        "callbackHandleArg",
        "",
        "callback",
        "Lkotlin/Function1;",
        "Lkotlin/Result;",
        "onPurchasesUpdated",
        "updateArg",
        "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;",
        "userSelectedalternativeBilling",
        "detailsArg",
        "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;

.field private static final codec$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

.field private final messageChannelSuffix:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->Companion:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;

    .line 2226
    new-instance v0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->codec$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V
    .locals 1

    const-string v0, "binaryMessenger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageChannelSuffix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2221
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

    .line 2222
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->messageChannelSuffix:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 2222
    const-string p2, ""

    .line 2220
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getCodec$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 2220
    sget-object v0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->codec$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method static final codec_delegate$lambda$0()Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;
    .locals 1

    .line 2226
    new-instance v0, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;

    invoke-direct {v0}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;-><init>()V

    return-object v0
.end method

.method static final onBillingServiceDisconnected$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 2237
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2238
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 2239
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lio/flutter/plugins/inapppurchase/FlutterError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 2241
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 2244
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onPurchasesUpdated$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 2257
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2258
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 2259
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lio/flutter/plugins/inapppurchase/FlutterError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 2261
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 2264
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final userSelectedalternativeBilling$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 2280
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2281
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 2282
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lio/flutter/plugins/inapppurchase/FlutterError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/inapppurchase/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 2284
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 2287
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/inapppurchase/FlutterError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onBillingServiceDisconnected(JLkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2232
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->messageChannelSuffix:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->messageChannelSuffix:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 2234
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2235
    new-instance v1, Lio/flutter/plugin/common/BasicMessageChannel;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

    sget-object v3, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->Companion:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;

    invoke-virtual {v3}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 2236
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda2;

    invoke-direct {p2, p3, v0}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onPurchasesUpdated(Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "updateArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2252
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->messageChannelSuffix:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->messageChannelSuffix:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 2254
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2255
    new-instance v1, Lio/flutter/plugin/common/BasicMessageChannel;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

    sget-object v3, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->Companion:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;

    invoke-virtual {v3}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 2256
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v2, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda1;

    invoke-direct {v2, p2, v0}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v1, p1, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final userSelectedalternativeBilling(Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "detailsArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2275
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->messageChannelSuffix:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->messageChannelSuffix:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 2277
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2278
    new-instance v1, Lio/flutter/plugin/common/BasicMessageChannel;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

    sget-object v3, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi;->Companion:Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;

    invoke-virtual {v3}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$Companion;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 2279
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v2, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda3;

    invoke-direct {v2, p2, v0}, Lio/flutter/plugins/inapppurchase/InAppPurchaseCallbackApi$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v1, p1, v2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method
