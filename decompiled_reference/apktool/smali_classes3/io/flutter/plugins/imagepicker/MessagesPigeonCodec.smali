.class Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Messages.kt\nio/flutter/plugins/imagepicker/MessagesPigeonCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,764:1\n1#2:765\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0012\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 536
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

    if-ne p1, v0, :cond_1

    .line 540
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/imagepicker/SourceCamera;->Companion:Lio/flutter/plugins/imagepicker/SourceCamera$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/imagepicker/SourceCamera$Companion;->ofRaw(I)Lio/flutter/plugins/imagepicker/SourceCamera;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    const/16 v0, -0x7e

    if-ne p1, v0, :cond_3

    .line 543
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/imagepicker/SourceType;->Companion:Lio/flutter/plugins/imagepicker/SourceType$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/imagepicker/SourceType$Companion;->ofRaw(I)Lio/flutter/plugins/imagepicker/SourceType;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    const/16 v0, -0x7d

    if-ne p1, v0, :cond_5

    .line 546
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/imagepicker/CacheRetrievalType;->Companion:Lio/flutter/plugins/imagepicker/CacheRetrievalType$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/imagepicker/CacheRetrievalType$Companion;->ofRaw(I)Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v1

    :cond_5
    const/16 v0, -0x7c

    if-ne p1, v0, :cond_8

    .line 549
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_6

    check-cast p1, Ljava/util/List;

    goto :goto_0

    :cond_6
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_7

    sget-object p2, Lio/flutter/plugins/imagepicker/GeneralOptions;->Companion:Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/imagepicker/GeneralOptions;

    move-result-object p1

    return-object p1

    :cond_7
    return-object v1

    :cond_8
    const/16 v0, -0x7b

    if-ne p1, v0, :cond_b

    .line 552
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_9

    check-cast p1, Ljava/util/List;

    goto :goto_1

    :cond_9
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_a

    sget-object p2, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->Companion:Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    move-result-object p1

    return-object p1

    :cond_a
    return-object v1

    :cond_b
    const/16 v0, -0x7a

    if-ne p1, v0, :cond_e

    .line 555
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_c

    check-cast p1, Ljava/util/List;

    goto :goto_2

    :cond_c
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_d

    sget-object p2, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->Companion:Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/imagepicker/MediaSelectionOptions;

    move-result-object p1

    return-object p1

    :cond_d
    return-object v1

    :cond_e
    const/16 v0, -0x79

    if-ne p1, v0, :cond_11

    .line 558
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_f

    check-cast p1, Ljava/util/List;

    goto :goto_3

    :cond_f
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_10

    sget-object p2, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->Companion:Lio/flutter/plugins/imagepicker/VideoSelectionOptions$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    move-result-object p1

    return-object p1

    :cond_10
    return-object v1

    :cond_11
    const/16 v0, -0x78

    if-ne p1, v0, :cond_14

    .line 561
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_12

    check-cast p1, Ljava/util/List;

    goto :goto_4

    :cond_12
    move-object p1, v1

    :goto_4
    if-eqz p1, :cond_13

    sget-object p2, Lio/flutter/plugins/imagepicker/SourceSpecification;->Companion:Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/imagepicker/SourceSpecification;

    move-result-object p1

    return-object p1

    :cond_13
    return-object v1

    :cond_14
    const/16 v0, -0x77

    if-ne p1, v0, :cond_17

    .line 564
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_15

    check-cast p1, Ljava/util/List;

    goto :goto_5

    :cond_15
    move-object p1, v1

    :goto_5
    if-eqz p1, :cond_16

    sget-object p2, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->Companion:Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    move-result-object p1

    return-object p1

    :cond_16
    return-object v1

    :cond_17
    const/16 v0, -0x76

    if-ne p1, v0, :cond_1a

    .line 567
    invoke-virtual {p0, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_18

    check-cast p1, Ljava/util/List;

    goto :goto_6

    :cond_18
    move-object p1, v1

    :goto_6
    if-eqz p1, :cond_19

    sget-object p2, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->Companion:Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    move-result-object p1

    return-object p1

    :cond_19
    return-object v1

    .line 569
    :cond_1a
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 575
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/SourceCamera;

    if-eqz v0, :cond_0

    const/16 v0, 0x81

    .line 576
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 577
    check-cast p2, Lio/flutter/plugins/imagepicker/SourceCamera;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/SourceCamera;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 579
    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/SourceType;

    if-eqz v0, :cond_1

    const/16 v0, 0x82

    .line 580
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 581
    check-cast p2, Lio/flutter/plugins/imagepicker/SourceType;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/SourceType;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 583
    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    if-eqz v0, :cond_2

    const/16 v0, 0x83

    .line 584
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 585
    check-cast p2, Lio/flutter/plugins/imagepicker/CacheRetrievalType;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/CacheRetrievalType;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 587
    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/GeneralOptions;

    if-eqz v0, :cond_3

    const/16 v0, 0x84

    .line 588
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 589
    check-cast p2, Lio/flutter/plugins/imagepicker/GeneralOptions;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/GeneralOptions;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 591
    :cond_3
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    if-eqz v0, :cond_4

    const/16 v0, 0x85

    .line 592
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 593
    check-cast p2, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/ImageSelectionOptions;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 595
    :cond_4
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;

    if-eqz v0, :cond_5

    const/16 v0, 0x86

    .line 596
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 597
    check-cast p2, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/MediaSelectionOptions;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 599
    :cond_5
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    if-eqz v0, :cond_6

    const/16 v0, 0x87

    .line 600
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 601
    check-cast p2, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/VideoSelectionOptions;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 603
    :cond_6
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/SourceSpecification;

    if-eqz v0, :cond_7

    const/16 v0, 0x88

    .line 604
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 605
    check-cast p2, Lio/flutter/plugins/imagepicker/SourceSpecification;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/SourceSpecification;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 607
    :cond_7
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    if-eqz v0, :cond_8

    const/16 v0, 0x89

    .line 608
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 609
    check-cast p2, Lio/flutter/plugins/imagepicker/CacheRetrievalError;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/CacheRetrievalError;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 611
    :cond_8
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    if-eqz v0, :cond_9

    const/16 v0, 0x8a

    .line 612
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 613
    check-cast p2, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/CacheRetrievalResult;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 615
    :cond_9
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method
