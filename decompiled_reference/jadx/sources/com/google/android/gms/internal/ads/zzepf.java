package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepf extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzerq zzc;
    private final zzdiz zzd;
    private final zzepl zze;
    private final zzemf zzf;

    public zzepf(zzcnq zzcnqVar, zzdci zzdciVar, zzerq zzerqVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzerqVar;
        this.zzd = zzdizVar;
        this.zze = zzeplVar;
        this.zzf = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    protected final ListenableFuture zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzf);
        }
        zzdnn zzdnnVarZzm = this.zza.zzm();
        zzdnnVarZzm.zze(zzdciVar.zze());
        zzdnnVarZzm.zzf(this.zzd);
        zzdnnVarZzm.zzd(this.zzc);
        zzcze zzczeVarZzb = zzdnnVarZzm.zzh().zzb();
        return zzczeVarZzb.zzc(zzczeVarZzb.zzb());
    }
}
