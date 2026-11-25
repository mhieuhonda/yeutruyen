.class public final Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\n\u0010\u001b\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformBillingResult;",
        "",
        "responseCode",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;",
        "debugMessage",
        "",
        "subResponseCode",
        "",
        "<init>",
        "(Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;Ljava/lang/String;J)V",
        "getResponseCode",
        "()Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;",
        "getDebugMessage",
        "()Ljava/lang/String;",
        "getSubResponseCode",
        "()J",
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
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;


# instance fields
.field private final debugMessage:Ljava/lang/String;

.field private final responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

.field private final subResponseCode:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;Ljava/lang/String;J)V
    .locals 1

    const-string v0, "responseCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 430
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 431
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    .line 432
    iput-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    .line 433
    iput-wide p3, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformBillingResult;Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;Ljava/lang/String;JILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-wide p3, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->copy(Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;Ljava/lang/String;J)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    return-wide v0
.end method

.method public final copy(Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;Ljava/lang/String;J)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;
    .locals 1

    const-string v0, "responseCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;-><init>(Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;Ljava/lang/String;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 453
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

    .line 459
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    .line 460
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 461
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 462
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v3, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p1, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getDebugMessage()Ljava/lang/String;
    .locals 1

    .line 432
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getResponseCode()Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;
    .locals 1

    .line 431
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    return-object v0
.end method

.method public final getSubResponseCode()J
    .locals 2

    .line 433
    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    .line 466
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 467
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 468
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 469
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 446
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    .line 447
    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    .line 448
    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 445
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->responseCode:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    iget-object v1, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->debugMessage:Ljava/lang/String;

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->subResponseCode:J

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PlatformBillingResult(responseCode="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", debugMessage="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subResponseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
