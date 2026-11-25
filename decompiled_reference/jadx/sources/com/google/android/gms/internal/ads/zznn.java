package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznn implements zzmd {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzav zzd = zzav.zza;

    public zznn(zzdp zzdpVar) {
    }

    public final void zza() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zzb() {
        if (this.zza) {
            zzc(zzg());
            this.zza = false;
        }
    }

    public final void zzc(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final long zzg() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzav zzavVar = this.zzd;
        return j + (zzavVar.zzb == 1.0f ? zzfm.zzt(jElapsedRealtime) : zzavVar.zza(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzi(zzav zzavVar) {
        if (this.zza) {
            zzc(zzg());
        }
        this.zzd = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        return this.zzd;
    }
}
