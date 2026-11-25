package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/imagepicker/MessagesPigeonCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "<init>", "()V", "readValueOfType", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "buffer", "Ljava/nio/ByteBuffer;", "writeValue", "", "stream", "Ljava/io/ByteArrayOutputStream;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
class MessagesPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (type == -127) {
            Long l = (Long) readValue(buffer);
            if (l != null) {
                return SourceCamera.INSTANCE.ofRaw((int) l.longValue());
            }
            return null;
        }
        if (type == -126) {
            Long l2 = (Long) readValue(buffer);
            if (l2 != null) {
                return SourceType.INSTANCE.ofRaw((int) l2.longValue());
            }
            return null;
        }
        if (type == -125) {
            Long l3 = (Long) readValue(buffer);
            if (l3 != null) {
                return CacheRetrievalType.INSTANCE.ofRaw((int) l3.longValue());
            }
            return null;
        }
        if (type == -124) {
            Object value = readValue(buffer);
            List<? extends Object> list = value instanceof List ? (List) value : null;
            if (list != null) {
                return GeneralOptions.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -123) {
            Object value2 = readValue(buffer);
            List<? extends Object> list2 = value2 instanceof List ? (List) value2 : null;
            if (list2 != null) {
                return ImageSelectionOptions.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -122) {
            Object value3 = readValue(buffer);
            List<? extends Object> list3 = value3 instanceof List ? (List) value3 : null;
            if (list3 != null) {
                return MediaSelectionOptions.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -121) {
            Object value4 = readValue(buffer);
            List<? extends Object> list4 = value4 instanceof List ? (List) value4 : null;
            if (list4 != null) {
                return VideoSelectionOptions.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -120) {
            Object value5 = readValue(buffer);
            List<? extends Object> list5 = value5 instanceof List ? (List) value5 : null;
            if (list5 != null) {
                return SourceSpecification.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type == -119) {
            Object value6 = readValue(buffer);
            List<? extends Object> list6 = value6 instanceof List ? (List) value6 : null;
            if (list6 != null) {
                return CacheRetrievalError.INSTANCE.fromList(list6);
            }
            return null;
        }
        if (type == -118) {
            Object value7 = readValue(buffer);
            List<? extends Object> list7 = value7 instanceof List ? (List) value7 : null;
            if (list7 != null) {
                return CacheRetrievalResult.INSTANCE.fromList(list7);
            }
            return null;
        }
        return super.readValueOfType(type, buffer);
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    protected void writeValue(ByteArrayOutputStream stream, Object value) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (value instanceof SourceCamera) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((SourceCamera) value).getRaw()));
            return;
        }
        if (value instanceof SourceType) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((SourceType) value).getRaw()));
            return;
        }
        if (value instanceof CacheRetrievalType) {
            stream.write(131);
            writeValue(stream, Long.valueOf(((CacheRetrievalType) value).getRaw()));
            return;
        }
        if (value instanceof GeneralOptions) {
            stream.write(132);
            writeValue(stream, ((GeneralOptions) value).toList());
            return;
        }
        if (value instanceof ImageSelectionOptions) {
            stream.write(133);
            writeValue(stream, ((ImageSelectionOptions) value).toList());
            return;
        }
        if (value instanceof MediaSelectionOptions) {
            stream.write(134);
            writeValue(stream, ((MediaSelectionOptions) value).toList());
            return;
        }
        if (value instanceof VideoSelectionOptions) {
            stream.write(135);
            writeValue(stream, ((VideoSelectionOptions) value).toList());
            return;
        }
        if (value instanceof SourceSpecification) {
            stream.write(136);
            writeValue(stream, ((SourceSpecification) value).toList());
        } else if (value instanceof CacheRetrievalError) {
            stream.write(137);
            writeValue(stream, ((CacheRetrievalError) value).toList());
        } else if (value instanceof CacheRetrievalResult) {
            stream.write(138);
            writeValue(stream, ((CacheRetrievalResult) value).toList());
        } else {
            super.writeValue(stream, value);
        }
    }
}
