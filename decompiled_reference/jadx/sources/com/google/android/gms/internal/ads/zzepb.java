package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepb extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzdiz zzc;
    private final zzepl zzd;
    private final zzemf zze;

    zzepb(zzcnq zzcnqVar, zzdci zzdciVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzdizVar;
        this.zzd = zzeplVar;
        this.zze = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    protected final ListenableFuture zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zze);
        }
        zzcvf zzcvfVarZzk = this.zza.zzk();
        zzcvfVarZzk.zzd(zzdciVar.zze());
        zzcvfVarZzk.zze(this.zzc);
        zzcze zzczeVarZza = zzcvfVarZzk.zzh().zza();
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }
}
