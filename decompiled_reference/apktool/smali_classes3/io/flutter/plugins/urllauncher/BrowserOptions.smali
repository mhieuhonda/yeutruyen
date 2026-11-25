.class public final Lio/flutter/plugins/urllauncher/BrowserOptions;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/urllauncher/BrowserOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\u0014\u0010\n\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000c\u001a\u00020\rH\u0096\u0080\u0004J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/flutter/plugins/urllauncher/BrowserOptions;",
        "",
        "showTitle",
        "",
        "<init>",
        "(Z)V",
        "getShowTitle",
        "()Z",
        "toList",
        "",
        "equals",
        "other",
        "hashCode",
        "",
        "component1",
        "copy",
        "toString",
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
.field public static final Companion:Lio/flutter/plugins/urllauncher/BrowserOptions$Companion;


# instance fields
.field private final showTitle:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/urllauncher/BrowserOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/urllauncher/BrowserOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/urllauncher/BrowserOptions;->Companion:Lio/flutter/plugins/urllauncher/BrowserOptions$Companion;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    iput-boolean p1, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/urllauncher/BrowserOptions;ZILjava/lang/Object;)Lio/flutter/plugins/urllauncher/BrowserOptions;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    :cond_0
    invoke-virtual {p0, p1}, Lio/flutter/plugins/urllauncher/BrowserOptions;->copy(Z)Lio/flutter/plugins/urllauncher/BrowserOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    return v0
.end method

.method public final copy(Z)Lio/flutter/plugins/urllauncher/BrowserOptions;
    .locals 1

    new-instance v0, Lio/flutter/plugins/urllauncher/BrowserOptions;

    invoke-direct {v0, p1}, Lio/flutter/plugins/urllauncher/BrowserOptions;-><init>(Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_2

    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 271
    :cond_1
    check-cast p1, Lio/flutter/plugins/urllauncher/BrowserOptions;

    .line 272
    sget-object v0, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-boolean v1, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean p1, p1, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getShowTitle()Z
    .locals 1

    .line 249
    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 276
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 277
    sget-object v1, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-boolean v2, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 260
    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 259
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/BrowserOptions;->showTitle:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BrowserOptions(showTitle="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
