.class public Lio/flutter/plugin/platform/PlatformViewsController2;
.super Ljava/lang/Object;
.source "PlatformViewsController2.java"

# interfaces
.implements Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;


# static fields
.field private static final TAG:Ljava/lang/String; = "PlatformViewsController2"


# instance fields
.field private final accessibilityEventsDelegate:Lio/flutter/plugin/platform/AccessibilityEventsDelegate;

.field private final activeTransactions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/SurfaceControl$Transaction;",
            ">;"
        }
    .end annotation
.end field

.field private androidTouchProcessor:Lio/flutter/embedding/android/AndroidTouchProcessor;

.field final channelHandler:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;

.field private context:Landroid/content/Context;

.field private flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

.field private flutterView:Lio/flutter/embedding/android/FlutterView;

.field private final motionEventTracker:Lio/flutter/embedding/android/MotionEventTracker;

.field private overlaySurfaceControl:Landroid/view/SurfaceControl;

.field private overlayerSurface:Landroid/view/Surface;

.field private final pendingTransactions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/SurfaceControl$Transaction;",
            ">;"
        }
    .end annotation
.end field

.field private final platformViewParent:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;",
            ">;"
        }
    .end annotation
.end field

.field private final platformViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lio/flutter/plugin/platform/PlatformView;",
            ">;"
        }
    .end annotation
.end field

.field private platformViewsChannel:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;

.field private registry:Lio/flutter/plugin/platform/PlatformViewRegistryImpl;

.field private textInputPlugin:Lio/flutter/plugin/editing/TextInputPlugin;

.field private final viewsWithPendingSurfaceCallback:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    .line 79
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlayerSurface:Landroid/view/Surface;

    .line 80
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlaySurfaceControl:Landroid/view/SurfaceControl;

    .line 82
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->viewsWithPendingSurfaceCallback:Ljava/util/HashSet;

    .line 761
    new-instance v0, Lio/flutter/plugin/platform/PlatformViewsController2$2;

    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/PlatformViewsController2$2;-><init>(Lio/flutter/plugin/platform/PlatformViewsController2;)V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->channelHandler:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;

    .line 85
    new-instance v0, Lio/flutter/plugin/platform/AccessibilityEventsDelegate;

    invoke-direct {v0}, Lio/flutter/plugin/platform/AccessibilityEventsDelegate;-><init>()V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->accessibilityEventsDelegate:Lio/flutter/plugin/platform/AccessibilityEventsDelegate;

    .line 86
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    .line 87
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->pendingTransactions:Ljava/util/ArrayList;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->activeTransactions:Ljava/util/ArrayList;

    .line 90
    invoke-static {}, Lio/flutter/embedding/android/MotionEventTracker;->getInstance()Lio/flutter/embedding/android/MotionEventTracker;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->motionEventTracker:Lio/flutter/embedding/android/MotionEventTracker;

    return-void
.end method

.method static synthetic access$000(Lio/flutter/plugin/platform/PlatformViewsController2;)Lio/flutter/embedding/engine/FlutterJNI;
    .locals 0

    .line 59
    iget-object p0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    return-object p0
.end method

.method static synthetic access$100(Lio/flutter/plugin/platform/PlatformViewsController2;)Ljava/util/HashSet;
    .locals 0

    .line 59
    iget-object p0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->viewsWithPendingSurfaceCallback:Ljava/util/HashSet;

    return-object p0
.end method

.method static synthetic access$200(Lio/flutter/plugin/platform/PlatformViewsController2;)Landroid/util/SparseArray;
    .locals 0

    .line 59
    iget-object p0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    return-object p0
.end method

.method static synthetic access$300(Lio/flutter/plugin/platform/PlatformViewsController2;)Landroid/util/SparseArray;
    .locals 0

    .line 59
    iget-object p0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    return-object p0
.end method

.method static synthetic access$400(Lio/flutter/plugin/platform/PlatformViewsController2;)Landroid/content/Context;
    .locals 0

    .line 59
    iget-object p0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->context:Landroid/content/Context;

    return-object p0
.end method

.method private createSurfaceClipCallback(Landroid/view/SurfaceView;FLandroid/graphics/Rect;I)Landroid/view/SurfaceHolder$Callback;
    .locals 6

    .line 622
    new-instance v0, Lio/flutter/plugin/platform/PlatformViewsController2$1;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lio/flutter/plugin/platform/PlatformViewsController2$1;-><init>(Lio/flutter/plugin/platform/PlatformViewsController2;Landroid/view/SurfaceView;FLandroid/graphics/Rect;I)V

    return-object v0
