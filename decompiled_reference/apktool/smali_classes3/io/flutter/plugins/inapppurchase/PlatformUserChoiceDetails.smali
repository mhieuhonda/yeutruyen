.class public final Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006J\u0014\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J/\u0010\u0018\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\n\u0010\u0019\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;",
        "",
        "originalExternalTransactionId",
        "",
        "externalTransactionToken",
        "products",
        "",
        "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "getOriginalExternalTransactionId",
        "()Ljava/lang/String;",
        "getExternalTransactionToken",
        "getProducts",
        "()Ljava/util/List;",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;


# instance fields
.field private final externalTransactionToken:Ljava/lang/String;

.field private final originalExternalTransactionId:Ljava/lang/String;

.field private final products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->Companion:Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "externalTransactionToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "products"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1347
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1348
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    .line 1349
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    .line 1350
    iput-object p3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    .line 1347
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;",
            ">;)",
            "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;"
        }
    .end annotation

    const-string v0, "externalTransactionToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "products"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;

    invoke-direct {v0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1371
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

    .line 1377
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;

    .line 1378
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    .line 1379
    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    .line 1378
    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1380
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    .line 1381
    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    .line 1380
    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1382
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    iget-object p1, p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getExternalTransactionToken()Ljava/lang/String;
    .locals 1

    .line 1349
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginalExternalTransactionId()Ljava/lang/String;
    .locals 1

    .line 1348
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getProducts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;",
            ">;"
        }
    .end annotation

    .line 1350
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1386
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1387
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1388
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1389
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

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

    .line 1364
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    .line 1365
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    .line 1366
    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 1363
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->originalExternalTransactionId:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->externalTransactionToken:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->products:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PlatformUserChoiceDetails(originalExternalTransactionId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", externalTransactionToken="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", products="

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
