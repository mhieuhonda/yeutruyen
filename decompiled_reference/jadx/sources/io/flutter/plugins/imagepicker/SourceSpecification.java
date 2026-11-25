package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lio/flutter/plugins/imagepicker/SourceSpecification;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/flutter/plugins/imagepicker/SourceType;", "camera", "Lio/flutter/plugins/imagepicker/SourceCamera;", "<init>", "(Lio/flutter/plugins/imagepicker/SourceType;Lio/flutter/plugins/imagepicker/SourceCamera;)V", "getType", "()Lio/flutter/plugins/imagepicker/SourceType;", "getCamera", "()Lio/flutter/plugins/imagepicker/SourceCamera;", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "Companion", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SourceSpecification {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SourceCamera camera;
    private final SourceType type;

    public static /* synthetic */ SourceSpecification copy$default(SourceSpecification sourceSpecification, SourceType sourceType, SourceCamera sourceCamera, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceType = sourceSpecification.type;
        }
        if ((i & 2) != 0) {
            sourceCamera = sourceSpecification.camera;
        }
        return sourceSpecification.copy(sourceType, sourceCamera);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SourceType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SourceCamera getCamera() {
        return this.camera;
    }

    public final SourceSpecification copy(SourceType type, SourceCamera camera) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new SourceSpecification(type, camera);
    }

    public String toString() {
        return "SourceSpecification(type=" + this.type + ", camera=" + this.camera + ")";
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/imagepicker/SourceSpecification$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/imagepicker/SourceSpecification;", "pigeonVar_list", "", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SourceSpecification fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceType");
            return new SourceSpecification((SourceType) obj, (SourceCamera) pigeonVar_list.get(1));
        }
    }

    public SourceSpecification(SourceType type, SourceCamera sourceCamera) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.camera = sourceCamera;
    }

    public /* synthetic */ SourceSpecification(SourceType sourceType, SourceCamera sourceCamera, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sourceType, (i & 2) != 0 ? null : sourceCamera);
    }

    public final SourceCamera getCamera() {
        return this.camera;
    }

    public final SourceType getType() {
        return this.type;
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf((Object[]) new Enum[]{this.type, this.camera});
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            SourceSpecification sourceSpecification = (SourceSpecification) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.type, sourceSpecification.type) && MessagesPigeonUtils.INSTANCE.deepEquals(this.camera, sourceSpecification.camera)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.type)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.camera);
    }
}
