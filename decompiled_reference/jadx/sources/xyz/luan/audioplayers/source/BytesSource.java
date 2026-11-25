package xyz.luan.audioplayers.source;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xyz.luan.audioplayers.player.SoundPoolPlayer;

/* JADX INFO: compiled from: BytesSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lxyz/luan/audioplayers/source/BytesSource;", "Lxyz/luan/audioplayers/source/Source;", "dataSource", "Lxyz/luan/audioplayers/source/ByteDataSource;", "<init>", "(Lxyz/luan/audioplayers/source/ByteDataSource;)V", "bytes", "", "([B)V", "getDataSource", "()Lxyz/luan/audioplayers/source/ByteDataSource;", "setForMediaPlayer", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "setForSoundPool", "soundPoolPlayer", "Lxyz/luan/audioplayers/player/SoundPoolPlayer;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BytesSource implements Source {
    private final ByteDataSource dataSource;

    public static /* synthetic */ BytesSource copy$default(BytesSource bytesSource, ByteDataSource byteDataSource, int i, Object obj) {
        if ((i & 1) != 0) {
            byteDataSource = bytesSource.dataSource;
        }
        return bytesSource.copy(byteDataSource);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteDataSource getDataSource() {
        return this.dataSource;
    }

    public final BytesSource copy(ByteDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return new BytesSource(dataSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BytesSource) && Intrinsics.areEqual(this.dataSource, ((BytesSource) other).dataSource);
    }

    public int hashCode() {
        return this.dataSource.hashCode();
    }

    public String toString() {
        return "BytesSource(dataSource=" + this.dataSource + ")";
    }

    public BytesSource(ByteDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    public final ByteDataSource getDataSource() {
        return this.dataSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BytesSource(byte[] bytes) {
        this(new ByteDataSource(bytes));
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    @Override // xyz.luan.audioplayers.source.Source
    public void setForMediaPlayer(MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.dataSource);
    }

    @Override // xyz.luan.audioplayers.source.Source
    public void setForSoundPool(SoundPoolPlayer soundPoolPlayer) {
        Intrinsics.checkNotNullParameter(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.".toString());
    }
}
