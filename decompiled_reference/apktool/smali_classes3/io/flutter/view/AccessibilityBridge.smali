.class public Lio/flutter/view/AccessibilityBridge;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "AccessibilityBridge.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;,
        Lio/flutter/view/AccessibilityBridge$SemanticsNode;,
        Lio/flutter/view/AccessibilityBridge$OnAccessibilityChangeListener;,
        Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;,
        Lio/flutter/view/AccessibilityBridge$Flag;,
        Lio/flutter/view/AccessibilityBridge$Action;,
        Lio/flutter/view/AccessibilityBridge$Role;,
        Lio/flutter/view/AccessibilityBridge$TextDirection;
    }
.end annotation


# static fields
.field private static final ACTION_SHOW_ON_SCREEN:I = 0x1020036

.field private static final BOLD_TEXT_WEIGHT_ADJUSTMENT:I = 0x12c

.field private static final DEFAULT_TRANSITION_ANIMATION_SCALE:F = 1.0f

.field private static final DISABLED_TRANSITION_ANIMATION_SCALE:F = 0.0f

.field private static EMPTY_STRING_INDEX:I = 0x0

.field private static FIRST_RESOURCE_ID:I = 0x0

.field private static final FOCUSABLE_FLAGS:I

.field private static final MIN_ENGINE_GENERATED_NODE_ID:I = 0x10000

.field private static final ROOT_NODE_ID:I = 0x0

.field private static final SCROLLABLE_ACTIONS:I

.field private static final SCROLL_EXTENT_FOR_INFINITY:F = 100000.0f

.field private static final SCROLL_POSITION_CAP_FOR_INFINITY:F = 70000.0f

.field private static final TAG:Ljava/lang/String; = "AccessibilityBridge"

.field static systemAction:I


# instance fields
.field private final accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

.field private accessibilityFeatureFlags:I

.field private accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

.field private final accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

.field final accessibilityMessageHandler:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel$AccessibilityMessageHandler;

.field private final accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

.field private final accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

.field private accessibleNavigation:Z

.field private final animationScaleObserver:Landroid/database/ContentObserver;

.field private final contentResolver:Landroid/content/ContentResolver;

.field private final customAccessibilityActions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;",
            ">;"
        }
    .end annotation
.end field

.field private defaultLocale:Ljava/lang/String;

.field private embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

.field private embeddedInputFocusedNodeId:Ljava/lang/Integer;

.field private final flutterNavigationStack:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final flutterSemanticsTree:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/flutter/view/AccessibilityBridge$SemanticsNode;",
            ">;"
        }
    .end annotation
.end field

.field private hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

.field private inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

.field private isReleased:Z

.field private lastInputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

.field private lastLeftFrameInset:Ljava/lang/Integer;

.field private onAccessibilityChangeListener:Lio/flutter/view/AccessibilityBridge$OnAccessibilityChangeListener;

.field private final platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

.field private previousRouteId:I

.field private final rootAccessibilityView:Landroid/view/View;

