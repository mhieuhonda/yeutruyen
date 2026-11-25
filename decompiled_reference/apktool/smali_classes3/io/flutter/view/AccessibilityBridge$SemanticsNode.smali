.class Lio/flutter/view/AccessibilityBridge$SemanticsNode;
.super Ljava/lang/Object;
.source "AccessibilityBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/AccessibilityBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SemanticsNode"
.end annotation


# instance fields
.field final accessibilityBridge:Lio/flutter/view/AccessibilityBridge;

.field private actions:I

.field private bottom:F

.field private childrenInHitTestOrder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            ">;"
        }
    .end annotation
.end field

.field private childrenInTraversalOrder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            ">;"
        }
    .end annotation
.end field

.field private currentValueLength:I

.field private customAccessibilityActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;",
            ">;"
        }
    .end annotation
.end field

.field private decreasedValue:Ljava/lang/String;

.field private decreasedValueAttributes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityStringBuilder$StringAttribute;",
            ">;"
        }
    .end annotation
.end field

.field private flags:J

.field private globalGeometryDirty:Z

.field private globalRect:Landroid/graphics/Rect;

.field private globalTransform:[F

.field private hadPreviousConfig:Z

.field private headingLevel:I

.field private hint:Ljava/lang/String;

.field private hintAttributes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityStringBuilder$StringAttribute;",
            ">;"
        }
    .end annotation
.end field

.field private hitTestTransform:[F

.field private id:I

.field private identifier:Ljava/lang/String;

.field private increasedValue:Ljava/lang/String;

.field private increasedValueAttributes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityStringBuilder$StringAttribute;",
            ">;"
        }
    .end annotation
.end field

.field private inverseTransform:[F

.field private inverseTransformDirty:Z

.field private label:Ljava/lang/String;

.field private labelAttributes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityStringBuilder$StringAttribute;",
            ">;"
        }
    .end annotation
.end field

.field private left:F

.field private linkUrl:Ljava/lang/String;

.field private locale:Ljava/lang/String;

.field private maxValue:Ljava/lang/String;

.field private maxValueLength:I

.field private minValue:Ljava/lang/String;

.field private onLongPressOverride:Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

.field private onTapOverride:Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

.field private parent:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

.field private platformViewId:I

.field private previousActions:I

.field private previousFlags:J

.field private previousLabel:Ljava/lang/String;

.field private previousNodeId:I

.field private previousScrollExtentMax:F

.field private previousScrollExtentMin:F

.field private previousScrollPosition:F

.field private previousTextSelectionBase:I

.field private previousTextSelectionExtent:I

.field private previousValue:Ljava/lang/String;

.field private right:F

.field private role:I

.field private scrollChildren:I

.field private scrollExtentMax:F

.field private scrollExtentMin:F

.field private scrollIndex:I

.field private scrollPosition:F

.field private textDirection:Lio/flutter/view/AccessibilityBridge$TextDirection;

.field private textSelectionBase:I

.field private textSelectionExtent:I

.field private tooltip:Ljava/lang/String;

.field private top:F

.field private transform:[F

.field private traversalParent:I

.field private value:Ljava/lang/String;

.field private valueAttributes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityStringBuilder$StringAttribute;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/flutter/view/AccessibilityBridge;)V
    .locals 1

    .line 2669
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2573
    iput v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->id:I

    .line 2632
    iput v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousNodeId:I

    const/4 v0, 0x0

    .line 2637
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadPreviousConfig:Z

    .line 2656
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInTraversalOrder:Ljava/util/List;

    .line 2657
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInHitTestOrder:Ljava/util/List;

    const/4 v0, 0x1

    .line 2662
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransformDirty:Z

    .line 2665
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalGeometryDirty:Z

    .line 2670
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->accessibilityBridge:Lio/flutter/view/AccessibilityBridge;

    return-void
.end method

.method static synthetic access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->id:I

    return p0
.end method