.end method

.method private disposeAllViews()V
    .locals 2

    .line 423
    :goto_0
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 424
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    .line 426
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->channelHandler:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;

    invoke-interface {v1, v0}, Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;->dispose(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private getDisplayDensity()F
    .locals 1

    .line 407
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    return v0
.end method

.method private lockInputConnection(Lio/flutter/plugin/platform/VirtualDisplayController;)V
    .locals 1

    .line 342
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->textInputPlugin:Lio/flutter/plugin/editing/TextInputPlugin;

    if-nez v0, :cond_0

    return-void

    .line 345
    :cond_0
    invoke-virtual {v0}, Lio/flutter/plugin/editing/TextInputPlugin;->lockPlatformViewInputConnection()V

    .line 346
    invoke-virtual {p1}, Lio/flutter/plugin/platform/VirtualDisplayController;->onInputConnectionLocked()V

    return-void
.end method

.method private maybeApplyClipToSurfaceView(Landroid/view/SurfaceView;IIIILio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;I)V
    .locals 3

    .line 553
    new-instance v0, Landroid/graphics/RectF;

    int-to-float v1, p2

    int-to-float v2, p3

    add-int/2addr p4, p2

    int-to-float p4, p4

    add-int/2addr p5, p3

    int-to-float p5, p5

    invoke-direct {v0, v1, v2, p4, p5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 554
    new-instance p4, Landroid/graphics/Rect;

    invoke-direct {p4}, Landroid/graphics/Rect;-><init>()V

    .line 555
    invoke-virtual {v0, p4}, Landroid/graphics/RectF;->roundOut(Landroid/graphics/Rect;)V

    .line 557
    invoke-virtual {p6}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;->getFinalClippingPaths()Ljava/util/List;

    move-result-object p5

    if-eqz p5, :cond_1

    .line 559
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 560
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 561
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :cond_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Path;

    const/4 v2, 0x1

    .line 563
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 566
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 567
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->roundOut(Landroid/graphics/Rect;)V

    .line 572
    invoke-virtual {p4, v1}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 574
    invoke-virtual {p4}, Landroid/graphics/Rect;->setEmpty()V

    :cond_1
    neg-int p2, p2

    neg-int p3, p3

    .line 583
    invoke-virtual {p4, p2, p3}, Landroid/graphics/Rect;->offset(II)V

    .line 584
    invoke-virtual {p4}, Landroid/graphics/Rect;->width()I

    move-result p2

    if-ltz p2, :cond_2

    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    move-result p2

    if-gez p2, :cond_3

    .line 585
    :cond_2
    invoke-virtual {p4}, Landroid/graphics/Rect;->setEmpty()V

    .line 592
    :cond_3
    invoke-virtual {p6}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;->getFinalOpacity()F

    move-result p2

    .line 593
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object p3

    if-nez p3, :cond_5

    .line 595
    iget-object p3, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->viewsWithPendingSurfaceCallback:Ljava/util/HashSet;

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p3, p5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    return-void

    .line 598
    :cond_4
    iget-object p3, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->viewsWithPendingSurfaceCallback:Ljava/util/HashSet;

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {p3, p5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 600
    invoke-direct {p0, p1, p2, p4, p7}, Lio/flutter/plugin/platform/PlatformViewsController2;->createSurfaceClipCallback(Landroid/view/SurfaceView;FLandroid/graphics/Rect;I)Landroid/view/SurfaceHolder$Callback;

    move-result-object p2

    .line 601
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void

    .line 604
    :cond_5
    invoke-virtual {p3}, Landroid/view/SurfaceControl;->isValid()Z

    move-result p5

    if-nez p5, :cond_6

    .line 605
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Skipping applying clip to SurfaceView: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 608
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getId()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " because it has an invalid SurfaceControl."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 605
    const-string p2, "PlatformViewsController2"

    invoke-static {p2, p1}, Lio/flutter/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 613
    :cond_6
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->createTransaction()Landroid/view/SurfaceControl$Transaction;

    move-result-object p1

    invoke-virtual {p1, p3, p2}, Landroid/view/SurfaceControl$Transaction;->setAlpha(Landroid/view/SurfaceControl;F)Landroid/view/SurfaceControl$Transaction;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Landroid/view/SurfaceControl$Transaction;->setCrop(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)Landroid/view/SurfaceControl$Transaction;

    return-void
.end method

.method private maybeInvokeOnFlutterViewAttached(Lio/flutter/plugin/platform/PlatformView;)V
    .locals 1

    .line 279
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    if-nez v0, :cond_0

    .line 280
    const-string p1, "PlatformViewsController2"

    const-string v0, "null flutterView"

    invoke-static {p1, v0}, Lio/flutter/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 284
    :cond_0
    invoke-interface {p1, v0}, Lio/flutter/plugin/platform/PlatformView;->onFlutterViewAttached(Landroid/view/View;)V

    return-void
.end method

.method private static parsePointerCoords(Ljava/lang/Object;F)Landroid/view/MotionEvent$PointerCoords;
    .locals 5

    .line 392
    check-cast p0, Ljava/util/List;

    .line 393
    new-instance v0, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v0}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    const/4 v1, 0x0

    .line 394
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    iput v1, v0, Landroid/view/MotionEvent$PointerCoords;->orientation:F

    const/4 v1, 0x1

    .line 395
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    iput v1, v0, Landroid/view/MotionEvent$PointerCoords;->pressure:F

    const/4 v1, 0x2

    .line 396
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float v1, v1

    iput v1, v0, Landroid/view/MotionEvent$PointerCoords;->size:F

    const/4 v1, 0x3

    .line 397
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    float-to-double v3, p1

    mul-double/2addr v1, v3

    double-to-float p1, v1

    iput p1, v0, Landroid/view/MotionEvent$PointerCoords;->toolMajor:F

    const/4 p1, 0x4

    .line 398
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    mul-double/2addr v1, v3

    double-to-float p1, v1

    iput p1, v0, Landroid/view/MotionEvent$PointerCoords;->toolMinor:F

    const/4 p1, 0x5

    .line 399
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    mul-double/2addr v1, v3

    double-to-float p1, v1

    iput p1, v0, Landroid/view/MotionEvent$PointerCoords;->touchMajor:F

    const/4 p1, 0x6

    .line 400
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    mul-double/2addr v1, v3

    double-to-float p1, v1

    iput p1, v0, Landroid/view/MotionEvent$PointerCoords;->touchMinor:F

    const/4 p1, 0x7

    .line 401
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    mul-double/2addr v1, v3

    double-to-float p1, v1

    iput p1, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    const/16 p1, 0x8

    .line 402
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    mul-double/2addr p0, v3

    double-to-float p0, p0

    iput p0, v0, Landroid/view/MotionEvent$PointerCoords;->y:F

    return-object v0
.end method

.method private static parsePointerCoordsList(Ljava/lang/Object;F)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "F)",
            "Ljava/util/List<",
            "Landroid/view/MotionEvent$PointerCoords;",
            ">;"
        }
    .end annotation

    .line 382
    check-cast p0, Ljava/util/List;

    .line 383
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 384
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 385
    invoke-static {v1, p1}, Lio/flutter/plugin/platform/PlatformViewsController2;->parsePointerCoords(Ljava/lang/Object;F)Landroid/view/MotionEvent$PointerCoords;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static parsePointerProperties(Ljava/lang/Object;)Landroid/view/MotionEvent$PointerProperties;
    .locals 2

    .line 373
    check-cast p0, Ljava/util/List;

    .line 374
    new-instance v0, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v0}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    const/4 v1, 0x0

    .line 375
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Landroid/view/MotionEvent$PointerProperties;->id:I

    const/4 v1, 0x1

    .line 376
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    iput p0, v0, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    return-object v0
.end method

