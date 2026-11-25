.class public final Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\u0014\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005H\u00c6\u0003J3\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005H\u00c6\u0001J\n\u0010\u001a\u001a\u00020\u001bH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;",
        "",
        "billingResult",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
        "productDetails",
        "",
        "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;",
        "unfetchedProductList",
        "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;",
        "<init>",
        "(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;)V",
        "getBillingResult",
        "()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
        "getProductDetails",
        "()Ljava/util/List;",
        "getUnfetchedProductList",
        "toList",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "component3",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;


# instance fields
.field private final billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

.field private final productDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;",
            ">;"
        }
    .end annotation
.end field

.field private final unfetchedProductList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;",
            ">;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unfetchedProductList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 616
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 617
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    .line 618
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    .line 619
    iput-object p3, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->copy(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;",
            ">;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;",
            ">;)",
            "Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unfetchedProductList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;-><init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 639
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

    .line 645
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;

    .line 646
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 647
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 648
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    iget-object p1, p1, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

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

    .line 617
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    return-object v0
.end method

.method public final getProductDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformProductDetails;",
            ">;"
        }
    .end annotation

    .line 618
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    return-object v0
.end method

.method public final getUnfetchedProductList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;",
            ">;"
        }
    .end annotation

    .line 619
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 652
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 653
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 654
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 655
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 632
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    .line 633
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    .line 634
    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 631
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->billingResult:Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->productDetails:Ljava/util/List;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->unfetchedProductList:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PlatformProductDetailsResponse(billingResult="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", productDetails="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", unfetchedProductList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
