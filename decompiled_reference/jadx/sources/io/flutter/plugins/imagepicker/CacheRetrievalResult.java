package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\n\u0010\u001b\u001a\u00020\bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lio/flutter/plugins/imagepicker/CacheRetrievalResult;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/flutter/plugins/imagepicker/CacheRetrievalType;", Constant.PARAM_ERROR, "Lio/flutter/plugins/imagepicker/CacheRetrievalError;", "paths", "", "", "<init>", "(Lio/flutter/plugins/imagepicker/CacheRetrievalType;Lio/flutter/plugins/imagepicker/CacheRetrievalError;Ljava/util/List;)V", "getType", "()Lio/flutter/plugins/imagepicker/CacheRetrievalType;", "getError", "()Lio/flutter/plugins/imagepicker/CacheRetrievalError;", "getPaths", "()Ljava/util/List;", "toList", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CacheRetrievalResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CacheRetrievalError error;
    private final List<String> paths;
    private final CacheRetrievalType type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CacheRetrievalResult copy$default(CacheRetrievalResult cacheRetrievalResult, CacheRetrievalType cacheRetrievalType, CacheRetrievalError cacheRetrievalError, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheRetrievalType = cacheRetrievalResult.type;
        }
        if ((i & 2) != 0) {
            cacheRetrievalError = cacheRetrievalResult.error;
        }
        if ((i & 4) != 0) {
            list = cacheRetrievalResult.paths;
        }
        return cacheRetrievalResult.copy(cacheRetrievalType, cacheRetrievalError, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CacheRetrievalType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CacheRetrievalError getError() {
        return this.error;
    }

    public final List<String> component3() {
        return this.paths;
    }

    public final CacheRetrievalResult copy(CacheRetrievalType type, CacheRetrievalError error, List<String> paths) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paths, "paths");
        return new CacheRetrievalResult(type, error, paths);
    }

    public String toString() {
        return "CacheRetrievalResult(type=" + this.type + ", error=" + this.error + ", paths=" + this.paths + ")";
    }

    public CacheRetrievalResult(CacheRetrievalType type, CacheRetrievalError cacheRetrievalError, List<String> paths) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.type = type;
        this.error = cacheRetrievalError;
        this.paths = paths;
    }

    public /* synthetic */ CacheRetrievalResult(CacheRetrievalType cacheRetrievalType, CacheRetrievalError cacheRetrievalError, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cacheRetrievalType, (i & 2) != 0 ? null : cacheRetrievalError, list);
    }

    public final CacheRetrievalType getType() {
        return this.type;
    }

    public final CacheRetrievalError getError() {
        return this.error;
    }

    public final List<String> getPaths() {
        return this.paths;
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/imagepicker/CacheRetrievalResult$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/imagepicker/CacheRetrievalResult;", "pigeonVar_list", "", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CacheRetrievalResult fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.CacheRetrievalType");
            CacheRetrievalError cacheRetrievalError = (CacheRetrievalError) pigeonVar_list.get(1);
            Object obj2 = pigeonVar_list.get(2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new CacheRetrievalResult((CacheRetrievalType) obj, cacheRetrievalError, (List) obj2);
        }
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf(this.type, this.error, this.paths);
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            CacheRetrievalResult cacheRetrievalResult = (CacheRetrievalResult) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.type, cacheRetrievalResult.type) && MessagesPigeonUtils.INSTANCE.deepEquals(this.error, cacheRetrievalResult.error) && MessagesPigeonUtils.INSTANCE.deepEquals(this.paths, cacheRetrievalResult.paths)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.type)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.error)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.paths);
    }
}
