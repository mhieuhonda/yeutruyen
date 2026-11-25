package io.flutter.plugins.inapppurchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResultUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001d\u0010\u0003\u001a\u0019\u0012\u000f\u0012\r\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"completeWithError", "", "T", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "Lkotlin/jvm/JvmSuppressWildcards;", "failure", "", "in_app_purchase_android_release"}, k = 2, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ResultUtilsKt {
    public static final <T> void completeWithError(Function1<? super Result<T>, Unit> callback, Throwable failure) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(failure, "failure");
        Result.Companion companion = Result.INSTANCE;
        callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(failure))));
    }
}
