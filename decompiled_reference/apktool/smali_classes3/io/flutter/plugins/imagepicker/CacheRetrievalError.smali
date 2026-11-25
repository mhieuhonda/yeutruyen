.class public final Lio/flutter/plugins/imagepicker/CacheRetrievalError;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0086\u0008\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/CacheRetrievalError;",
        "",
        "code",
        "",
        "message",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "getMessage",
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;


# instance fields
.field private final code:Ljava/lang/String;

.field private final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->Companion:Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 448
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/CacheRetrievalError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/flutter/plugins/imagepicker/CacheRetrievalError;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->copy(Ljava/lang/String;Ljava/lang/String;)Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lio/flutter/plugins/imagepicker/CacheRetrievalError;
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/imagepicker/CacheRetrievalError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 465
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

    .line 471
    :cond_1
    check-cast p1, Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    .line 472
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 473
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    iget-object p1, p1, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 448
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 448
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 477
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 478
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 479
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

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

    const/4 v0, 0x2

    .line 459
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 460
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 458
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->code:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->message:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CacheRetrievalError(code="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", message="

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
