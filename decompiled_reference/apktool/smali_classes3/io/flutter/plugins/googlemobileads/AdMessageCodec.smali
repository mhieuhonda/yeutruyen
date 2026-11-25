.class Lio/flutter/plugins/googlemobileads/AdMessageCodec;
.super Lio/flutter/plugin/common/StandardMessageCodec;
.source "AdMessageCodec.java"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final VALUE_ADAPTER_RESPONSE_INFO:B = -0x73t

.field private static final VALUE_ADAPTER_STATUS:B = -0x78t

.field private static final VALUE_ADMANAGER_AD_REQUEST:B = -0x7at

.field private static final VALUE_AD_ERROR:B = -0x75t

.field private static final VALUE_AD_REQUEST:B = -0x7ft

.field private static final VALUE_AD_SIZE:B = -0x80t

.field private static final VALUE_ANCHORED_ADAPTIVE_BANNER_AD_SIZE:B = -0x72t

.field private static final VALUE_COLOR:B = -0x67t

.field private static final VALUE_FLUID_AD_SIZE:B = -0x7et

.field private static final VALUE_INITIALIZATION_STATE:B = -0x79t

.field private static final VALUE_INITIALIZATION_STATUS:B = -0x77t

.field private static final VALUE_INLINE_ADAPTIVE_BANNER_AD_SIZE:B = -0x6et

.field private static final VALUE_LOAD_AD_ERROR:B = -0x7bt

.field private static final VALUE_MEDIATION_EXTRAS:B = -0x66t

.field private static final VALUE_NATIVE_AD_OPTIONS:B = -0x70t

.field private static final VALUE_NATIVE_TEMPLATE_FONT_STYLE:B = -0x69t

.field private static final VALUE_NATIVE_TEMPLATE_STYLE:B = -0x6bt

.field private static final VALUE_NATIVE_TEMPLATE_TEXT_STYLE:B = -0x6at

.field private static final VALUE_NATIVE_TEMPLATE_TYPE:B = -0x68t

.field private static final VALUE_REQUEST_CONFIGURATION_PARAMS:B = -0x6ct

.field private static final VALUE_RESPONSE_INFO:B = -0x74t

.field private static final VALUE_REWARD_ITEM:B = -0x7ct

.field private static final VALUE_SERVER_SIDE_VERIFICATION_OPTIONS:B = -0x76t

.field private static final VALUE_SMART_BANNER_AD_SIZE:B = -0x71t

.field private static final VALUE_VIDEO_OPTIONS:B = -0x6ft


# instance fields
.field final adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

.field context:Landroid/content/Context;

.field private mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

.field private final requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

    .line 92
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    .line 93
    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    .line 94
    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lio/flutter/plugin/common/StandardMessageCodec;-><init>()V

    .line 82
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    .line 83
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    .line 84
    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    return-void
.end method

