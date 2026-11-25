package androidx.core.os;

import android.os.Build;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BuildCompat$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ int m() {
        return Build.VERSION.SDK_INT < 36 ? Build.VERSION.SDK_INT * 100000 : Build.VERSION.SDK_INT_FULL;
    }
}
