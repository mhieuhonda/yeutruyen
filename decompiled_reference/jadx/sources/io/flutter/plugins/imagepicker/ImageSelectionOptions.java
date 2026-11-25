package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J0\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lio/flutter/plugins/imagepicker/ImageSelectionOptions;", "", "maxWidth", "", "maxHeight", "quality", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;J)V", "getMaxWidth", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxHeight", "getQuality", "()J", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;J)Lio/flutter/plugins/imagepicker/ImageSelectionOptions;", "toString", "", "Companion", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ImageSelectionOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double maxHeight;
    private final Double maxWidth;
    private final long quality;

    public static /* synthetic */ ImageSelectionOptions copy$default(ImageSelectionOptions imageSelectionOptions, Double d, Double d2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            d = imageSelectionOptions.maxWidth;
        }
        if ((i & 2) != 0) {
            d2 = imageSelectionOptions.maxHeight;
        }
        if ((i & 4) != 0) {
            j = imageSelectionOptions.quality;
        }
        return imageSelectionOptions.copy(d, d2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getQuality() {
        return this.quality;
    }

    public final ImageSelectionOptions copy(Double maxWidth, Double maxHeight, long quality) {
        return new ImageSelectionOptions(maxWidth, maxHeight, quality);
    }

    public String toString() {
        return "ImageSelectionOptions(maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ", quality=" + this.quality + ")";
    }

    public ImageSelectionOptions(Double d, Double d2, long j) {
        this.maxWidth = d;
        this.maxHeight = d2;
        this.quality = j;
    }

    public /* synthetic */ ImageSelectionOptions(Double d, Double d2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, j);
    }

    public final Double getMaxWidth() {
        return this.maxWidth;
    }

    public final Double getMaxHeight() {
        return this.maxHeight;
    }

    public final long getQuality() {
        return this.quality;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/imagepicker/ImageSelectionOptions$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;", "pigeonVar_list", "", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImageSelectionOptions fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Double d = (Double) pigeonVar_list.get(0);
            Double d2 = (Double) pigeonVar_list.get(1);
            Object obj = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            return new ImageSelectionOptions(d, d2, ((Long) obj).longValue());
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.maxWidth, this.maxHeight, Long.valueOf(this.quality));
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            ImageSelectionOptions imageSelectionOptions = (ImageSelectionOptions) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.maxWidth, imageSelectionOptions.maxWidth) && MessagesPigeonUtils.INSTANCE.deepEquals(this.maxHeight, imageSelectionOptions.maxHeight) && MessagesPigeonUtils.INSTANCE.deepEquals(Long.valueOf(this.quality), Long.valueOf(imageSelectionOptions.quality))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.maxWidth)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.maxHeight)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Long.valueOf(this.quality));
    }
}
