package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeoy extends zzepa {
    private final zzcnq zza;
    private final zzdof zzb;
    private final zzdci zzc;
    private final zzdiz zzd;
    private final zzepl zze;
    private final zzemf zzf;

    public zzeoy(zzcnq zzcnqVar, zzdof zzdofVar, zzdci zzdciVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdofVar;
        this.zzc = zzdciVar;
        this.zzd = zzdizVar;
        this.zze = zzeplVar;
        this.zzf = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    protected final ListenableFuture zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzc;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzf);
        }
        zzdoj zzdojVarZzo = this.zza.zzo();
        zzdojVarZzo.zzf(zzdciVar.zze());
        zzdojVarZzo.zzg(this.zzd);
        zzdojVarZzo.zze(this.zzb);
        zzdojVarZzo.zzd(new zzcvp(null));
        zzcze zzczeVarZza = zzdojVarZzo.zzh().zza();
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }
}
