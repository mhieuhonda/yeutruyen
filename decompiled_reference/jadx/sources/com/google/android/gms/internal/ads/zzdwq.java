package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwq {
    private final Context zza;
    private final zzbaw zzb;
    private final zzbke zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbhw zzf;
    private final zzdga zzg;
    private final zzekz zzh;
    private final zzflk zzi;
    private final zzdzt zzj;
    private final zzcna zzk;

    public zzdwq(zzclr zzclrVar, Context context, zzbaw zzbawVar, zzbke zzbkeVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbhw zzbhwVar, zzdga zzdgaVar, zzekz zzekzVar, zzflk zzflkVar, zzdzt zzdztVar, zzcna zzcnaVar) {
        this.zza = context;
        this.zzb = zzbawVar;
        this.zzc = zzbkeVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbhwVar;
        this.zzg = zzdgaVar;
        this.zzh = zzekzVar;
        this.zzi = zzflkVar;
        this.zzj = zzdztVar;
        this.zzk = zzcnaVar;
    }

    public final zzclb zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfkn zzfknVar, zzfkq zzfkqVar) throws zzclq {
        zzcnl zzcnlVarZza = zzcnl.zza(zzrVar);
        String str = zzrVar.zza;
        zzdwf zzdwfVar = new zzdwf(this);
        zzbaw zzbawVar = this.zzb;
        zzekz zzekzVar = this.zzh;
        zzclb zzclbVarZza = zzclr.zza(this.zza, zzcnlVarZza, str, false, false, zzbawVar, this.zzc, this.zzd, null, zzdwfVar, this.zze, this.zzf, zzfknVar, zzfkqVar, zzekzVar, this.zzi, this.zzj);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpK)).booleanValue()) {
            this.zzk.zza(zzclbVarZza.zzD());
        }
        return zzclbVarZza;
    }

    final /* synthetic */ zzdga zzb() {
        return this.zzg;
    }
}
