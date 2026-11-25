.class Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;
.super Ljava/lang/Object;
.source "ImagePickerDelegate.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/ImagePickerDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PendingCallState"
.end annotation


# instance fields
.field public final callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final imageOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

.field public final videoOptions:Lio/flutter/plugins/imagepicker/VideoSelectionOptions;


# direct methods
.method constructor <init>(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;Lio/flutter/plugins/imagepicker/VideoSelectionOptions;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;",
            "Lio/flutter/plugins/imagepicker/VideoSelectionOptions;",
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

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->imageOptions:Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    .line 115
    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->videoOptions:Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    .line 116
    iput-object p3, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$PendingCallState;->callback:Lkotlin/jvm/functions/Function1;

    return-void
.end method
