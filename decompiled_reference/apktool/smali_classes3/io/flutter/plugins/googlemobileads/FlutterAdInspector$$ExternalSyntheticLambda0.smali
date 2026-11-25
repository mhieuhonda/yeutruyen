.class public final synthetic Lio/flutter/plugins/googlemobileads/FlutterAdInspector$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/ads/OnAdInspectorClosedListener;


# instance fields
.field public final synthetic f$0:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdInspector$$ExternalSyntheticLambda0;->f$0:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final onAdInspectorClosed(Lcom/google/android/gms/ads/AdInspectorError;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdInspector$$ExternalSyntheticLambda0;->f$0:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAdInspector;->lambda$openAdInspector$0(Lio/flutter/plugin/common/MethodChannel$Result;Lcom/google/android/gms/ads/AdInspectorError;)V

    return-void
.end method
