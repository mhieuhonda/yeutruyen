.class public final Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\u0014\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;",
        "",
        "billingResult",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
        "purchases",
        "",
        "Lio/flutter/plugins/inapppurchase/PlatformPurchase;",
        "<init>",
        "(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)V",
        "getBillingResult",
        "()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
        "getPurchases",
        "()Ljava/util/List;",
        "toList",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "copy",
        "toString",
        "",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse$Companion;


# instance fields
.field private final billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

.field private final purchases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchases"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1239
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    .line 1240
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;ILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->copy(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchase;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchase;",
            ">;)",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchases"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;-><init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    .line 1264
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    .line 1265
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1266
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    iget-object p1, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getBillingResult()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
    .locals 1

    .line 1239
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    return-object v0
.end method

.method public final getPurchases()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchase;",
            ">;"
        }
    .end annotation

    .line 1240
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1270
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1271
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1272
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1252
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    .line 1253
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 1251
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->purchases:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "PlatformPurchasesResponse(billingResult="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", purchases="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
