package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvr implements zzbqp {
    private final zzdeg zza;
    private final zzcci zzb;
    private final String zzc;
    private final String zzd;

    public zzdvr(zzdeg zzdegVar, zzfkn zzfknVar) {
        this.zza = zzdegVar;
        this.zzb = zzfknVar.zzl;
        this.zzc = zzfknVar.zzj;
        this.zzd = zzfknVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    @ParametersAreNonnullByDefault
    public final void zzb(zzcci zzcciVar) {
        int i;
        String str;
        zzcci zzcciVar2 = this.zzb;
        if (zzcciVar2 != null) {
            zzcciVar = zzcciVar2;
        }
        if (zzcciVar != null) {
            str = zzcciVar.zza;
            i = zzcciVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zze(new zzcbt(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzc() {
        this.zza.zzf();
    }
}