.method static synthetic access$002(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I
    .locals 0

    .line 2564
    iput p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->id:I

    return p1
.end method

.method static synthetic access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollChildren:I

    return p0
.end method

.method static synthetic access$1400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/function/Predicate;)Z
    .locals 0

    .line 2564
    invoke-static {p0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->nullableHasAncestor(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/function/Predicate;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->parent:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    return-object p0
.end method

.method static synthetic access$1502(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 0

    .line 2564
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->parent:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    return-object p1
.end method

.method static synthetic access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z
    .locals 0

    .line 2564
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->platformViewId:I

    return p0
.end method

.method static synthetic access$1800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Landroid/graphics/Rect;
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getGlobalRect()Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->identifier:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->isFocusable()Z

    move-result p0

    return p0
.end method

.method static synthetic access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionBase:I

    return p0
.end method

.method static synthetic access$2102(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I
    .locals 0

    .line 2564
    iput p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionBase:I

    return p1
.end method

.method static synthetic access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    return p0
.end method

.method static synthetic access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I
    .locals 0

    .line 2564
    iput p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    return p1
.end method

.method static synthetic access$2212(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I
    .locals 1

    .line 2564
    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    add-int/2addr v0, p1

    iput v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    return v0
.end method

.method static synthetic access$2220(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I
    .locals 1

    .line 2564
    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    sub-int/2addr v0, p1

    iput v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    return v0
.end method

.method static synthetic access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z
    .locals 0

    .line 2564
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasAction(Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$2400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->maxValueLength:I

    return p0
.end method

.method static synthetic access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->value:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2502(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2564
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->value:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$2600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->currentValueLength:I

    return p0
.end method

.method static synthetic access$2700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->shouldBeTreatedAsButton()Z

    move-result p0

    return p0
.end method

.method static synthetic access$2800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->role:I

    return p0
.end method

.method static synthetic access$2900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->minValue:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->maxValue:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousNodeId:I

    return p0
.end method

.method static synthetic access$3200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->onTapOverride:Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    return-object p0
.end method

.method static synthetic access$3400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->onLongPressOverride:Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    return-object p0
.end method

.method static synthetic access$3500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInTraversalOrder:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$3600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getValue()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$3700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getTextFieldHint()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$3800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getValueLabelHint()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$3900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->tooltip:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$4000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->headingLevel:I

    return p0
.end method

.method static synthetic access$4100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->customAccessibilityActions:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$4400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->actions:I

    return p0
.end method

.method static synthetic access$4500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->increasedValue:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$4602(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 2564
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->valueAttributes:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$4700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->increasedValueAttributes:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$4800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->decreasedValue:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$4900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->decreasedValueAttributes:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$5100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;[FZ)Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 0

    .line 2564
    invoke-direct {p0, p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hitTest([FZ)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$5300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 2564
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->updateWith(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method static synthetic access$5400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 0

    .line 2564
    iget-boolean p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadPreviousConfig:Z

    return p0
.end method

.method static synthetic access$5500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;[FLjava/util/Set;Z)V
    .locals 0

    .line 2564
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->updateRecursively([FLjava/util/Set;Z)V

    return-void
.end method

.method static synthetic access$5600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/List;)V
    .locals 0

    .line 2564
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->collectRoutes(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$5700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->didScroll()Z

    move-result p0

    return p0
.end method

.method static synthetic access$5800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollPosition:F

    return p0
.end method

.method static synthetic access$5900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollExtentMax:F

    return p0
.end method

.method static synthetic access$6000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollExtentMin:F

    return p0
.end method

.method static synthetic access$6100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z
    .locals 0

    .line 2564
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadAction(Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$6200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollIndex:I

    return p0
.end method

.method static synthetic access$6300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInHitTestOrder:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$6400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->didChangeLabel()Z

    move-result p0

    return p0
.end method

.method static synthetic access$6500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->didChangeCheckedState()Z

    move-result p0

    return p0
.end method

.method static synthetic access$6600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z
    .locals 0

    .line 2564
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$6700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$6800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousValue:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$6900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousTextSelectionBase:I

    return p0
.end method

.method static synthetic access$7000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I
    .locals 0

    .line 2564
    iget p0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousTextSelectionExtent:I

    return p0
.end method

.method static synthetic access$7100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;
    .locals 0

    .line 2564
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getRouteName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private collectRoutes(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            ">;)V"
        }
    .end annotation

    .line 3025
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->SCOPES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3026
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3028
    :cond_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInTraversalOrder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 3029
    invoke-direct {v1, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->collectRoutes(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private didChangeCheckedState()Z
    .locals 3

    .line 2743
    iget-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadPreviousConfig:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2746
    :cond_0
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECKED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    sget-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECKED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v2

    if-ne v0, v2, :cond_2

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECK_STATE_MIXED:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 2747
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    sget-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECK_STATE_MIXED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v2

    if-ne v0, v2, :cond_2

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TOGGLED:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 2748
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    sget-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TOGGLED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v2

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private didChangeLabel()Z
    .locals 3

    .line 2736
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousLabel:Ljava/lang/String;

    if-nez v2, :cond_0

    return v1

    :cond_0
    if-eqz v0, :cond_2

    .line 2739
    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousLabel:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private didScroll()Z
    .locals 2

    .line 2730
    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollPosition:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousScrollPosition:F

    .line 2731
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousScrollPosition:F

    iget v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollPosition:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ensureInverseTransform()V
    .locals 3

    .line 2952
    iget-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransformDirty:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2955
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransformDirty:Z

    .line 2956
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransform:[F

    if-nez v1, :cond_1

    const/16 v1, 0x10

    .line 2957
    new-array v1, v1, [F

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransform:[F

    .line 2959
    :cond_1
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransform:[F

    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hitTestTransform:[F

    invoke-static {v1, v0, v2, v0}, Landroid/opengl/Matrix;->invertM([FI[FI)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2960
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransform:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    :cond_2
    :goto_0
    return-void
.end method

.method private getAncestor(Ljava/util/function/Predicate;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Predicate<",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            ">;)",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;"
        }
    .end annotation

    .line 2678
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->parent:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    :goto_0
    if-eqz v0, :cond_1

    .line 2680
    invoke-interface {p1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 2683
    :cond_0
    iget-object v0, v0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->parent:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private getEffectiveLocale()Ljava/lang/String;
    .locals 1

    .line 3059
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->locale:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3060
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->locale:Ljava/lang/String;

    return-object v0

    .line 3062
    :cond_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->accessibilityBridge:Lio/flutter/view/AccessibilityBridge;

    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge;->access$7800(Lio/flutter/view/AccessibilityBridge;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getGlobalRect()Landroid/graphics/Rect;
    .locals 1

    .line 2968
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method private getHint()Ljava/lang/CharSequence;
    .locals 2

    .line 3174
    new-instance v0, Lio/flutter/view/AccessibilityStringBuilder;

    invoke-direct {v0}, Lio/flutter/view/AccessibilityStringBuilder;-><init>()V

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hint:Ljava/lang/String;

    .line 3175
    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addString(Ljava/lang/String;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hintAttributes:Ljava/util/List;

    .line 3176
    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addAttributes(Ljava/util/List;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    .line 3177
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getEffectiveLocale()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addLocale(Ljava/lang/String;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    .line 3178
    invoke-virtual {v0}, Lio/flutter/view/AccessibilityStringBuilder;->build()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method private getLabel()Ljava/lang/CharSequence;
    .locals 2

    .line 3165
    new-instance v0, Lio/flutter/view/AccessibilityStringBuilder;

    invoke-direct {v0}, Lio/flutter/view/AccessibilityStringBuilder;-><init>()V

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    .line 3166
    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addString(Ljava/lang/String;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->labelAttributes:Ljava/util/List;

    .line 3167
    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addAttributes(Ljava/util/List;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->linkUrl:Ljava/lang/String;

    .line 3168
    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addUrl(Ljava/lang/String;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    .line 3169
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getEffectiveLocale()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addLocale(Ljava/lang/String;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    .line 3170
    invoke-virtual {v0}, Lio/flutter/view/AccessibilityStringBuilder;->build()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method private getRouteName()Ljava/lang/String;
    .locals 3

    .line 3036
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->NAMES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3037
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3038
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    return-object v0

    .line 3041
    :cond_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInTraversalOrder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 3042
    invoke-direct {v1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getRouteName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 3043
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private getStringAttributesFromBuffer(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "[",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/List<",
            "Lio/flutter/view/AccessibilityStringBuilder$StringAttribute;",
            ">;"
        }
    .end annotation

    .line 2911
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2915
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 2917
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 2918
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    .line 2919
    invoke-static {}, Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;->values()[Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;

    move-result-object v5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6

    aget-object v5, v5, v6

    .line 2920
    sget-object v6, Lio/flutter/view/AccessibilityBridge$5;->$SwitchMap$io$flutter$view$AccessibilityStringBuilder$StringAttributeType:[I

    invoke-virtual {v5}, Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x1

    if-eq v6, v7, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    goto :goto_1

    .line 2934
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6

    .line 2935
    aget-object v6, p2, v6

    .line 2936
    new-instance v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;

    invoke-direct {v7}, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;-><init>()V

    .line 2937
    iput v3, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->start:I

    .line 2938
    iput v4, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->end:I

    .line 2939
    iput-object v5, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->type:Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;

    .line 2940
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v6}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->locale:Ljava/lang/String;

    .line 2941
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 2924
    :cond_2
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 2925
    new-instance v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;

    invoke-direct {v6}, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;-><init>()V

    .line 2926
    iput v3, v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;->start:I

    .line 2927
    iput v4, v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;->end:I

    .line 2928
    iput-object v5, v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;->type:Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;

    .line 2929
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method private getTextFieldHint()Ljava/lang/CharSequence;
    .locals 8

    const/4 v0, 0x2

    .line 3197
    new-array v1, v0, [Ljava/lang/CharSequence;

    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getLabel()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getHint()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/4 v2, 0x0

    move v5, v3

    :goto_0
    if-ge v5, v0, :cond_3

    .line 3199
    aget-object v6, v1, v5

    if-eqz v6, :cond_2

    .line 3200
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_2

    if-eqz v2, :cond_1

    .line 3201
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    const/4 v7, 0x3

    .line 3204
    new-array v7, v7, [Ljava/lang/CharSequence;

    aput-object v2, v7, v3

    const-string v2, ", "

    aput-object v2, v7, v4

    aput-object v6, v7, v0

    invoke-static {v7}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_2

    :cond_1
    :goto_1
    move-object v2, v6

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method private getValue()Ljava/lang/CharSequence;
    .locals 2

    .line 3157
    new-instance v0, Lio/flutter/view/AccessibilityStringBuilder;

    invoke-direct {v0}, Lio/flutter/view/AccessibilityStringBuilder;-><init>()V

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->value:Ljava/lang/String;

    .line 3158
    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addString(Ljava/lang/String;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->valueAttributes:Ljava/util/List;

    .line 3159
    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addAttributes(Ljava/util/List;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    .line 3160
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getEffectiveLocale()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityStringBuilder;->addLocale(Ljava/lang/String;)Lio/flutter/view/AccessibilityStringBuilder;

    move-result-object v0

    .line 3161
    invoke-virtual {v0}, Lio/flutter/view/AccessibilityStringBuilder;->build()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method private getValueLabelHint()Ljava/lang/CharSequence;
    .locals 9

    const/4 v0, 0x3

    .line 3182
    new-array v1, v0, [Ljava/lang/CharSequence;

    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getValue()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getLabel()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getHint()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const/4 v2, 0x0

    move v6, v3

    :goto_0
    if-ge v6, v0, :cond_3

    .line 3184
    aget-object v7, v1, v6

    if-eqz v7, :cond_2

    .line 3185
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_2

    if-eqz v2, :cond_1

    .line 3186
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-nez v8, :cond_0

    goto :goto_1

    .line 3189
    :cond_0
    new-array v8, v0, [Ljava/lang/CharSequence;

    aput-object v2, v8, v3

    const-string v2, ", "

    aput-object v2, v8, v4

    aput-object v7, v8, v5

    invoke-static {v8}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_2

    :cond_1
    :goto_1
    move-object v2, v7

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method private hadAction(Lio/flutter/view/AccessibilityBridge$Action;)Z
    .locals 1

    .line 2703
    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousActions:I

    iget p1, p1, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private hadFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z
    .locals 4

    .line 2714
    iget-wide v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousFlags:J

    iget p1, p1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    int-to-long v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private hasAction(Lio/flutter/view/AccessibilityBridge$Action;)Z
    .locals 1

    .line 2695
    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->actions:I

    iget p1, p1, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z
    .locals 4

    .line 2707
    iget-wide v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->flags:J

    iget p1, p1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    int-to-long v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private hitTest([FZ)Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 12

    const/4 v0, 0x3

    .line 2980
    aget v0, p1, v0

    const/4 v1, 0x0

    .line 2981
    aget v2, p1, v1

    div-float/2addr v2, v0

    const/4 v3, 0x1

    .line 2982
    aget v4, p1, v3

    div-float/2addr v4, v0

    .line 2983
    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->left:F

    cmpg-float v0, v2, v0

    const/4 v5, 0x0

    if-ltz v0, :cond_7

    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->right:F

    cmpl-float v0, v2, v0

    if-gez v0, :cond_7

    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->top:F

    cmpg-float v0, v4, v0

    if-ltz v0, :cond_7

    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->bottom:F

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x4

    .line 2984
    new-array v6, v0, [F

    .line 2985
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInHitTestOrder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2986
    sget-object v4, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HIDDEN:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {v2, v4}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 2989
    :cond_1
    invoke-direct {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->ensureInverseTransform()V

    .line 2990
    iget-object v8, v2, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransform:[F

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x0

    move-object v10, p1

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->multiplyMV([FI[FI[FI)V

    .line 2991
    invoke-direct {v2, v6, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hitTest([FZ)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    move-object p1, v10

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    .line 2996
    iget p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->platformViewId:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_4

    move v1, v3

    .line 2997
    :cond_4
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->isFocusable()Z

    move-result p1

    if-nez p1, :cond_6

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    return-object v5

    :cond_6
    :goto_1
    return-object p0

    :cond_7
    :goto_2
    return-object v5
.end method

.method private isFocusable()Z
    .locals 7

    .line 3005
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->SCOPES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 3008
    :cond_0
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_FOCUSABLE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 3011
    :cond_1
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_ACCESSIBILITY_FOCUS_BLOCKED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 3017
    :cond_2
    iget v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->actions:I

    invoke-static {}, Lio/flutter/view/AccessibilityBridge;->access$7600()I

    move-result v3

    not-int v3, v3

    and-int/2addr v0, v3

    if-nez v0, :cond_6

    iget-wide v3, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->flags:J

    .line 3018
    invoke-static {}, Lio/flutter/view/AccessibilityBridge;->access$7700()I

    move-result v0

    int-to-long v5, v0

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-nez v0, :cond_6

    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 3019
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_3
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->value:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 3020
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_4
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hint:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 3021
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    return v1

    :cond_6
    :goto_0
    return v2
.end method

.method private log(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method

.method private max(FFFF)F
    .locals 0

    .line 3153
    invoke-static {p3, p4}, Ljava/lang/Math;->max(FF)F

    move-result p3

    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method

.method private min(FFFF)F
    .locals 0

    .line 3149
    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    move-result p3

    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1
.end method

.method private static nullableHasAncestor(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/function/Predicate;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            "Ljava/util/function/Predicate<",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            ">;)Z"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 2567
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getAncestor(Ljava/util/function/Predicate;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private shouldBeTreatedAsButton()Z
    .locals 1

    .line 2718
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_BUTTON:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 2721
    :cond_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->linkUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 2726
    :cond_1
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_LINK:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hasFlag(Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    return v0
.end method

.method private transformPoint([F[F[F)V
    .locals 6

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, p2

    move-object v4, p3

    .line 3140
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMV([FI[FI[FI)V

    const/4 p1, 0x3

    .line 3141
    aget p2, v0, p1

    const/4 p3, 0x0

    .line 3142
    aget v1, v0, p3

    div-float/2addr v1, p2

    aput v1, v0, p3

    const/4 p3, 0x1

    .line 3143
    aget v1, v0, p3

    div-float/2addr v1, p2

    aput v1, v0, p3

    const/4 p3, 0x2

    .line 3144
    aget v1, v0, p3

    div-float/2addr v1, p2

    aput v1, v0, p3

    const/4 p2, 0x0

    .line 3145
    aput p2, v0, p1

    return-void
.end method

.method private updateRecursively([FLjava/util/Set;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([F",
            "Ljava/util/Set<",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            ">;Z)V"
        }
    .end annotation

    .line 3067
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 3069
    iget-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalGeometryDirty:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move p3, v1

    :cond_0
    if-eqz p3, :cond_4

    .line 3074
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    const/16 v2, 0x10

    if-nez v0, :cond_1

    .line 3075
    new-array v0, v2, [F

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    .line 3077
    :cond_1
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transform:[F

    if-nez v0, :cond_2

    .line 3082
    new-array v0, v2, [F

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transform:[F

    .line 3084
    :cond_2
    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    iget-object v6, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transform:[F

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    const/4 p1, 0x4

    .line 3086
    new-array v0, p1, [F

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 3087
    aput v3, v0, v2

    const/4 v2, 0x3

    const/high16 v3, 0x3f800000    # 1.0f

    .line 3088
    aput v3, v0, v2

    .line 3090
    new-array v2, p1, [F

    .line 3091
    new-array v3, p1, [F

    .line 3092
    new-array v4, p1, [F

    .line 3093
    new-array p1, p1, [F

    .line 3095
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->left:F

    const/4 v6, 0x0

    aput v5, v0, v6

    .line 3096
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->top:F

    aput v5, v0, v1

    .line 3097
    iget-object v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    invoke-direct {p0, v2, v5, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transformPoint([F[F[F)V

    .line 3099
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->right:F

    aput v5, v0, v6

    .line 3100
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->top:F

    aput v5, v0, v1

    .line 3101
    iget-object v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    invoke-direct {p0, v3, v5, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transformPoint([F[F[F)V

    .line 3103
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->right:F

    aput v5, v0, v6

    .line 3104
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->bottom:F

    aput v5, v0, v1

    .line 3105
    iget-object v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    invoke-direct {p0, v4, v5, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transformPoint([F[F[F)V

    .line 3107
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->left:F

    aput v5, v0, v6

    .line 3108
    iget v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->bottom:F

    aput v5, v0, v1

    .line 3109
    iget-object v5, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    invoke-direct {p0, p1, v5, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transformPoint([F[F[F)V

    .line 3111
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalRect:Landroid/graphics/Rect;

    if-nez v0, :cond_3

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalRect:Landroid/graphics/Rect;

    .line 3113
    :cond_3
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalRect:Landroid/graphics/Rect;

    aget v5, v2, v6

    aget v7, v3, v6

    aget v8, v4, v6

    aget v9, p1, v6

    .line 3114
    invoke-direct {p0, v5, v7, v8, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->min(FFFF)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aget v7, v2, v1

    aget v8, v3, v1

    aget v9, v4, v1

    aget v10, p1, v1

    .line 3115
    invoke-direct {p0, v7, v8, v9, v10}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->min(FFFF)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    aget v8, v2, v6

    aget v9, v3, v6

    aget v10, v4, v6

    aget v11, p1, v6

    .line 3116
    invoke-direct {p0, v8, v9, v10, v11}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->max(FFFF)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    aget v2, v2, v1

    aget v3, v3, v1

    aget v4, v4, v1

    aget p1, p1, v1

    .line 3117
    invoke-direct {p0, v2, v3, v4, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->max(FFFF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 3113
    invoke-virtual {v0, v5, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 3119
    iput-boolean v6, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalGeometryDirty:Z

    .line 3132
    :cond_4
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInTraversalOrder:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, -0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 3133
    iput v0, v1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousNodeId:I

    .line 3134
    iget v0, v1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->id:I

    .line 3135
    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalTransform:[F

    invoke-direct {v1, v2, p2, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->updateRecursively([FLjava/util/Set;Z)V

    goto :goto_0

    :cond_5
    return-void
.end method

.method private updateWith(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V
    .locals 3

    const/4 v0, 0x1

    .line 2802
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hadPreviousConfig:Z

    .line 2803
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->value:Ljava/lang/String;

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousValue:Ljava/lang/String;

    .line 2804
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousLabel:Ljava/lang/String;

    .line 2805
    iget-wide v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->flags:J

    iput-wide v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousFlags:J

    .line 2806
    iget v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->actions:I

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousActions:I

    .line 2807
    iget v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionBase:I

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousTextSelectionBase:I

    .line 2808
    iget v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousTextSelectionExtent:I

    .line 2809
    iget v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollPosition:F

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousScrollPosition:F

    .line 2810
    iget v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollExtentMax:F

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousScrollExtentMax:F

    .line 2811
    iget v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollExtentMin:F

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->previousScrollExtentMin:F

    .line 2813
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v1

    iput-wide v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->flags:J

    .line 2814
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->actions:I

    .line 2815
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->maxValueLength:I

    .line 2816
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->currentValueLength:I

    .line 2817
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionBase:I

    .line 2818
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textSelectionExtent:I

    .line 2819
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->platformViewId:I

    .line 2820
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollChildren:I

    .line 2821
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollIndex:I

    .line 2822
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->traversalParent:I

    .line 2823
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollPosition:F

    .line 2824
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollExtentMax:F

    .line 2825
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->scrollExtentMin:F

    .line 2826
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->role:I

    .line 2828
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->identifier:Ljava/lang/String;

    .line 2830
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->label:Ljava/lang/String;

    .line 2831
    invoke-direct {p0, p1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getStringAttributesFromBuffer(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->labelAttributes:Ljava/util/List;

    .line 2833
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->value:Ljava/lang/String;

    .line 2834
    invoke-direct {p0, p1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getStringAttributesFromBuffer(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->valueAttributes:Ljava/util/List;

    .line 2836
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->increasedValue:Ljava/lang/String;

    .line 2837
    invoke-direct {p0, p1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getStringAttributesFromBuffer(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->increasedValueAttributes:Ljava/util/List;

    .line 2839
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->decreasedValue:Ljava/lang/String;

    .line 2840
    invoke-direct {p0, p1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getStringAttributesFromBuffer(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->decreasedValueAttributes:Ljava/util/List;

    .line 2842
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hint:Ljava/lang/String;

    .line 2843
    invoke-direct {p0, p1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->getStringAttributesFromBuffer(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/List;

    move-result-object p3

    iput-object p3, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hintAttributes:Ljava/util/List;

    .line 2845
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->tooltip:Ljava/lang/String;

    .line 2846
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->linkUrl:Ljava/lang/String;

    .line 2847
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->locale:Ljava/lang/String;

    .line 2848
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->minValue:Ljava/lang/String;

    .line 2849
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->maxValue:Ljava/lang/String;

    .line 2851
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    iput p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->headingLevel:I

    .line 2852
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    invoke-static {p2}, Lio/flutter/view/AccessibilityBridge$TextDirection;->fromInt(I)Lio/flutter/view/AccessibilityBridge$TextDirection;

    move-result-object p2

    iput-object p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->textDirection:Lio/flutter/view/AccessibilityBridge$TextDirection;

    .line 2854
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result p2

    iput p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->left:F

    .line 2855
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result p2

    iput p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->top:F

    .line 2856
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result p2

    iput p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->right:F

    .line 2857
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result p2

    iput p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->bottom:F

    .line 2859
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transform:[F

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7300(Ljava/nio/ByteBuffer;[F)[F

    move-result-object p2

    iput-object p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->transform:[F

    .line 2860
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hitTestTransform:[F

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->access$7300(Ljava/nio/ByteBuffer;[F)[F

    move-result-object p2

    iput-object p2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->hitTestTransform:[F

    .line 2862
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->inverseTransformDirty:Z

    .line 2863
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->globalGeometryDirty:Z

    .line 2865
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    .line 2866
    iget-object p3, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInTraversalOrder:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->clear()V

    const/4 p3, 0x0

    move v0, p3

    :goto_0
    if-ge v0, p2, :cond_0

    .line 2868
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->accessibilityBridge:Lio/flutter/view/AccessibilityBridge;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    invoke-static {v1, v2}, Lio/flutter/view/AccessibilityBridge;->access$7400(Lio/flutter/view/AccessibilityBridge;I)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v1

    .line 2869
    iput-object p0, v1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->parent:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2870
    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInTraversalOrder:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2873
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    .line 2874
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInHitTestOrder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    move v0, p3

    :goto_1
    if-ge v0, p2, :cond_1

    .line 2876
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->accessibilityBridge:Lio/flutter/view/AccessibilityBridge;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    invoke-static {v1, v2}, Lio/flutter/view/AccessibilityBridge;->access$7400(Lio/flutter/view/AccessibilityBridge;I)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v1

    .line 2877
    iput-object p0, v1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->parent:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2878
    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->childrenInHitTestOrder:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2881
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    if-nez p2, :cond_2

    const/4 p1, 0x0

    .line 2883
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->customAccessibilityActions:Ljava/util/List;

    return-void

    .line 2885
    :cond_2
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->customAccessibilityActions:Ljava/util/List;

    if-nez v0, :cond_3

    .line 2886
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->customAccessibilityActions:Ljava/util/List;

    goto :goto_2

    .line 2887
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :goto_2
    if-ge p3, p2, :cond_6

    .line 2890
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->accessibilityBridge:Lio/flutter/view/AccessibilityBridge;

    .line 2891
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v0, v1}, Lio/flutter/view/AccessibilityBridge;->access$7500(Lio/flutter/view/AccessibilityBridge;I)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    move-result-object v0

    .line 2892
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$5200(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;)I

    move-result v1

    sget-object v2, Lio/flutter/view/AccessibilityBridge$Action;->TAP:Lio/flutter/view/AccessibilityBridge$Action;

    iget v2, v2, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    if-ne v1, v2, :cond_4

    .line 2893
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->onTapOverride:Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    goto :goto_3

    .line 2894
    :cond_4
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$5200(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;)I

    move-result v1

    sget-object v2, Lio/flutter/view/AccessibilityBridge$Action;->LONG_PRESS:Lio/flutter/view/AccessibilityBridge$Action;

    iget v2, v2, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    if-ne v1, v2, :cond_5

    .line 2895
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->onLongPressOverride:Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    goto :goto_3

    .line 2902
    :cond_5
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->customAccessibilityActions:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2904
    :goto_3
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->customAccessibilityActions:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method
