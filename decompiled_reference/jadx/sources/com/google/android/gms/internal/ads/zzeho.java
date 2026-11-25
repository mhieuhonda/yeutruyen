package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeho {
    private final zzcnq zza;
    private final Context zzb;
    private final Executor zzc;

    zzeho(zzcnq zzcnqVar, Context context, Executor executor) {
        this.zza = zzcnqVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        zzehq zzehqVarZzh = this.zza.zzh();
        zzehqVarZzh.zzb(this.zzb);
        zzehqVarZzh.zza().zza().zza();
    }
}
