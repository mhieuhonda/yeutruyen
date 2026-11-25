.class public final Lio/flutter/plugins/imagepicker/MediaSelectionOptions;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\u0014\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/MediaSelectionOptions;",
        "",
        "imageSelectionOptions",
        "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
        "<init>",
        "(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)V",
        "getImageSelectionOptions",
        "()Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
        "toList",
        "",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;


# instance fields
.field private final imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->Companion:Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)V
    .locals 1

    const-string v0, "imageSelectionOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/imagepicker/MediaSelectionOptions;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;ILjava/lang/Object;)Lio/flutter/plugins/imagepicker/MediaSelectionOptions;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    :cond_0
    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->copy(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)Lio/flutter/plugins/imagepicker/MediaSelectionOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/flutter/plugins/imagepicker/ImageSelectionOptions;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    return-object v0
.end method

.method public final copy(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)Lio/flutter/plugins/imagepicker/MediaSelectionOptions;
    .locals 1

    const-string v0, "imageSelectionOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;

    invoke-direct {v0, p1}, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;-><init>(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_2

    .line 343
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

    .line 349
    :cond_1
    check-cast p1, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;

    .line 350
    sget-object v0, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    iget-object p1, p1, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getImageSelectionOptions()Lio/flutter/plugins/imagepicker/ImageSelectionOptions;
    .locals 1

    .line 328
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 354
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 355
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

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

    .line 338
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    .line 337
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->imageSelectionOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MediaSelectionOptions(imageSelectionOptions="

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
