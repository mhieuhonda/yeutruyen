.class public final Lio/flutter/plugins/imagepicker/FlutterError;
.super Ljava/lang/RuntimeException;
.source "Messages.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0008\u0018\u00002\u00060\u0001j\u0002`\u0002B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0084\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/FlutterError;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "code",
        "",
        "message",
        "details",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V",
        "getCode",
        "()Ljava/lang/String;",
        "getMessage",
        "getDetails",
        "()Ljava/lang/Object;",
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


# instance fields
.field private final code:Ljava/lang/String;

.field private final details:Ljava/lang/Object;

.field private final message:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 188
    iput-object p1, p0, Lio/flutter/plugins/imagepicker/FlutterError;->code:Ljava/lang/String;

    .line 189
    iput-object p2, p0, Lio/flutter/plugins/imagepicker/FlutterError;->message:Ljava/lang/String;

    .line 190
    iput-object p3, p0, Lio/flutter/plugins/imagepicker/FlutterError;->details:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 187
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 188
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/FlutterError;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetails()Ljava/lang/Object;
    .locals 1

    .line 190
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/FlutterError;->details:Ljava/lang/Object;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/FlutterError;->message:Ljava/lang/String;

    return-object v0
.end method
