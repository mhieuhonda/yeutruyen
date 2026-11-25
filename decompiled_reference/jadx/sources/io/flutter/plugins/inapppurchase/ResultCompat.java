package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: ResultUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\nR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0013"}, d2 = {"Lio/flutter/plugins/inapppurchase/ResultCompat;", "T", "", Constant.PARAM_RESULT, "Lkotlin/Result;", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "exception", "", "isSuccess", "", "()Z", "isFailure", "getOrNull", "()Ljava/lang/Object;", "exceptionOrNull", "Companion", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ResultCompat<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Throwable exception;
    private final boolean isFailure;
    private final boolean isSuccess;
    private final Object result;
    private final T value;

    @JvmStatic
    public static final <T> Function1<Result<? extends T>, Unit> asCompatCallback(Function1<? super ResultCompat<T>, Unit> function1) {
        return INSTANCE.asCompatCallback(function1);
    }

    @JvmStatic
    public static final <T> void success(T t, Object obj) {
        INSTANCE.success(t, obj);
    }

    public ResultCompat(Object obj) {
        this.result = obj;
        this.value = Result.m416isFailureimpl(obj) ? null : (T) obj;
        this.exception = Result.m413exceptionOrNullimpl(obj);
        this.isSuccess = Result.m417isSuccessimpl(obj);
        this.isFailure = Result.m416isFailureimpl(obj);
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: renamed from: isFailure, reason: from getter */
    public final boolean getIsFailure() {
        return this.isFailure;
    }

    /* JADX INFO: compiled from: ResultUtils.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u0002H\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\tJ:\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\f\u0012\u0004\u0012\u00020\u00050\u000b\"\u0004\b\u0001\u0010\u00062\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000e\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;", "", "<init>", "()V", "success", "", "T", AppMeasurementSdk.ConditionalUserProperty.VALUE, "callback", "(Ljava/lang/Object;Ljava/lang/Object;)V", "asCompatCallback", "Lkotlin/Function1;", "Lkotlin/Result;", Constant.PARAM_RESULT, "Lio/flutter/plugins/inapppurchase/ResultCompat;", "in_app_purchase_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <T> void success(T value, Object callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Function1 function1 = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(callback, 1);
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(value)));
        }

        static final Unit asCompatCallback$lambda$0(Function1 function1, Result result) {
            function1.invoke(new ResultCompat(result.getValue()));
            return Unit.INSTANCE;
        }

        @JvmStatic
        public final <T> Function1<Result<? extends T>, Unit> asCompatCallback(final Function1<? super ResultCompat<T>, Unit> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Function1() { // from class: io.flutter.plugins.inapppurchase.ResultCompat$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ResultCompat.Companion.asCompatCallback$lambda$0(result, (Result) obj);
                }
            };
        }
    }

    public final T getOrNull() {
        return this.value;
    }

    /* JADX INFO: renamed from: exceptionOrNull, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }
}
