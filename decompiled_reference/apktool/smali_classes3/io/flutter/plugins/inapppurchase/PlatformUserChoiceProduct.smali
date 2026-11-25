.class public final Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\n\u0010\u0019\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;",
        "",
        "id",
        "",
        "offerToken",
        "type",
        "Lio/flutter/plugins/inapppurchase/PlatformProductType;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;)V",
        "getId",
        "()Ljava/lang/String;",
        "getOfferToken",
        "getType",
        "()Lio/flutter/plugins/inapppurchase/PlatformProductType;",
        "toList",
        "",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;


# instance fields
.field private final id:Ljava/lang/String;

.field private final offerToken:Ljava/lang/String;

.field private final type:Lio/flutter/plugins/inapppurchase/PlatformProductType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->Companion:Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1400
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    .line 1401
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    .line 1402
    iput-object p3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 1399
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;ILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->copy(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/flutter/plugins/inapppurchase/PlatformProductType;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;

    invoke-direct {v0, p1, p2, p3}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/inapppurchase/PlatformProductType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1422
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

    .line 1428
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;

    .line 1429
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1430
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1431
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    iget-object p1, p1, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1400
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getOfferToken()Ljava/lang/String;
    .locals 1

    .line 1401
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lio/flutter/plugins/inapppurchase/PlatformProductType;
    .locals 1

    .line 1402
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1435
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1436
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1437
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1438
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

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

    .line 1415
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    .line 1416
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    .line 1417
    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 1414
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->id:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->offerToken:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->type:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PlatformUserChoiceProduct(id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", offerToken="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

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
