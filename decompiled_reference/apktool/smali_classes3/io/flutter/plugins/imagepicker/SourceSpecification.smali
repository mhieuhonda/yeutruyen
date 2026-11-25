.class public final Lio/flutter/plugins/imagepicker/SourceSpecification;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/SourceSpecification;",
        "",
        "type",
        "Lio/flutter/plugins/imagepicker/SourceType;",
        "camera",
        "Lio/flutter/plugins/imagepicker/SourceCamera;",
        "<init>",
        "(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;)V",
        "getType",
        "()Lio/flutter/plugins/imagepicker/SourceType;",
        "getCamera",
        "()Lio/flutter/plugins/imagepicker/SourceCamera;",
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;


# instance fields
.field private final camera:Lio/flutter/plugins/imagepicker/SourceCamera;

.field private final type:Lio/flutter/plugins/imagepicker/SourceType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/SourceSpecification;->Companion:Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 405
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/SourceSpecification;-><init>(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/imagepicker/SourceSpecification;Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;ILjava/lang/Object;)Lio/flutter/plugins/imagepicker/SourceSpecification;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/SourceSpecification;->copy(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;)Lio/flutter/plugins/imagepicker/SourceSpecification;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/flutter/plugins/imagepicker/SourceType;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    return-object v0
.end method

.method public final component2()Lio/flutter/plugins/imagepicker/SourceCamera;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    return-object v0
.end method

.method public final copy(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;)Lio/flutter/plugins/imagepicker/SourceSpecification;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/imagepicker/SourceSpecification;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/imagepicker/SourceSpecification;-><init>(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 422
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

    .line 428
    :cond_1
    check-cast p1, Lio/flutter/plugins/imagepicker/SourceSpecification;

    .line 429
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    iget-object v4, p1, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 430
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    iget-object p1, p1, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getCamera()Lio/flutter/plugins/imagepicker/SourceCamera;
    .locals 1

    .line 405
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    return-object v0
.end method

.method public final getType()Lio/flutter/plugins/imagepicker/SourceType;
    .locals 1

    .line 405
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 434
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 435
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 436
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

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

    .line 416
    new-array v0, v0, [Ljava/lang/Enum;

    const/4 v1, 0x0

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 417
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    aput-object v2, v0, v1

    .line 415
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->type:Lio/flutter/plugins/imagepicker/SourceType;

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/SourceSpecification;->camera:Lio/flutter/plugins/imagepicker/SourceCamera;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SourceSpecification(type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", camera="

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
