.class public final Lio/flutter/plugins/imagepicker/CacheRetrievalResult;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\u0014\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J/\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001J\n\u0010\u001b\u001a\u00020\u0008H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/CacheRetrievalResult;",
        "",
        "type",
        "Lio/flutter/plugins/imagepicker/CacheRetrievalType;",
        "error",
        "Lio/flutter/plugins/imagepicker/CacheRetrievalError;",
        "paths",
        "",
        "",
        "<init>",
        "(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)V",
        "getType",
        "()Lio/flutter/plugins/imagepicker/CacheRetrievalType;",
        "getError",
        "()Lio/flutter/plugins/imagepicker/CacheRetrievalError;",
        "getPaths",
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;


# instance fields
.field private final error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

.field private final paths:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->Companion:Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/CacheRetrievalType;",
            "Lio/flutter/plugins/imagepicker/CacheRetrievalError;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paths"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 491
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    .line 493
    iput-object p2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    .line 495
    iput-object p3, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 489
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;-><init>(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/imagepicker/CacheRetrievalResult;Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;ILjava/lang/Object;)Lio/flutter/plugins/imagepicker/CacheRetrievalResult;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->copy(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/flutter/plugins/imagepicker/CacheRetrievalType;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    return-object v0
.end method

.method public final component2()Lio/flutter/plugins/imagepicker/CacheRetrievalError;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)Lio/flutter/plugins/imagepicker/CacheRetrievalResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/CacheRetrievalType;",
            "Lio/flutter/plugins/imagepicker/CacheRetrievalError;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/plugins/imagepicker/CacheRetrievalResult;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paths"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    invoke-direct {v0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;-><init>(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 515
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

    .line 521
    :cond_1
    check-cast p1, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    .line 522
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    iget-object v4, p1, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 523
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    iget-object v4, p1, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 524
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    iget-object p1, p1, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getError()Lio/flutter/plugins/imagepicker/CacheRetrievalError;
    .locals 1

    .line 493
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    return-object v0
.end method

.method public final getPaths()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 495
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Lio/flutter/plugins/imagepicker/CacheRetrievalType;
    .locals 1

    .line 491
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 528
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 529
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 530
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 531
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

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

    .line 508
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    .line 509
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    .line 510
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 507
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->type:Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->error:Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->paths:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CacheRetrievalResult(type="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", error="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paths="

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
