.class public final Lio/flutter/plugins/imagepicker/VideoSelectionOptions;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/VideoSelectionOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nJ\u0014\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
        "",
        "maxDurationSeconds",
        "",
        "<init>",
        "(Ljava/lang/Long;)V",
        "getMaxDurationSeconds",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "toList",
        "",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "copy",
        "(Ljava/lang/Long;)Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
        "toString",
        "",
        "Companion",
        "image_picker_android_release"
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/VideoSelectionOptions$Companion;


# instance fields
.field private final maxDurationSeconds:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->Companion:Lio/flutter/plugins/imagepicker/VideoSelectionOptions$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;-><init>(Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;)V
    .locals 0

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 367
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 365
    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;-><init>(Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Ljava/lang/Long;ILjava/lang/Object;)Lio/flutter/plugins/imagepicker/VideoSelectionOptions;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    :cond_0
    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->copy(Ljava/lang/Long;)Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;)Lio/flutter/plugins/imagepicker/VideoSelectionOptions;
    .locals 1

    new-instance v0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    invoke-direct {v0, p1}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;-><init>(Ljava/lang/Long;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_2

    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 389
    :cond_1
    check-cast p1, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    .line 390
    sget-object v0, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    iget-object p1, p1, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getMaxDurationSeconds()Ljava/lang/Long;
    .locals 1

    .line 367
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 394
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 395
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 378
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    .line 377
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->maxDurationSeconds:Ljava/lang/Long;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "VideoSelectionOptions(maxDurationSeconds="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
