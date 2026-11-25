package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lio/flutter/plugins/imagepicker/MediaSelectionOptions;", "", "imageSelectionOptions", "Lio/flutter/plugins/imagepicker/ImageSelectionOptions;", "<init>", "(Lio/flutter/plugins/imagepicker/ImageSelectionOptions;)V", "getImageSelectionOptions", "()Lio/flutter/plugins/imagepicker/ImageSelectionOptions;", "toList", "", "equals", "", "other", "hashCode", "", "component1", "copy", "toString", "", "Companion", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MediaSelectionOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ImageSelectionOptions imageSelectionOptions;

    public static /* synthetic */ MediaSelectionOptions copy$default(MediaSelectionOptions mediaSelectionOptions, ImageSelectionOptions imageSelectionOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            imageSelectionOptions = mediaSelectionOptions.imageSelectionOptions;
        }
        return mediaSelectionOptions.copy(imageSelectionOptions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageSelectionOptions getImageSelectionOptions() {
        return this.imageSelectionOptions;
    }

    public final MediaSelectionOptions copy(ImageSelectionOptions imageSelectionOptions) {
        Intrinsics.checkNotNullParameter(imageSelectionOptions, "imageSelectionOptions");
        return new MediaSelectionOptions(imageSelectionOptions);
    }

    public String toString() {
        return "MediaSelectionOptions(imageSelectionOptions=" + this.imageSelectionOptions + ")";
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/imagepicker/MediaSelectionOptions$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/imagepicker/MediaSelectionOptions;", "pigeonVar_list", "", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MediaSelectionOptions fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
            return new MediaSelectionOptions((ImageSelectionOptions) obj);
        }
    }

    public MediaSelectionOptions(ImageSelectionOptions imageSelectionOptions) {
        Intrinsics.checkNotNullParameter(imageSelectionOptions, "imageSelectionOptions");
        this.imageSelectionOptions = imageSelectionOptions;
    }

    public final ImageSelectionOptions getImageSelectionOptions() {
        return this.imageSelectionOptions;
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.imageSelectionOptions);
    }

    public boolean equals(Object other) {
        if (other == null || !Intrinsics.areEqual(other.getClass(), getClass())) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(this.imageSelectionOptions, ((MediaSelectionOptions) other).imageSelectionOptions);
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.imageSelectionOptions);
    }
}
