package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lio/flutter/plugins/imagepicker/GeneralOptions;", "", "allowMultiple", "", "usePhotoPicker", "limit", "", "<init>", "(ZZLjava/lang/Long;)V", "getAllowMultiple", "()Z", "getUsePhotoPicker", "getLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "toList", "", "equals", "other", "hashCode", "", "component1", "component2", "component3", "copy", "(ZZLjava/lang/Long;)Lio/flutter/plugins/imagepicker/GeneralOptions;", "toString", "", "Companion", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class GeneralOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean allowMultiple;
    private final Long limit;
    private final boolean usePhotoPicker;

    public static /* synthetic */ GeneralOptions copy$default(GeneralOptions generalOptions, boolean z, boolean z2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = generalOptions.allowMultiple;
        }
        if ((i & 2) != 0) {
            z2 = generalOptions.usePhotoPicker;
        }
        if ((i & 4) != 0) {
            l = generalOptions.limit;
        }
        return generalOptions.copy(z, z2, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUsePhotoPicker() {
        return this.usePhotoPicker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getLimit() {
        return this.limit;
    }

    public final GeneralOptions copy(boolean allowMultiple, boolean usePhotoPicker, Long limit) {
        return new GeneralOptions(allowMultiple, usePhotoPicker, limit);
    }

    public String toString() {
        return "GeneralOptions(allowMultiple=" + this.allowMultiple + ", usePhotoPicker=" + this.usePhotoPicker + ", limit=" + this.limit + ")";
    }

    public GeneralOptions(boolean z, boolean z2, Long l) {
        this.allowMultiple = z;
        this.usePhotoPicker = z2;
        this.limit = l;
    }

    public /* synthetic */ GeneralOptions(boolean z, boolean z2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? null : l);
    }

    public final boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    public final boolean getUsePhotoPicker() {
        return this.usePhotoPicker;
    }

    public final Long getLimit() {
        return this.limit;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/imagepicker/GeneralOptions;", "pigeonVar_list", "", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GeneralOptions fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new GeneralOptions(zBooleanValue, ((Boolean) obj2).booleanValue(), (Long) pigeonVar_list.get(2));
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(Boolean.valueOf(this.allowMultiple), Boolean.valueOf(this.usePhotoPicker), this.limit);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            GeneralOptions generalOptions = (GeneralOptions) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.allowMultiple), Boolean.valueOf(generalOptions.allowMultiple)) && MessagesPigeonUtils.INSTANCE.deepEquals(Boolean.valueOf(this.usePhotoPicker), Boolean.valueOf(generalOptions.usePhotoPicker)) && MessagesPigeonUtils.INSTANCE.deepEquals(this.limit, generalOptions.limit)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.allowMultiple))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(Boolean.valueOf(this.usePhotoPicker))) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.limit);
    }
}
