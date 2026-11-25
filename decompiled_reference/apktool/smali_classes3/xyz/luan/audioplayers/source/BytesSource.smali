.class public final Lxyz/luan/audioplayers/source/BytesSource;
.super Ljava/lang/Object;
.source "BytesSource.kt"

# interfaces
.implements Lxyz/luan/audioplayers/source/Source;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001c"
    }
    d2 = {
        "Lxyz/luan/audioplayers/source/BytesSource;",
        "Lxyz/luan/audioplayers/source/Source;",
        "dataSource",
        "Lxyz/luan/audioplayers/source/ByteDataSource;",
        "<init>",
        "(Lxyz/luan/audioplayers/source/ByteDataSource;)V",
        "bytes",
        "",
        "([B)V",
        "getDataSource",
        "()Lxyz/luan/audioplayers/source/ByteDataSource;",
        "setForMediaPlayer",
        "",
        "mediaPlayer",
        "Landroid/media/MediaPlayer;",
        "setForSoundPool",
        "soundPoolPlayer",
        "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field private final dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;


# direct methods
.method public constructor <init>(Lxyz/luan/audioplayers/source/ByteDataSource;)V
    .locals 1

    const-string v0, "dataSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lxyz/luan/audioplayers/source/ByteDataSource;

    invoke-direct {v0, p1}, Lxyz/luan/audioplayers/source/ByteDataSource;-><init>([B)V

    invoke-direct {p0, v0}, Lxyz/luan/audioplayers/source/BytesSource;-><init>(Lxyz/luan/audioplayers/source/ByteDataSource;)V

    return-void
.end method

.method public static synthetic copy$default(Lxyz/luan/audioplayers/source/BytesSource;Lxyz/luan/audioplayers/source/ByteDataSource;ILjava/lang/Object;)Lxyz/luan/audioplayers/source/BytesSource;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    :cond_0
    invoke-virtual {p0, p1}, Lxyz/luan/audioplayers/source/BytesSource;->copy(Lxyz/luan/audioplayers/source/ByteDataSource;)Lxyz/luan/audioplayers/source/BytesSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lxyz/luan/audioplayers/source/ByteDataSource;
    .locals 1

    iget-object v0, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    return-object v0
.end method

.method public final copy(Lxyz/luan/audioplayers/source/ByteDataSource;)Lxyz/luan/audioplayers/source/BytesSource;
    .locals 1

    const-string v0, "dataSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxyz/luan/audioplayers/source/BytesSource;

    invoke-direct {v0, p1}, Lxyz/luan/audioplayers/source/BytesSource;-><init>(Lxyz/luan/audioplayers/source/ByteDataSource;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxyz/luan/audioplayers/source/BytesSource;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxyz/luan/audioplayers/source/BytesSource;

    iget-object v1, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    iget-object p1, p1, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getDataSource()Lxyz/luan/audioplayers/source/ByteDataSource;
    .locals 1

    .line 10
    iget-object v0, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    invoke-virtual {v0}, Lxyz/luan/audioplayers/source/ByteDataSource;->hashCode()I

    move-result v0

    return v0
.end method

.method public setForMediaPlayer(Landroid/media/MediaPlayer;)V
    .locals 1

    const-string v0, "mediaPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    check-cast v0, Landroid/media/MediaDataSource;

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDataSource(Landroid/media/MediaDataSource;)V

    return-void
.end method

.method public setForSoundPool(Lxyz/luan/audioplayers/player/SoundPoolPlayer;)V
    .locals 1

    const-string v0, "soundPoolPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    const-string v0, "Bytes sources are not supported on LOW_LATENCY mode yet."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lxyz/luan/audioplayers/source/BytesSource;->dataSource:Lxyz/luan/audioplayers/source/ByteDataSource;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BytesSource(dataSource="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
