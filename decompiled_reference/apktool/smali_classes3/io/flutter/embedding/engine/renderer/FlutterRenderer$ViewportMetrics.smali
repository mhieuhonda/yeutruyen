.class public final Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;
.super Ljava/lang/Object;
.source "FlutterRenderer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/renderer/FlutterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewportMetrics"
.end annotation


# static fields
.field public static final unsetValue:I = -0x1


# instance fields
.field public devicePixelRatio:F

.field public displayCornerRadiusBottomLeft:I

.field public displayCornerRadiusBottomRight:I

.field public displayCornerRadiusTopLeft:I

.field public displayCornerRadiusTopRight:I

.field private final displayCutouts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/renderer/FlutterRenderer$DisplayFeature;",
            ">;"
        }
    .end annotation
.end field

.field private final displayFeatures:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/renderer/FlutterRenderer$DisplayFeature;",
            ">;"
        }
    .end annotation
.end field

.field public height:I

.field public maxHeight:I

.field public maxWidth:I

.field public minHeight:I

.field public minWidth:I

.field public physicalTouchSlop:I

.field public systemGestureInsetBottom:I

.field public systemGestureInsetLeft:I

.field public systemGestureInsetRight:I

.field public systemGestureInsetTop:I

.field public viewInsetBottom:I

.field public viewInsetLeft:I

.field public viewInsetRight:I

.field public viewInsetTop:I

.field public viewPaddingBottom:I

.field public viewPaddingLeft:I

.field public viewPaddingRight:I

.field public viewPaddingTop:I

.field public width:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1398
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->devicePixelRatio:F

    const/4 v0, 0x0

    .line 1399
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->width:I

    .line 1400
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->height:I

    .line 1401
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->minWidth:I

    .line 1402
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->maxWidth:I

    .line 1403
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->minHeight:I

    .line 1404
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->maxHeight:I

    .line 1408
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewPaddingTop:I

    .line 1409
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewPaddingRight:I

    .line 1410
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewPaddingBottom:I

    .line 1411
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewPaddingLeft:I

    .line 1412
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewInsetTop:I

    .line 1413
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewInsetRight:I

    .line 1414
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewInsetBottom:I

    .line 1415
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->viewInsetLeft:I

    .line 1416
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->systemGestureInsetTop:I

    .line 1417
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->systemGestureInsetRight:I

    .line 1418
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->systemGestureInsetBottom:I

    .line 1419
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->systemGestureInsetLeft:I

    const/4 v0, -0x1

    .line 1420
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->physicalTouchSlop:I

    .line 1421
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCornerRadiusTopLeft:I

    .line 1422
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCornerRadiusTopRight:I

    .line 1423
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCornerRadiusBottomRight:I

    .line 1424
    iput v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCornerRadiusBottomLeft:I

    .line 1445
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayFeatures:Ljava/util/List;

    .line 1448
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCutouts:Ljava/util/List;

    return-void
.end method

.method static synthetic access$800(Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;)Ljava/util/List;
    .locals 0

    .line 1394
    iget-object p0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayFeatures:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$900(Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;)Ljava/util/List;
    .locals 0

    .line 1394
    iget-object p0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCutouts:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public getDisplayCutouts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/renderer/FlutterRenderer$DisplayFeature;",
            ">;"
        }
    .end annotation

    .line 1455
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCutouts:Ljava/util/List;

    return-object v0
.end method

.method public getDisplayFeatures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/renderer/FlutterRenderer$DisplayFeature;",
            ">;"
        }
    .end annotation

    .line 1451
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayFeatures:Ljava/util/List;

    return-object v0
.end method

.method public setDisplayCutouts(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/renderer/FlutterRenderer$DisplayFeature;",
            ">;)V"
        }
    .end annotation

    .line 1464
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCutouts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1465
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayCutouts:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setDisplayFeatures(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/renderer/FlutterRenderer$DisplayFeature;",
            ">;)V"
        }
    .end annotation

    .line 1459
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayFeatures:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1460
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->displayFeatures:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method validate()Z
    .locals 6

    .line 1432
    iget v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->width:I

    const-string v1, ","

    const-string v2, "FlutterRenderer"

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_2

    .line 1433
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Width is zero. "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->minWidth:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->maxWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1434
    iget v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->minWidth:I

    if-gtz v0, :cond_1

    iget v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->maxWidth:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    :goto_0
    return v4

    .line 1437
    :cond_2
    iget v5, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->height:I

    if-nez v5, :cond_5

    .line 1438
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Height is zero. "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->minHeight:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->maxHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1439
    iget v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->minHeight:I

    if-gtz v0, :cond_4

    iget v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->maxHeight:I

    if-lez v0, :cond_3

    goto :goto_1

    :cond_3
    return v3

    :cond_4
    :goto_1
    return v4

    :cond_5
    if-lez v0, :cond_6

    if-lez v5, :cond_6

    .line 1441
    iget v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$ViewportMetrics;->devicePixelRatio:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    return v4

    :cond_6
    return v3
.end method
