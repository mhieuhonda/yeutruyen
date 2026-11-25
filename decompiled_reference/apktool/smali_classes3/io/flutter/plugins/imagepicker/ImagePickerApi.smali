.class public interface abstract Lio/flutter/plugins/imagepicker/ImagePickerApi;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/ImagePickerApi$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u000c\u0012\u0004\u0012\u00020\u00030\u000bH&J@\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0008\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u000c\u0012\u0004\u0012\u00020\u00030\u000bH&J8\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0008\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u000c\u0012\u0004\u0012\u00020\u00030\u000bH&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/ImagePickerApi;",
        "",
        "pickImages",
        "",
        "source",
        "Lio/flutter/plugins/imagepicker/SourceSpecification;",
        "options",
        "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
        "generalOptions",
        "Lio/flutter/plugins/imagepicker/GeneralOptions;",
        "callback",
        "Lkotlin/Function1;",
        "Lkotlin/Result;",
        "",
        "",
        "pickVideos",
        "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
        "pickMedia",
        "mediaSelectionOptions",
        "Lio/flutter/plugins/imagepicker/MediaSelectionOptions;",
        "retrieveLostResults",
        "Lio/flutter/plugins/imagepicker/CacheRetrievalResult;",
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/ImagePickerApi$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/flutter/plugins/imagepicker/ImagePickerApi$Companion;->$$INSTANCE:Lio/flutter/plugins/imagepicker/ImagePickerApi$Companion;

    sput-object v0, Lio/flutter/plugins/imagepicker/ImagePickerApi;->Companion:Lio/flutter/plugins/imagepicker/ImagePickerApi$Companion;

    return-void
.end method


# virtual methods
.method public abstract pickImages(Lio/flutter/plugins/imagepicker/SourceSpecification;Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/SourceSpecification;",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/GeneralOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract pickMedia(Lio/flutter/plugins/imagepicker/MediaSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/MediaSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/GeneralOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract pickVideos(Lio/flutter/plugins/imagepicker/SourceSpecification;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lio/flutter/plugins/imagepicker/GeneralOptions;Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/SourceSpecification;",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/GeneralOptions;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract retrieveLostResults()Lio/flutter/plugins/imagepicker/CacheRetrievalResult;
.end method
