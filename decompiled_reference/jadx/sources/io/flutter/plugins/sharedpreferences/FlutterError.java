package io.flutter.plugins.sharedpreferences;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Messages.g.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/sharedpreferences/FlutterError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", Constant.PARAM_ERROR_CODE, "", Constant.PARAM_ERROR_MESSAGE, "details", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getDetails", "()Ljava/lang/Object;", "shared_preferences_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FlutterError extends RuntimeException {
    private final String code;
    private final Object details;
    private final String message;

    public FlutterError(String code, String str, Object obj) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.message = str;
        this.details = obj;
    }

    public /* synthetic */ FlutterError(String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : obj);
    }

    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final Object getDetails() {
        return this.details;
    }
}
