package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbfi implements zzbfk {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    zzbfi(zzbfl zzbflVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
        Objects.requireNonNull(zzbflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
