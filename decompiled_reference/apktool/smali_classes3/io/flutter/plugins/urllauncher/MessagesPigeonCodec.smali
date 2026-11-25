.class Lio/flutter/plugins/urllauncher/MessagesPigeonCodec;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Messages.kt\nio/flutter/plugins/urllauncher/MessagesPigeonCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0012\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/flutter/plugins/urllauncher/MessagesPigeonCodec;",
        "Lio/flutter/plugin/common/StandardMessageCodec;",
        "<init>",
        "()V",
        "readValueOfType",
        "",
        "type",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "writeValue",
        "",
        "stream",
        "Ljava/io/ByteArrayOutputStream;",
        "value",
        "url_launcher_android_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 282
    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

    return-void
.end method


# virtual methods
.method protected readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 2

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, -0x7f

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    .line 286
    invoke-virtual {p0, p2}, Lio/flutter/plugins/urllauncher/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    sget-object p2, Lio/flutter/plugins/urllauncher/WebViewOptions;->Companion:Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/urllauncher/WebViewOptions;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    const/16 v0, -0x7e

    if-ne p1, v0, :cond_5

    .line 289
    invoke-virtual {p0, p2}, Lio/flutter/plugins/urllauncher/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_3

    check-cast p1, Ljava/util/List;

    goto :goto_1

    :cond_3
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_4

    sget-object p2, Lio/flutter/plugins/urllauncher/BrowserOptions;->Companion:Lio/flutter/plugins/urllauncher/BrowserOptions$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/urllauncher/BrowserOptions$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/urllauncher/BrowserOptions;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v1

    .line 291
    :cond_5
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    instance-of v0, p2, Lio/flutter/plugins/urllauncher/WebViewOptions;

    if-eqz v0, :cond_0

    const/16 v0, 0x81

    .line 298
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 299
    check-cast p2, Lio/flutter/plugins/urllauncher/WebViewOptions;

    invoke-virtual {p2}, Lio/flutter/plugins/urllauncher/WebViewOptions;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/urllauncher/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 301
    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/urllauncher/BrowserOptions;

    if-eqz v0, :cond_1

    const/16 v0, 0x82

    .line 302
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 303
    check-cast p2, Lio/flutter/plugins/urllauncher/BrowserOptions;

    invoke-virtual {p2}, Lio/flutter/plugins/urllauncher/BrowserOptions;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/urllauncher/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 305
    :cond_1
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method
