package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzte {
    private final Context zza;
    private zztm zzb;
    private zzqj zzc;
    private zztk zzd;

    public zzte(Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = zztm.zza;
        if (context == null) {
            this.zzc = zzqj.zza;
        }
    }

    public final zzte zza(zztm zztmVar) {
        this.zzb = zztmVar;
        return this;
    }

    final zzte zzb(zzqj zzqjVar) {
        if (this.zza == null) {
            this.zzc = zzqjVar;
        }
        return this;
    }

    public final zztg zzc() {
        if (this.zzd == null) {
            this.zzd = new zztk(this.zza);
        }
        return new zztg(this, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zza;
    }

    final /* synthetic */ zzqj zze() {
        return this.zzc;
    }

    public final zzte zzf(zztk zztkVar) {
        this.zzd = zztkVar;
        return this;
    }

    final /* synthetic */ zztk zzg() {
        return this.zzd;
    }
}
