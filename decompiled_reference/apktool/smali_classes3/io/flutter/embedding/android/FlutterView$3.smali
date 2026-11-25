.class Lio/flutter/embedding/android/FlutterView$3;
.super Ljava/lang/Object;
.source "FlutterView.java"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/FlutterUiResizeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/FlutterView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/embedding/android/FlutterView;


# direct methods
.method constructor <init>(Lio/flutter/embedding/android/FlutterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    .line 191
    iput-object p1, p0, Lio/flutter/embedding/android/FlutterView$3;->this$0:Lio/flutter/embedding/android/FlutterView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public resizeEngineView(II)V
    .locals 4

    .line 195
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterView$3;->this$0:Lio/flutter/embedding/android/FlutterView;

    iget-object v0, v0, Lio/flutter/embedding/android/FlutterView;->renderSurface:Lio/flutter/embedding/engine/renderer/RenderSurface;

    if-eqz v0, :cond_3

    .line 196
    iget-object v0, p0, Lio/flutter/embedding/android/FlutterView$3;->this$0:Lio/flutter/embedding/android/FlutterView;

    iget-object v0, v0, Lio/flutter/embedding/android/FlutterView;->renderSurface:Lio/flutter/embedding/engine/renderer/RenderSurface;

    check-cast v0, Landroid/view/View;

    .line 197
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 198
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, p2, :cond_0

    .line 200
    iput p2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    move p2, v3

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 202
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    if-eq v2, p1, :cond_1

    .line 204
    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    if-eqz v3, :cond_2

    .line 207
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void

    .line 210
    :cond_3
    const-string p1, "FlutterView"

    const-string p2, "Flutter engine view not set."

    invoke-static {p1, p2}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
