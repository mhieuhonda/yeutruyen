.class public interface abstract Lio/flutter/plugins/urllauncher/UrlLauncherApi;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/urllauncher/UrlLauncherApi$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\t\u001a\u00020\u0003H&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0008\u0010\u0010\u001a\u00020\u0003H&J\u0008\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/flutter/plugins/urllauncher/UrlLauncherApi;",
        "",
        "canLaunchUrl",
        "",
        "url",
        "",
        "launchUrl",
        "headers",
        "",
        "requireNonBrowser",
        "openUrlInApp",
        "allowCustomTab",
        "webViewOptions",
        "Lio/flutter/plugins/urllauncher/WebViewOptions;",
        "browserOptions",
        "Lio/flutter/plugins/urllauncher/BrowserOptions;",
        "supportsCustomTabs",
        "closeWebView",
        "",
        "Companion",
        "url_launcher_android_release"
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
.field public static final Companion:Lio/flutter/plugins/urllauncher/UrlLauncherApi$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/flutter/plugins/urllauncher/UrlLauncherApi$Companion;->$$INSTANCE:Lio/flutter/plugins/urllauncher/UrlLauncherApi$Companion;

    sput-object v0, Lio/flutter/plugins/urllauncher/UrlLauncherApi;->Companion:Lio/flutter/plugins/urllauncher/UrlLauncherApi$Companion;

    return-void
.end method


# virtual methods
.method public abstract canLaunchUrl(Ljava/lang/String;)Z
.end method

.method public abstract closeWebView()V
.end method

.method public abstract launchUrl(Ljava/lang/String;Ljava/util/Map;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract openUrlInApp(Ljava/lang/String;ZLio/flutter/plugins/urllauncher/WebViewOptions;Lio/flutter/plugins/urllauncher/BrowserOptions;)Z
.end method

.method public abstract supportsCustomTabs()Z
.end method
