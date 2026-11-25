package io.flutter.plugins.imagepicker;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lio/flutter/plugins/imagepicker/CacheRetrievalError;", "", Constant.PARAM_ERROR_CODE, "", Constant.PARAM_ERROR_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "toList", "", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CacheRetrievalError {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String message;

    public static /* synthetic */ CacheRetrievalError copy$default(CacheRetrievalError cacheRetrievalError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cacheRetrievalError.code;
        }
        if ((i & 2) != 0) {
            str2 = cacheRetrievalError.message;
        }
        return cacheRetrievalError.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final CacheRetrievalError copy(String code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new CacheRetrievalError(code, message);
    }

    public String toString() {
        return "CacheRetrievalError(code=" + this.code + ", message=" + this.message + ")";
    }

    /* JADX INFO: compiled from: Messages.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/imagepicker/CacheRetrievalError$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/imagepicker/CacheRetrievalError;", "pigeonVar_list", "", "image_picker_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CacheRetrievalError fromList(List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            Object obj = pigeonVar_list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            return new CacheRetrievalError((String) obj, (String) pigeonVar_list.get(1));
        }
    }

    public CacheRetrievalError(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.message = str;
    }

    public /* synthetic */ CacheRetrievalError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Object> toList() {
        return CollectionsKt.listOf((Object[]) new String[]{this.code, this.message});
    }

    public boolean equals(Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), getClass())) {
            if (this == other) {
                return true;
            }
            CacheRetrievalError cacheRetrievalError = (CacheRetrievalError) other;
            if (MessagesPigeonUtils.INSTANCE.deepEquals(this.code, cacheRetrievalError.code) && MessagesPigeonUtils.INSTANCE.deepEquals(this.message, cacheRetrievalError.message)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.code)) * 31) + MessagesPigeonUtils.INSTANCE.deepHash(this.message);
    }
}
