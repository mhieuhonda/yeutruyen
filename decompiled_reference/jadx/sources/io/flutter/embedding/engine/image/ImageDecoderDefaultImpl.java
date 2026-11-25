package io.flutter.embedding.engine.image;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.Size;
import io.flutter.Log;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
class ImageDecoderDefaultImpl implements ImageDecoder {
    private static final String TAG = "FlutterImageDecoderImplDefault";
    private final FlutterImageDecoder.HeaderListener listener;

    public ImageDecoderDefaultImpl(FlutterImageDecoder.HeaderListener headerListener) {
        this.listener = headerListener;
    }

    @Override // io.flutter.embedding.engine.image.ImageDecoder
    public Bitmap decodeImage(ByteBuffer byteBuffer, Metadata metadata) {
        try {
            return android.graphics.ImageDecoder.decodeBitmap(android.graphics.ImageDecoder.createSource(byteBuffer), new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.image.ImageDecoderDefaultImpl$$ExternalSyntheticLambda0
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                    this.f$0.m324x9b976ca1(imageDecoder, imageInfo, source);
                }
            });
        } catch (IOException e) {
            Log.e(TAG, "Failed to decode image", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: lambda$decodeImage$0$io-flutter-embedding-engine-image-ImageDecoderDefaultImpl, reason: not valid java name */
    /* synthetic */ void m324x9b976ca1(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        if (this.listener != null) {
            Size size = imageInfo.getSize();
            this.listener.onImageHeader(size.getWidth(), size.getHeight());
        }
    }
}
