.class public Lio/flutter/plugin/platform/PlatformViewWrapper;
.super Landroid/widget/FrameLayout;
.source "PlatformViewWrapper.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "PlatformViewWrapper"


# instance fields
.field private activeFocusListener:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

.field private left:I

.field private prevLeft:I

.field private prevTop:I

.field private renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

.field private top:I

.field private touchProcessor:Lio/flutter/embedding/android/AndroidTouchProcessor;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 54
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/PlatformViewWrapper;->setWillNotDraw(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/platform/PlatformViewRenderTarget;)V
    .locals 2

    .line 59
    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/PlatformViewWrapper;-><init>(Landroid/content/Context;)V

    .line 60
    iput-object p2, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    .line 62
    invoke-interface {p2}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->getSurface()Landroid/view/Surface;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 63
    sget-boolean p2, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->debugDisableSurfaceClear:Z

    if-nez p2, :cond_0

    .line 64
    invoke-virtual {p1}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object p2

    .line 66
    :try_start_0
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    invoke-virtual {p1, p2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1, p2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 69
    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 159
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    const-string v1, "PlatformViewWrapper"

    if-nez v0, :cond_0

    .line 160
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 161
    const-string p1, "Platform view cannot be composed without a RenderTarget."

    invoke-static {v1, p1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 165
    :cond_0
    invoke-interface {v0}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->getSurface()Landroid/view/Surface;

    move-result-object p1

    .line 166
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    .line 167
    const-string p1, "Platform view cannot be composed without a valid RenderTarget surface."

    invoke-static {v1, p1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 171
    :cond_1
    invoke-virtual {p1}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    if-nez v0, :cond_2

    .line 174
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->invalidate()V

    return-void

    .line 181
    :cond_2
    :try_start_0
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 183
    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    invoke-interface {v1}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->scheduleFrame()V

    .line 186
    invoke-virtual {p1, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    return-void

    :catchall_0
    move-exception v1

    .line 185
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    invoke-interface {v2}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->scheduleFrame()V

    .line 186
    invoke-virtual {p1, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 187
    throw v1
.end method

.method public getActiveFocusListener()Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;
    .locals 1

    .line 220
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->activeFocusListener:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    return-object v0
.end method

.method public getRenderTargetHeight()I
    .locals 1

    .line 108
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    if-eqz v0, :cond_0

    .line 109
    invoke-interface {v0}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->getHeight()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getRenderTargetWidth()I
    .locals 1

    .line 101
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    if-eqz v0, :cond_0

    .line 102
    invoke-interface {v0}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->getWidth()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 0

    .line 152
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->invalidate()V

    .line 153
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    move-result-object p1

    return-object p1
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 146
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 147
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->invalidate()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 193
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->touchProcessor:Lio/flutter/embedding/android/AndroidTouchProcessor;

    if-nez v0, :cond_0

    .line 194
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 196
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 197
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    .line 212
    iget v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->left:I

    int-to-float v1, v1

    iget v2, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->top:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_0

    .line 206
    :cond_1
    iget v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->prevLeft:I

    int-to-float v1, v1

    iget v2, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->prevTop:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 207
    iget v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->left:I

    iput v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->prevLeft:I

    .line 208
    iget v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->top:I

    iput v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->prevTop:I

    goto :goto_0

    .line 199
    :cond_2
    iget v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->left:I

    iput v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->prevLeft:I

    .line 200
    iget v2, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->top:I

    iput v2, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->prevTop:I

    int-to-float v1, v1

    int-to-float v2, v2

    .line 201
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 215
    :goto_0
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->touchProcessor:Lio/flutter/embedding/android/AndroidTouchProcessor;

    invoke-virtual {v1, p1, v0}, Lio/flutter/embedding/android/AndroidTouchProcessor;->onTouchEvent(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Z

    move-result p1

    return p1
.end method

.method public release()V
    .locals 1

    .line 116
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    if-eqz v0, :cond_0

    .line 117
    invoke-interface {v0}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->release()V

    const/4 v0, 0x0

    .line 118
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    :cond_0
    return-void
.end method

.method public requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    const/4 v0, 0x0

    .line 129
    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 131
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    return v0

    .line 139
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public resizeRenderTarget(II)V
    .locals 1

    .line 95
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->renderTarget:Lio/flutter/plugin/platform/PlatformViewRenderTarget;

    if-eqz v0, :cond_0

    .line 96
    invoke-interface {v0, p1, p2}, Lio/flutter/plugin/platform/PlatformViewRenderTarget;->resize(II)V

    :cond_0
    return-void
.end method

.method public setLayoutParams(Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 1

    .line 88
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    iget v0, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v0, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->left:I

    .line 91
    iget p1, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput p1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->top:I

    return-void
.end method

.method public setOnDescendantFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 2

    .line 224
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->unsetOnDescendantFocusChangeListener()V

    .line 225
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 226
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->activeFocusListener:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    if-nez v1, :cond_0

    .line 227
    new-instance v1, Lio/flutter/plugin/platform/PlatformViewWrapper$1;

    invoke-direct {v1, p0, p1}, Lio/flutter/plugin/platform/PlatformViewWrapper$1;-><init>(Lio/flutter/plugin/platform/PlatformViewWrapper;Landroid/view/View$OnFocusChangeListener;)V

    iput-object v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->activeFocusListener:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    .line 235
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    :cond_0
    return-void
.end method

.method public setTouchProcessor(Lio/flutter/embedding/android/AndroidTouchProcessor;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->touchProcessor:Lio/flutter/embedding/android/AndroidTouchProcessor;

    return-void
.end method

.method public unsetOnDescendantFocusChangeListener()V
    .locals 3

    .line 240
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewWrapper;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 241
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->activeFocusListener:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 243
    iput-object v2, p0, Lio/flutter/plugin/platform/PlatformViewWrapper;->activeFocusListener:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    .line 244
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    :cond_0
    return-void
.end method
