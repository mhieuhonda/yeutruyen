.class public final Lio/flutter/plugins/googlemobileads/FlutterAdInspector;
.super Ljava/lang/Object;
.source "FlutterAdInspector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$openAdInspector$0(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/google/android/gms/ads/AdInspectorError;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 26
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdInspectorError;->getCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdInspectorError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdInspectorError;->getDomain()Ljava/lang/String;

    move-result-object p1

    .line 27
    invoke-interface {p0, v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 30
    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public static openAdInspector(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    .line 22
    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdInspector$$ExternalSyntheticLambda0;

    invoke-direct {v0, p2}, Lio/flutter/plugins/googlemobileads/FlutterAdInspector$$ExternalSyntheticLambda0;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p1, p0, v0}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->openAdInspector(Landroid/content/Context;Lcom/google/android/gms/ads/OnAdInspectorClosedListener;)V

    return-void
.end method
