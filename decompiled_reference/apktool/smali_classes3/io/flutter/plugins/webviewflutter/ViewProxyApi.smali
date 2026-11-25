.class public Lio/flutter/plugins/webviewflutter/ViewProxyApi;
.super Lio/flutter/plugins/webviewflutter/PigeonApiView;
.source "ViewProxyApi.java"


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/ProxyApiRegistrar;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/PigeonApiView;-><init>(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V

    return-void
.end method

.method static synthetic lambda$setInsetListenerToSetInsetsToZero$0(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    return-object p1
.end method

.method static synthetic lambda$setInsetListenerToSetInsetsToZero$1(ILandroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    .line 121
    new-instance p1, Landroidx/core/view/WindowInsetsCompat$Builder;

    invoke-direct {p1, p2}, Landroidx/core/view/WindowInsetsCompat$Builder;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    sget-object p2, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    .line 122
    invoke-virtual {p1, p0, p2}, Landroidx/core/view/WindowInsetsCompat$Builder;->setInsets(ILandroidx/core/graphics/Insets;)Landroidx/core/view/WindowInsetsCompat$Builder;

    move-result-object p0

    .line 123
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat$Builder;->build()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/ViewProxyApi;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/ProxyApiRegistrar;

    move-result-object v0

    return-object v0
.end method

.method public getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/ProxyApiRegistrar;
    .locals 1

    .line 29
    invoke-super {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiView;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/webviewflutter/ProxyApiRegistrar;

    return-object v0
.end method

.method public getScrollPosition(Landroid/view/View;)Lio/flutter/plugins/webviewflutter/WebViewPoint;
    .locals 5

    .line 45
    new-instance v0, Lio/flutter/plugins/webviewflutter/WebViewPoint;

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    int-to-long v3, p1

    invoke-direct {v0, v1, v2, v3, v4}, Lio/flutter/plugins/webviewflutter/WebViewPoint;-><init>(JJ)V

    return-object v0
.end method

.method public scrollBy(Landroid/view/View;JJ)V
    .locals 0

    long-to-int p2, p2

    long-to-int p3, p4

    .line 39
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->scrollBy(II)V

    return-void
.end method

.method public scrollTo(Landroid/view/View;JJ)V
    .locals 0

    long-to-int p2, p2

    long-to-int p3, p4

    .line 34
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->scrollTo(II)V

    return-void
.end method

.method public setHorizontalScrollBarEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    return-void
.end method

.method public setInsetListenerToSetInsetsToZero(Landroid/view/View;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "+",
            "Lio/flutter/plugins/webviewflutter/WindowInsetsType;",
            ">;)V"
        }
    .end annotation

    .line 78
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    new-instance p2, Lio/flutter/plugins/webviewflutter/ViewProxyApi$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lio/flutter/plugins/webviewflutter/ViewProxyApi$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    return-void

    .line 85
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/webviewflutter/WindowInsetsType;

    .line 86
    sget-object v2, Lio/flutter/plugins/webviewflutter/ViewProxyApi$1;->$SwitchMap$io$flutter$plugins$webviewflutter$WindowInsetsType:[I

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/WindowInsetsType;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 112
    :pswitch_0
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->tappableElement()I

    move-result v1

    goto :goto_1

    .line 109
    :pswitch_1
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemGestures()I

    move-result v1

    goto :goto_1

    .line 106
    :pswitch_2
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->statusBars()I

    move-result v1

    goto :goto_1

    .line 103
    :pswitch_3
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->navigationBars()I

    move-result v1

    goto :goto_1

    .line 100
    :pswitch_4
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->mandatorySystemGestures()I

    move-result v1

    goto :goto_1

    .line 97
    :pswitch_5
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v1

    goto :goto_1

    .line 94
    :pswitch_6
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->captionBar()I

    move-result v1

    goto :goto_1

    .line 91
    :pswitch_7
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->displayCutout()I

    move-result v1

    goto :goto_1

    .line 88
    :pswitch_8
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v1

    :goto_1
    or-int/2addr v0, v1

    goto :goto_0

    .line 118
    :cond_1
    new-instance p2, Lio/flutter/plugins/webviewflutter/ViewProxyApi$$ExternalSyntheticLambda1;

    invoke-direct {p2, v0}, Lio/flutter/plugins/webviewflutter/ViewProxyApi$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setOverScrollMode(Landroid/view/View;Lio/flutter/plugins/webviewflutter/OverScrollMode;)V
    .locals 2

    .line 60
    sget-object v0, Lio/flutter/plugins/webviewflutter/ViewProxyApi$1;->$SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode:[I

    invoke-virtual {p2}, Lio/flutter/plugins/webviewflutter/OverScrollMode;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 p1, 0x4

    if-eq p2, p1, :cond_0

    return-void

    .line 71
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/ViewProxyApi;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/ProxyApiRegistrar;

    move-result-object p1

    sget-object p2, Lio/flutter/plugins/webviewflutter/OverScrollMode;->UNKNOWN:Lio/flutter/plugins/webviewflutter/OverScrollMode;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/webviewflutter/ProxyApiRegistrar;->createUnknownEnumException(Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    .line 68
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setOverScrollMode(I)V

    return-void

    .line 65
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setOverScrollMode(I)V

    return-void

    :cond_3
    const/4 p2, 0x0

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->setOverScrollMode(I)V

    return-void
.end method

.method public setVerticalScrollBarEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 50
    invoke-virtual {p1, p2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method
