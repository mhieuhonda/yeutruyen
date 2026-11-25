.class public final Lio/flutter/plugins/imagepicker/ImageSelectionOptions;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\'\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J0\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
        "",
        "maxWidth",
        "",
        "maxHeight",
        "quality",
        "",
        "<init>",
        "(Ljava/lang/Double;Ljava/lang/Double;J)V",
        "getMaxWidth",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getMaxHeight",
        "getQuality",
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
        "(Ljava/lang/Double;Ljava/lang/Double;J)Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;


# instance fields
.field private final maxHeight:Ljava/lang/Double;

.field private final maxWidth:Ljava/lang/Double;

.field private final quality:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->Companion:Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;J)V
    .locals 0

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 278
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    .line 280
    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    .line 286
    iput-wide p3, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Double;Ljava/lang/Double;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    .line 276
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;-><init>(Ljava/lang/Double;Ljava/lang/Double;J)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Ljava/lang/Double;Ljava/lang/Double;JILjava/lang/Object;)Lio/flutter/plugins/imagepicker/ImageSelectionOptions;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-wide p3, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->copy(Ljava/lang/Double;Ljava/lang/Double;J)Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/Double;Ljava/lang/Double;J)Lio/flutter/plugins/imagepicker/ImageSelectionOptions;
    .locals 1

    new-instance v0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;-><init>(Ljava/lang/Double;Ljava/lang/Double;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 306
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

    .line 312
    :cond_1
    check-cast p1, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    .line 313
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    iget-object v4, p1, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 314
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    iget-object v4, p1, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 315
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-wide v3, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p1, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getMaxHeight()Ljava/lang/Double;
    .locals 1

    .line 280
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    return-object v0
.end method

.method public final getMaxWidth()Ljava/lang/Double;
    .locals 1

    .line 278
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    return-object v0
.end method

.method public final getQuality()J
    .locals 2

    .line 286
    iget-wide v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    .line 319
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 320
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 321
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 322
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-wide v2, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

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

    .line 299
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    .line 300
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    .line 301
    iget-wide v2, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 298
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxWidth:Ljava/lang/Double;

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->maxHeight:Ljava/lang/Double;

    iget-wide v2, p0, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->quality:J

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ImageSelectionOptions(maxWidth="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", maxHeight="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", quality="

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
