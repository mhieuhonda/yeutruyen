.class public interface abstract Lxyz/luan/audioplayers/player/PlayerWrapper;
.super Ljava/lang/Object;
.source "PlayerWrapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\tH&J\u0008\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H&J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0008\u0010\u001c\u001a\u00020\tH&J\u0008\u0010\u001d\u001a\u00020\tH&J\u0008\u0010\u001e\u001a\u00020\tH&\u00a8\u0006\u001f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lxyz/luan/audioplayers/player/PlayerWrapper;",
        "",
        "getDuration",
        "",
        "()Ljava/lang/Integer;",
        "getCurrentPosition",
        "isLiveStream",
        "",
        "start",
        "",
        "pause",
        "stop",
        "seekTo",
        "position",
        "setVolume",
        "leftVolume",
        "",
        "rightVolume",
        "setRate",
        "rate",
        "setLooping",
        "looping",
        "updateContext",
        "context",
        "Lxyz/luan/audioplayers/AudioContextAndroid;",
        "setSource",
        "source",
        "Lxyz/luan/audioplayers/source/Source;",
        "prepare",
        "release",
        "reset",
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


# virtual methods
.method public abstract getCurrentPosition()Ljava/lang/Integer;
.end method

.method public abstract getDuration()Ljava/lang/Integer;
.end method

.method public abstract isLiveStream()Z
.end method

.method public abstract pause()V
.end method

.method public abstract prepare()V
.end method

.method public abstract release()V
.end method

.method public abstract reset()V
.end method

.method public abstract seekTo(I)V
.end method

.method public abstract setLooping(Z)V
.end method

.method public abstract setRate(F)V
.end method

.method public abstract setSource(Lxyz/luan/audioplayers/source/Source;)V
.end method

.method public abstract setVolume(FF)V
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method

.method public abstract updateContext(Lxyz/luan/audioplayers/AudioContextAndroid;)V
.end method