.field private final touchExplorationStateChangeListener:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 90
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    iget v0, v0, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    or-int/2addr v0, v1

    sput v0, Lio/flutter/view/AccessibilityBridge;->SCROLLABLE_ACTIONS:I

    .line 96
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_CHECKED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v0, v0, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECKED:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SELECTED:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TEXT_FIELD:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_FOCUSED:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_ENABLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_ENABLED:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_IN_MUTUALLY_EXCLUSIVE_GROUP:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_TOGGLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TOGGLED:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_FOCUSABLE:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SLIDER:Lio/flutter/view/AccessibilityBridge$Flag;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    or-int/2addr v0, v1

    sput v0, Lio/flutter/view/AccessibilityBridge;->FOCUSABLE_FLAGS:I

    const v0, 0xff00001

    .line 135
    sput v0, Lio/flutter/view/AccessibilityBridge;->FIRST_RESOURCE_ID:I

    const/4 v0, -0x1

    .line 138
    sput v0, Lio/flutter/view/AccessibilityBridge;->EMPTY_STRING_INDEX:I

    .line 2424
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Action;->DID_GAIN_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    iget v0, v0, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Action;->DID_LOSE_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    and-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Action;->SHOW_ON_SCREEN:Lio/flutter/view/AccessibilityBridge$Action;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$Action;->value:I

    and-int/2addr v0, v1

    sput v0, Lio/flutter/view/AccessibilityBridge;->systemAction:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;)V
    .locals 7

    .line 462
    new-instance v5, Lio/flutter/view/AccessibilityViewEmbedder;

    const/high16 v0, 0x10000

    invoke-direct {v5, p1, v0}, Lio/flutter/view/AccessibilityViewEmbedder;-><init>(Landroid/view/View;I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lio/flutter/view/AccessibilityBridge;-><init>(Landroid/view/View;Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/view/AccessibilityViewEmbedder;Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/view/AccessibilityViewEmbedder;Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;)V
    .locals 5

    .line 478
    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    .line 175
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    .line 202
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->customAccessibilityActions:Ljava/util/Map;

    const/4 v0, 0x0

    .line 228
    iput v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    .line 273
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge;->flutterNavigationStack:Ljava/util/List;

    .line 276
    iput v0, p0, Lio/flutter/view/AccessibilityBridge;->previousRouteId:I

    .line 281
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge;->lastLeftFrameInset:Ljava/lang/Integer;

    .line 294
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibleNavigation:Z

    .line 310
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge;->isReleased:Z

    .line 313
    new-instance v1, Lio/flutter/view/AccessibilityBridge$1;

    invoke-direct {v1, p0}, Lio/flutter/view/AccessibilityBridge$1;-><init>(Lio/flutter/view/AccessibilityBridge;)V

    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityMessageHandler:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel$AccessibilityMessageHandler;

    .line 398
    new-instance v2, Lio/flutter/view/AccessibilityBridge$2;

    invoke-direct {v2, p0}, Lio/flutter/view/AccessibilityBridge$2;-><init>(Lio/flutter/view/AccessibilityBridge;)V

    iput-object v2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 427
    new-instance v3, Lio/flutter/view/AccessibilityBridge$3;

    new-instance v4, Landroid/os/Handler;

    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    invoke-direct {v3, p0, v4}, Lio/flutter/view/AccessibilityBridge$3;-><init>(Lio/flutter/view/AccessibilityBridge;Landroid/os/Handler;)V

    iput-object v3, p0, Lio/flutter/view/AccessibilityBridge;->animationScaleObserver:Landroid/database/ContentObserver;

    .line 479
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    .line 480
    iput-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    .line 481
    iput-object p3, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    .line 482
    iput-object p4, p0, Lio/flutter/view/AccessibilityBridge;->contentResolver:Landroid/content/ContentResolver;

    .line 483
    iput-object p5, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 484
    iput-object p6, p0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 485
    invoke-virtual {p2, v1}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->setAccessibilityMessageHandler(Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel$AccessibilityMessageHandler;)V

    .line 488
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p1

    invoke-interface {v2, p1}, Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;->onAccessibilityStateChanged(Z)V

    .line 489
    invoke-virtual {p3, v2}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 493
    new-instance p1, Lio/flutter/view/AccessibilityBridge$4;

    invoke-direct {p1, p0, p3}, Lio/flutter/view/AccessibilityBridge$4;-><init>(Lio/flutter/view/AccessibilityBridge;Landroid/view/accessibility/AccessibilityManager;)V

    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge;->touchExplorationStateChangeListener:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 512
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p2

    .line 511
    invoke-interface {p1, p2}, Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;->onTouchExplorationStateChanged(Z)V

    .line 513
    invoke-virtual {p3, p1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 516
    iget p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    sget-object p2, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->NO_ANNOUNCE:Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;

    iget p2, p2, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->value:I

    or-int/2addr p1, p2

    iput p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    .line 519
    invoke-virtual {v3, v0}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 520
    const-string p1, "transition_animation_scale"

    invoke-static {p1}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 521
    invoke-virtual {p4, p1, v0, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 526
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1f

    if-lt p1, p2, :cond_0

    .line 527
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->setBoldTextFlag()V

    .line 530
    :cond_0
    invoke-interface {p6, p0}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->attachAccessibilityBridge(Lio/flutter/view/AccessibilityBridge;)V

    return-void
.end method

.method static synthetic access$100(Lio/flutter/view/AccessibilityBridge;)Landroid/view/View;
    .locals 0

    .line 79
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$1072(Lio/flutter/view/AccessibilityBridge;I)I
    .locals 1

    .line 79
    iget v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    and-int/2addr p1, v0

    iput p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    return p1
.end method

.method static synthetic access$1076(Lio/flutter/view/AccessibilityBridge;I)I
    .locals 1

    .line 79
    iget v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    or-int/2addr p1, v0

    iput p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    return p1
.end method

.method static synthetic access$1100(Lio/flutter/view/AccessibilityBridge;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->sendLatestAccessibilityFlagsToFlutter()V

    return-void
.end method

.method static synthetic access$1200(Lio/flutter/view/AccessibilityBridge;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->onTouchExplorationExit()V

    return-void
.end method

.method static synthetic access$200(Lio/flutter/view/AccessibilityBridge;II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 0

    .line 79
    invoke-direct {p0, p1, p2}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lio/flutter/view/AccessibilityBridge;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method static synthetic access$400(Lio/flutter/view/AccessibilityBridge;)Z
    .locals 0

    .line 79
    iget-boolean p0, p0, Lio/flutter/view/AccessibilityBridge;->isReleased:Z

    return p0
.end method

.method static synthetic access$500(Lio/flutter/view/AccessibilityBridge;)Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;
    .locals 0

    .line 79
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    return-object p0
.end method

.method static synthetic access$600(Lio/flutter/view/AccessibilityBridge;Z)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge;->setAccessibleNavigation(Z)V

    return-void
.end method

.method static synthetic access$700(Lio/flutter/view/AccessibilityBridge;)Lio/flutter/view/AccessibilityBridge$OnAccessibilityChangeListener;
    .locals 0

    .line 79
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge;->onAccessibilityChangeListener:Lio/flutter/view/AccessibilityBridge$OnAccessibilityChangeListener;

    return-object p0
.end method

.method static synthetic access$7200(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 79
    invoke-static {p0, p1}, Lio/flutter/view/AccessibilityBridge;->getStringFromBuffer(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$7300(Ljava/nio/ByteBuffer;[F)[F
    .locals 0

    .line 79
    invoke-static {p0, p1}, Lio/flutter/view/AccessibilityBridge;->getMatrix4FromBuffer(Ljava/nio/ByteBuffer;[F)[F

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$7400(Lio/flutter/view/AccessibilityBridge;I)Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge;->getOrCreateSemanticsNode(I)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$7500(Lio/flutter/view/AccessibilityBridge;I)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge;->getOrCreateAccessibilityAction(I)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$7600()I
    .locals 1

    .line 79
    sget v0, Lio/flutter/view/AccessibilityBridge;->SCROLLABLE_ACTIONS:I

    return v0
.end method

.method static synthetic access$7700()I
    .locals 1

    .line 79
    sget v0, Lio/flutter/view/AccessibilityBridge;->FOCUSABLE_FLAGS:I

    return v0
.end method

.method static synthetic access$7800(Lio/flutter/view/AccessibilityBridge;)Ljava/lang/String;
    .locals 0

    .line 79
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge;->defaultLocale:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lio/flutter/view/AccessibilityBridge;)Landroid/view/accessibility/AccessibilityManager;
    .locals 0

    .line 79
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    return-object p0
.end method

.method static synthetic access$900(Lio/flutter/view/AccessibilityBridge;)Landroid/content/ContentResolver;
    .locals 0

    .line 79
    iget-object p0, p0, Lio/flutter/view/AccessibilityBridge;->contentResolver:Landroid/content/ContentResolver;

    return-object p0
.end method

.method private createTextChangedEvent(ILjava/lang/String;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 5

    const/16 v0, 0x10

    .line 2092
    invoke-direct {p0, p1, v0}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    .line 2093
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 2094
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 2097
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2098
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2102
    :cond_1
    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 2106
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 2108
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 2109
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_2
    if-lt v1, v0, :cond_4

    if-lt v2, v0, :cond_4

    .line 2111
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_4
    :goto_3
    sub-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    .line 2117
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setRemovedCount(I)V

    sub-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x1

    .line 2118
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAddedCount(I)V

    return-object p1
.end method

.method private doesLayoutInDisplayCutoutModeRequireLeftInset()Z
    .locals 3

    .line 2237
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2238
    invoke-static {v0}, Lio/flutter/util/ViewUtils;->getActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2239
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 2244
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method private getBoundsInScreen(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 3

    .line 1271
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    const/4 p1, 0x2

    .line 1272
    new-array p1, p1, [I

    .line 1273
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v1, 0x0

    .line 1274
    aget v1, p1, v1

    const/4 v2, 0x1

    aget p1, p1, v2

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Rect;->offset(II)V

    return-object v0
.end method

.method private static getMatrix4FromBuffer(Ljava/nio/ByteBuffer;[F)[F
    .locals 3

    const/16 v0, 0x10

    if-nez p1, :cond_0

    .line 583
    new-array p1, v0, [F

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 586
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v2

    aput v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method private getOrCreateAccessibilityAction(I)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;
    .locals 2

    .line 1736
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->customAccessibilityActions:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    if-nez v0, :cond_0

    .line 1738
    new-instance v0, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    invoke-direct {v0}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;-><init>()V

    .line 1739
    invoke-static {v0, p1}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$5002(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;I)I

    .line 1740
    sget v1, Lio/flutter/view/AccessibilityBridge;->FIRST_RESOURCE_ID:I

    add-int/2addr v1, p1

    invoke-static {v0, v1}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$4202(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;I)I

    .line 1741
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->customAccessibilityActions:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private getOrCreateSemanticsNode(I)Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 2

    .line 1715
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-nez v0, :cond_0

    .line 1717
    new-instance v0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    invoke-direct {v0, p0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;-><init>(Lio/flutter/view/AccessibilityBridge;)V

    .line 1718
    invoke-static {v0, p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$002(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    .line 1719
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private getRootSemanticsNode()Lio/flutter/view/AccessibilityBridge$SemanticsNode;
    .locals 2

    .line 1701
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    return-object v0
.end method

.method private static getStringAttributesFromBuffer(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/List;
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

    .line 535
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 539
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 541
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 542
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    .line 543
    invoke-static {}, Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;->values()[Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;

    move-result-object v5

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6

    aget-object v5, v5, v6

    .line 544
    sget-object v6, Lio/flutter/view/AccessibilityBridge$5;->$SwitchMap$io$flutter$view$AccessibilityStringBuilder$StringAttributeType:[I

    invoke-virtual {v5}, Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x1

    if-eq v6, v7, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    goto :goto_1

    .line 558
    :cond_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6

    .line 559
    aget-object v6, p1, v6

    .line 560
    new-instance v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;

    invoke-direct {v7}, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;-><init>()V

    .line 561
    iput v3, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->start:I

    .line 562
    iput v4, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->end:I

    .line 563
    iput-object v5, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->type:Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;

    .line 564
    const-string v3, "UTF-8"

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v7, Lio/flutter/view/AccessibilityStringBuilder$LocaleStringAttribute;->locale:Ljava/lang/String;

    .line 565
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 548
    :cond_2
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 549
    new-instance v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;

    invoke-direct {v6}, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;-><init>()V

    .line 550
    iput v3, v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;->start:I

    .line 551
    iput v4, v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;->end:I

    .line 552
    iput-object v5, v6, Lio/flutter/view/AccessibilityStringBuilder$SpellOutStringAttribute;->type:Lio/flutter/view/AccessibilityStringBuilder$StringAttributeType;

    .line 553
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method private static getStringFromBuffer(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 576
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p0

    .line 578
    sget v0, Lio/flutter/view/AccessibilityBridge;->EMPTY_STRING_INDEX:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    aget-object p0, p1, p0

    return-object p0
.end method

.method private handleTouchExploration(FFZ)V
    .locals 3

    .line 1832
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1837
    :cond_0
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->getRootSemanticsNode()Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p2, v1, p1

    const/4 p1, 0x0

    const/4 p2, 0x2

    aput p1, v1, p2

    const/high16 p1, 0x3f800000    # 1.0f

    const/4 p2, 0x3

    aput p1, v1, p2

    invoke-static {v0, v1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;[FZ)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object p1

    .line 1838
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eq p1, p2, :cond_3

    if-eqz p1, :cond_1

    .line 1842
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    const/16 p3, 0x80

    .line 1841
    invoke-virtual {p0, p2, p3}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    .line 1844
    :cond_1
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz p2, :cond_2

    .line 1845
    invoke-static {p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    const/16 p3, 0x100

    invoke-virtual {p0, p2, p3}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    .line 1847
    :cond_2
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    :cond_3
    :goto_0
    return-void
.end method

.method private isImportant(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 3

    .line 1252
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->SCOPES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 1256
    :cond_0
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 1261
    :cond_1
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p1

    sget v0, Lio/flutter/view/AccessibilityBridge;->systemAction:I

    not-int v0, v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method static synthetic lambda$shouldSetCollectionInfo$0(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic lambda$shouldSetCollectionInfo$1(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 1

    .line 647
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_IMPLICIT_SCROLLING:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {p0, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result p0

    return p0
.end method

.method private obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 2218
    invoke-virtual {p0, p2}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    .line 2219
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 2220
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;I)V

    return-object p2
.end method

.method private onTouchExplorationExit()V
    .locals 2

    .line 1816
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v0, :cond_0

    .line 1817
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    const/16 v1, 0x100

    invoke-virtual {p0, v0, v1}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    const/4 v0, 0x0

    .line 1818
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    :cond_0
    return-void
.end method

.method private onWindowNameChange(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)V
    .locals 3

    .line 2168
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$7100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2178
    const-string v0, " "

    .line 2180
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    .line 2181
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->setAccessibilityPaneTitle(Ljava/lang/String;)V

    return-void

    .line 2184
    :cond_1
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p1

    const/16 v1, 0x20

    invoke-direct {p0, p1, v1}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    .line 2185
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2186
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method private performCursorMoveAction(Lio/flutter/view/AccessibilityBridge$SemanticsNode;ILandroid/os/Bundle;Z)Z
    .locals 4

    .line 1510
    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 1511
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 1512
    const-string v1, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 1513
    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    .line 1516
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    .line 1517
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v2

    .line 1518
    invoke-direct {p0, p1, v0, p4, p3}, Lio/flutter/view/AccessibilityBridge;->predictCursorMovement(Lio/flutter/view/AccessibilityBridge$SemanticsNode;IZZ)V

    .line 1520
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-ne v1, v3, :cond_0

    .line 1521
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    if-eq v2, v1, :cond_2

    .line 1522
    :cond_0
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    .line 1525
    :goto_0
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v2

    const/16 v3, 0x2000

    .line 1524
    invoke-direct {p0, v2, v3}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v2

    .line 1526
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1527
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 1528
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    .line 1529
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    .line 1530
    invoke-direct {p0, v2}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_2
    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 p1, 0x4

    if-eq v0, p1, :cond_3

    const/16 p1, 0x8

    if-eq v0, p1, :cond_3

    const/16 p1, 0x10

    if-eq v0, p1, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    if-eqz p4, :cond_5

    .line 1549
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1550
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p4, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1551
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    .line 1550
    invoke-virtual {p1, p2, p4, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;Ljava/lang/Object;)V

    return v1

    :cond_5
    if-nez p4, :cond_8

    .line 1554
    sget-object p4, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p1, p4}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1555
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p4, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1556
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    .line 1555
    invoke-virtual {p1, p2, p4, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;Ljava/lang/Object;)V

    return v1

    :cond_6
    if-eqz p4, :cond_7

    .line 1536
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1537
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p4, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1538
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    .line 1537
    invoke-virtual {p1, p2, p4, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;Ljava/lang/Object;)V

    return v1

    :cond_7
    if-nez p4, :cond_8

    .line 1541
    sget-object p4, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p1, p4}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1542
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p4, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1543
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    .line 1542
    invoke-virtual {p1, p2, p4, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;Ljava/lang/Object;)V

    return v1

    :cond_8
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method private performSetText(Lio/flutter/view/AccessibilityBridge$SemanticsNode;ILandroid/os/Bundle;)Z
    .locals 2

    if-eqz p3, :cond_0

    .line 1644
    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1645
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 1647
    :cond_0
    const-string p3, ""

    :goto_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object v1, Lio/flutter/view/AccessibilityBridge$Action;->SET_TEXT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {v0, p2, v1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;Ljava/lang/Object;)V

    .line 1650
    invoke-static {p1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2502(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/lang/String;)Ljava/lang/String;

    const/4 p2, 0x0

    .line 1651
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4602(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/List;)Ljava/util/List;

    const/4 p1, 0x1

    return p1
.end method

.method private predictCursorMovement(Lio/flutter/view/AccessibilityBridge$SemanticsNode;IZZ)V
    .locals 3

    .line 1570
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    if-ltz v0, :cond_d

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    if-gez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    if-eq p2, v0, :cond_a

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p2, v1, :cond_7

    const/4 v1, 0x4

    if-eq p2, v1, :cond_3

    const/16 v0, 0x8

    if-eq p2, v0, :cond_1

    const/16 v0, 0x10

    if-eq p2, v0, :cond_1

    goto/16 :goto_0

    :cond_1
    if-eqz p3, :cond_2

    .line 1626
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto/16 :goto_0

    .line 1628
    :cond_2
    invoke-static {p1, v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto/16 :goto_0

    :cond_3
    if-eqz p3, :cond_5

    .line 1603
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p2, v1, :cond_5

    .line 1605
    const-string p2, "(?!^)(\\n)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 1606
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    .line 1607
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_4

    .line 1608
    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2212(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto/16 :goto_0

    .line 1610
    :cond_4
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto/16 :goto_0

    :cond_5
    if-nez p3, :cond_c

    .line 1612
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    if-lez p2, :cond_c

    .line 1614
    const-string p2, "(?s:.*)(\\n)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 1615
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    invoke-virtual {p3, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    .line 1616
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_6

    .line 1617
    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto/16 :goto_0

    .line 1619
    :cond_6
    invoke-static {p1, v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto/16 :goto_0

    :cond_7
    if-eqz p3, :cond_9

    .line 1583
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p2, v1, :cond_9

    .line 1584
    const-string p2, "\\p{L}(\\b)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 1585
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    .line 1587
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    .line 1588
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_8

    .line 1589
    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2212(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto :goto_0

    .line 1591
    :cond_8
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto :goto_0

    :cond_9
    if-nez p3, :cond_c

    .line 1593
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    if-lez p2, :cond_c

    .line 1595
    const-string p2, "(?s:.*)(\\b)\\p{L}"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    .line 1596
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    invoke-virtual {p3, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    .line 1597
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_c

    .line 1598
    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto :goto_0

    :cond_a
    if-eqz p3, :cond_b

    .line 1576
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p2, v1, :cond_b

    .line 1577
    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2212(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    goto :goto_0

    :cond_b
    if-nez p3, :cond_c

    .line 1578
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    if-lez p2, :cond_c

    .line 1579
    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2220(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    :cond_c
    :goto_0
    if-nez p4, :cond_d

    .line 1633
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2102(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    :cond_d
    :goto_1
    return-void
.end method

.method private sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 2146
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2153
    :cond_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-interface {v0, v1, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method private sendLatestAccessibilityFlagsToFlutter()V
    .locals 2

    .line 629
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    iget v1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->setAccessibilityFeatures(I)V

    return-void
.end method

.method private sendWindowContentChangeEvent(II)V
    .locals 1

    const/16 v0, 0x800

    .line 2204
    invoke-direct {p0, p1, v0}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    .line 2205
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 2206
    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method private setAccessibilityPaneTitle(Ljava/lang/String;)V
    .locals 1

    .line 2192
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAccessibilityPaneTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setAccessibleNavigation(Z)V
    .locals 1

    .line 297
    iget-boolean v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibleNavigation:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 300
    :cond_0
    iput-boolean p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibleNavigation:Z

    .line 304
    iget v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    if-eqz p1, :cond_1

    .line 302
    sget-object p1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->ACCESSIBLE_NAVIGATION:Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;

    iget p1, p1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->value:I

    or-int/2addr p1, v0

    iput p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    goto :goto_0

    .line 304
    :cond_1
    sget-object p1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->ACCESSIBLE_NAVIGATION:Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;

    iget p1, p1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->value:I

    not-int p1, p1

    and-int/2addr p1, v0

    iput p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    .line 306
    :goto_0
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->sendLatestAccessibilityFlagsToFlutter()V

    return-void
.end method

.method private setBoldTextFlag()V
    .locals 2

    .line 658
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 661
    :cond_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    .line 662
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontWeightAdjustment:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_1

    const/16 v1, 0x12c

    if-lt v0, v1, :cond_1

    .line 668
    iget v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    sget-object v1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->BOLD_TEXT:Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->value:I

    or-int/2addr v0, v1

    iput v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    goto :goto_0

    .line 670
    :cond_1
    iget v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    sget-object v1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->BOLD_TEXT:Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;

    iget v1, v1, Lio/flutter/view/AccessibilityBridge$AccessibilityFeature;->value:I

    not-int v1, v1

    and-int/2addr v0, v1

    iput v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFeatureFlags:I

    .line 672
    :goto_0
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->sendLatestAccessibilityFlagsToFlutter()V

    :cond_2
    :goto_1
    return-void
.end method

.method private shouldSetCollectionInfo(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 3

    .line 643
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    new-instance v2, Lio/flutter/view/AccessibilityBridge$$ExternalSyntheticLambda0;

    invoke-direct {v2, p1}, Lio/flutter/view/AccessibilityBridge$$ExternalSyntheticLambda0;-><init>(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)V

    .line 644
    invoke-static {v0, v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/function/Predicate;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    new-instance v0, Lio/flutter/view/AccessibilityBridge$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lio/flutter/view/AccessibilityBridge$$ExternalSyntheticLambda1;-><init>()V

    .line 646
    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/function/Predicate;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private shouldSetCollectionItemInfo(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z
    .locals 1

    .line 651
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 652
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->shouldSetCollectionInfo(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 653
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object p1

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_IMPLICIT_SCROLLING:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private willRemoveSemanticsNode(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)V
    .locals 6

    const/4 v0, 0x0

    .line 2269
    invoke-static {p1, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1502(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2271
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    const/high16 v2, 0x10000

    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v4, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 2273
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v1}, Lio/flutter/view/AccessibilityViewEmbedder;->platformViewOfNode(I)Landroid/view/View;

    move-result-object v1

    iget-object v4, p0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 2275
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v5

    .line 2274
    invoke-interface {v4, v5}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->getPlatformViewById(I)Landroid/view/View;

    move-result-object v4

    if-ne v1, v4, :cond_0

    .line 2278
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    .line 2279
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 2278
    invoke-virtual {p0, v1, v2}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    .line 2281
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    .line 2284
    :cond_0
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    if-eq v1, v3, :cond_1

    .line 2285
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 2287
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    .line 2286
    invoke-interface {v1, v3}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->getPlatformViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v3, 0x4

    .line 2289
    invoke-virtual {v1, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 2294
    :cond_1
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-ne v1, p1, :cond_2

    .line 2296
    invoke-static {v1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    .line 2295
    invoke-virtual {p0, v1, v2}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    .line 2298
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2301
    :cond_2
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-ne v1, p1, :cond_3

    .line 2302
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2305
    :cond_3
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-ne v1, p1, :cond_4

    .line 2306
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    :cond_4
    return-void
.end method


# virtual methods
.method public createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x1

    .line 713
    invoke-direct {v0, v2}, Lio/flutter/view/AccessibilityBridge;->setAccessibleNavigation(Z)V

    const/high16 v3, 0x10000

    if-lt v1, v3, :cond_0

    .line 717
    iget-object v2, v0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {v2, v1}, Lio/flutter/view/AccessibilityViewEmbedder;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    return-object v1

    :cond_0
    const/4 v4, -0x1

    const/4 v5, 0x0

    if-ne v1, v4, :cond_2

    .line 721
    iget-object v1, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v0, v1}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityNodeInfo(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    .line 722
    iget-object v2, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 725
    iget-object v2, v0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 726
    iget-object v2, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v1, v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 728
    :cond_1
    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    return-object v1

    .line 732
    :cond_2
    iget-object v6, v0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    const/4 v7, 0x0

    if-nez v6, :cond_3

    return-object v7

    .line 745
    :cond_3
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v8

    if-eq v8, v4, :cond_5

    .line 746
    iget-object v8, v0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    invoke-interface {v8, v9}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->usesVirtualDisplay(I)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 747
    iget-object v1, v0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 748
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v2

    invoke-interface {v1, v2}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->getPlatformViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_4

    return-object v7

    .line 752
    :cond_4
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Landroid/graphics/Rect;

    move-result-object v2

    .line 753
    iget-object v3, v0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v4

    invoke-virtual {v3, v1, v4, v2}, Lio/flutter/view/AccessibilityViewEmbedder;->getRootNode(Landroid/view/View;ILandroid/graphics/Rect;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    return-object v1

    .line 757
    :cond_5
    iget-object v7, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    .line 758
    invoke-virtual {v0, v7, v1}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityNodeInfo(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v7

    .line 762
    invoke-direct {v0, v6}, Lio/flutter/view/AccessibilityBridge;->isImportant(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v8

    invoke-virtual {v7, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 765
    const-string v8, ""

    invoke-virtual {v7, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 766
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    .line 767
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 769
    :cond_6
    iget-object v9, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 770
    const-string v9, "android.view.View"

    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 771
    iget-object v9, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {v7, v9, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 772
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v9

    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 773
    iget-object v9, v0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v9, :cond_8

    .line 774
    invoke-static {v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    if-ne v9, v1, :cond_7

    move v9, v2

    goto :goto_0

    :cond_7
    move v9, v5

    :goto_0
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 777
    :cond_8
    iget-object v9, v0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v9, :cond_a

    .line 778
    invoke-static {v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    if-ne v9, v1, :cond_9

    move v9, v2

    goto :goto_1

    :cond_9
    move v9, v5

    :goto_1
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 781
    :cond_a
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TEXT_FIELD:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v9

    if-eqz v9, :cond_13

    .line 782
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Flag;->IS_OBSCURED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v9

    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 783
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Flag;->IS_READ_ONLY:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v9

    if-nez v9, :cond_b

    .line 784
    const-string v9, "android.widget.EditText"

    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 786
    :cond_b
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Flag;->IS_READ_ONLY:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v9

    xor-int/2addr v9, v2

    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 787
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    if-eq v9, v4, :cond_c

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    if-eq v9, v4, :cond_c

    .line 788
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v10

    invoke-virtual {v7, v9, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 793
    :cond_c
    iget-object v9, v0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v9, :cond_d

    .line 794
    invoke-static {v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    if-ne v9, v1, :cond_d

    .line 795
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 800
    :cond_d
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v9

    const/16 v10, 0x100

    if-eqz v9, :cond_e

    .line 801
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    move v9, v2

    goto :goto_2

    :cond_e
    move v9, v5

    .line 804
    :goto_2
    sget-object v11, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_CHARACTER:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v11}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v11

    const/16 v12, 0x200

    if-eqz v11, :cond_f

    .line 805
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    move v9, v2

    .line 808
    :cond_f
    sget-object v11, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_FORWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v11}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v11

    if-eqz v11, :cond_10

    .line 809
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    or-int/lit8 v9, v9, 0x2

    .line 812
    :cond_10
    sget-object v10, Lio/flutter/view/AccessibilityBridge$Action;->MOVE_CURSOR_BACKWARD_BY_WORD:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v10}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v10

    if-eqz v10, :cond_11

    .line 813
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    or-int/lit8 v9, v9, 0x2

    .line 816
    :cond_11
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 817
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    if-ltz v9, :cond_13

    .line 820
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_12

    move v9, v5

    goto :goto_3

    :cond_12
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    .line 821
    :goto_3
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    .line 823
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v10

    sub-int/2addr v9, v10

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v10

    add-int/2addr v9, v10

    .line 822
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 829
    :cond_13
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Action;->SET_SELECTION:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v9

    if-eqz v9, :cond_14

    const/high16 v9, 0x20000

    .line 830
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 832
    :cond_14
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Action;->COPY:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v9

    if-eqz v9, :cond_15

    const/16 v9, 0x4000

    .line 833
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 835
    :cond_15
    sget-object v9, Lio/flutter/view/AccessibilityBridge$Action;->CUT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v9

    if-eqz v9, :cond_16

    .line 836
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 838
    :cond_16
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->PASTE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_17

    const v3, 0x8000

    .line 839
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 842
    :cond_17
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SET_TEXT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_18

    const/high16 v3, 0x200000

    .line 843
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 846
    :cond_18
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 847
    const-string v3, "android.widget.Button"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 849
    :cond_19
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_IMAGE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 850
    const-string v3, "android.widget.ImageView"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 854
    :cond_1a
    invoke-static {}, Lio/flutter/view/AccessibilityBridge$Role;->values()[Lio/flutter/view/AccessibilityBridge$Role;

    move-result-object v3

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    aget-object v3, v3, v9

    .line 855
    invoke-virtual {v3}, Lio/flutter/view/AccessibilityBridge$Role;->ordinal()I

    move-result v3

    const/16 v9, 0x17

    const/4 v10, 0x3

    const/16 v11, 0x24

    if-eq v3, v9, :cond_1b

    goto :goto_6

    .line 857
    :cond_1b
    const-string v3, "android.widget.ProgressBar"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 858
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1f

    .line 861
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1c

    .line 863
    :try_start_0
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    :cond_1c
    const/high16 v3, -0x800000    # Float.NEGATIVE_INFINITY

    .line 868
    :goto_4
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_1d

    .line 870
    :try_start_1
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v9
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    :cond_1d
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 876
    :goto_5
    :try_start_2
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v12

    .line 878
    invoke-static {v2, v3, v9, v12}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v3

    .line 877
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    .line 881
    :catch_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v9, 0x0

    if-lt v3, v11, :cond_1e

    .line 883
    invoke-static {v10, v9, v9, v9}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v3

    .line 882
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    goto :goto_6

    .line 888
    :cond_1e
    invoke-static {v2, v9, v9, v9}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v3

    .line 887
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 897
    :cond_1f
    :goto_6
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->DISMISS:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 898
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    const/high16 v3, 0x100000

    .line 899
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 902
    :cond_20
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v3

    .line 911
    iget-object v9, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    if-eqz v3, :cond_21

    .line 906
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v3

    invoke-static {v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    invoke-virtual {v7, v9, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    goto :goto_7

    .line 911
    :cond_21
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 914
    :goto_7
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-eq v3, v4, :cond_22

    .line 916
    iget-object v3, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v9

    invoke-virtual {v7, v3, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;I)V

    .line 919
    :cond_22
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Landroid/graphics/Rect;

    move-result-object v3

    .line 920
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v9

    if-eqz v9, :cond_23

    .line 921
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v9

    invoke-static {v9}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Landroid/graphics/Rect;

    move-result-object v9

    .line 922
    new-instance v12, Landroid/graphics/Rect;

    invoke-direct {v12, v3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 923
    iget v13, v9, Landroid/graphics/Rect;->left:I

    neg-int v13, v13

    iget v9, v9, Landroid/graphics/Rect;->top:I

    neg-int v9, v9

    invoke-virtual {v12, v13, v9}, Landroid/graphics/Rect;->offset(II)V

    .line 924
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    goto :goto_8

    .line 926
    :cond_23
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 928
    :goto_8
    invoke-direct {v0, v3}, Lio/flutter/view/AccessibilityBridge;->getBoundsInScreen(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v3

    .line 929
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 930
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 931
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_ENABLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 932
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_25

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_ENABLED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_24

    goto :goto_9

    :cond_24
    move v3, v5

    goto :goto_a

    :cond_25
    :goto_9
    move v3, v2

    .line 931
    :goto_a
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 934
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->TAP:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    const/16 v9, 0x10

    if-eqz v3, :cond_27

    .line 935
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    move-result-object v3

    if-eqz v3, :cond_26

    .line 936
    new-instance v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 938
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    move-result-object v12

    invoke-static {v12}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$3300(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v3, v9, v12}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 936
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 939
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    goto :goto_b

    .line 941
    :cond_26
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 942
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    goto :goto_b

    .line 949
    :cond_27
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SLIDER:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_28

    .line 950
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 951
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 954
    :cond_28
    :goto_b
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->LONG_PRESS:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 955
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    move-result-object v3

    const/16 v9, 0x20

    if-eqz v3, :cond_29

    .line 956
    new-instance v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 958
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    move-result-object v12

    invoke-static {v12}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$3300(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v3, v9, v12}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 956
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 959
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    goto :goto_c

    .line 961
    :cond_29
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 962
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 965
    :cond_2a
    :goto_c
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-nez v3, :cond_2b

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    .line 966
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-nez v3, :cond_2b

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 967
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-nez v3, :cond_2b

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    .line 968
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_2e

    .line 972
    :cond_2b
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 973
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_IMPLICIT_SCROLLING:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_2e

    .line 974
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-nez v3, :cond_2d

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 975
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_2c

    goto :goto_d

    .line 978
    :cond_2c
    const-string v3, "android.widget.ScrollView"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    goto :goto_e

    .line 976
    :cond_2d
    :goto_d
    const-string v3, "android.widget.HorizontalScrollView"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 992
    :cond_2e
    :goto_e
    invoke-direct {v0, v6}, Lio/flutter/view/AccessibilityBridge;->shouldSetCollectionInfo(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v3

    const/16 v9, 0x21

    if-eqz v3, :cond_33

    .line 993
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-nez v3, :cond_31

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 994
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_2f

    goto :goto_f

    .line 1016
    :cond_2f
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v3, v9, :cond_30

    .line 1019
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    .line 1018
    invoke-static {v3, v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v3

    .line 1017
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    goto :goto_10

    .line 1024
    :cond_30
    new-instance v3, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 1026
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v12

    invoke-direct {v3, v12, v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;-><init>(IIZ)V

    .line 1024
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    goto :goto_10

    .line 997
    :cond_31
    :goto_f
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v3, v9, :cond_32

    .line 1001
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    .line 999
    invoke-static {v2, v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v3

    .line 998
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    goto :goto_10

    .line 1006
    :cond_32
    new-instance v3, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 1009
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v12

    invoke-direct {v3, v2, v12, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;-><init>(IIZ)V

    .line 1006
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 1034
    :cond_33
    :goto_10
    invoke-direct {v0, v6}, Lio/flutter/view/AccessibilityBridge;->shouldSetCollectionItemInfo(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v3

    if-eqz v3, :cond_38

    .line 1035
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v3

    .line 1036
    invoke-static {v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;

    move-result-object v12

    .line 1037
    sget-object v13, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1038
    invoke-static {v3, v13}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v13

    if-nez v13, :cond_34

    sget-object v13, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v3, v13}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-nez v3, :cond_34

    move v3, v2

    goto :goto_11

    :cond_34
    move v3, v5

    .line 1039
    :goto_11
    invoke-interface {v12, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v14

    if-eqz v3, :cond_36

    .line 1043
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v3, v9, :cond_35

    .line 1044
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HEADER:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 1050
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    .line 1045
    invoke-static {v14, v2, v5, v2, v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object v3

    .line 1044
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    goto :goto_12

    .line 1053
    :cond_35
    new-instance v13, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HEADER:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 1059
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v18

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x1

    invoke-direct/range {v13 .. v18}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;-><init>(IIIIZ)V

    .line 1053
    invoke-virtual {v7, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    goto :goto_12

    .line 1065
    :cond_36
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v3, v9, :cond_37

    .line 1066
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HEADER:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 1072
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    .line 1067
    invoke-static {v5, v2, v14, v2, v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object v3

    .line 1066
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    goto :goto_12

    .line 1075
    :cond_37
    new-instance v13, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HEADER:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 1081
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v18

    move/from16 v16, v14

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v17, 0x1

    invoke-direct/range {v13 .. v18}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;-><init>(IIIIZ)V

    .line 1075
    invoke-virtual {v7, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 1089
    :cond_38
    :goto_12
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    const/16 v9, 0x1000

    if-nez v3, :cond_39

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_3a

    .line 1090
    :cond_39
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1092
    :cond_3a
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    const/16 v12, 0x2000

    if-nez v3, :cond_3b

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1093
    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_3c

    .line 1094
    :cond_3b
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1096
    :cond_3c
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-nez v3, :cond_3d

    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_3f

    .line 1099
    :cond_3d
    const-string v3, "android.widget.SeekBar"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1100
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_3e

    .line 1101
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1103
    :cond_3e
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_3f

    .line 1104
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1107
    :cond_3f
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_LIVE_REGION:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_40

    .line 1108
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 1113
    :cond_40
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TEXT_FIELD:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    const/16 v9, 0x1c

    if-eqz v3, :cond_41

    .line 1114
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 1115
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v9, :cond_44

    .line 1116
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHintText(Ljava/lang/CharSequence;)V

    goto :goto_13

    .line 1118
    :cond_41
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->SCOPES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-nez v3, :cond_44

    .line 1119
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 1120
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v12, v9, :cond_43

    .line 1121
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_43

    if-eqz v3, :cond_42

    move-object v8, v3

    .line 1125
    :cond_42
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v8, "\n"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_43
    if-eqz v3, :cond_44

    .line 1129
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1133
    :cond_44
    :goto_13
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v9, :cond_45

    .line 1134
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_45

    .line 1135
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTooltipText(Ljava/lang/CharSequence;)V

    .line 1142
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/CharSequence;

    move-result-object v3

    if-nez v3, :cond_45

    .line 1143
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1148
    :cond_45
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_CHECKED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    .line 1149
    sget-object v8, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_TOGGLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v8}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v8

    if-nez v3, :cond_47

    if-eqz v8, :cond_46

    goto :goto_14

    :cond_46
    move v12, v5

    goto :goto_15

    :cond_47
    :goto_14
    move v12, v2

    .line 1153
    :goto_15
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    if-eqz v3, :cond_4c

    .line 1155
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_IN_MUTUALLY_EXCLUSIVE_GROUP:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_48

    .line 1156
    const-string v3, "android.widget.RadioButton"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    goto :goto_16

    .line 1158
    :cond_48
    const-string v3, "android.widget.CheckBox"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1161
    :goto_16
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v11, :cond_4b

    .line 1163
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECK_STATE_MIXED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_49

    const/4 v3, 0x2

    goto :goto_17

    .line 1165
    :cond_49
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECKED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_4a

    move v3, v2

    goto :goto_17

    :cond_4a
    move v3, v5

    .line 1162
    :goto_17
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(I)V

    goto :goto_18

    .line 1169
    :cond_4b
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECKED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    goto :goto_18

    :cond_4c
    if-eqz v8, :cond_4e

    .line 1172
    const-string v3, "android.widget.Switch"

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1174
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v11, :cond_4d

    .line 1176
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TOGGLED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    .line 1175
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(I)V

    goto :goto_18

    .line 1180
    :cond_4d
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TOGGLED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1183
    :cond_4e
    :goto_18
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SELECTED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 1184
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v11, :cond_51

    .line 1185
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_EXPANDED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_51

    .line 1186
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_EXPANDED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_4f

    goto :goto_19

    :cond_4f
    move v10, v2

    .line 1187
    :goto_19
    invoke-virtual {v7, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setExpandedState(I)V

    .line 1191
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->EXPAND:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_50

    const/high16 v3, 0x40000

    .line 1192
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1194
    :cond_50
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Action;->COLLAPSE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v6, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v3

    if-eqz v3, :cond_51

    const/high16 v3, 0x80000

    .line 1195
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1201
    :cond_51
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v9, :cond_53

    .line 1202
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-lez v3, :cond_52

    goto :goto_1a

    :cond_52
    move v2, v5

    :goto_1a
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    .line 1206
    :cond_53
    iget-object v2, v0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v2, :cond_54

    .line 1207
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v2

    if-ne v2, v1, :cond_54

    const/16 v1, 0x80

    .line 1208
    invoke-virtual {v7, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    goto :goto_1b

    :cond_54
    const/16 v1, 0x40

    .line 1210
    invoke-virtual {v7, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1214
    :goto_1b
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_55

    .line 1215
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_55

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    .line 1216
    new-instance v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 1217
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$4200(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;)I

    move-result v8

    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$4300(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v8, v2}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 1216
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    goto :goto_1c

    .line 1221
    :cond_55
    invoke-static {v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$3500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_58

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1222
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HIDDEN:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v2, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_56

    goto :goto_1d

    .line 1225
    :cond_56
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-eq v3, v4, :cond_57

    .line 1226
    iget-object v3, v0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 1227
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v6

    invoke-interface {v3, v6}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->getPlatformViewById(I)Landroid/view/View;

    move-result-object v3

    .line 1236
    iget-object v6, v0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v8

    invoke-interface {v6, v8}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->usesVirtualDisplay(I)Z

    move-result v6

    if-nez v6, :cond_57

    if-eqz v3, :cond_57

    .line 1240
    invoke-virtual {v3, v5}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1241
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    goto :goto_1d

    .line 1246
    :cond_57
    iget-object v3, v0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v2

    invoke-virtual {v7, v3, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    goto :goto_1d

    :cond_58
    return-object v7
.end method

.method public externalViewRequestSendAccessibilityEvent(Landroid/view/View;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 3232
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 3236
    :cond_0
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {p2, p1, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->getRecordFlutterId(Landroid/view/View;Landroid/view/accessibility/AccessibilityRecord;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    .line 3240
    :cond_1
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p2

    const/16 p3, 0x8

    const/4 v0, 0x0

    if-eq p2, p3, :cond_5

    const/16 p3, 0x80

    if-eq p2, p3, :cond_4

    const p3, 0x8000

    if-eq p2, p3, :cond_3

    const/high16 p1, 0x10000

    if-eq p2, p1, :cond_2

    goto :goto_0

    .line 3249
    :cond_2
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->embeddedInputFocusedNodeId:Ljava/lang/Integer;

    .line 3250
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    goto :goto_0

    .line 3245
    :cond_3
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    .line 3246
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    goto :goto_0

    .line 3242
    :cond_4
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    goto :goto_0

    .line 3253
    :cond_5
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge;->embeddedInputFocusedNodeId:Ljava/lang/Integer;

    .line 3254
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    goto :goto_0

    .line 1675
    :cond_0
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz p1, :cond_1

    .line 1676
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p1

    invoke-virtual {p0, p1}, Lio/flutter/view/AccessibilityBridge;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1

    .line 1678
    :cond_1
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->embeddedInputFocusedNodeId:Ljava/lang/Integer;

    if-eqz p1, :cond_2

    .line 1679
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/flutter/view/AccessibilityBridge;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1

    .line 1685
    :cond_2
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz p1, :cond_3

    .line 1686
    invoke-static {p1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p1

    invoke-virtual {p0, p1}, Lio/flutter/view/AccessibilityBridge;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1

    .line 1688
    :cond_3
    iget-object p1, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    .line 1689
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/flutter/view/AccessibilityBridge;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getAccessibleNavigation()Z
    .locals 1

    .line 291
    iget-boolean v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibleNavigation:Z

    return v0
.end method

.method public getHoveredObjectId()I
    .locals 1

    .line 265
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    return v0
.end method

.method public isAccessibilityEnabled()Z
    .locals 1

    .line 611
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public isTouchExplorationEnabled()Z
    .locals 1

    .line 616
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    return v0
.end method

.method public obtainAccessibilityEvent(I)Landroid/view/accessibility/AccessibilityEvent;
    .locals 0

    .line 2226
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    return-object p1
.end method

.method public obtainAccessibilityNodeInfo(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 0

    .line 677
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method

.method public obtainAccessibilityNodeInfo(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 0

    .line 682
    invoke-static {p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method

.method public onAccessibilityHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1757
    invoke-virtual {p0, p1, v0}, Lio/flutter/view/AccessibilityBridge;->onAccessibilityHoverEvent(Landroid/view/MotionEvent;Z)Z

    move-result p1

    return p1
.end method

.method public onAccessibilityHoverEvent(Landroid/view/MotionEvent;Z)Z
    .locals 6

    .line 1776
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1779
    :cond_0
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 1784
    :cond_1
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->getRootSemanticsNode()Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v0

    .line 1785
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    const/4 v4, 0x4

    new-array v4, v4, [F

    aput v2, v4, v1

    const/4 v2, 0x1

    aput v3, v4, v2

    const/4 v3, 0x0

    const/4 v5, 0x2

    aput v3, v4, v5

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v5, 0x3

    aput v3, v4, v5

    invoke-static {v0, v4, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;[FZ)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1788
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_3

    if-eqz p2, :cond_2

    return v1

    .line 1792
    :cond_2
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 1793
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    .line 1792
    invoke-virtual {p2, v0, p1}, Lio/flutter/view/AccessibilityViewEmbedder;->onAccessibilityHoverEvent(ILandroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 1796
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v3, 0x9

    if-eq v0, v3, :cond_6

    .line 1797
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v3, 0x7

    if-ne v0, v3, :cond_4

    goto :goto_0

    .line 1799
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/16 v0, 0xa

    if-ne p2, v0, :cond_5

    .line 1800
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->onTouchExplorationExit()V

    goto :goto_1

    .line 1802
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "unexpected accessibility hover event: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "flutter"

    invoke-static {p2, p1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 1798
    :cond_6
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v0, p1, p2}, Lio/flutter/view/AccessibilityBridge;->handleTouchExploration(FFZ)V

    :goto_1
    return v2
.end method

.method public performAction(IILandroid/os/Bundle;)Z
    .locals 7

    const/4 v0, 0x0

    const/high16 v1, 0x10000

    if-lt p1, v1, :cond_1

    .line 1297
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityViewEmbedder:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 1298
    invoke-virtual {v1, p1, p2, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->performAction(IILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p3, 0x80

    if-ne p2, p3, :cond_0

    .line 1301
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    :cond_0
    return p1

    .line 1305
    :cond_1
    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    return v3

    :cond_2
    const/4 v4, 0x4

    const/4 v5, 0x1

    sparse-switch p2, :sswitch_data_0

    .line 1490
    sget p3, Lio/flutter/view/AccessibilityBridge;->FIRST_RESOURCE_ID:I

    sub-int/2addr p2, p3

    .line 1491
    iget-object p3, p0, Lio/flutter/view/AccessibilityBridge;->customAccessibilityActions:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    if-eqz p2, :cond_f

    .line 1493
    iget-object p3, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Action;->CUSTOM_ACTION:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1494
    invoke-static {p2}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$5000(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 1493
    invoke-virtual {p3, p1, v0, p2}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;Ljava/lang/Object;)V

    return v5

    .line 1421
    :sswitch_0
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->SHOW_ON_SCREEN:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1476
    :sswitch_1
    invoke-direct {p0, v2, p1, p3}, Lio/flutter/view/AccessibilityBridge;->performSetText(Lio/flutter/view/AccessibilityBridge$SemanticsNode;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    .line 1471
    :sswitch_2
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->DISMISS:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1485
    :sswitch_3
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->COLLAPSE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1480
    :sswitch_4
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->EXPAND:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1426
    :sswitch_5
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 1427
    const-string v0, "extent"

    const-string v1, "base"

    if-eqz p3, :cond_3

    .line 1429
    const-string v3, "ACTION_ARGUMENT_SELECTION_START_INT"

    invoke-virtual {p3, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1431
    const-string v4, "ACTION_ARGUMENT_SELECTION_END_INT"

    invoke-virtual {p3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 1435
    invoke-virtual {p3, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 1433
    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1438
    invoke-virtual {p3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 1436
    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1441
    :cond_3
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1442
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1444
    :goto_0
    iget-object p3, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object v2, Lio/flutter/view/AccessibilityBridge$Action;->SET_SELECTION:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p3, p1, v2, p2}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;Ljava/lang/Object;)V

    .line 1449
    iget-object p3, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1450
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {p1, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2102(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    .line 1451
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2202(Lio/flutter/view/AccessibilityBridge$SemanticsNode;I)I

    return v5

    .line 1461
    :sswitch_6
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->CUT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1466
    :sswitch_7
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->PASTE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1456
    :sswitch_8
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->COPY:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1346
    :sswitch_9
    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 1347
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    goto :goto_1

    .line 1348
    :cond_4
    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 1350
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    goto :goto_1

    .line 1351
    :cond_5
    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 1352
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2502(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/lang/String;)Ljava/lang/String;

    .line 1353
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;

    move-result-object p2

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4602(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/List;)Ljava/util/List;

    .line 1355
    invoke-virtual {p0, p1, v4}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    .line 1356
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    :goto_1
    return v5

    :cond_6
    return v3

    .line 1328
    :sswitch_a
    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 1329
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    goto :goto_2

    .line 1330
    :cond_7
    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 1332
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    goto :goto_2

    .line 1333
    :cond_8
    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 1334
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2502(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/lang/String;)Ljava/lang/String;

    .line 1335
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;

    move-result-object p2

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$4602(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/List;)Ljava/util/List;

    .line 1337
    invoke-virtual {p0, p1, v4}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    .line 1338
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    :goto_2
    return v5

    :cond_9
    return v3

    .line 1364
    :sswitch_b
    invoke-direct {p0, v2, p1, p3, v3}, Lio/flutter/view/AccessibilityBridge;->performCursorMoveAction(Lio/flutter/view/AccessibilityBridge$SemanticsNode;ILandroid/os/Bundle;Z)Z

    move-result p1

    return p1

    .line 1368
    :sswitch_c
    invoke-direct {p0, v2, p1, p3, v5}, Lio/flutter/view/AccessibilityBridge;->performCursorMoveAction(Lio/flutter/view/AccessibilityBridge$SemanticsNode;ILandroid/os/Bundle;Z)Z

    move-result p1

    return p1

    .line 1375
    :sswitch_d
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz p2, :cond_a

    .line 1376
    invoke-static {p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p2

    if-ne p2, p1, :cond_a

    .line 1377
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1379
    :cond_a
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    if-eqz p2, :cond_b

    .line 1380
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, p1, :cond_b

    .line 1381
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->embeddedAccessibilityFocusedNodeId:Ljava/lang/Integer;

    .line 1383
    :cond_b
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->DID_LOSE_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    .line 1385
    invoke-virtual {p0, p1, v1}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    return v5

    .line 1391
    :sswitch_e
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-nez p2, :cond_c

    .line 1395
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->rootAccessibilityView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 1399
    :cond_c
    iput-object v2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1401
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->DID_GAIN_ACCESSIBILITY_FOCUS:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    .line 1404
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 1405
    const-string p3, "type"

    const-string v0, "didGainFocus"

    invoke-virtual {p2, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1406
    invoke-static {v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string v0, "nodeId"

    invoke-virtual {p2, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1407
    iget-object p3, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    iget-object p3, p3, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->channel:Lio/flutter/plugin/common/BasicMessageChannel;

    invoke-virtual {p3, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;)V

    const p2, 0x8000

    .line 1409
    invoke-virtual {p0, p1, p2}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    .line 1411
    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->INCREASE:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-nez p2, :cond_d

    sget-object p2, Lio/flutter/view/AccessibilityBridge$Action;->DECREASE:Lio/flutter/view/AccessibilityBridge$Action;

    .line 1412
    invoke-static {v2, p2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result p2

    if-eqz p2, :cond_e

    .line 1414
    :cond_d
    invoke-virtual {p0, p1, v4}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    :cond_e
    return v5

    .line 1323
    :sswitch_f
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->LONG_PRESS:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    .line 1315
    :sswitch_10
    iget-object p2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    sget-object p3, Lio/flutter/view/AccessibilityBridge$Action;->TAP:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-virtual {p2, p1, p3}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->dispatchSemanticsAction(ILio/flutter/view/AccessibilityBridge$Action;)V

    return v5

    :cond_f
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_10
        0x20 -> :sswitch_f
        0x40 -> :sswitch_e
        0x80 -> :sswitch_d
        0x100 -> :sswitch_c
        0x200 -> :sswitch_b
        0x1000 -> :sswitch_a
        0x2000 -> :sswitch_9
        0x4000 -> :sswitch_8
        0x8000 -> :sswitch_7
        0x10000 -> :sswitch_6
        0x20000 -> :sswitch_5
        0x40000 -> :sswitch_4
        0x80000 -> :sswitch_3
        0x100000 -> :sswitch_2
        0x200000 -> :sswitch_1
        0x1020036 -> :sswitch_0
    .end sparse-switch
.end method

.method public release()V
    .locals 3

    const/4 v0, 0x1

    .line 599
    iput-boolean v0, p0, Lio/flutter/view/AccessibilityBridge;->isReleased:Z

    .line 600
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    invoke-interface {v0}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->detachAccessibilityBridge()V

    const/4 v0, 0x0

    .line 601
    invoke-virtual {p0, v0}, Lio/flutter/view/AccessibilityBridge;->setOnAccessibilityChangeListener(Lio/flutter/view/AccessibilityBridge$OnAccessibilityChangeListener;)V

    .line 602
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityStateChangeListener:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 603
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge;->touchExplorationStateChangeListener:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 605
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->contentResolver:Landroid/content/ContentResolver;

    iget-object v2, p0, Lio/flutter/view/AccessibilityBridge;->animationScaleObserver:Landroid/database/ContentObserver;

    invoke-virtual {v1, v2}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 606
    iget-object v1, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityChannel:Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;

    invoke-virtual {v1, v0}, Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel;->setAccessibilityMessageHandler(Lio/flutter/embedding/engine/systemchannels/AccessibilityChannel$AccessibilityMessageHandler;)V

    return-void
.end method

.method public reset()V
    .locals 2

    .line 2321
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 2322
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v0, :cond_0

    .line 2324
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    const/high16 v1, 0x10000

    .line 2323
    invoke-virtual {p0, v0, v1}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(II)V

    :cond_0
    const/4 v0, 0x0

    .line 2327
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2328
    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->hoveredObject:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2329
    invoke-direct {p0, v0, v1}, Lio/flutter/view/AccessibilityBridge;->sendWindowContentChangeEvent(II)V

    return-void
.end method

.method public sendAccessibilityEvent(II)V
    .locals 1

    .line 2132
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityManager:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2135
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public setLocale(Ljava/lang/String;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge;->defaultLocale:Ljava/lang/String;

    return-void
.end method

.method public setOnAccessibilityChangeListener(Lio/flutter/view/AccessibilityBridge$OnAccessibilityChangeListener;)V
    .locals 0

    .line 624
    iput-object p1, p0, Lio/flutter/view/AccessibilityBridge;->onAccessibilityChangeListener:Lio/flutter/view/AccessibilityBridge$OnAccessibilityChangeListener;

    return-void
.end method

.method updateCustomAccessibilityActions(Ljava/nio/ByteBuffer;[Ljava/lang/String;)V
    .locals 2

    .line 1861
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1862
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 1863
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->getOrCreateAccessibilityAction(I)Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;

    move-result-object v0

    .line 1864
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v0, v1}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$5202(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;I)I

    .line 1865
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->getStringFromBuffer(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$4302(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;Ljava/lang/String;)Ljava/lang/String;

    .line 1866
    invoke-static {p1, p2}, Lio/flutter/view/AccessibilityBridge;->getStringFromBuffer(Ljava/nio/ByteBuffer;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;->access$3302(Lio/flutter/view/AccessibilityBridge$CustomAccessibilityAction;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_0
    return-void
.end method

.method updateSemantics(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V
    .locals 8

    .line 1881
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1882
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 1883
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    .line 1884
    invoke-direct {p0, v1}, Lio/flutter/view/AccessibilityBridge;->getOrCreateSemanticsNode(I)Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object v1

    .line 1885
    invoke-static {v1, p1, p2, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V

    .line 1886
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HIDDEN:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v1, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 1889
    :cond_1
    sget-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_FOCUSED:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v1, v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1890
    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1892
    :cond_2
    invoke-static {v1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1893
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1895
    :cond_3
    invoke-static {v1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    iget-object v3, p0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 1896
    invoke-static {v1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v4

    invoke-interface {v3, v4}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->usesVirtualDisplay(I)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1897
    iget-object v3, p0, Lio/flutter/view/AccessibilityBridge;->platformViewsAccessibilityDelegate:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 1898
    invoke-static {v1}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v1

    invoke-interface {v3, v1}, Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;->getPlatformViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1900
    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    goto :goto_0

    .line 1905
    :cond_4
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 1906
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge;->getRootSemanticsNode()Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    move-result-object p2

    .line 1907
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_5

    const/16 v1, 0x10

    .line 1909
    new-array v1, v1, [F

    .line 1910
    invoke-static {v1, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 1911
    invoke-static {p2, v1, p1, v2}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;[FLjava/util/Set;Z)V

    .line 1912
    invoke-static {p2, p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Ljava/util/List;)V

    .line 1920
    :cond_5
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    move-object v3, v1

    :cond_6
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1921
    iget-object v5, p0, Lio/flutter/view/AccessibilityBridge;->flutterNavigationStack:Ljava/util/List;

    invoke-static {v4}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    move-object v3, v4

    goto :goto_1

    :cond_7
    const/4 p2, 0x1

    if-nez v3, :cond_8

    .line 1927
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    .line 1928
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, p2

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    :cond_8
    if-eqz v3, :cond_a

    .line 1939
    invoke-static {v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v4

    iget v5, p0, Lio/flutter/view/AccessibilityBridge;->previousRouteId:I

    if-ne v4, v5, :cond_9

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    iget-object v5, p0, Lio/flutter/view/AccessibilityBridge;->flutterNavigationStack:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_a

    .line 1940
    :cond_9
    invoke-static {v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v4

    iput v4, p0, Lio/flutter/view/AccessibilityBridge;->previousRouteId:I

    .line 1941
    invoke-direct {p0, v3}, Lio/flutter/view/AccessibilityBridge;->onWindowNameChange(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)V

    .line 1943
    :cond_a
    iget-object v3, p0, Lio/flutter/view/AccessibilityBridge;->flutterNavigationStack:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 1944
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1945
    iget-object v4, p0, Lio/flutter/view/AccessibilityBridge;->flutterNavigationStack:Ljava/util/List;

    invoke-static {v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1948
    :cond_b
    iget-object p3, p0, Lio/flutter/view/AccessibilityBridge;->flutterSemanticsTree:Ljava/util/Map;

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    .line 1949
    :cond_c
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    .line 1950
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 1951
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1952
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    .line 1953
    invoke-direct {p0, v3}, Lio/flutter/view/AccessibilityBridge;->willRemoveSemanticsNode(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)V

    .line 1954
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    .line 1960
    :cond_d
    invoke-direct {p0, v2, p2}, Lio/flutter/view/AccessibilityBridge;->sendWindowContentChangeEvent(II)V

    .line 1962
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_26

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 1963
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1965
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    const/16 v3, 0x1000

    invoke-direct {p0, v0, v3}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 1969
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F

    move-result v3

    .line 1970
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F

    move-result v4

    .line 1971
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$5900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    const v6, 0x47c35000    # 100000.0f

    if-eqz v5, :cond_10

    const v4, 0x4788b800    # 70000.0f

    cmpl-float v5, v3, v4

    if-lez v5, :cond_f

    move v3, v4

    :cond_f
    move v4, v6

    .line 1977
    :cond_10
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-eqz v5, :cond_12

    add-float/2addr v4, v6

    const v5, -0x38774800    # -70000.0f

    cmpg-float v7, v3, v5

    if-gez v7, :cond_11

    move v3, v5

    :cond_11
    add-float/2addr v3, v6

    goto :goto_5

    .line 1984
    :cond_12
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F

    move-result v5

    sub-float/2addr v4, v5

    .line 1985
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)F

    move-result v5

    sub-float/2addr v3, v5

    .line 1988
    :goto_5
    sget-object v5, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_UP:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p3, v5}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v5

    if-nez v5, :cond_15

    sget-object v5, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_DOWN:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p3, v5}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_6

    .line 1991
    :cond_13
    sget-object v5, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_LEFT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p3, v5}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v5

    if-nez v5, :cond_14

    sget-object v5, Lio/flutter/view/AccessibilityBridge$Action;->SCROLL_RIGHT:Lio/flutter/view/AccessibilityBridge$Action;

    invoke-static {p3, v5}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Action;)Z

    move-result v5

    if-eqz v5, :cond_16

    :cond_14
    float-to-int v3, v3

    .line 1992
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setScrollX(I)V

    float-to-int v3, v4

    .line 1993
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollX(I)V

    goto :goto_7

    :cond_15
    :goto_6
    float-to-int v3, v3

    .line 1989
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setScrollY(I)V

    float-to-int v3, v4

    .line 1990
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollY(I)V

    .line 1995
    :cond_16
    :goto_7
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-lez v3, :cond_19

    .line 1997
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    .line 1998
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 2001
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6300(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :cond_17
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2002
    sget-object v6, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HIDDEN:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v5, v6}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v5

    if-nez v5, :cond_17

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    .line 2023
    :cond_18
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    add-int/2addr v3, v4

    sub-int/2addr v3, p2

    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    .line 2025
    :cond_19
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2027
    :cond_1a
    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_LIVE_REGION:Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {p3, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6400(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 2028
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    invoke-direct {p0, v0, p2}, Lio/flutter/view/AccessibilityBridge;->sendWindowContentChangeEvent(II)V

    .line 2030
    :cond_1b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x24

    const/16 v4, 0x2000

    if-lt v0, v3, :cond_1c

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 2031
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    invoke-direct {p0, v0, v4}, Lio/flutter/view/AccessibilityBridge;->sendWindowContentChangeEvent(II)V

    .line 2033
    :cond_1c
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v0, :cond_1d

    .line 2034
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-ne v0, v3, :cond_1d

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SELECTED:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 2035
    invoke-static {p3, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-nez v0, :cond_1d

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SELECTED:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 2036
    invoke-static {p3, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 2038
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    const/4 v3, 0x4

    invoke-direct {p0, v0, v3}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 2039
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v3

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6700(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2040
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2045
    :cond_1d
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v0, :cond_1f

    .line 2046
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-ne v0, v3, :cond_1f

    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->lastInputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v0, :cond_1e

    .line 2048
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    iget-object v3, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    invoke-static {v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-eq v0, v3, :cond_1f

    .line 2049
    :cond_1e
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    iput-object v0, p0, Lio/flutter/view/AccessibilityBridge;->lastInputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2051
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    const/16 v3, 0x8

    invoke-direct {p0, v0, v3}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 2050
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_9

    .line 2052
    :cond_1f
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-nez v0, :cond_20

    .line 2056
    iput-object v1, p0, Lio/flutter/view/AccessibilityBridge;->lastInputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    .line 2059
    :cond_20
    :goto_9
    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v0, :cond_e

    .line 2060
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-ne v0, v3, :cond_e

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TEXT_FIELD:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 2061
    invoke-static {p3, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TEXT_FIELD:Lio/flutter/view/AccessibilityBridge$Flag;

    .line 2062
    invoke-static {p3, v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$1600(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$Flag;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lio/flutter/view/AccessibilityBridge;->accessibilityFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    if-eqz v0, :cond_21

    .line 2068
    invoke-static {v0}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    iget-object v3, p0, Lio/flutter/view/AccessibilityBridge;->inputFocusedSemanticsNode:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    invoke-static {v3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v3

    if-ne v0, v3, :cond_e

    .line 2069
    :cond_21
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v0

    const-string v3, ""

    if-eqz v0, :cond_22

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6800(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_22
    move-object v0, v3

    .line 2070
    :goto_a
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_23

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2500(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Ljava/lang/String;

    move-result-object v3

    .line 2071
    :cond_23
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v5

    invoke-direct {p0, v5, v0, v3}, Lio/flutter/view/AccessibilityBridge;->createTextChangedEvent(ILjava/lang/String;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    if-eqz v0, :cond_24

    .line 2073
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2076
    :cond_24
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$6900(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v5

    if-ne v0, v5, :cond_25

    .line 2077
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$7000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v5

    if-eq v0, v5, :cond_e

    .line 2080
    :cond_25
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$000(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v0

    .line 2079
    invoke-direct {p0, v0, v4}, Lio/flutter/view/AccessibilityBridge;->obtainAccessibilityEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 2081
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2082
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2100(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 2083
    invoke-static {p3}, Lio/flutter/view/AccessibilityBridge$SemanticsNode;->access$2200(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)I

    move-result p3

    invoke-virtual {v0, p3}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    .line 2084
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {v0, p3}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    .line 2085
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    goto/16 :goto_4

    :cond_26
    return-void
.end method
