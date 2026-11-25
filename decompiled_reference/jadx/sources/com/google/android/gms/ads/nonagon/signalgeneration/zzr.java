package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdls;
import com.google.android.gms.internal.ads.zzdzo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzr implements zzdls {
    private final zzdzo zza;
    private final zzq zzb;
    private final String zzc;

    public zzr(zzdzo zzdzoVar, zzq zzqVar, String str) {
        this.zza = zzdzoVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
    }
}
