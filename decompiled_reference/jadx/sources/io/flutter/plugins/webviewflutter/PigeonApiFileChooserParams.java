package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidWebkitLibrary.g.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0017\u0012\u0004\u0012\u00020\u00130\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/flutter/plugins/webviewflutter/PigeonApiFileChooserParams;", "", "pigeonRegistrar", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;)V", "getPigeonRegistrar", "()Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonProxyApiRegistrar;", "isCaptureEnabled", "", "pigeon_instance", "Landroid/webkit/WebChromeClient$FileChooserParams;", "acceptTypes", "", "", "mode", "Lio/flutter/plugins/webviewflutter/FileChooserMode;", "filenameHint", "pigeon_newInstance", "", "pigeon_instanceArg", "callback", "Lkotlin/Function1;", "Lkotlin/Result;", "webview_flutter_android_release"}, k = 1, mv = {2, 3, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class PigeonApiFileChooserParams {
    private final AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar;

    public abstract List<String> acceptTypes(WebChromeClient.FileChooserParams pigeon_instance);

    public abstract String filenameHint(WebChromeClient.FileChooserParams pigeon_instance);

    public abstract boolean isCaptureEnabled(WebChromeClient.FileChooserParams pigeon_instance);

    public abstract FileChooserMode mode(WebChromeClient.FileChooserParams pigeon_instance);

    public PigeonApiFileChooserParams(AndroidWebkitLibraryPigeonProxyApiRegistrar pigeonRegistrar) {
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        this.pigeonRegistrar = pigeonRegistrar;
    }

    public AndroidWebkitLibraryPigeonProxyApiRegistrar getPigeonRegistrar() {
        return this.pigeonRegistrar;
    }

    public final void pigeon_newInstance(WebChromeClient.FileChooserParams pigeon_instanceArg, final Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (getPigeonRegistrar().getIgnoreCallsToDart()) {
            Result.Companion companion = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        if (getPigeonRegistrar().getInstanceManager().containsInstance(pigeon_instanceArg)) {
            Result.Companion companion2 = Result.INSTANCE;
            callback.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        long jAddHostCreatedInstance = getPigeonRegistrar().getInstanceManager().addHostCreatedInstance(pigeon_instanceArg);
        boolean zIsCaptureEnabled = isCaptureEnabled(pigeon_instanceArg);
        final String str = "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance";
        new BasicMessageChannel(getPigeonRegistrar().getBinaryMessenger(), "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", getPigeonRegistrar().getCodec()).send(CollectionsKt.listOf(Long.valueOf(jAddHostCreatedInstance), Boolean.valueOf(zIsCaptureEnabled), acceptTypes(pigeon_instanceArg), mode(pigeon_instanceArg), filenameHint(pigeon_instanceArg)), new BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams$$ExternalSyntheticLambda0
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                PigeonApiFileChooserParams.pigeon_newInstance$lambda$0(callback, str, obj);
            }
        });
    }

    static final void pigeon_newInstance$lambda$0(Function1 function1, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 1) {
                Result.Companion companion = Result.INSTANCE;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(new AndroidWebKitError((String) obj2, (String) obj3, (String) list.get(2))))));
                return;
            }
            Result.Companion companion2 = Result.INSTANCE;
            function1.invoke(Result.m409boximpl(Result.m410constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        function1.invoke(Result.m409boximpl(Result.m410constructorimpl(ResultKt.createFailure(AndroidWebkitLibraryPigeonUtils.INSTANCE.createConnectionError(str)))));
    }
}
