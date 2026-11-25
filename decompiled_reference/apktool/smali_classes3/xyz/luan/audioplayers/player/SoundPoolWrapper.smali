.class public final Lxyz/luan/audioplayers/player/SoundPoolWrapper;
.super Ljava/lang/Object;
.source "SoundPoolPlayer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00100\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\r\u00a8\u0006\u0014"
    }
    d2 = {
        "Lxyz/luan/audioplayers/player/SoundPoolWrapper;",
        "",
        "soundPool",
        "Landroid/media/SoundPool;",
        "<init>",
        "(Landroid/media/SoundPool;)V",
        "getSoundPool",
        "()Landroid/media/SoundPool;",
        "soundIdToPlayer",
        "",
        "",
        "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
        "getSoundIdToPlayer",
        "()Ljava/util/Map;",
        "urlToPlayers",
        "Lxyz/luan/audioplayers/source/UrlSource;",
        "",
        "getUrlToPlayers",
        "dispose",
        "",
        "audioplayers_android_release"
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
.field private final soundIdToPlayer:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
            ">;"
        }
    .end annotation
.end field

.field private final soundPool:Landroid/media/SoundPool;

.field private final urlToPlayers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lxyz/luan/audioplayers/source/UrlSource;",
            "Ljava/util/List<",
            "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/media/SoundPool;)V
    .locals 1

    const-string v0, "soundPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->soundPool:Landroid/media/SoundPool;

    .line 293
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "synchronizedMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->soundIdToPlayer:Ljava/util/Map;

    .line 300
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->urlToPlayers:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    .line 303
    iget-object v0, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->soundPool:Landroid/media/SoundPool;

    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 304
    iget-object v0, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->soundIdToPlayer:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 305
    iget-object v0, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->urlToPlayers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final getSoundIdToPlayer()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
            ">;"
        }
    .end annotation

    .line 293
    iget-object v0, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->soundIdToPlayer:Ljava/util/Map;

    return-object v0
.end method

.method public final getSoundPool()Landroid/media/SoundPool;
    .locals 1

    .line 288
    iget-object v0, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->soundPool:Landroid/media/SoundPool;

    return-object v0
.end method

.method public final getUrlToPlayers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lxyz/luan/audioplayers/source/UrlSource;",
            "Ljava/util/List<",
            "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
            ">;>;"
        }
    .end annotation

    .line 299
    iget-object v0, p0, Lxyz/luan/audioplayers/player/SoundPoolWrapper;->urlToPlayers:Ljava/util/Map;

    return-object v0
.end method
