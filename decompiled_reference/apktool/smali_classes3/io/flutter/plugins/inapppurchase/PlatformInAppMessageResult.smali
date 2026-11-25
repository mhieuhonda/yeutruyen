.class public final Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0086\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\n\u0010\u0016\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;",
        "",
        "responseCode",
        "Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;",
        "purchaseToken",
        "",
        "<init>",
        "(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;)V",
        "getResponseCode",
        "()Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;",
        "getPurchaseToken",
        "()Ljava/lang/String;",
        "toList",
        "",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;


# instance fields
.field private final purchaseToken:Ljava/lang/String;

.field private final responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->Companion:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;)V
    .locals 1

    const-string v0, "responseCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 714
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 716
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    .line 718
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 714
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;-><init>(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;ILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->copy(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;)Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;)Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;
    .locals 1

    const-string v0, "responseCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;-><init>(Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 736
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

    .line 742
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;

    .line 743
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 744
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    iget-object p1, p1, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getPurchaseToken()Ljava/lang/String;
    .locals 1

    .line 718
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponseCode()Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;
    .locals 1

    .line 716
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 748
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 749
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 750
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

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

    .line 730
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    .line 731
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 729
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->purchaseToken:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "PlatformInAppMessageResult(responseCode="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", purchaseToken="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
