.class Lio/flutter/plugin/platform/PlatformViewsController2$1;
.super Ljava/lang/Object;
.source "PlatformViewsController2.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/PlatformViewsController2;->createSurfaceClipCallback(Landroid/view/SurfaceView;FLandroid/graphics/Rect;I)Landroid/view/SurfaceHolder$Callback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugin/platform/PlatformViewsController2;

.field final synthetic val$opacity:F

.field final synthetic val$screenRect:Landroid/graphics/Rect;

.field final synthetic val$surfaceView:Landroid/view/SurfaceView;

.field final synthetic val$viewId:I


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/PlatformViewsController2;Landroid/view/SurfaceView;FLandroid/graphics/Rect;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 622
    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->this$0:Lio/flutter/plugin/platform/PlatformViewsController2;

    iput-object p2, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$surfaceView:Landroid/view/SurfaceView;

    iput p3, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$opacity:F

    iput-object p4, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$screenRect:Landroid/graphics/Rect;

    iput p5, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$viewId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 625
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$surfaceView:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 626
    invoke-virtual {p1}, Landroid/view/SurfaceControl;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 627
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->this$0:Lio/flutter/plugin/platform/PlatformViewsController2;

    .line 628
    invoke-virtual {v0}, Lio/flutter/plugin/platform/PlatformViewsController2;->createTransaction()Landroid/view/SurfaceControl$Transaction;

    move-result-object v0

    iget v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$opacity:F

    .line 629
    invoke-virtual {v0, p1, v1}, Landroid/view/SurfaceControl$Transaction;->setAlpha(Landroid/view/SurfaceControl;F)Landroid/view/SurfaceControl$Transaction;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$screenRect:Landroid/graphics/Rect;

    .line 630
    invoke-virtual {v0, p1, v1}, Landroid/view/SurfaceControl$Transaction;->setCrop(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)Landroid/view/SurfaceControl$Transaction;

    goto :goto_0

    .line 632
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Failed to apply clipping to SurfaceView: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$surfaceView:Landroid/view/SurfaceView;

    .line 635
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, " - the SurfaceControl was null or invalid during surfaceCreated callback."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 632
    const-string v0, "PlatformViewsController2"

    invoke-static {v0, p1}, Lio/flutter/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 642
    :goto_0
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->this$0:Lio/flutter/plugin/platform/PlatformViewsController2;

    invoke-static {p1}, Lio/flutter/plugin/platform/PlatformViewsController2;->access$000(Lio/flutter/plugin/platform/PlatformViewsController2;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterJNI;->scheduleFrame()V

    .line 643
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->this$0:Lio/flutter/plugin/platform/PlatformViewsController2;

    invoke-static {p1}, Lio/flutter/plugin/platform/PlatformViewsController2;->access$100(Lio/flutter/plugin/platform/PlatformViewsController2;)Ljava/util/HashSet;

    move-result-object p1

    iget v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$viewId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 644
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$surfaceView:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 653
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->this$0:Lio/flutter/plugin/platform/PlatformViewsController2;

    invoke-static {p1}, Lio/flutter/plugin/platform/PlatformViewsController2;->access$100(Lio/flutter/plugin/platform/PlatformViewsController2;)Ljava/util/HashSet;

    move-result-object p1

    iget v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$viewId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 654
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2$1;->val$surfaceView:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method
