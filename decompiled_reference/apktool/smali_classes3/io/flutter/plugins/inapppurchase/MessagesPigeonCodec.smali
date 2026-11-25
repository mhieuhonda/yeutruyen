.class Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMessages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Messages.kt\nio/flutter/plugins/inapppurchase/MessagesPigeonCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2292:1\n1#2:2293\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0012\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;",
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
        "in_app_purchase_android_release"
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

    .line 1566
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

    .line 1570
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingResponse$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingResponse$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    const/16 v0, -0x7e

    if-ne p1, v0, :cond_3

    .line 1573
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    const/16 v0, -0x7d

    if-ne p1, v0, :cond_5

    .line 1576
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->Companion:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v1

    :cond_5
    const/16 v0, -0x7c

    if-ne p1, v0, :cond_7

    .line 1579
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformProductType;->Companion:Lio/flutter/plugins/inapppurchase/PlatformProductType$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformProductType$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformProductType;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v1

    :cond_7
    const/16 v0, -0x7b

    if-ne p1, v0, :cond_9

    .line 1582
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_8

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;

    move-result-object p1

    return-object p1

    :cond_8
    return-object v1

    :cond_9
    const/16 v0, -0x7a

    if-ne p1, v0, :cond_b

    .line 1585
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_a

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    move-result-object p1

    return-object p1

    :cond_a
    return-object v1

    :cond_b
    const/16 v0, -0x79

    if-ne p1, v0, :cond_d

    .line 1588
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_c

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchaseState$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseState$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;

    move-result-object p1

    return-object p1

    :cond_c
    return-object v1

    :cond_d
    const/16 v0, -0x78

    if-ne p1, v0, :cond_f

    .line 1591
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_e

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;->Companion:Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode$Companion;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode$Companion;->ofRaw(I)Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;

    move-result-object p1

    return-object p1

    :cond_e
    return-object v1

    :cond_f
    const/16 v0, -0x77

    if-ne p1, v0, :cond_12

    .line 1594
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_10

    check-cast p1, Ljava/util/List;

    goto :goto_0

    :cond_10
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_11

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;->Companion:Lio/flutter/plugins/inapppurchase/PlatformQueryProduct$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformQueryProduct$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;

    move-result-object p1

    return-object p1

    :cond_11
    return-object v1

    :cond_12
    const/16 v0, -0x76

    if-ne p1, v0, :cond_15

    .line 1597
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_13

    check-cast p1, Ljava/util/List;

    goto :goto_1

    :cond_13
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_14

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;->Companion:Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;

    move-result-object p1

    return-object p1

    :cond_14
    return-object v1

    :cond_15
    const/16 v0, -0x75

    if-ne p1, v0, :cond_18

    .line 1600
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_16

    check-cast p1, Ljava/util/List;

    goto :goto_2

    :cond_16
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_17

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingResult$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    move-result-object p1

    return-object p1

    :cond_17
    return-object v1

    :cond_18
    const/16 v0, -0x74

    if-ne p1, v0, :cond_1b

    .line 1603
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_19

    check-cast p1, Ljava/util/List;

    goto :goto_3

    :cond_19
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_1a

    .line 1604
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;->Companion:Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;

    move-result-object p1

    return-object p1

    :cond_1a
    return-object v1

    :cond_1b
    const/16 v0, -0x73

    if-ne p1, v0, :cond_1e

    .line 1608
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_1c

    check-cast p1, Ljava/util/List;

    goto :goto_4

    :cond_1c
    move-object p1, v1

    :goto_4
    if-eqz p1, :cond_1d

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformProductDetails;->Companion:Lio/flutter/plugins/inapppurchase/PlatformProductDetails$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformProductDetails$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformProductDetails;

    move-result-object p1

    return-object p1

    :cond_1d
    return-object v1

    :cond_1e
    const/16 v0, -0x72

    if-ne p1, v0, :cond_21

    .line 1611
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_1f

    check-cast p1, Ljava/util/List;

    goto :goto_5

    :cond_1f
    move-object p1, v1

    :goto_5
    if-eqz p1, :cond_20

    .line 1612
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;

    move-result-object p1

    return-object p1

    :cond_20
    return-object v1

    :cond_21
    const/16 v0, -0x71

    if-ne p1, v0, :cond_24

    .line 1616
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_22

    check-cast p1, Ljava/util/List;

    goto :goto_6

    :cond_22
    move-object p1, v1

    :goto_6
    if-eqz p1, :cond_23

    .line 1617
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;

    move-result-object p1

    return-object p1

    :cond_23
    return-object v1

    :cond_24
    const/16 v0, -0x70

    if-ne p1, v0, :cond_27

    .line 1621
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_25

    check-cast p1, Ljava/util/List;

    goto :goto_7

    :cond_25
    move-object p1, v1

    :goto_7
    if-eqz p1, :cond_26

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->Companion:Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;

    move-result-object p1

    return-object p1

    :cond_26
    return-object v1

    :cond_27
    const/16 v0, -0x6f

    if-ne p1, v0, :cond_2a

    .line 1624
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_28

    check-cast p1, Ljava/util/List;

    goto :goto_8

    :cond_28
    move-object p1, v1

    :goto_8
    if-eqz p1, :cond_29

    .line 1625
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;

    move-result-object p1

    return-object p1

    :cond_29
    return-object v1

    :cond_2a
    const/16 v0, -0x6e

    if-ne p1, v0, :cond_2d

    .line 1629
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_2b

    check-cast p1, Ljava/util/List;

    goto :goto_9

    :cond_2b
    move-object p1, v1

    :goto_9
    if-eqz p1, :cond_2c

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;

    move-result-object p1

    return-object p1

    :cond_2c
    return-object v1

    :cond_2d
    const/16 v0, -0x6d

    if-ne p1, v0, :cond_30

    .line 1632
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_2e

    check-cast p1, Ljava/util/List;

    goto :goto_a

    :cond_2e
    move-object p1, v1

    :goto_a
    if-eqz p1, :cond_2f

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPricingPhase$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformPricingPhase$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;

    move-result-object p1

    return-object p1

    :cond_2f
    return-object v1

    :cond_30
    const/16 v0, -0x6c

    if-ne p1, v0, :cond_33

    .line 1635
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_31

    check-cast p1, Ljava/util/List;

    goto :goto_b

    :cond_31
    move-object p1, v1

    :goto_b
    if-eqz p1, :cond_32

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformPurchase;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchase$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformPurchase$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchase;

    move-result-object p1

    return-object p1

    :cond_32
    return-object v1

    :cond_33
    const/16 v0, -0x6b

    if-ne p1, v0, :cond_36

    .line 1638
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_34

    check-cast p1, Ljava/util/List;

    goto :goto_c

    :cond_34
    move-object p1, v1

    :goto_c
    if-eqz p1, :cond_35

    .line 1639
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;

    move-result-object p1

    return-object p1

    :cond_35
    return-object v1

    :cond_36
    const/16 v0, -0x6a

    if-ne p1, v0, :cond_39

    .line 1643
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_37

    check-cast p1, Ljava/util/List;

    goto :goto_d

    :cond_37
    move-object p1, v1

    :goto_d
    if-eqz p1, :cond_38

    .line 1644
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;

    move-result-object p1

    return-object p1

    :cond_38
    return-object v1

    :cond_39
    const/16 v0, -0x69

    if-ne p1, v0, :cond_3c

    .line 1648
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_3a

    check-cast p1, Ljava/util/List;

    goto :goto_e

    :cond_3a
    move-object p1, v1

    :goto_e
    if-eqz p1, :cond_3b

    .line 1649
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse;

    move-result-object p1

    return-object p1

    :cond_3b
    return-object v1

    :cond_3c
    const/16 v0, -0x68

    if-ne p1, v0, :cond_3f

    .line 1653
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_3d

    check-cast p1, Ljava/util/List;

    goto :goto_f

    :cond_3d
    move-object p1, v1

    :goto_f
    if-eqz p1, :cond_3e

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    move-result-object p1

    return-object p1

    :cond_3e
    return-object v1

    :cond_3f
    const/16 v0, -0x67

    if-ne p1, v0, :cond_42

    .line 1656
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_40

    check-cast p1, Ljava/util/List;

    goto :goto_10

    :cond_40
    move-object p1, v1

    :goto_10
    if-eqz p1, :cond_41

    .line 1657
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;->Companion:Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;

    move-result-object p1

    return-object p1

    :cond_41
    return-object v1

    :cond_42
    const/16 v0, -0x66

    if-ne p1, v0, :cond_45

    .line 1661
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_43

    check-cast p1, Ljava/util/List;

    goto :goto_11

    :cond_43
    move-object p1, v1

    :goto_11
    if-eqz p1, :cond_44

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->Companion:Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;

    move-result-object p1

    return-object p1

    :cond_44
    return-object v1

    :cond_45
    const/16 v0, -0x65

    if-ne p1, v0, :cond_48

    .line 1664
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_46

    check-cast p1, Ljava/util/List;

    goto :goto_12

    :cond_46
    move-object p1, v1

    :goto_12
    if-eqz p1, :cond_47

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->Companion:Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;

    move-result-object p1

    return-object p1

    :cond_47
    return-object v1

    :cond_48
    const/16 v0, -0x64

    if-ne p1, v0, :cond_4b

    .line 1667
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_49

    check-cast p1, Ljava/util/List;

    goto :goto_13

    :cond_49
    move-object p1, v1

    :goto_13
    if-eqz p1, :cond_4a

    .line 1668
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->Companion:Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;

    move-result-object p1

    return-object p1

    :cond_4a
    return-object v1

    :cond_4b
    const/16 v0, -0x63

    if-ne p1, v0, :cond_4e

    .line 1672
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_4c

    check-cast p1, Ljava/util/List;

    goto :goto_14

    :cond_4c
    move-object p1, v1

    :goto_14
    if-eqz p1, :cond_4d

    .line 1673
    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;

    move-result-object p1

    return-object p1

    :cond_4d
    return-object v1

    :cond_4e
    const/16 v0, -0x62

    if-ne p1, v0, :cond_51

    .line 1677
    invoke-virtual {p0, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/util/List;

    if-eqz p2, :cond_4f

    check-cast p1, Ljava/util/List;

    goto :goto_15

    :cond_4f
    move-object p1, v1

    :goto_15
    if-eqz p1, :cond_50

    sget-object p2, Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;->Companion:Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct$Companion;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct$Companion;->fromList(Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;

    move-result-object p1

    return-object p1

    :cond_50
    return-object v1

    .line 1679
    :cond_51
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1685
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    if-eqz v0, :cond_0

    const/16 v0, 0x81

    .line 1686
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1687
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformBillingResponse;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1689
    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    if-eqz v0, :cond_1

    const/16 v0, 0x82

    .line 1690
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1691
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResponse;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1693
    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    if-eqz v0, :cond_2

    const/16 v0, 0x83

    .line 1694
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1695
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1697
    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformProductType;

    if-eqz v0, :cond_3

    const/16 v0, 0x84

    .line 1698
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1699
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformProductType;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformProductType;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1701
    :cond_3
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;

    if-eqz v0, :cond_4

    const/16 v0, 0x85

    .line 1702
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1703
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformBillingChoiceMode;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1705
    :cond_4
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    if-eqz v0, :cond_5

    const/16 v0, 0x86

    .line 1706
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1707
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1709
    :cond_5
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;

    if-eqz v0, :cond_6

    const/16 v0, 0x87

    .line 1710
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1711
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseState;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1713
    :cond_6
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;

    if-eqz v0, :cond_7

    const/16 v0, 0x88

    .line 1714
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1715
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformRecurrenceMode;->getRaw()I

    move-result p2

    int-to-long v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1717
    :cond_7
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;

    if-eqz v0, :cond_8

    const/16 v0, 0x89

    .line 1718
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1719
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformQueryProduct;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1721
    :cond_8
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;

    if-eqz v0, :cond_9

    const/16 v0, 0x8a

    .line 1722
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1723
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformAccountIdentifiers;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1725
    :cond_9
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    if-eqz v0, :cond_a

    const/16 v0, 0x8b

    .line 1726
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1727
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformBillingResult;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1729
    :cond_a
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;

    if-eqz v0, :cond_b

    const/16 v0, 0x8c

    .line 1730
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1731
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformOneTimePurchaseOfferDetails;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1733
    :cond_b
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformProductDetails;

    if-eqz v0, :cond_c

    const/16 v0, 0x8d

    .line 1734
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1735
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformProductDetails;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformProductDetails;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1737
    :cond_c
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;

    if-eqz v0, :cond_d

    const/16 v0, 0x8e

    .line 1738
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1739
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformProductDetailsResponse;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1741
    :cond_d
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;

    if-eqz v0, :cond_e

    const/16 v0, 0x8f

    .line 1742
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1743
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformAlternativeBillingOnlyReportingDetailsResponse;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1745
    :cond_e
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;

    if-eqz v0, :cond_f

    const/16 v0, 0x90

    .line 1746
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1747
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformInAppMessageResult;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1749
    :cond_f
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;

    if-eqz v0, :cond_10

    const/16 v0, 0x91

    .line 1750
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1751
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformBillingConfigResponse;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1753
    :cond_10
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;

    if-eqz v0, :cond_11

    const/16 v0, 0x92

    .line 1754
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1755
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformBillingFlowParams;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1757
    :cond_11
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;

    if-eqz v0, :cond_12

    const/16 v0, 0x93

    .line 1758
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1759
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPricingPhase;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1761
    :cond_12
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPurchase;

    if-eqz v0, :cond_13

    const/16 v0, 0x94

    .line 1762
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1763
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPurchase;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchase;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1765
    :cond_13
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;

    if-eqz v0, :cond_14

    const/16 v0, 0x95

    .line 1766
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1767
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchaseUpdate;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1769
    :cond_14
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;

    if-eqz v0, :cond_15

    const/16 v0, 0x96

    .line 1770
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1771
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1773
    :cond_15
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse;

    if-eqz v0, :cond_16

    const/16 v0, 0x97

    .line 1774
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1775
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryResponse;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1777
    :cond_16
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    if-eqz v0, :cond_17

    const/16 v0, 0x98

    .line 1778
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1779
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPurchasesResponse;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1781
    :cond_17
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;

    if-eqz v0, :cond_18

    const/16 v0, 0x99

    .line 1782
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1783
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformSubscriptionOfferDetails;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1785
    :cond_18
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;

    if-eqz v0, :cond_19

    const/16 v0, 0x9a

    .line 1786
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1787
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceDetails;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1789
    :cond_19
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;

    if-eqz v0, :cond_1a

    const/16 v0, 0x9b

    .line 1790
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1791
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformUserChoiceProduct;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1793
    :cond_1a
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;

    if-eqz v0, :cond_1b

    const/16 v0, 0x9c

    .line 1794
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1795
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformInstallmentPlanDetails;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1797
    :cond_1b
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;

    if-eqz v0, :cond_1c

    const/16 v0, 0x9d

    .line 1798
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1799
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformPendingPurchasesParams;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1801
    :cond_1c
    instance-of v0, p2, Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;

    if-eqz v0, :cond_1d

    const/16 v0, 0x9e

    .line 1802
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 1803
    check-cast p2, Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;

    invoke-virtual {p2}, Lio/flutter/plugins/inapppurchase/PlatformUnfetchedProduct;->toList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 1805
    :cond_1d
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method
