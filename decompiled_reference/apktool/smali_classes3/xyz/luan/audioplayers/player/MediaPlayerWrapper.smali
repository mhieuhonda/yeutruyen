.class public final Lxyz/luan/audioplayers/player/MediaPlayerWrapper;
.super Ljava/lang/Object;
.source "MediaPlayerWrapper.kt"

# interfaces
.implements Lxyz/luan/audioplayers/player/PlayerWrapper;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMediaPlayerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerWrapper.kt\nxyz/luan/audioplayers/player/MediaPlayerWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\r\u0010\u000c\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u000eH\u0016J\u0008\u0010\u001b\u001a\u00020\u000eH\u0016J\u0008\u0010\u001c\u001a\u00020\u000eH\u0016J\u0008\u0010\u001d\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\u0008\u0010#\u001a\u00020\u000eH\u0016J\u0008\u0010$\u001a\u00020\u000eH\u0016J\u0008\u0010%\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lxyz/luan/audioplayers/player/MediaPlayerWrapper;",
        "Lxyz/luan/audioplayers/player/PlayerWrapper;",
        "wrappedPlayer",
        "Lxyz/luan/audioplayers/player/WrappedPlayer;",
        "<init>",
        "(Lxyz/luan/audioplayers/player/WrappedPlayer;)V",
        "mediaPlayer",
        "Landroid/media/MediaPlayer;",
        "createMediaPlayer",
        "getDuration",
        "",
        "()Ljava/lang/Integer;",
        "getCurrentPosition",
        "setVolume",
        "",
        "leftVolume",
        "",
        "rightVolume",
        "setRate",
        "rate",
        "setSource",
        "source",
        "Lxyz/luan/audioplayers/source/Source;",
        "setLooping",
        "looping",
        "",
        "start",
        "pause",
        "stop",
        "release",
        "seekTo",
        "position",
        "updateContext",
        "context",
        "Lxyz/luan/audioplayers/AudioContextAndroid;",
        "prepare",
        "reset",
        "isLiveStream",
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
.field private final mediaPlayer:Landroid/media/MediaPlayer;

.field private final wrappedPlayer:Lxyz/luan/audioplayers/player/WrappedPlayer;


