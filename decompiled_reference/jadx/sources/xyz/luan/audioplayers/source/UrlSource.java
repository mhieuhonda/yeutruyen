package xyz.luan.audioplayers.source;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xyz.luan.audioplayers.player.SoundPoolPlayer;

/* JADX INFO: compiled from: UrlSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006!"}, d2 = {"Lxyz/luan/audioplayers/source/UrlSource;", "Lxyz/luan/audioplayers/source/Source;", ImagesContract.URL, "", "isLocal", "", "<init>", "(Ljava/lang/String;Z)V", "getUrl", "()Ljava/lang/String;", "()Z", "setForMediaPlayer", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "setForSoundPool", "soundPoolPlayer", "Lxyz/luan/audioplayers/player/SoundPoolPlayer;", "getAudioPathForSoundPool", "loadTempFileFromNetwork", "Ljava/io/File;", "downloadUrl", "", "Ljava/net/URL;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class UrlSource implements Source {
    private final boolean isLocal;
    private final String url;

    public static /* synthetic */ UrlSource copy$default(UrlSource urlSource, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlSource.url;
        }
        if ((i & 2) != 0) {
            z = urlSource.isLocal;
        }
        return urlSource.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    public final UrlSource copy(String url, boolean isLocal) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new UrlSource(url, isLocal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlSource)) {
            return false;
        }
        UrlSource urlSource = (UrlSource) other;
        return Intrinsics.areEqual(this.url, urlSource.url) && this.isLocal == urlSource.isLocal;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + Boolean.hashCode(this.isLocal);
    }

    public String toString() {
        return "UrlSource(url=" + this.url + ", isLocal=" + this.isLocal + ")";
    }

    public UrlSource(String url, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.isLocal = z;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    @Override // xyz.luan.audioplayers.source.Source
    public void setForMediaPlayer(MediaPlayer mediaPlayer) throws IOException {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.url);
    }

    @Override // xyz.luan.audioplayers.source.Source
    public void setForSoundPool(SoundPoolPlayer soundPoolPlayer) {
        Intrinsics.checkNotNullParameter(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.setUrlSource(this);
    }

    public final String getAudioPathForSoundPool() {
        if (this.isLocal) {
            return StringsKt.removePrefix(this.url, (CharSequence) "file://");
        }
        String absolutePath = loadTempFileFromNetwork().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    private final File loadTempFileFromNetwork() throws IOException {
        URL url = URI.create(this.url).toURL();
        Intrinsics.checkNotNullExpressionValue(url, "toURL(...)");
        byte[] bArrDownloadUrl = downloadUrl(url);
        File fileCreateTempFile = File.createTempFile("sound", "");
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            fileOutputStream.write(bArrDownloadUrl);
            fileCreateTempFile.deleteOnExit();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            Intrinsics.checkNotNull(fileCreateTempFile);
            return fileCreateTempFile;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    private final byte[] downloadUrl(URL url) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpenStream = url.openStream();
        try {
            InputStream inputStream = inputStreamOpenStream;
            byte[] bArr = new byte[4096];
            while (true) {
                Integer numValueOf = Integer.valueOf(inputStream.read(bArr));
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    byteArrayOutputStream.write(bArr, 0, numValueOf.intValue());
                } else {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStreamOpenStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStreamOpenStream, th);
                throw th2;
            }
        }
    }
}
