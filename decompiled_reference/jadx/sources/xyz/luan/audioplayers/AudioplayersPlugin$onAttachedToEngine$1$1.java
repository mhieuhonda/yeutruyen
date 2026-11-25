package xyz.luan.audioplayers;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* synthetic */ class AudioplayersPlugin$onAttachedToEngine$1$1 extends FunctionReferenceImpl implements Function2<MethodCall, MethodChannel.Result, Unit> {
    AudioplayersPlugin$onAttachedToEngine$1$1(Object obj) {
        super(2, obj, AudioplayersPlugin.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(MethodCall methodCall, MethodChannel.Result result) {
        invoke2(methodCall, result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MethodCall p0, MethodChannel.Result p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((AudioplayersPlugin) this.receiver).methodHandler(p0, p1);
    }
}
