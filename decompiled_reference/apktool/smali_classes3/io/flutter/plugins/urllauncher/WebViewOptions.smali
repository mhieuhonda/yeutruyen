.class public final Lio/flutter/plugins/urllauncher/WebViewOptions;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J3\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\n\u0010\u0019\u001a\u00020\u0007H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/flutter/plugins/urllauncher/WebViewOptions;",
        "",
        "enableJavaScript",
        "",
        "enableDomStorage",
        "headers",
        "",
        "",
        "<init>",
        "(ZZLjava/util/Map;)V",
        "getEnableJavaScript",
        "()Z",
        "getEnableDomStorage",
        "getHeaders",
        "()Ljava/util/Map;",
        "toList",
        "",
        "equals",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "component3",
        "copy",
        "toString",
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
.field public static final Companion:Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;


# instance fields
.field private final enableDomStorage:Z

.field private final enableJavaScript:Z

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/urllauncher/WebViewOptions;->Companion:Lio/flutter/plugins/urllauncher/WebViewOptions$Companion;

    return-void
.end method

.method public constructor <init>(ZZLjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    iput-boolean p1, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    .line 200
    iput-boolean p2, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    .line 201
    iput-object p3, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/urllauncher/WebViewOptions;ZZLjava/util/Map;ILjava/lang/Object;)Lio/flutter/plugins/urllauncher/WebViewOptions;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/flutter/plugins/urllauncher/WebViewOptions;->copy(ZZLjava/util/Map;)Lio/flutter/plugins/urllauncher/WebViewOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    return v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(ZZLjava/util/Map;)Lio/flutter/plugins/urllauncher/WebViewOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/plugins/urllauncher/WebViewOptions;"
        }
    .end annotation

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/urllauncher/WebViewOptions;

    invoke-direct {v0, p1, p2, p3}, Lio/flutter/plugins/urllauncher/WebViewOptions;-><init>(ZZLjava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    .line 227
    :cond_1
    check-cast p1, Lio/flutter/plugins/urllauncher/WebViewOptions;

    .line 228
    sget-object v2, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-boolean v3, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v4, p1, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 229
    sget-object v2, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-boolean v3, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v4, p1, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 230
    sget-object v2, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    iget-object p1, p1, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getEnableDomStorage()Z
    .locals 1

    .line 200
    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    return v0
.end method

.method public final getEnableJavaScript()Z
    .locals 1

    .line 199
    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    return v0
.end method

.method public final getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 201
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 235
    sget-object v1, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-boolean v2, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 236
    sget-object v1, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-boolean v2, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 237
    sget-object v1, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/urllauncher/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 214
    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 215
    iget-boolean v1, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 216
    iget-object v2, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 213
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableJavaScript:Z

    iget-boolean v1, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->enableDomStorage:Z

    iget-object v2, p0, Lio/flutter/plugins/urllauncher/WebViewOptions;->headers:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "WebViewOptions(enableJavaScript="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", enableDomStorage="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
