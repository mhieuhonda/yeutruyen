package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzduy implements zzhcc {
    final /* synthetic */ zzfkn zza;
    final /* synthetic */ zzfkq zzb;
    final /* synthetic */ zzctq zzc;
    final /* synthetic */ zzdvf zzd;

    zzduy(zzdvf zzdvfVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar) {
        this.zza = zzfknVar;
        this.zzb = zzfkqVar;
        this.zzc = zzctqVar;
        Objects.requireNonNull(zzdvfVar);
        this.zzd = zzdvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzclb zzclbVar = (zzclb) obj;
        zzfkn zzfknVar = this.zza;
        zzclbVar.zzaD(zzfknVar, this.zzb);
        zzcmz zzcmzVarZzP = zzclbVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlL)).booleanValue() && zzcmzVarZzP != null) {
            zzctq zzctqVar = this.zzc;
            zzdvf zzdvfVar = this.zzd;
            zzcmzVarZzP.zzd(zzctqVar, zzdvfVar.zzm(), zzdvfVar.zzn());
            zzcmzVarZzP.zze(zzctqVar, zzdvfVar.zzm(), zzdvfVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoK)).booleanValue() || zzcmzVarZzP == null) {
            return;
        }
        zzcmzVarZzP.zzb(zzfknVar);
    }
}