.method private static parsePointerPropertiesList(Ljava/lang/Object;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/MotionEvent$PointerProperties;",
            ">;"
        }
    .end annotation

    .line 363
    check-cast p0, Ljava/util/List;

    .line 364
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 365
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 366
    invoke-static {v1}, Lio/flutter/plugin/platform/PlatformViewsController2;->parsePointerProperties(Ljava/lang/Object;)Landroid/view/MotionEvent$PointerProperties;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private toLogicalPixels(D)I
    .locals 1

    .line 419
    invoke-direct {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->getDisplayDensity()F

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Lio/flutter/plugin/platform/PlatformViewsController2;->toLogicalPixels(DF)I

    move-result p1

    return p1
.end method

.method private toLogicalPixels(DF)I
    .locals 2

    float-to-double v0, p3

    div-double/2addr p1, v0

    .line 415
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p1, p1

    return p1
.end method

.method private toPhysicalPixels(D)I
    .locals 2

    .line 411
    invoke-direct {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->getDisplayDensity()F

    move-result v0

    float-to-double v0, v0

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p1, p1

    return p1
.end method

.method private static translateMotionEvent(Landroid/view/MotionEvent;[Landroid/view/MotionEvent$PointerCoords;)V
    .locals 3

    .line 141
    array-length v0, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 145
    aget-object v1, p1, v0

    iget v1, v1, Landroid/view/MotionEvent$PointerCoords;->x:F

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    .line 146
    aget-object p1, p1, v0

    iget p1, p1, Landroid/view/MotionEvent$PointerCoords;->y:F

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sub-float/2addr p1, v0

    .line 148
    invoke-virtual {p0, v1, p1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    return-void
.end method

.method private unlockInputConnection(Lio/flutter/plugin/platform/VirtualDisplayController;)V
    .locals 1

    .line 350
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->textInputPlugin:Lio/flutter/plugin/editing/TextInputPlugin;

    if-nez v0, :cond_0

    return-void

    .line 353
    :cond_0
    invoke-virtual {v0}, Lio/flutter/plugin/editing/TextInputPlugin;->unlockPlatformViewInputConnection()V

    .line 354
    invoke-virtual {p1}, Lio/flutter/plugin/platform/VirtualDisplayController;->onInputConnectionUnlocked()V

    return-void
.end method

.method private static validateDirection(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method


# virtual methods
.method public applyTransactions()V
    .locals 3

    .line 697
    new-instance v0, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {v0}, Landroid/view/SurfaceControl$Transaction;-><init>()V

    const/4 v1, 0x0

    .line 698
    :goto_0
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->pendingTransactions:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 699
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->pendingTransactions:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v0, v2}, Landroid/view/SurfaceControl$Transaction;->merge(Landroid/view/SurfaceControl$Transaction;)Landroid/view/SurfaceControl$Transaction;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 701
    :cond_0
    invoke-virtual {v0}, Landroid/view/SurfaceControl$Transaction;->apply()V

    .line 702
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->pendingTransactions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public attach(Landroid/content/Context;Lio/flutter/embedding/engine/dart/DartExecutor;)V
    .locals 1

    .line 204
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->context:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 209
    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->context:Landroid/content/Context;

    .line 212
    new-instance p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;

    invoke-direct {p1, p2}, Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;-><init>(Lio/flutter/embedding/engine/dart/DartExecutor;)V

    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewsChannel:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;

    .line 213
    iget-object p2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->channelHandler:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;

    invoke-virtual {p1, p2}, Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;->setPlatformViewsHandler(Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;)V

    return-void

    .line 205
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public attachAccessibilityBridge(Lio/flutter/view/AccessibilityBridge;)V
    .locals 1

    .line 289
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->accessibilityEventsDelegate:Lio/flutter/plugin/platform/AccessibilityEventsDelegate;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/AccessibilityEventsDelegate;->setAccessibilityBridge(Lio/flutter/view/AccessibilityBridge;)V

    return-void
.end method

.method public attachTextInputPlugin(Lio/flutter/plugin/editing/TextInputPlugin;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->textInputPlugin:Lio/flutter/plugin/editing/TextInputPlugin;

    return-void
.end method

.method public attachToFlutterRenderer(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)V
    .locals 2

    .line 495
    new-instance v0, Lio/flutter/embedding/android/AndroidTouchProcessor;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/flutter/embedding/android/AndroidTouchProcessor;-><init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)V

    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->androidTouchProcessor:Lio/flutter/embedding/android/AndroidTouchProcessor;

    return-void
.end method

.method public attachToView(Lio/flutter/embedding/android/FlutterView;)V
    .locals 3

    .line 241
    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    const/4 p1, 0x0

    move v0, p1

    .line 243
    :goto_0
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 244
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;

    .line 245
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {v2, v1}, Lio/flutter/embedding/android/FlutterView;->addView(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 248
    :cond_0
    :goto_1
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 249
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/PlatformView;

    .line 250
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-interface {v0, v1}, Lio/flutter/plugin/platform/PlatformView;->onFlutterViewAttached(Landroid/view/View;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public createFlutterPlatformView(Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;)Lio/flutter/plugin/platform/PlatformView;
    .locals 4

    .line 108
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->registry:Lio/flutter/plugin/platform/PlatformViewRegistryImpl;

    iget-object v1, p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;->viewType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/PlatformViewRegistryImpl;->getFactory(Ljava/lang/String;)Lio/flutter/plugin/platform/PlatformViewFactory;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 115
    iget-object v1, p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;->params:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_0

    .line 116
    invoke-virtual {v0}, Lio/flutter/plugin/platform/PlatformViewFactory;->getCreateArgsCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    iget-object v2, p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;->params:Ljava/nio/ByteBuffer;

    invoke-interface {v1, v2}, Lio/flutter/plugin/common/MessageCodec;->decodeMessage(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 118
    :goto_0
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->context:Landroid/content/Context;

    iget v3, p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;->viewId:I

    invoke-virtual {v0, v2, v3, v1}, Lio/flutter/plugin/platform/PlatformViewFactory;->create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/PlatformView;

    move-result-object v0

    .line 121
    invoke-interface {v0}, Lio/flutter/plugin/platform/PlatformView;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 126
    iget v2, p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;->direction:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 127
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    iget p1, p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;->viewId:I

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 128
    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/PlatformViewsController2;->maybeInvokeOnFlutterViewAttached(Lio/flutter/plugin/platform/PlatformView;)V

    return-object v0

    .line 123
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "PlatformView#getView() returned null, but an Android view reference was expected."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 110
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trying to create a platform view of unregistered type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lio/flutter/embedding/engine/systemchannels/PlatformViewCreationRequest;->viewType:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public createOverlaySurface()Lio/flutter/embedding/engine/FlutterOverlaySurface;
    .locals 4

    .line 707
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlayerSurface:Landroid/view/Surface;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 708
    new-instance v0, Landroid/view/SurfaceControl$Builder;

    invoke-direct {v0}, Landroid/view/SurfaceControl$Builder;-><init>()V

    .line 709
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {v2}, Lio/flutter/embedding/android/FlutterView;->getWidth()I

    move-result v2

    iget-object v3, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {v3}, Lio/flutter/embedding/android/FlutterView;->getHeight()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/view/SurfaceControl$Builder;->setBufferSize(II)Landroid/view/SurfaceControl$Builder;

    const/4 v2, 0x1

    .line 710
    invoke-virtual {v0, v2}, Landroid/view/SurfaceControl$Builder;->setFormat(I)Landroid/view/SurfaceControl$Builder;

    .line 711
    const-string v2, "Flutter Overlay Surface"

    invoke-virtual {v0, v2}, Landroid/view/SurfaceControl$Builder;->setName(Ljava/lang/String;)Landroid/view/SurfaceControl$Builder;

    .line 712
    invoke-virtual {v0, v1}, Landroid/view/SurfaceControl$Builder;->setOpaque(Z)Landroid/view/SurfaceControl$Builder;

    .line 713
    invoke-virtual {v0, v1}, Landroid/view/SurfaceControl$Builder;->setHidden(Z)Landroid/view/SurfaceControl$Builder;

    .line 714
    invoke-virtual {v0}, Landroid/view/SurfaceControl$Builder;->build()Landroid/view/SurfaceControl;

    move-result-object v0

    .line 715
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    .line 716
    invoke-virtual {v2}, Lio/flutter/embedding/android/FlutterView;->getRootSurfaceControl()Landroid/view/AttachedSurfaceControl;

    move-result-object v2

    invoke-interface {v2, v0}, Landroid/view/AttachedSurfaceControl;->buildReparentTransaction(Landroid/view/SurfaceControl;)Landroid/view/SurfaceControl$Transaction;

    move-result-object v2

    const/16 v3, 0x3e8

    .line 717
    invoke-virtual {v2, v0, v3}, Landroid/view/SurfaceControl$Transaction;->setLayer(Landroid/view/SurfaceControl;I)Landroid/view/SurfaceControl$Transaction;

    .line 718
    invoke-virtual {v2}, Landroid/view/SurfaceControl$Transaction;->apply()V

    .line 719
    new-instance v2, Landroid/view/Surface;

    invoke-direct {v2, v0}, Landroid/view/Surface;-><init>(Landroid/view/SurfaceControl;)V

    iput-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlayerSurface:Landroid/view/Surface;

    .line 720
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlaySurfaceControl:Landroid/view/SurfaceControl;

    .line 723
    :cond_0
    new-instance v0, Lio/flutter/embedding/engine/FlutterOverlaySurface;

    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlayerSurface:Landroid/view/Surface;

    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/engine/FlutterOverlaySurface;-><init>(ILandroid/view/Surface;)V

    return-object v0
.end method

.method public createTransaction()Landroid/view/SurfaceControl$Transaction;
    .locals 2

    .line 689
    new-instance v0, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {v0}, Landroid/view/SurfaceControl$Transaction;-><init>()V

    .line 690
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->pendingTransactions:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public destroyOverlaySurface()V
    .locals 1

    .line 727
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlayerSurface:Landroid/view/Surface;

    if-eqz v0, :cond_0

    .line 728
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    .line 729
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlayerSurface:Landroid/view/Surface;

    .line 730
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlaySurfaceControl:Landroid/view/SurfaceControl;

    :cond_0
    return-void
.end method

.method public detach()V
    .locals 2

    .line 226
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewsChannel:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 227
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;->setPlatformViewsHandler(Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;)V

    .line 229
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->destroyOverlaySurface()V

    .line 230
    iput-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewsChannel:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;

    .line 231
    iput-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->context:Landroid/content/Context;

    return-void
.end method

.method public detachAccessibilityBridge()V
    .locals 2

    .line 294
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->accessibilityEventsDelegate:Lio/flutter/plugin/platform/AccessibilityEventsDelegate;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/AccessibilityEventsDelegate;->setAccessibilityBridge(Lio/flutter/view/AccessibilityBridge;)V

    return-void
.end method

.method public detachFromView()V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 263
    :goto_0
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 264
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;

    .line 265
    iget-object v3, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {v3, v2}, Lio/flutter/embedding/android/FlutterView;->removeView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 268
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->destroyOverlaySurface()V

    const/4 v1, 0x0

    .line 269
    iput-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    .line 272
    :goto_1
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 273
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugin/platform/PlatformView;

    .line 274
    invoke-interface {v1}, Lio/flutter/plugin/platform/PlatformView;->onFlutterViewDetached()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public detachTextInputPlugin()V
    .locals 1

    const/4 v0, 0x0

    .line 312
    iput-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->textInputPlugin:Lio/flutter/plugin/editing/TextInputPlugin;

    return-void
.end method

.method public disposePlatformView(I)V
    .locals 1

    .line 437
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->channelHandler:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;

    invoke-interface {v0, p1}, Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2$PlatformViewsHandler;->dispose(I)V

    return-void
.end method

.method public getPlatformViewById(I)Landroid/view/View;
    .locals 1

    .line 334
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugin/platform/PlatformView;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 338
    :cond_0
    invoke-interface {p1}, Lio/flutter/plugin/platform/PlatformView;->getView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;
    .locals 1

    .line 316
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->registry:Lio/flutter/plugin/platform/PlatformViewRegistryImpl;

    return-object v0
.end method

.method public hideOverlaySurface()V
    .locals 3

    .line 745
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlaySurfaceControl:Landroid/view/SurfaceControl;

    if-nez v0, :cond_0

    return-void

    .line 748
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->createTransaction()Landroid/view/SurfaceControl$Transaction;

    move-result-object v0

    .line 749
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlaySurfaceControl:Landroid/view/SurfaceControl;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/SurfaceControl$Transaction;->setVisibility(Landroid/view/SurfaceControl;Z)Landroid/view/SurfaceControl$Transaction;

    return-void
.end method

.method public hidePlatformView(I)V
    .locals 1

    .line 660
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/PlatformViewsController2;->initializePlatformViewIfNeeded(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 664
    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;

    const/16 v0, 0x8

    .line 665
    invoke-virtual {p1, v0}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;->setVisibility(I)V

    return-void
.end method

.method initializePlatformViewIfNeeded(I)Z
    .locals 6

    .line 448
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/PlatformView;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 452
    :cond_0
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    .line 455
    :cond_1
    invoke-interface {v0}, Lio/flutter/plugin/platform/PlatformView;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 460
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_2

    .line 465
    new-instance v1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;

    iget-object v3, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->context:Landroid/content/Context;

    .line 467
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    iget-object v5, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->androidTouchProcessor:Lio/flutter/embedding/android/AndroidTouchProcessor;

    invoke-direct {v1, v3, v4, v5}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;-><init>(Landroid/content/Context;FLio/flutter/embedding/android/AndroidTouchProcessor;)V

    .line 469
    new-instance v3, Lio/flutter/plugin/platform/PlatformViewsController2$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0, p1}, Lio/flutter/plugin/platform/PlatformViewsController2$$ExternalSyntheticLambda0;-><init>(Lio/flutter/plugin/platform/PlatformViewsController2;I)V

    invoke-virtual {v1, v3}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;->setOnDescendantFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 478
    iget-object v3, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v3, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 p1, 0x4

    .line 487
    invoke-virtual {v0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 489
    invoke-virtual {v1, v0}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;->addView(Landroid/view/View;)V

    .line 490
    iget-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {p1, v1}, Lio/flutter/embedding/android/FlutterView;->addView(Landroid/view/View;)V

    return v2

    .line 461
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The Android view returned from PlatformView#getView() was already added to a parent view."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 457
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "PlatformView#getView() returned null, but an Android view reference was expected."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isHcppEnabled()Z
    .locals 1

    .line 753
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 756
    :cond_0
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->IsSurfaceControlEnabled()Z

    move-result v0

    return v0
.end method

.method synthetic lambda$initializePlatformViewIfNeeded$0$io-flutter-plugin-platform-PlatformViewsController2(ILandroid/view/View;Z)V
    .locals 0

    .line 0
    if-eqz p3, :cond_0

    .line 472
    iget-object p2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewsChannel:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;

    invoke-virtual {p2, p1}, Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel2;->invokeViewFocused(I)V

    return-void

    .line 473
    :cond_0
    iget-object p2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->textInputPlugin:Lio/flutter/plugin/editing/TextInputPlugin;

    if-eqz p2, :cond_1

    .line 474
    invoke-virtual {p2, p1}, Lio/flutter/plugin/editing/TextInputPlugin;->clearPlatformViewClient(I)V

    :cond_1
    return-void
.end method

.method public onDetachedFromJNI()V
    .locals 0

    .line 324
    invoke-direct {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->disposeAllViews()V

    return-void
.end method

.method public onDisplayPlatformView(IIIIIIILio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;)V
    .locals 7

    .line 521
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/PlatformViewsController2;->initializePlatformViewIfNeeded(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 525
    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViewParent:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v2, p8

    .line 526
    invoke-virtual/range {v1 .. v6}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;->readyToDisplay(Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;IIII)V

    move p3, v3

    move p4, v4

    move p5, v5

    const/4 p2, 0x0

    .line 527
    invoke-virtual {v1, p2}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;->setVisibility(I)V

    .line 528
    invoke-virtual {v1}, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorView;->bringToFront()V

    .line 530
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 p8, 0x33

    invoke-direct {p2, p6, p7, p8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 532
    iget-object p6, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->platformViews:Landroid/util/SparseArray;

    invoke-virtual {p6, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lio/flutter/plugin/platform/PlatformView;

    invoke-interface {p6}, Lio/flutter/plugin/platform/PlatformView;->getView()Landroid/view/View;

    move-result-object p6

    if-eqz p6, :cond_1

    .line 534
    invoke-virtual {p6, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 535
    invoke-virtual {p6}, Landroid/view/View;->bringToFront()V

    .line 536
    instance-of p2, p6, Landroid/view/SurfaceView;

    if-eqz p2, :cond_1

    .line 537
    move-object p2, p6

    check-cast p2, Landroid/view/SurfaceView;

    move p8, p1

    move-object p7, v2

    move p6, v6

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lio/flutter/plugin/platform/PlatformViewsController2;->maybeApplyClipToSurfaceView(Landroid/view/SurfaceView;IIIILio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onEndFrame()V
    .locals 4

    .line 670
    new-instance v0, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {v0}, Landroid/view/SurfaceControl$Transaction;-><init>()V

    const/4 v1, 0x0

    .line 671
    :goto_0
    iget-object v2, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->activeTransactions:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 674
    iget-object v3, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->activeTransactions:Ljava/util/ArrayList;

    if-ge v1, v2, :cond_0

    .line 672
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {v0, v2}, Landroid/view/SurfaceControl$Transaction;->merge(Landroid/view/SurfaceControl$Transaction;)Landroid/view/SurfaceControl$Transaction;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 674
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 675
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterView;->invalidate()V

    .line 676
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterView:Lio/flutter/embedding/android/FlutterView;

    invoke-virtual {v1}, Lio/flutter/embedding/android/FlutterView;->getRootSurfaceControl()Landroid/view/AttachedSurfaceControl;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/AttachedSurfaceControl;->applyTransactionOnDraw(Landroid/view/SurfaceControl$Transaction;)Z

    return-void
.end method

.method public onPreEngineRestart()V
    .locals 0

    .line 328
    invoke-direct {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->disposeAllViews()V

    return-void
.end method

.method public setFlutterJNI(Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->flutterJNI:Lio/flutter/embedding/engine/FlutterJNI;

    return-void
.end method

.method public setRegistry(Lio/flutter/plugin/platform/PlatformViewRegistry;)V
    .locals 0

    .line 94
    check-cast p1, Lio/flutter/plugin/platform/PlatformViewRegistryImpl;

    iput-object p1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->registry:Lio/flutter/plugin/platform/PlatformViewRegistryImpl;

    return-void
.end method

.method public showOverlaySurface()V
    .locals 3

    .line 736
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlaySurfaceControl:Landroid/view/SurfaceControl;

    if-nez v0, :cond_0

    return-void

    .line 739
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugin/platform/PlatformViewsController2;->createTransaction()Landroid/view/SurfaceControl$Transaction;

    move-result-object v0

    .line 740
    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->overlaySurfaceControl:Landroid/view/SurfaceControl;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/SurfaceControl$Transaction;->setVisibility(Landroid/view/SurfaceControl;Z)Landroid/view/SurfaceControl$Transaction;

    return-void
.end method

.method public declared-synchronized swapTransactions()V
    .locals 2

    monitor-enter p0

    .line 681
    :try_start_0
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->activeTransactions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 682
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->activeTransactions:Ljava/util/ArrayList;

    iget-object v1, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->pendingTransactions:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 683
    iget-object v0, p0, Lio/flutter/plugin/platform/PlatformViewsController2;->pendingTransactions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 684
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public toMotionEvent(FLio/flutter/embedding/engine/systemchannels/PlatformViewTouch;)Landroid/view/MotionEvent;
    .locals 20

    move-object/from16 v0, p2

    .line 153
    iget-wide v1, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->motionEventId:J

    .line 154
    invoke-static {v1, v2}, Lio/flutter/embedding/android/MotionEventTracker$MotionEventId;->from(J)Lio/flutter/embedding/android/MotionEventTracker$MotionEventId;

    move-result-object v1

    move-object/from16 v2, p0

    .line 155
    iget-object v3, v2, Lio/flutter/plugin/platform/PlatformViewsController2;->motionEventTracker:Lio/flutter/embedding/android/MotionEventTracker;

    invoke-virtual {v3, v1}, Lio/flutter/embedding/android/MotionEventTracker;->pop(Lio/flutter/embedding/android/MotionEventTracker$MotionEventId;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 162
    iget-object v3, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->rawPointerCoords:Ljava/lang/Object;

    move/from16 v4, p1

    .line 163
    invoke-static {v3, v4}, Lio/flutter/plugin/platform/PlatformViewsController2;->parsePointerCoordsList(Ljava/lang/Object;F)Ljava/util/List;

    move-result-object v3

    iget v4, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->pointerCount:I

    new-array v4, v4, [Landroid/view/MotionEvent$PointerCoords;

    .line 164
    invoke-interface {v3, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, [Landroid/view/MotionEvent$PointerCoords;

    if-eqz v1, :cond_0

    .line 169
    invoke-static {v1, v11}, Lio/flutter/plugin/platform/PlatformViewsController2;->translateMotionEvent(Landroid/view/MotionEvent;[Landroid/view/MotionEvent$PointerCoords;)V

    return-object v1

    .line 175
    :cond_0
    iget-object v1, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->rawPointerPropertiesList:Ljava/lang/Object;

    .line 176
    invoke-static {v1}, Lio/flutter/plugin/platform/PlatformViewsController2;->parsePointerPropertiesList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget v3, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->pointerCount:I

    new-array v3, v3, [Landroid/view/MotionEvent$PointerProperties;

    .line 177
    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, [Landroid/view/MotionEvent$PointerProperties;

    .line 179
    iget-object v1, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->downTime:Ljava/lang/Number;

    .line 180
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    iget-object v1, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->eventTime:Ljava/lang/Number;

    .line 181
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    iget v8, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->action:I

    iget v9, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->pointerCount:I

    iget v12, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->metaState:I

    iget v13, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->buttonState:I

    iget v14, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->xPrecision:F

    iget v15, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->yPrecision:F

    iget v1, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->deviceId:I

    iget v3, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->edgeFlags:I

    move/from16 v16, v1

    iget v1, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->source:I

    iget v0, v0, Lio/flutter/embedding/engine/systemchannels/PlatformViewTouch;->flags:I

    move/from16 v19, v0

    move/from16 v18, v1

    move/from16 v17, v3

    .line 179
    invoke-static/range {v4 .. v19}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v0

    return-object v0
.end method

.method public usesVirtualDisplay(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
