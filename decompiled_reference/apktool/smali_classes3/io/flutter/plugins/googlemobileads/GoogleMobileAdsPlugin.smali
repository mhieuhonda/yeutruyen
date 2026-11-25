.class public Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;
.super Ljava/lang/Object;
.source "GoogleMobileAdsPlugin.java"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# static fields
.field private static final TAG:Ljava/lang/String; = "GoogleMobileAdsPlugin"


# instance fields
.field private adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

.field private appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

.field private final flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

.field private instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

.field private final nativeAdFactories:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemobileads/NativeAdFactory;",
            ">;"
        }
    .end annotation
.end field

.field private pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

.field private userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    .line 74
    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-direct {v0}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    return-void
.end method

.method protected constructor <init>(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;Lio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    .line 83
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 84
    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 85
    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    return-void
.end method

.method protected constructor <init>(Lio/flutter/plugins/googlemobileads/AppStateNotifier;)V
    .locals 1

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    .line 90
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    .line 91
    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    return-void
.end method

.method private addNativeAdFactory(Ljava/lang/String;Lio/flutter/plugins/googlemobileads/NativeAdFactory;)Z
    .locals 1

    .line 198
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    const-string p2, "A NativeAdFactory with the following factoryId already exists: %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 200
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 202
    const-string p2, "GoogleMobileAdsPlugin"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    .line 206
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public static registerMediationNetworkExtrasProvider(Lio/flutter/embedding/engine/FlutterEngine;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 130
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 134
    :cond_0
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    .line 135
    iget-object p0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz p0, :cond_1

    .line 136
    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static registerNativeAdFactory(Lio/flutter/embedding/engine/FlutterEngine;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/NativeAdFactory;)Z
    .locals 1

    .line 111
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    .line 112
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->registerNativeAdFactory(Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/NativeAdFactory;)Z

    move-result p0

    return p0
.end method

.method private static registerNativeAdFactory(Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/NativeAdFactory;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 172
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->addNativeAdFactory(Ljava/lang/String;Lio/flutter/plugins/googlemobileads/NativeAdFactory;)Z

    move-result p0

    return p0

    .line 168
    :cond_0
    const-string p0, "GoogleMobileAdsPlugin"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 166
    const-string p1, "Could not find a %s instance. The plugin may have not been registered."

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 169
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private removeNativeAdFactory(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/NativeAdFactory;
    .locals 1

    .line 211
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemobileads/NativeAdFactory;

    return-object p1
.end method

.method private static requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    .line 50
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static unregisterMediationNetworkExtrasProvider(Lio/flutter/embedding/engine/FlutterEngine;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 151
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    if-nez p0, :cond_0

    return-void

    .line 156
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 157
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V

    .line 159
    :cond_1
    iput-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    return-void
.end method

.method public static unregisterNativeAdFactory(Lio/flutter/embedding/engine/FlutterEngine;Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/NativeAdFactory;
    .locals 1

    .line 189
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 191
    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->removeNativeAdFactory(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/NativeAdFactory;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;
    .locals 1

    .line 634
    new-instance v0, Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlemobileads/BannerAdCreator;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    .line 252
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    if-eqz v0, :cond_0

    .line 253
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    .line 255
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_1

    .line 256
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    .line 258
    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    .line 259
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 4

    .line 216
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    .line 217
    new-instance v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    .line 219
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    .line 220
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    .line 221
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    if-eqz v1, :cond_0

    .line 222
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V

    .line 224
    :cond_0
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    .line 226
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    new-instance v2, Lio/flutter/plugin/common/StandardMethodCodec;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    invoke-direct {v2, v3}, Lio/flutter/plugin/common/StandardMethodCodec;-><init>(Lio/flutter/plugin/common/StandardMessageCodec;)V

    const-string v3, "plugins.flutter.io/google_mobile_ads"

    invoke-direct {v0, v1, v3, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    .line 229
    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 230
    new-instance v1, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v1, v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;-><init>(Lio/flutter/plugin/common/MethodChannel;)V

    iput-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 232
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getPlatformViewRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;

    move-result-object v0

    new-instance v1, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsViewFactory;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v1, v2}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsViewFactory;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;)V

    .line 233
    const-string v2, "plugins.flutter.io/google_mobile_ads/ad_widget"

    invoke-interface {v0, v2, v1}, Lio/flutter/plugin/platform/PlatformViewRegistry;->registerViewFactory(Ljava/lang/String;Lio/flutter/plugin/platform/PlatformViewFactory;)Z

    .line 236
    new-instance v0, Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlemobileads/AppStateNotifier;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    .line 237
    new-instance v0, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    .line 239
    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    .line 292
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    if-eqz v1, :cond_0

    .line 293
    invoke-virtual {v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    .line 295
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 296
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    .line 298
    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    .line 299
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 266
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    if-eqz v1, :cond_0

    .line 267
    invoke-virtual {v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    .line 269
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 270
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    .line 272
    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    .line 273
    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    .line 244
    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    if-eqz p1, :cond_0

    .line 245
    invoke-virtual {p1}, Lio/flutter/plugins/googlemobileads/AppStateNotifier;->stop()V

    const/4 p1, 0x0

    .line 246
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    :cond_0
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 306
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    const-string v4, "GoogleMobileAdsPlugin"

    if-eqz v3, :cond_2f

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    if-nez v5, :cond_0

    goto/16 :goto_7

    .line 312
    :cond_0
    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 313
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v3

    goto :goto_0

    .line 314
    :cond_1
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v3}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    :goto_0
    move-object v6, v3

    .line 315
    iget-object v3, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v7, 0x0

    const/4 v8, -0x1

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v5, "loadRewardedInterstitialAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v8, 0x1b

    goto/16 :goto_1

    :sswitch_1
    const-string v5, "setImmersiveMode"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v8, 0x1a

    goto/16 :goto_1

    :sswitch_2
    const-string v5, "isCollapsible"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v8, 0x19

    goto/16 :goto_1

    :sswitch_3
    const-string v5, "MobileAds#initialize"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v8, 0x18

    goto/16 :goto_1

    :sswitch_4
    const-string v5, "showAdWithoutView"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v8, 0x17

    goto/16 :goto_1

    :sswitch_5
    const-string v5, "MobileAds#openAdInspector"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v8, 0x16

    goto/16 :goto_1

    :sswitch_6
    const-string v5, "MobileAds#disableMediationInitialization"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v8, 0x15

    goto/16 :goto_1

    :sswitch_7
    const-string v5, "MobileAds#updateRequestConfiguration"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v8, 0x14

    goto/16 :goto_1

    :sswitch_8
    const-string v5, "getAdSize"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v8, 0x13

    goto/16 :goto_1

    :sswitch_9
    const-string v5, "disposeAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v8, 0x12

    goto/16 :goto_1

    :sswitch_a
    const-string v5, "_init"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v8, 0x11

    goto/16 :goto_1

    :sswitch_b
    const-string v5, "loadAdManagerBannerAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v8, 0x10

    goto/16 :goto_1

    :sswitch_c
    const-string v5, "AdSize#getLargeAnchoredAdaptiveBannerAdSize"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v8, 0xf

    goto/16 :goto_1

    :sswitch_d
    const-string v5, "MobileAds#getVersionString"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v8, 0xe

    goto/16 :goto_1

    :sswitch_e
    const-string v5, "MobileAds#setAppVolume"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v8, 0xd

    goto/16 :goto_1

    :sswitch_f
    const-string v5, "loadBannerAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v8, 0xc

    goto/16 :goto_1

    :sswitch_10
    const-string v5, "loadAdManagerInterstitialAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v8, 0xb

    goto/16 :goto_1

    :sswitch_11
    const-string v5, "AdSize#getAnchoredAdaptiveBannerAdSize"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v8, 0xa

    goto/16 :goto_1

    :sswitch_12
    const-string v5, "setServerSideVerificationOptions"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    goto/16 :goto_1

    :cond_14
    const/16 v8, 0x9

    goto/16 :goto_1

    :sswitch_13
    const-string v5, "loadNativeAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    goto/16 :goto_1

    :cond_15
    const/16 v8, 0x8

    goto/16 :goto_1

    :sswitch_14
    const-string v5, "loadFluidAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    goto :goto_1

    :cond_16
    const/4 v8, 0x7

    goto :goto_1

    :sswitch_15
    const-string v5, "MobileAds#getRequestConfiguration"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    goto :goto_1

    :cond_17
    const/4 v8, 0x6

    goto :goto_1

    :sswitch_16
    const-string v5, "loadRewardedAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    goto :goto_1

    :cond_18
    const/4 v8, 0x5

    goto :goto_1

    :sswitch_17
    const-string v5, "MobileAds#registerWebView"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    goto :goto_1

    :cond_19
    const/4 v8, 0x4

    goto :goto_1

    :sswitch_18
    const-string v5, "loadAppOpenAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    goto :goto_1

    :cond_1a
    const/4 v8, 0x3

    goto :goto_1

    :sswitch_19
    const-string v5, "MobileAds#setAppMuted"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_1

    :cond_1b
    const/4 v8, 0x2

    goto :goto_1

    :sswitch_1a
    const-string v5, "loadInterstitialAd"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    goto :goto_1

    :cond_1c
    const/4 v8, 0x1

    goto :goto_1

    :sswitch_1b
    const-string v5, "MobileAds#openDebugMenu"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    goto :goto_1

    :cond_1d
    move v8, v7

    .line 628
    :goto_1
    const-string v3, "unexpected_ad_type"

    const-string v5, "A null or invalid ad request was provided."

    const-string v9, "InvalidRequest"

    const-string v10, "width"

    const-string v11, "orientation"

    const-string v12, "adManagerRequest"

    const-string v13, "request"

    const-string v14, "adUnitId"

    const-string v15, "adId"

    move-object/from16 v16, v4

    const/4 v4, 0x0

    packed-switch v8, :pswitch_data_0

    invoke-interface {v2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    return-void

    .line 465
    :pswitch_0
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Ljava/lang/String;

    .line 466
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    check-cast v20, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    .line 468
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v20, :cond_1e

    .line 472
    new-instance v16, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    .line 474
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 475
    invoke-static {v3}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v3, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object/from16 v21, v3

    invoke-direct/range {v16 .. v21}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    :goto_2
    move-object/from16 v3, v16

    goto :goto_3

    :cond_1e
    if-eqz v3, :cond_1f

    .line 480
    new-instance v16, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    .line 482
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 483
    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v18, v5

    check-cast v18, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v5, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object/from16 v20, v3

    move-object/from16 v21, v5

    invoke-direct/range {v16 .. v21}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    goto :goto_2

    .line 492
    :goto_3
    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 493
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 492
    invoke-virtual {v5, v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 494
    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->load()V

    .line 495
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 488
    :cond_1f
    invoke-interface {v2, v9, v5, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 559
    :pswitch_1
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->adForId(I)Lio/flutter/plugins/googlemobileads/FlutterAd;

    move-result-object v3

    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;

    const-string v5, "immersiveModeEnabled"

    .line 560
    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;->setImmersiveMode(Z)V

    .line 561
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 595
    :pswitch_2
    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v5, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->adForId(I)Lio/flutter/plugins/googlemobileads/FlutterAd;

    move-result-object v1

    if-nez v1, :cond_20

    .line 597
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 598
    :cond_20
    instance-of v5, v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    if-eqz v5, :cond_21

    .line 599
    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->isCollapsible()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 600
    :cond_21
    instance-of v5, v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    if-eqz v5, :cond_22

    .line 601
    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->isCollapsible()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 603
    :cond_22
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unexpected ad type for isCollapsible: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 322
    :pswitch_3
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;

    invoke-direct {v3, v2}, Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v1, v6, v3}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;)V

    return-void

    .line 515
    :pswitch_4
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->showAdWithId(I)Z

    move-result v1

    if-nez v1, :cond_23

    .line 517
    const-string v1, "AdShowError"

    const-string v3, "Ad failed to show."

    invoke-interface {v2, v1, v3, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 520
    :cond_23
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 325
    :pswitch_5
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-static {v6, v1, v2}, Lio/flutter/plugins/googlemobileads/FlutterAdInspector;->openAdInspector(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    .line 564
    :pswitch_6
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1, v6}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->disableMediationInitialization(Landroid/content/Context;)V

    .line 565
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 331
    :pswitch_7
    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->updateRequestConfiguration(Lio/flutter/plugin/common/MethodCall;)V

    .line 332
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 577
    :pswitch_8
    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v5, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->adForId(I)Lio/flutter/plugins/googlemobileads/FlutterAd;

    move-result-object v1

    if-nez v1, :cond_24

    .line 580
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 581
    :cond_24
    instance-of v5, v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    if-eqz v5, :cond_25

    .line 582
    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->getAdSize()Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 583
    :cond_25
    instance-of v5, v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    if-eqz v5, :cond_26

    .line 584
    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->getAdSize()Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 586
    :cond_26
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unexpected ad type for getAdSize: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 511
    :pswitch_9
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->disposeAd(I)V

    .line 512
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 318
    :pswitch_a
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->disposeAllAds()V

    .line 319
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 426
    :pswitch_b
    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    .line 428
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v7, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 430
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-string v9, "sizes"

    .line 431
    invoke-virtual {v1, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    .line 432
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    .line 433
    invoke-virtual {v0, v6}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    move-result-object v11

    move v6, v3

    invoke-direct/range {v5 .. v11}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V

    .line 434
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v5, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 435
    invoke-virtual {v5}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->load()V

    .line 436
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 537
    :pswitch_c
    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    new-instance v7, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    invoke-direct {v7}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;-><init>()V

    .line 541
    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    .line 542
    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/4 v10, 0x1

    invoke-direct/range {v5 .. v10}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;IZ)V

    .line 544
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->INVALID:Lcom/google/android/gms/ads/AdSize;

    iget-object v3, v5, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->size:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/ads/AdSize;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    .line 545
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 547
    :cond_27
    iget v1, v5, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 568
    :pswitch_d
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->getVersionString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 555
    :pswitch_e
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    const-string v5, "volume"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->setAppVolume(D)V

    .line 556
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 340
    :pswitch_f
    new-instance v16, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    .line 342
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 344
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v19, v5

    check-cast v19, Ljava/lang/String;

    .line 345
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v20, v5

    check-cast v20, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    const-string v5, "size"

    .line 346
    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v21, v5

    check-cast v21, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    .line 347
    invoke-virtual {v0, v6}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    move-result-object v22

    move-object/from16 v18, v3

    invoke-direct/range {v16 .. v22}, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdSize;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V

    move-object/from16 v3, v16

    .line 348
    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v5, v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 349
    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->load()V

    .line 350
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 451
    :pswitch_10
    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;

    .line 453
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 454
    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 455
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    .line 456
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    new-instance v11, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v11, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v6, v3

    invoke-direct/range {v6 .. v11}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    .line 458
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 459
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 458
    invoke-virtual {v3, v6, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 460
    invoke-virtual {v6}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->load()V

    .line 461
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 523
    :pswitch_11
    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    new-instance v7, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    invoke-direct {v7}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;-><init>()V

    .line 527
    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    .line 528
    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;IZ)V

    .line 530
    sget-object v1, Lcom/google/android/gms/ads/AdSize;->INVALID:Lcom/google/android/gms/ads/AdSize;

    iget-object v3, v5, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->size:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/ads/AdSize;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28

    .line 531
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 533
    :cond_28
    iget v1, v5, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 612
    :pswitch_12
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->adForId(I)Lio/flutter/plugins/googlemobileads/FlutterAd;

    move-result-object v3

    .line 613
    const-string v5, "serverSideVerificationOptions"

    .line 614
    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    if-nez v3, :cond_29

    .line 616
    const-string v1, "Error - null ad in setServerSideVerificationOptions"

    move-object/from16 v5, v16

    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_29
    move-object/from16 v5, v16

    .line 617
    instance-of v6, v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    if-eqz v6, :cond_2a

    .line 618
    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->setServerSideVerificationOptions(Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;)V

    goto :goto_4

    .line 619
    :cond_2a
    instance-of v6, v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    if-eqz v6, :cond_2b

    .line 620
    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->setServerSideVerificationOptions(Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;)V

    goto :goto_4

    .line 622
    :cond_2b
    const-string v1, "Error - setServerSideVerificationOptions called on non-rewarded ad"

    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 624
    :goto_4
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 353
    :pswitch_13
    const-string v3, "factoryId"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 354
    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/NativeAdFactory;

    .line 355
    const-string v7, "nativeTemplateStyle"

    invoke-virtual {v1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    if-nez v5, :cond_2c

    if-nez v8, :cond_2c

    .line 357
    const-string v1, "No NativeAdFactory with id: %s or nativeTemplateStyle"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 358
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 359
    const-string v3, "NativeAdError"

    invoke-interface {v2, v3, v1, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 363
    :cond_2c
    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    invoke-direct {v3, v6}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;-><init>(Landroid/content/Context;)V

    iget-object v8, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 365
    invoke-virtual {v3, v8}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setManager(Lio/flutter/plugins/googlemobileads/AdInstanceManager;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    .line 366
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v3, v8}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setAdUnitId(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    .line 367
    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setAdFactory(Lio/flutter/plugins/googlemobileads/NativeAdFactory;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    .line 368
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setRequest(Lio/flutter/plugins/googlemobileads/FlutterAdRequest;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    .line 369
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setAdManagerRequest(Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    const-string v5, "customOptions"

    .line 370
    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setCustomOptions(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    .line 371
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setId(I)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    const-string v5, "nativeAdOptions"

    .line 372
    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setNativeAdOptions(Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v5, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    .line 373
    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setFlutterAdLoader(Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    .line 375
    invoke-virtual {v1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    .line 374
    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setNativeTemplateStyle(Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    .line 376
    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterNativeAd;

    move-result-object v3

    .line 377
    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v5, v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 378
    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd;->load()V

    .line 379
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 439
    :pswitch_14
    new-instance v3, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;

    .line 441
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 443
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    .line 444
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    .line 445
    invoke-virtual {v0, v6}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    move-result-object v11

    move-object v6, v3

    invoke-direct/range {v6 .. v11}, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V

    .line 446
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v6, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 447
    invoke-virtual {v6}, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->load()V

    .line 448
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 328
    :pswitch_15
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->getRequestConfiguration()Lcom/google/android/gms/ads/RequestConfiguration;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 394
    :pswitch_16
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Ljava/lang/String;

    .line 395
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    check-cast v20, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    .line 397
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v20, :cond_2d

    .line 401
    new-instance v16, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    .line 403
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 404
    invoke-static {v3}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v3, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object/from16 v21, v3

    invoke-direct/range {v16 .. v21}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    :goto_5
    move-object/from16 v3, v16

    goto :goto_6

    :cond_2d
    if-eqz v3, :cond_2e

    .line 409
    new-instance v16, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    .line 411
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 412
    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v18, v5

    check-cast v18, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v5, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object/from16 v20, v3

    move-object/from16 v21, v5

    invoke-direct/range {v16 .. v21}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    goto :goto_5

    .line 421
    :goto_6
    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v5, v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 422
    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->load()V

    .line 423
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 417
    :cond_2e
    invoke-interface {v2, v9, v5, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 335
    :pswitch_17
    const-string v3, "webViewId"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 336
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v5}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getFlutterEngine()Lio/flutter/embedding/engine/FlutterEngine;

    move-result-object v5

    invoke-virtual {v3, v1, v5}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->registerWebView(ILio/flutter/embedding/engine/FlutterEngine;)V

    .line 337
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 498
    :pswitch_18
    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;

    .line 500
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 501
    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 502
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    .line 503
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    .line 504
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    new-instance v12, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v12, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v6, v3

    invoke-direct/range {v6 .. v12}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    .line 506
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v6, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 507
    invoke-virtual {v6}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->load()V

    .line 508
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 551
    :pswitch_19
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    const-string v5, "muted"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->setAppMuted(Z)V

    .line 552
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 382
    :pswitch_1a
    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterInterstitialAd;

    .line 384
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v7, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    .line 386
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 387
    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    new-instance v10, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v10, v6}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move v6, v3

    invoke-direct/range {v5 .. v10}, Lio/flutter/plugins/googlemobileads/FlutterInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    .line 389
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v5, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    .line 390
    invoke-virtual {v5}, Lio/flutter/plugins/googlemobileads/FlutterInterstitialAd;->load()V

    .line 391
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    .line 571
    :pswitch_1b
    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 572
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v3, v6, v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->openDebugMenu(Landroid/content/Context;Ljava/lang/String;)V

    .line 573
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_2f
    :goto_7
    move-object v5, v4

    .line 307
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "method call received before instanceManager initialized: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74cc200d -> :sswitch_1b
        -0x73bda50b -> :sswitch_1a
        -0x6cdd4229 -> :sswitch_19
        -0x699434b8 -> :sswitch_18
        -0x5cdc65ff -> :sswitch_17
        -0x5c523da9 -> :sswitch_16
        -0x53263dd8 -> :sswitch_15
        -0x4be76439 -> :sswitch_14
        -0x398c6e60 -> :sswitch_13
        -0x36c202d9 -> :sswitch_12
        -0x2dc7f84f -> :sswitch_11
        -0x28540aad -> :sswitch_10
        -0x2218b08b -> :sswitch_f
        -0x1fc757d2 -> :sswitch_e
        -0x1a08c958 -> :sswitch_d
        -0xcdcbac2 -> :sswitch_c
        -0xa4c77ad -> :sswitch_b
        0x56c1def -> :sswitch_a
        0xef422a2 -> :sswitch_9
        0x1045b9ba -> :sswitch_8
        0x11316e25 -> :sswitch_7
        0x12d86e45 -> :sswitch_6
        0x3f6c8375 -> :sswitch_5
        0x50d09b6d -> :sswitch_4
        0x53a942a5 -> :sswitch_3
        0x5cfc8c80 -> :sswitch_2
        0x630fa5bc -> :sswitch_1
        0x70385ca3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    .line 279
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    if-eqz v0, :cond_0

    .line 280
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    .line 282
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_1

    .line 283
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    .line 285
    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    .line 286
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method
