.class Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;
.super Ljava/lang/Object;
.source "FlutterRequestAgentProvider.java"


# static fields
.field static final GAME_VERSION_KEY:Ljava/lang/String; = "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION"

.field static final NEWS_VERSION_KEY:Ljava/lang/String; = "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION"


# instance fields
.field private gameTemplateVersion:Ljava/lang/String;

.field private newsTemplateVersion:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->processGameAndNewsTemplateVersions(Landroid/content/Context;)V

    return-void
.end method

.method private processGameAndNewsTemplateVersions(Landroid/content/Context;)V
    .locals 3

    .line 29
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v1, 0x80

    .line 36
    invoke-static {v1, v2}, Landroid/content/pm/PackageManager$ApplicationInfoFlags;->of(J)Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    move-result-object v1

    .line 34
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 44
    :goto_0
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->gameTemplateVersion:Ljava/lang/String;

    .line 47
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->newsTemplateVersion:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method


# virtual methods
.method getRequestAgent()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Flutter-GMA-9.0.0"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->newsTemplateVersion:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 58
    const-string v1, "_News-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->newsTemplateVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->gameTemplateVersion:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 64
    const-string v1, "_Game-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;->gameTemplateVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
