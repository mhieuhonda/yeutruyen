.class public abstract Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;
.super Ljava/lang/Object;
.source "AndroidWebkitLibrary.g.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0008\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J8\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J>\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u001e\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0 0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J0\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010#\u001a\u00020$2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J8\u0010%\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J(\u0010*\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J8\u0010+\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010,\u001a\u00020!2\u0006\u0010(\u001a\u00020-2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J(\u0010.\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J0\u0010/\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u00100\u001a\u0002012\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J@\u00102\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020!2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J@\u00104\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020!2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016JJ\u00105\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020!2\u0006\u00106\u001a\u00020!2\u001a\u0010\u0015\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0017\u0012\u0004\u0012\u00020\u000b0\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u00068"
    }
    d2 = {
        "Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;",
        "",
        "pigeonRegistrar",
        "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;",
        "<init>",
        "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V",
        "getPigeonRegistrar",
        "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;",
        "pigeon_defaultConstructor",
        "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
        "setSynchronousReturnValueForOnShowFileChooser",
        "",
        "pigeon_instance",
        "value",
        "",
        "setSynchronousReturnValueForOnConsoleMessage",
        "setSynchronousReturnValueForOnJsAlert",
        "setSynchronousReturnValueForOnJsConfirm",
        "setSynchronousReturnValueForOnJsPrompt",
        "pigeon_newInstance",
        "pigeon_instanceArg",
        "callback",
        "Lkotlin/Function1;",
        "Lkotlin/Result;",
        "onProgressChanged",
        "webViewArg",
        "Landroid/webkit/WebView;",
        "progressArg",
        "",
        "onShowFileChooser",
        "paramsArg",
        "Landroid/webkit/WebChromeClient$FileChooserParams;",
        "",
        "",
        "onPermissionRequest",
        "requestArg",
        "Landroid/webkit/PermissionRequest;",
        "onShowCustomView",
        "viewArg",
        "Landroid/view/View;",
        "callbackArg",
        "Landroid/webkit/WebChromeClient$CustomViewCallback;",
        "onHideCustomView",
        "onGeolocationPermissionsShowPrompt",
        "originArg",
        "Landroid/webkit/GeolocationPermissions$Callback;",
        "onGeolocationPermissionsHidePrompt",
        "onConsoleMessage",
        "messageArg",
        "Landroid/webkit/ConsoleMessage;",
        "onJsAlert",
        "urlArg",
        "onJsConfirm",
        "onJsPrompt",
        "defaultValueArg",
        "Companion",
        "webview_flutter_android_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$Companion;


# instance fields
.field private final pigeonRegistrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->Companion:Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$Companion;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V
    .locals 1

    const-string v0, "pigeonRegistrar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4071
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4073
    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->pigeonRegistrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    return-void
.end method

.method static final onConsoleMessage$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4688
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4689
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4691
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4692
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4691
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4690
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4694
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4697
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onGeolocationPermissionsHidePrompt$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4648
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4649
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4651
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4652
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4651
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4650
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4654
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4657
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onGeolocationPermissionsShowPrompt$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4605
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4606
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4608
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4609
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4608
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4607
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4611
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4614
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onHideCustomView$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4560
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4561
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4563
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4564
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4563
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4562
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4566
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4569
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onJsAlert$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4732
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4733
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4735
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4736
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4735
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4734
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4738
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4741
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onJsConfirm$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4776
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 4777
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-le p1, v0, :cond_0

    .line 4779
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4780
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4779
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4778
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4781
    :cond_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    .line 4783
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4784
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4786
    const-string p2, "Flutter api returned null value for non-null return value."

    .line 4787
    const-string v0, ""

    .line 4784
    const-string v1, "null-error"

    invoke-direct {p1, v1, p2, v0}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4783
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4782
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4789
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 4790
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4793
    :cond_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onJsPrompt$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4829
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4830
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-le p1, v1, :cond_0

    .line 4832
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4833
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4832
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4831
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4835
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 4836
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4839
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onPermissionRequest$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4480
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4481
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4483
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4484
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4483
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4482
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4486
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4489
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onProgressChanged$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4387
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4388
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4390
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4391
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4390
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4389
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4393
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4396
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onShowCustomView$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4521
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4522
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 4524
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4525
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4524
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4523
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4527
    :cond_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4530
    :cond_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static final onShowFileChooser$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 4428
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 4429
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-le p1, v0, :cond_0

    .line 4431
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4432
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4431
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4430
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4433
    :cond_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    .line 4435
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4436
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4438
    const-string p2, "Flutter api returned null value for non-null return value."

    .line 4439
    const-string v0, ""

    .line 4436
    const-string v1, "null-error"

    invoke-direct {p1, v1, p2, v0}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4435
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4434
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4441
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    .line 4442
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4445
    :cond_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->INSTANCE:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;

    invoke-virtual {p2, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonUtils;->createConnectionError(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;
    .locals 1

    .line 4073
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->pigeonRegistrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    return-object v0
.end method

.method public final onConsoleMessage(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/ConsoleMessage;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/webkit/ConsoleMessage;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4669
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4671
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4672
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string v0, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, v0, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4671
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4670
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4674
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4676
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4677
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4678
    const-string p2, "missing-instance-error"

    .line 4679
    const-string v0, "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager."

    .line 4677
    invoke-direct {p1, p2, v0, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4676
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4675
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4683
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4684
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4686
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4687
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda7;

    invoke-direct {p2, p3, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda7;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onGeolocationPermissionsHidePrompt(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4628
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4630
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4631
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string v0, "ignore-calls-error"

    const-string v2, "Calls to Dart are being ignored."

    invoke-direct {p1, v0, v2, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4630
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4629
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4633
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4635
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4636
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4637
    const-string v0, "missing-instance-error"

    .line 4638
    const-string v2, "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager."

    .line 4636
    invoke-direct {p1, v0, v2, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4635
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4634
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4642
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4643
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4646
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4647
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda10;

    invoke-direct {v0, p2, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda10;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v0}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onGeolocationPermissionsShowPrompt(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Ljava/lang/String;",
            "Landroid/webkit/GeolocationPermissions$Callback;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackArg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4585
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4587
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4588
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string p3, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4587
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4586
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4590
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4592
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4593
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4594
    const-string p2, "missing-instance-error"

    .line 4595
    const-string p3, "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager."

    .line 4593
    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4592
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4591
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4599
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4600
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4603
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4604
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda8;

    invoke-direct {p2, p4, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda8;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onHideCustomView(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4541
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4543
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4544
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string v0, "ignore-calls-error"

    const-string v2, "Calls to Dart are being ignored."

    invoke-direct {p1, v0, v2, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4543
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4542
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4546
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4548
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4549
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4550
    const-string v0, "missing-instance-error"

    .line 4551
    const-string v2, "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager."

    .line 4549
    invoke-direct {p1, v0, v2, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4548
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4547
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4555
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4556
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4558
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4559
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda0;

    invoke-direct {v0, p2, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v0}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onJsAlert(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlArg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageArg"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4713
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4715
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4716
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string p3, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4715
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4714
    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4718
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4720
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4721
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4722
    const-string p2, "missing-instance-error"

    .line 4723
    const-string p3, "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager."

    .line 4721
    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4720
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4719
    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4727
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4728
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4730
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4731
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda3;

    invoke-direct {p2, p5, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onJsConfirm(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlArg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageArg"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4757
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4759
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4760
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string p3, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4759
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4758
    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4762
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4764
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4765
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4766
    const-string p2, "missing-instance-error"

    .line 4767
    const-string p3, "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager."

    .line 4765
    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4764
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4763
    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4771
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4772
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4774
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4775
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda9;

    invoke-direct {p2, p5, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda9;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onJsPrompt(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlArg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageArg"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultValueArg"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4810
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4812
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4813
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string p3, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4812
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4811
    invoke-interface {p6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4815
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4817
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4818
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4819
    const-string p2, "missing-instance-error"

    .line 4820
    const-string p3, "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager."

    .line 4818
    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4817
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4816
    invoke-interface {p6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4824
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4825
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4827
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4828
    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda2;

    invoke-direct {p2, p6, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onPermissionRequest(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/PermissionRequest;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/webkit/PermissionRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4460
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4462
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4463
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string v0, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, v0, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4462
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4461
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4465
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4467
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4468
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4469
    const-string p2, "missing-instance-error"

    .line 4470
    const-string v0, "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager."

    .line 4468
    invoke-direct {p1, p2, v0, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4467
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4466
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4474
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4475
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4478
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4479
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda5;

    invoke-direct {p2, p3, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onProgressChanged(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;JLkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/webkit/WebView;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4368
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4370
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4371
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string p3, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4370
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4369
    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4373
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4375
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4376
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4377
    const-string p2, "missing-instance-error"

    .line 4378
    const-string p3, "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager."

    .line 4376
    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4375
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4374
    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4382
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4383
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4385
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4386
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda1;

    invoke-direct {p2, p5, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onShowCustomView(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/view/View;",
            "Landroid/webkit/WebChromeClient$CustomViewCallback;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackArg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4502
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4504
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4505
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string p3, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4504
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4503
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4507
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4509
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4510
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4511
    const-string p2, "missing-instance-error"

    .line 4512
    const-string p3, "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager."

    .line 4510
    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4509
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4508
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4516
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4517
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4519
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4520
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda6;

    invoke-direct {p2, p4, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda6;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public final onShowFileChooser(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Landroid/webkit/WebView;Landroid/webkit/WebChromeClient$FileChooserParams;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewArg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paramsArg"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4409
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4411
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4412
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string p2, "ignore-calls-error"

    const-string p3, "Calls to Dart are being ignored."

    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4411
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4410
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4414
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4416
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4417
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4418
    const-string p2, "missing-instance-error"

    .line 4419
    const-string p3, "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager."

    .line 4417
    invoke-direct {p1, p2, p3, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4416
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4415
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4423
    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    .line 4424
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getCodec()Lio/flutter/plugin/common/MessageCodec;

    move-result-object v1

    .line 4426
    new-instance v2, Lio/flutter/plugin/common/BasicMessageChannel;

    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser"

    invoke-direct {v2, v0, v3, v1}, Lio/flutter/plugin/common/BasicMessageChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MessageCodec;)V

    .line 4427
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda4;

    invoke-direct {p2, p4, v3}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient$$ExternalSyntheticLambda4;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Lio/flutter/plugin/common/BasicMessageChannel;->send(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method

.method public abstract pigeon_defaultConstructor()Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;
.end method

.method public final pigeon_newInstance(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pigeon_instanceArg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4344
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getIgnoreCallsToDart()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 4346
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4347
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    const-string v0, "ignore-calls-error"

    const-string v2, "Calls to Dart are being ignored."

    invoke-direct {p1, v0, v2, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4346
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4345
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4348
    :cond_0
    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->getPigeonRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4349
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4352
    :cond_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4353
    new-instance p1, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;

    .line 4354
    const-string v0, "new-instance-error"

    .line 4355
    const-string v2, "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method."

    .line 4353
    invoke-direct {p1, v0, v2, v1}, Lio/flutter/plugins/webviewflutter/AndroidWebKitError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 4352
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    .line 4351
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public abstract setSynchronousReturnValueForOnConsoleMessage(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Z)V
.end method

.method public abstract setSynchronousReturnValueForOnJsAlert(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Z)V
.end method

.method public abstract setSynchronousReturnValueForOnJsConfirm(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Z)V
.end method

.method public abstract setSynchronousReturnValueForOnJsPrompt(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Z)V
.end method

.method public abstract setSynchronousReturnValueForOnShowFileChooser(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Z)V
.end method
