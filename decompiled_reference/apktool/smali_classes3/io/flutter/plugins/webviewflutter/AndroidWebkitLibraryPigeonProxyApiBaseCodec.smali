.class final Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;
.super Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;
.source "AndroidWebkitLibrary.g.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;",
        "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;",
        "registrar",
        "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;",
        "<init>",
        "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V",
        "getRegistrar",
        "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;",
        "readValueOfType",
        "",
        "type",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "writeValue",
        "",
        "stream",
        "Ljava/io/ByteArrayOutputStream;",
        "value",
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


# instance fields
.field private final registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V
    .locals 1

    const-string v0, "registrar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 676
    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;-><init>()V

    .line 677
    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    return-void
.end method

.method static final writeValue$lambda$0(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 725
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 726
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebResourceRequest"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 728
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$1(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 731
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 732
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebResourceResponse"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 734
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$10(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 785
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 786
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebViewClient"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 788
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$11(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 791
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 792
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "DownloadListener"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 794
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$12(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 798
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 799
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebChromeClient"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 801
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$13(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 804
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 805
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "FlutterAssetManager"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 807
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$14(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 810
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 811
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebStorage"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 813
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$15(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 816
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 817
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "FileChooserParams"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 819
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$16(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 822
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 823
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "PermissionRequest"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 825
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$17(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 828
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 829
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "CustomViewCallback"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 831
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$18(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 834
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 835
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "View"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 837
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$19(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 840
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 841
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "GeolocationPermissionsCallback"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 843
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$2(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 737
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 738
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebResourceError"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 740
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$20(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 846
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 847
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "HttpAuthHandler"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 849
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$21(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 852
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 853
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "AndroidMessage"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 855
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$22(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 858
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 859
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "ClientCertRequest"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 861
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$23(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 864
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 865
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "PrivateKey"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 867
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$24(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 870
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 871
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "X509Certificate"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 873
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$25(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 876
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 877
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "SslErrorHandler"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 879
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$26(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 882
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 883
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "SslError"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 885
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$27(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 888
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 889
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "SslCertificateDName"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 891
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$28(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 894
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 895
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "SslCertificate"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 897
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$29(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 900
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 901
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "Certificate"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 903
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$3(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 743
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 744
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebResourceErrorCompat"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 746
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$30(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 906
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 907
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebSettingsCompat"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 909
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$31(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 912
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 913
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebViewFeature"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 915
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$4(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 749
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 750
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebViewPoint"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 752
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$5(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 755
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 756
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "ConsoleMessage"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 758
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$6(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 761
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 762
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "CookieManager"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 764
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$7(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 767
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 768
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebView"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 770
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$8(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 773
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 774
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "WebSettings"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 776
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method static final writeValue$lambda$9(Ljava/lang/Object;Lkotlin/Result;)Lkotlin/Unit;
    .locals 1

    .line 779
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 780
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    const-string v0, "JavaScriptChannel"

    invoke-static {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 782
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final writeValue$logNewInstanceFailure(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 2

    .line 720
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to create new Dart proxy instance of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, ": "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, ". "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 718
    const-string p1, "PigeonProxyApiBaseCodec"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final getRegistrar()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;
    .locals 1

    .line 677
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    return-object v0
.end method

.method protected readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 3

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, -0x80

    if-ne p1, v0, :cond_1

    .line 682
    invoke-virtual {p0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->readValue(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    .line 683
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->getInstance(J)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 685
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to find instance with identifier: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PigeonProxyApiBaseCodec"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object v0

    .line 689
    :cond_1
    invoke-super {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;->readValueOfType(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 694
    instance-of v0, p2, Ljava/lang/Boolean;

    if-nez v0, :cond_22

    .line 695
    instance-of v0, p2, [B

    if-nez v0, :cond_22

    .line 696
    instance-of v0, p2, Ljava/lang/Double;

    if-nez v0, :cond_22

    .line 697
    instance-of v0, p2, [D

    if-nez v0, :cond_22

    .line 698
    instance-of v0, p2, [F

    if-nez v0, :cond_22

    .line 699
    instance-of v0, p2, Ljava/lang/Integer;

    if-nez v0, :cond_22

    .line 700
    instance-of v0, p2, [I

    if-nez v0, :cond_22

    .line 701
    instance-of v0, p2, Ljava/util/List;

    if-nez v0, :cond_22

    .line 702
    instance-of v0, p2, Ljava/lang/Long;

    if-nez v0, :cond_22

    .line 703
    instance-of v0, p2, [J

    if-nez v0, :cond_22

    .line 704
    instance-of v0, p2, Ljava/util/Map;

    if-nez v0, :cond_22

    .line 705
    instance-of v0, p2, Ljava/lang/String;

    if-nez v0, :cond_22

    .line 706
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/FileChooserMode;

    if-nez v0, :cond_22

    .line 707
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/ConsoleMessageLevel;

    if-nez v0, :cond_22

    .line 708
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/OverScrollMode;

    if-nez v0, :cond_22

    .line 709
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/SslErrorType;

    if-nez v0, :cond_22

    .line 710
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/MixedContentMode;

    if-nez v0, :cond_22

    .line 711
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/WindowInsetsType;

    if-nez v0, :cond_22

    if-nez p2, :cond_0

    goto/16 :goto_1

    .line 723
    :cond_0
    instance-of v0, p2, Landroid/webkit/WebResourceRequest;

    if-eqz v0, :cond_1

    .line 724
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebResourceRequest()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceRequest;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebResourceRequest;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda0;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda0;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceRequest;->pigeon_newInstance(Landroid/webkit/WebResourceRequest;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 729
    :cond_1
    instance-of v0, p2, Landroid/webkit/WebResourceResponse;

    if-eqz v0, :cond_2

    .line 730
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebResourceResponse()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceResponse;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebResourceResponse;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda2;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceResponse;->pigeon_newInstance(Landroid/webkit/WebResourceResponse;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 735
    :cond_2
    instance-of v0, p2, Landroid/webkit/WebResourceError;

    if-eqz v0, :cond_3

    .line 736
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebResourceError()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceError;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebResourceError;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda14;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda14;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceError;->pigeon_newInstance(Landroid/webkit/WebResourceError;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 741
    :cond_3
    instance-of v0, p2, Landroidx/webkit/WebResourceErrorCompat;

    if-eqz v0, :cond_4

    .line 742
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebResourceErrorCompat()Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceErrorCompat;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroidx/webkit/WebResourceErrorCompat;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda17;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda17;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebResourceErrorCompat;->pigeon_newInstance(Landroidx/webkit/WebResourceErrorCompat;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 747
    :cond_4
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/WebViewPoint;

    if-eqz v0, :cond_5

    .line 748
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebViewPoint()Lio/flutter/plugins/webviewflutter/PigeonApiWebViewPoint;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lio/flutter/plugins/webviewflutter/WebViewPoint;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda18;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda18;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebViewPoint;->pigeon_newInstance(Lio/flutter/plugins/webviewflutter/WebViewPoint;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 753
    :cond_5
    instance-of v0, p2, Landroid/webkit/ConsoleMessage;

    if-eqz v0, :cond_6

    .line 754
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiConsoleMessage()Lio/flutter/plugins/webviewflutter/PigeonApiConsoleMessage;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/ConsoleMessage;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda19;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda19;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiConsoleMessage;->pigeon_newInstance(Landroid/webkit/ConsoleMessage;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 759
    :cond_6
    instance-of v0, p2, Landroid/webkit/CookieManager;

    if-eqz v0, :cond_7

    .line 760
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiCookieManager()Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/CookieManager;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda20;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda20;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiCookieManager;->pigeon_newInstance(Landroid/webkit/CookieManager;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 765
    :cond_7
    instance-of v0, p2, Landroid/webkit/WebView;

    if-eqz v0, :cond_8

    .line 766
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebView()Lio/flutter/plugins/webviewflutter/PigeonApiWebView;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebView;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda21;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda21;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebView;->pigeon_newInstance(Landroid/webkit/WebView;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 771
    :cond_8
    instance-of v0, p2, Landroid/webkit/WebSettings;

    if-eqz v0, :cond_9

    .line 772
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebSettings()Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebSettings;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda23;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda23;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebSettings;->pigeon_newInstance(Landroid/webkit/WebSettings;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 777
    :cond_9
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;

    if-eqz v0, :cond_a

    .line 778
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiJavaScriptChannel()Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda24;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda24;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiJavaScriptChannel;->pigeon_newInstance(Lio/flutter/plugins/webviewflutter/JavaScriptChannel;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 783
    :cond_a
    instance-of v0, p2, Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_b

    .line 784
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebViewClient()Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebViewClient;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda11;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda11;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebViewClient;->pigeon_newInstance(Landroid/webkit/WebViewClient;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 789
    :cond_b
    instance-of v0, p2, Landroid/webkit/DownloadListener;

    if-eqz v0, :cond_c

    .line 790
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiDownloadListener()Lio/flutter/plugins/webviewflutter/PigeonApiDownloadListener;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/DownloadListener;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda22;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda22;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiDownloadListener;->pigeon_newInstance(Landroid/webkit/DownloadListener;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 795
    :cond_c
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;

    if-eqz v0, :cond_d

    .line 797
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebChromeClient()Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda25;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda25;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebChromeClient;->pigeon_newInstance(Lio/flutter/plugins/webviewflutter/WebChromeClientProxyApi$WebChromeClientImpl;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 802
    :cond_d
    instance-of v0, p2, Lio/flutter/plugins/webviewflutter/FlutterAssetManager;

    if-eqz v0, :cond_e

    .line 803
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiFlutterAssetManager()Lio/flutter/plugins/webviewflutter/PigeonApiFlutterAssetManager;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lio/flutter/plugins/webviewflutter/FlutterAssetManager;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda26;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda26;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiFlutterAssetManager;->pigeon_newInstance(Lio/flutter/plugins/webviewflutter/FlutterAssetManager;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 808
    :cond_e
    instance-of v0, p2, Landroid/webkit/WebStorage;

    if-eqz v0, :cond_f

    .line 809
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebStorage()Lio/flutter/plugins/webviewflutter/PigeonApiWebStorage;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebStorage;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda27;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda27;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebStorage;->pigeon_newInstance(Landroid/webkit/WebStorage;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 814
    :cond_f
    instance-of v0, p2, Landroid/webkit/WebChromeClient$FileChooserParams;

    if-eqz v0, :cond_10

    .line 815
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiFileChooserParams()Lio/flutter/plugins/webviewflutter/PigeonApiFileChooserParams;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebChromeClient$FileChooserParams;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda28;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda28;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiFileChooserParams;->pigeon_newInstance(Landroid/webkit/WebChromeClient$FileChooserParams;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 820
    :cond_10
    instance-of v0, p2, Landroid/webkit/PermissionRequest;

    if-eqz v0, :cond_11

    .line 821
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiPermissionRequest()Lio/flutter/plugins/webviewflutter/PigeonApiPermissionRequest;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/PermissionRequest;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda29;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda29;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiPermissionRequest;->pigeon_newInstance(Landroid/webkit/PermissionRequest;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 826
    :cond_11
    instance-of v0, p2, Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_12

    .line 827
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiCustomViewCallback()Lio/flutter/plugins/webviewflutter/PigeonApiCustomViewCallback;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/WebChromeClient$CustomViewCallback;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda30;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda30;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiCustomViewCallback;->pigeon_newInstance(Landroid/webkit/WebChromeClient$CustomViewCallback;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 832
    :cond_12
    instance-of v0, p2, Landroid/view/View;

    if-eqz v0, :cond_13

    .line 833
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiView()Lio/flutter/plugins/webviewflutter/PigeonApiView;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/view/View;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda31;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda31;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiView;->pigeon_newInstance(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 838
    :cond_13
    instance-of v0, p2, Landroid/webkit/GeolocationPermissions$Callback;

    if-eqz v0, :cond_14

    .line 839
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiGeolocationPermissionsCallback()Lio/flutter/plugins/webviewflutter/PigeonApiGeolocationPermissionsCallback;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/GeolocationPermissions$Callback;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda1;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiGeolocationPermissionsCallback;->pigeon_newInstance(Landroid/webkit/GeolocationPermissions$Callback;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 844
    :cond_14
    instance-of v0, p2, Landroid/webkit/HttpAuthHandler;

    if-eqz v0, :cond_15

    .line 845
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiHttpAuthHandler()Lio/flutter/plugins/webviewflutter/PigeonApiHttpAuthHandler;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/HttpAuthHandler;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda3;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda3;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiHttpAuthHandler;->pigeon_newInstance(Landroid/webkit/HttpAuthHandler;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 850
    :cond_15
    instance-of v0, p2, Landroid/os/Message;

    if-eqz v0, :cond_16

    .line 851
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiAndroidMessage()Lio/flutter/plugins/webviewflutter/PigeonApiAndroidMessage;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/os/Message;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda4;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda4;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiAndroidMessage;->pigeon_newInstance(Landroid/os/Message;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 856
    :cond_16
    instance-of v0, p2, Landroid/webkit/ClientCertRequest;

    if-eqz v0, :cond_17

    .line 857
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiClientCertRequest()Lio/flutter/plugins/webviewflutter/PigeonApiClientCertRequest;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/ClientCertRequest;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda5;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda5;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiClientCertRequest;->pigeon_newInstance(Landroid/webkit/ClientCertRequest;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 862
    :cond_17
    instance-of v0, p2, Ljava/security/PrivateKey;

    if-eqz v0, :cond_18

    .line 863
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiPrivateKey()Lio/flutter/plugins/webviewflutter/PigeonApiPrivateKey;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Ljava/security/PrivateKey;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda6;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda6;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiPrivateKey;->pigeon_newInstance(Ljava/security/PrivateKey;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 868
    :cond_18
    instance-of v0, p2, Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_19

    .line 869
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiX509Certificate()Lio/flutter/plugins/webviewflutter/PigeonApiX509Certificate;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Ljava/security/cert/X509Certificate;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda7;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda7;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiX509Certificate;->pigeon_newInstance(Ljava/security/cert/X509Certificate;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 874
    :cond_19
    instance-of v0, p2, Landroid/webkit/SslErrorHandler;

    if-eqz v0, :cond_1a

    .line 875
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiSslErrorHandler()Lio/flutter/plugins/webviewflutter/PigeonApiSslErrorHandler;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/webkit/SslErrorHandler;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda8;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda8;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiSslErrorHandler;->pigeon_newInstance(Landroid/webkit/SslErrorHandler;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_0

    .line 880
    :cond_1a
    instance-of v0, p2, Landroid/net/http/SslError;

    if-eqz v0, :cond_1b

    .line 881
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiSslError()Lio/flutter/plugins/webviewflutter/PigeonApiSslError;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/net/http/SslError;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda9;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda9;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiSslError;->pigeon_newInstance(Landroid/net/http/SslError;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 886
    :cond_1b
    instance-of v0, p2, Landroid/net/http/SslCertificate$DName;

    if-eqz v0, :cond_1c

    .line 887
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiSslCertificateDName()Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/net/http/SslCertificate$DName;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda10;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda10;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificateDName;->pigeon_newInstance(Landroid/net/http/SslCertificate$DName;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 892
    :cond_1c
    instance-of v0, p2, Landroid/net/http/SslCertificate;

    if-eqz v0, :cond_1d

    .line 893
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiSslCertificate()Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificate;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroid/net/http/SslCertificate;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda12;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda12;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiSslCertificate;->pigeon_newInstance(Landroid/net/http/SslCertificate;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 898
    :cond_1d
    instance-of v0, p2, Ljava/security/cert/Certificate;

    if-eqz v0, :cond_1e

    .line 899
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiCertificate()Lio/flutter/plugins/webviewflutter/PigeonApiCertificate;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Ljava/security/cert/Certificate;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda13;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda13;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiCertificate;->pigeon_newInstance(Ljava/security/cert/Certificate;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 904
    :cond_1e
    instance-of v0, p2, Landroidx/webkit/WebSettingsCompat;

    if-eqz v0, :cond_1f

    .line 905
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebSettingsCompat()Lio/flutter/plugins/webviewflutter/PigeonApiWebSettingsCompat;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroidx/webkit/WebSettingsCompat;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda15;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda15;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebSettingsCompat;->pigeon_newInstance(Landroidx/webkit/WebSettingsCompat;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 910
    :cond_1f
    instance-of v0, p2, Landroidx/webkit/WebViewFeature;

    if-eqz v0, :cond_20

    .line 911
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getPigeonApiWebViewFeature()Lio/flutter/plugins/webviewflutter/PigeonApiWebViewFeature;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Landroidx/webkit/WebViewFeature;

    new-instance v2, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda16;

    invoke-direct {v2, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec$$ExternalSyntheticLambda16;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/PigeonApiWebViewFeature;->pigeon_newInstance(Landroidx/webkit/WebViewFeature;Lkotlin/jvm/functions/Function1;)V

    .line 919
    :cond_20
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    const/16 v0, 0x80

    .line 920
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 921
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->registrar:Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;->getInstanceManager()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;

    move-result-object v0

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;->getIdentifierForStrongReference(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiBaseCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void

    .line 924
    :cond_21
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 925
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported value: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v1, "\' of type \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 924
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 713
    :cond_22
    :goto_1
    invoke-super {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonCodec;->writeValue(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method