# direct methods
.method public static synthetic $r8$lambda$4UBHbnVDMex0FJ5T9oMfxuCJaDE(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->createMediaPlayer$lambda$0$0(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic $r8$lambda$4kAyQz1yfyNjYMO1cpke2K-es_k(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->createMediaPlayer$lambda$0$4(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$Kyedz2SlqLsQz0FZDA3XmZVZMHc(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->createMediaPlayer$lambda$0$2(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic $r8$lambda$VOxspFtIcABajGupC5X4ld0y9V4(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->createMediaPlayer$lambda$0$3(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$xbeSHHpOJzD8jX_6RbGK8hRISxE(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->createMediaPlayer$lambda$0$1(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public constructor <init>(Lxyz/luan/audioplayers/player/WrappedPlayer;)V
    .locals 1

    const-string v0, "wrappedPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->wrappedPlayer:Lxyz/luan/audioplayers/player/WrappedPlayer;

    .line 12
    invoke-direct {p0, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->createMediaPlayer(Lxyz/luan/audioplayers/player/WrappedPlayer;)Landroid/media/MediaPlayer;

    move-result-object p1

    iput-object p1, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    return-void
.end method

.method private final createMediaPlayer(Lxyz/luan/audioplayers/player/WrappedPlayer;)Landroid/media/MediaPlayer;
    .locals 2

    .line 15
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 16
    new-instance v1, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda0;-><init>(Lxyz/luan/audioplayers/player/WrappedPlayer;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 17
    new-instance v1, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda1;

    invoke-direct {v1, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda1;-><init>(Lxyz/luan/audioplayers/player/WrappedPlayer;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 18
    new-instance v1, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda2;

    invoke-direct {v1, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda2;-><init>(Lxyz/luan/audioplayers/player/WrappedPlayer;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 19
    new-instance v1, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda3;

    invoke-direct {v1, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda3;-><init>(Lxyz/luan/audioplayers/player/WrappedPlayer;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 20
    new-instance v1, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda4;

    invoke-direct {v1, p1}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper$$ExternalSyntheticLambda4;-><init>(Lxyz/luan/audioplayers/player/WrappedPlayer;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 22
    invoke-virtual {p1}, Lxyz/luan/audioplayers/player/WrappedPlayer;->getContext()Lxyz/luan/audioplayers/AudioContextAndroid;

    move-result-object p1

    invoke-virtual {p1, v0}, Lxyz/luan/audioplayers/AudioContextAndroid;->setAttributesOnPlayer(Landroid/media/MediaPlayer;)V

    return-object v0
.end method

.method private static final createMediaPlayer$lambda$0$0(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 16
    invoke-virtual {p0}, Lxyz/luan/audioplayers/player/WrappedPlayer;->onPrepared()V

    return-void
.end method

.method private static final createMediaPlayer$lambda$0$1(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 17
    invoke-virtual {p0}, Lxyz/luan/audioplayers/player/WrappedPlayer;->onCompletion()V

    return-void
.end method

.method private static final createMediaPlayer$lambda$0$2(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 18
    invoke-virtual {p0}, Lxyz/luan/audioplayers/player/WrappedPlayer;->onSeekComplete()V

    return-void
.end method

.method private static final createMediaPlayer$lambda$0$3(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 19
    invoke-virtual {p0, p2, p3}, Lxyz/luan/audioplayers/player/WrappedPlayer;->onError(II)Z

    move-result p0

    return p0
.end method

.method private static final createMediaPlayer$lambda$0$4(Lxyz/luan/audioplayers/player/WrappedPlayer;Landroid/media/MediaPlayer;I)V
    .locals 0

    .line 20
    invoke-virtual {p0, p2}, Lxyz/luan/audioplayers/player/WrappedPlayer;->onBuffering(I)V

    return-void
.end method


# virtual methods
.method public getCurrentPosition()Ljava/lang/Integer;
    .locals 1

    .line 32
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getDuration()Ljava/lang/Integer;
    .locals 3

    .line 28
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public isLiveStream()Z
    .locals 1

    .line 96
    invoke-virtual {p0}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->getDuration()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 97
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public pause()V
    .locals 1

    .line 64
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    return-void
.end method

.method public prepare()V
    .locals 1

    .line 88
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    return-void
.end method

.method public release()V
    .locals 1

    .line 72
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 73
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    return-void
.end method

.method public reset()V
    .locals 1

    .line 92
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    return-void
.end method

.method public seekTo(I)V
    .locals 1

    .line 77
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void
.end method

.method public setLooping(Z)V
    .locals 1

    .line 55
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    return-void
.end method

.method public setRate(F)V
    .locals 2

    .line 41
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V

    return-void
.end method

.method public setSource(Lxyz/luan/audioplayers/source/Source;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->reset()V

    .line 51
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-interface {p1, v0}, Lxyz/luan/audioplayers/source/Source;->setForMediaPlayer(Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public setVolume(FF)V
    .locals 1

    .line 36
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    return-void
.end method

.method public start()V
    .locals 1

    .line 60
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->wrappedPlayer:Lxyz/luan/audioplayers/player/WrappedPlayer;

    invoke-virtual {v0}, Lxyz/luan/audioplayers/player/WrappedPlayer;->getRate()F

    move-result v0

    invoke-virtual {p0, v0}, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->setRate(F)V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 68
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    return-void
.end method

.method public updateContext(Lxyz/luan/audioplayers/AudioContextAndroid;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, v0}, Lxyz/luan/audioplayers/AudioContextAndroid;->setAttributesOnPlayer(Landroid/media/MediaPlayer;)V

    .line 82
    invoke-virtual {p1}, Lxyz/luan/audioplayers/AudioContextAndroid;->getStayAwake()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 83
    iget-object p1, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->mediaPlayer:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lxyz/luan/audioplayers/player/MediaPlayerWrapper;->wrappedPlayer:Lxyz/luan/audioplayers/player/WrappedPlayer;

    invoke-virtual {v0}, Lxyz/luan/audioplayers/player/WrappedPlayer;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaPlayer;->setWakeMode(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
