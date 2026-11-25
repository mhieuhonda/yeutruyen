package xyz.luan.audioplayers.source;

import android.media.MediaDataSource;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ByteDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lxyz/luan/audioplayers/source/ByteDataSource;", "Landroid/media/MediaDataSource;", Constant.PARAM_ERROR_DATA, "", "<init>", "([B)V", "getSize", "", "close", "", "readAt", "", "position", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, "size", "computeRemainingSize", "audioplayers_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ByteDataSource extends MediaDataSource {
    private final byte[] data;

    public ByteDataSource(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @Override // android.media.MediaDataSource
    public synchronized long getSize() {
        return this.data.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public synchronized int readAt(long position, byte[] buffer, int offset, int size) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (position >= this.data.length) {
            return -1;
        }
        int iComputeRemainingSize = computeRemainingSize(size, position);
        System.arraycopy(this.data, (int) position, buffer, offset, iComputeRemainingSize);
        return iComputeRemainingSize;
    }

    private final int computeRemainingSize(int size, long position) {
        long length = size;
        long j = position + length;
        byte[] bArr = this.data;
        if (j > bArr.length) {
            length -= j - ((long) bArr.length);
        }
        return (int) length;
    }
}
