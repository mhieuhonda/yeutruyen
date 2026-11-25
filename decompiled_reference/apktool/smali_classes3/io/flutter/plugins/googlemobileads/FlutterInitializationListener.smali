.class public final Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;
.super Ljava/lang/Object;
.source "FlutterInitializationListener.java"

# interfaces
.implements Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;


# instance fields
.field private isInitializationCompleted:Z

.field private final result:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;->isInitializationCompleted:Z

    return-void
.end method


# virtual methods
.method public onInitializationComplete(Lcom/google/android/gms/ads/initialization/InitializationStatus;)V
    .locals 6

    .line 39
    iget-boolean v0, p0, Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;->isInitializationCompleted:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 43
    :try_start_0
    const-string v1, "com.google.android.gms.ads.MobileAds"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 44
    const-string v2, "setPlugin"

    new-array v3, v0, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 46
    const-string v2, "Flutter-GMA-9.0.0"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :catch_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    invoke-direct {v2, p1}, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;-><init>(Lcom/google/android/gms/ads/initialization/InitializationStatus;)V

    invoke-interface {v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 50
    iput-boolean v0, p0, Lio/flutter/plugins/googlemobileads/FlutterInitializationListener;->isInitializationCompleted:Z

    return-void
.end method
