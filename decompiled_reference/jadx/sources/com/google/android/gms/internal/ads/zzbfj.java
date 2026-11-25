package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbfj implements zzbfk {
    final /* synthetic */ Activity zza;

    zzbfj(zzbfl zzbflVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
