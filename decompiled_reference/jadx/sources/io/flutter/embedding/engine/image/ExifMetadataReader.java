package io.flutter.embedding.engine.image;

import androidx.exifinterface.media.ExifInterface;
import io.flutter.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class ExifMetadataReader {
    private static final String TAG = "ExifMetadataReader";

    ExifMetadataReader() {
    }

    static void read(byte[] bArr, Metadata metadata) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                metadata.orientation = new ExifInterface(byteArrayInputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e(TAG, "Failed to read EXIF metadata", e);
        }
    }
}
