package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdac implements zzdiu, zzden {
    private final Clock zza;
    private final zzdae zzb;
    private final zzflg zzc;
    private final String zzd;

    zzdac(Clock clock, zzdae zzdaeVar, zzflg zzflgVar, String str) {
        this.zza = clock;
        this.zzb = zzdaeVar;
        this.zzc = zzflgVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