.method private static booleanValueOf(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 480
    :cond_0
    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method protected readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 12

    .line 268
    const-string v0, "FlutterMediationExtras"

    packed-switch p1, :pswitch_data_0

    .line 447
    :pswitch_0
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 305
    :pswitch_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 306
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    .line 309
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    .line 310
    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    .line 311
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    .line 312
    invoke-virtual {v1, p2}, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;->setMediationExtras(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 323
    :catch_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unable to instantiate class "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 321
    :catch_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Illegal Access to "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 319
    :catch_2
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Invocation Target Exception for: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 317
    :catch_3
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "No such method found: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ".getDeclaredConstructor()"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 315
    :catch_4
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Class not found: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 441
    :pswitch_2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    .line 442
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 443
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 444
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p0, v2, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    .line 445
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, v0, v1, p2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    invoke-direct {v2, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v2

    .line 439
    :pswitch_3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 438
    invoke-static {p1}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;->fromIntValue(I)Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    move-result-object p1

    return-object p1

    .line 436
    :pswitch_4
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 435
    invoke-static {p1}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;->fromIntValue(I)Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    move-result-object p1

    return-object p1

    .line 429
    :pswitch_5
    new-instance p1, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    .line 430
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 431
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    .line 432
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p0, v2, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    .line 433
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {p0, v3, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;-><init>(Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/ColorDrawable;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;Ljava/lang/Double;)V

    return-object p1

    .line 421
    :pswitch_6
    new-instance v3, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    .line 422
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    .line 423
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Landroid/graphics/drawable/ColorDrawable;

    .line 424
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    .line 425
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    .line 426
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    .line 427
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    invoke-direct/range {v3 .. v9}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;-><init>(Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;Landroid/graphics/drawable/ColorDrawable;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;)V

    return-object v3

    .line 414
    :pswitch_7
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;-><init>()V

    .line 415
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->setMaxAdContentRating(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;

    .line 416
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->setTagForChildDirectedTreatment(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;

    .line 417
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->setTagForUnderAgeOfConsent(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;

    .line 418
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->setTestDeviceIds(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;

    .line 419
    invoke-virtual {p1}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;

    move-result-object p1

    return-object p1

    .line 271
    :pswitch_8
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    .line 272
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 273
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Ljava/lang/Integer;

    .line 274
    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    .line 275
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct/range {v1 .. v6}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;)V

    return-object v1

    .line 409
    :pswitch_9
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    .line 410
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 411
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    .line 412
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p0, v2, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-direct {p1, v0, v1, p2}, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object p1

    .line 401
    :pswitch_a
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    .line 402
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/Integer;

    .line 403
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/Integer;

    .line 404
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    .line 405
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/Boolean;

    .line 406
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/lang/Boolean;

    .line 407
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ljava/lang/Boolean;

    invoke-direct/range {v2 .. v8}, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v2

    .line 283
    :pswitch_b
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$SmartBannerAdSize;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$SmartBannerAdSize;-><init>()V

    return-object p1

    .line 278
    :pswitch_c
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    .line 279
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    .line 280
    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->adSizeFactory:Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    .line 281
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;IZ)V

    return-object v0

    .line 331
    :pswitch_d
    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    .line 332
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    .line 333
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 334
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    .line 335
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/util/Map;

    .line 336
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    .line 337
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ljava/lang/String;

    .line 338
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    .line 339
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Ljava/lang/String;

    .line 340
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v11, p1

    check-cast v11, Ljava/lang/String;

    invoke-direct/range {v1 .. v11}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 342
    :pswitch_e
    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    .line 343
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    .line 344
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    .line 345
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    .line 346
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    .line 347
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/util/Map;

    invoke-direct/range {v2 .. v7}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;Ljava/util/Map;)V

    return-object v2

    .line 355
    :pswitch_f
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    .line 356
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 357
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 358
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p0, v2, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 397
    :pswitch_10
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    .line 398
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 399
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 394
    :pswitch_11
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    .line 395
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-direct {p1, p2}, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;-><init>(Ljava/util/Map;)V

    return-object p1

    .line 389
    :pswitch_12
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;

    .line 390
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    .line 391
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 392
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p0, v2, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-direct {p1, v0, v1, p2}, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;Ljava/lang/String;Ljava/lang/Number;)V

    return-object p1

    .line 378
    :pswitch_13
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 379
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const-string p2, "ready"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "notReady"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 381
    sget-object p1, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->NOT_READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    return-object p1

    .line 385
    :cond_0
    const-string p2, "Unable to handle state: %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 386
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 383
    :cond_1
    sget-object p1, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->READY:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    return-object p1

    .line 360
    :pswitch_14
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;-><init>()V

    .line 361
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setKeywords(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 362
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setContentUrl(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 363
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setCustomTargeting(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    .line 365
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 364
    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setCustomTargetingLists(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    .line 366
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setNonPersonalizedAds(Ljava/lang/Boolean;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 367
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setNeighboringContentUrls(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 368
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setHttpTimeoutMillis(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 369
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setPublisherProvidedId(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;

    .line 370
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setMediationNetworkExtrasIdentifier(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 371
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 372
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setAdMobExtras(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 373
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->getRequestAgent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setRequestAgent(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 375
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 374
    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->setMediationExtras(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    .line 376
    invoke-virtual {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    move-result-object p1

    return-object p1

    .line 349
    :pswitch_15
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    .line 350
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 351
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 352
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p0, v2, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 353
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {p0, v3, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;-><init>(ILjava/lang/String;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;)V

    return-object p1

    .line 327
    :pswitch_16
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;

    .line 328
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 329
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    return-object p1

    .line 289
    :pswitch_17
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdSize$FluidAdSize;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$FluidAdSize;-><init>()V

    return-object p1

    .line 291
    :pswitch_18
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;-><init>()V

    .line 292
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setKeywords(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 293
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setContentUrl(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 294
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->booleanValueOf(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setNonPersonalizedAds(Ljava/lang/Boolean;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 295
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setNeighboringContentUrls(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 296
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setHttpTimeoutMillis(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 297
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationNetworkExtrasIdentifier(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    .line 298
    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 299
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setAdMobExtras(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->requestAgentProvider:Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    .line 300
    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->getRequestAgent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setRequestAgent(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 302
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 301
    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->setMediationExtras(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;

    move-result-object p1

    .line 303
    invoke-virtual {p1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    move-result-object p1

    return-object p1

    .line 285
    :pswitch_19
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    .line 286
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p0, v0, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 287
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p0, v1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, v0, p2}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;-><init>(II)V

    return-object p1

    :pswitch_data_0
    .packed-switch -0x80
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method setContext(Landroid/content/Context;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->context:Landroid/content/Context;

    return-void
.end method

.method setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    return-void
.end method

.method protected writeAdSize(Ljava/io/ByteArrayOutputStream;Lio/flutter/plugins/googlemobileads/FlutterAdSize;)V
    .locals 1

    .line 452
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;

    if-eqz v0, :cond_0

    .line 453
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;

    const/16 v0, -0x6e

    .line 454
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 455
    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;->width:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 456
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;->maxHeight:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 457
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$InlineAdaptiveBannerAdSize;->orientation:Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 458
    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    if-eqz v0, :cond_1

    const/16 v0, -0x72

    .line 459
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 460
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    .line 462
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->orientation:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 463
    iget p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->width:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 464
    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$SmartBannerAdSize;

    if-eqz v0, :cond_2

    const/16 p2, -0x71

    .line 465
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void

    .line 466
    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize$FluidAdSize;

    if-eqz v0, :cond_3

    const/16 p2, -0x7e

    .line 467
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void

    :cond_3
    const/16 v0, -0x80

    .line 469
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 470
    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->width:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 471
    iget p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->height:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method

.method protected writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 2

    .line 109
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    if-eqz v0, :cond_0

    .line 110
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeAdSize(Ljava/io/ByteArrayOutputStream;Lio/flutter/plugins/googlemobileads/FlutterAdSize;)V

    return-void

    .line 111
    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v0, :cond_1

    const/16 v0, -0x7a

    .line 112
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 113
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    .line 114
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getKeywords()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 115
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getCustomTargeting()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 117
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getCustomTargetingLists()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 118
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getNonPersonalizedAds()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 119
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getNeighboringContentUrls()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 120
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getHttpTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 121
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getPublisherProvidedId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getMediationExtrasIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 123
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getAdMobExtras()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 124
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->getMediationExtras()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 125
    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    if-eqz v0, :cond_2

    const/16 v0, -0x7f

    .line 126
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 127
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    .line 128
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getKeywords()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 129
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 130
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getNonPersonalizedAds()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getNeighboringContentUrls()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 132
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getHttpTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 133
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getMediationExtrasIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 134
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getAdMobExtras()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 135
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->getMediationExtras()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 136
    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    if-eqz v0, :cond_3

    const/16 v0, -0x66

    .line 137
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 138
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    .line 139
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    .line 140
    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 141
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;->extras:Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 142
    :cond_3
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;

    if-eqz v0, :cond_4

    const/16 v0, -0x7c

    .line 143
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 144
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;

    .line 145
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;->amount:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 146
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;->type:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 147
    :cond_4
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    if-eqz v0, :cond_5

    const/16 v0, -0x73

    .line 148
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 149
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    .line 150
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdapterClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 151
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getLatencyMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 152
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 153
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdUnitMapping()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 154
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getError()Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 155
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 156
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 157
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceInstanceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 158
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;->getAdSourceInstanceId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 159
    :cond_5
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    if-eqz v0, :cond_6

    const/16 v0, -0x74

    .line 160
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 161
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    .line 162
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getResponseId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 163
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 164
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getAdapterResponses()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 165
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getLoadedAdapterResponseInfo()Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdapterResponseInfo;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 166
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;->getResponseExtras()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 167
    :cond_6
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    if-eqz v0, :cond_7

    const/16 v0, -0x7b

    .line 168
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 169
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    .line 170
    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 171
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->domain:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 172
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->message:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 173
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;->responseInfo:Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterResponseInfo;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 174
    :cond_7
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    if-eqz v0, :cond_8

    const/16 v0, -0x75

    .line 175
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 176
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;

    .line 177
    iget v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 178
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;->domain:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 179
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterAdError;->message:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 180
    :cond_8
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    if-eqz v0, :cond_b

    const/16 v0, -0x79

    .line 181
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 182
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    .line 184
    sget-object v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec$1;->$SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState:[I

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    .line 189
    const-string p2, "ready"

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 192
    :cond_9
    const-string p1, "Unable to handle state: %s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 193
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 186
    :cond_a
    const-string p2, "notReady"

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 194
    :cond_b
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;

    if-eqz v0, :cond_c

    const/16 v0, -0x78

    .line 195
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 196
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;

    .line 197
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;->state:Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus$AdapterInitializationState;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 198
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;->description:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 199
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAdapterStatus;->latency:Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 200
    :cond_c
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    if-eqz v0, :cond_d

    const/16 v0, -0x77

    .line 201
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 202
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    .line 203
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;->adapterStatuses:Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 204
    :cond_d
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    if-eqz v0, :cond_e

    const/16 v0, -0x76

    .line 205
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 206
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    .line 207
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 208
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->getCustomData()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 209
    :cond_e
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    if-eqz v0, :cond_f

    const/16 v0, -0x70

    .line 210
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 211
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    .line 212
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->adChoicesPlacement:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 213
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->mediaAspectRatio:Ljava/lang/Integer;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 214
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->videoOptions:Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 215
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->requestCustomMuteThisAd:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 216
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldRequestMultipleImages:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 217
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldReturnUrlsForImageAssets:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 218
    :cond_f
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;

    if-eqz v0, :cond_10

    const/16 v0, -0x6c

    .line 219
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 220
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;

    .line 221
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->getMaxAdContentRating()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 222
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->getTagForChildDirectedTreatment()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 223
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->getTagForUnderAgeOfConsent()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 224
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->getTestDeviceIds()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 225
    :cond_10
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    if-eqz v0, :cond_11

    const/16 v0, -0x6f

    .line 226
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 227
    check-cast p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    .line 228
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->clickToExpandRequested:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 229
    iget-object v0, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->customControlsRequested:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 230
    iget-object p2, p2, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->startMuted:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 231
    :cond_11
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    if-eqz v0, :cond_12

    const/16 v0, -0x6b

    .line 232
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 233
    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    .line 234
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getTemplateType()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 235
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getMainBackgroundColor()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 236
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getCallToActionStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 237
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getPrimaryTextStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 238
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getSecondaryTextStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 239
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;->getTertiaryTextStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 240
    :cond_12
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    if-eqz v0, :cond_13

    const/16 v0, -0x69

    .line 241
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 242
    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;->ordinal()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 243
    :cond_13
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    if-eqz v0, :cond_14

    const/16 v0, -0x68

    .line 244
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 245
    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;

    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateType;->ordinal()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 246
    :cond_14
    instance-of v0, p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    if-eqz v0, :cond_15

    const/16 v0, -0x6a

    .line 247
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 248
    check-cast p2, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;

    .line 249
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getTextColor()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 250
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getBackgroundColor()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 251
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getFontStyle()Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateFontStyle;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 252
    invoke-virtual {p2}, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateTextStyle;->getSize()Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 253
    :cond_15
    instance-of v0, p2, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_16

    const/16 v0, -0x67

    .line 254
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 255
    check-cast p2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p2

    .line 256
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 257
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 258
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 259
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 261
    :cond_16
    invoke-super {p0, p1, p2}, Lio/flutter/plugin/common/StandardMessageCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method
