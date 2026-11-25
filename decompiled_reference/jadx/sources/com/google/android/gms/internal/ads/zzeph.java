package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeph extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzdiz zzc;
    private final zzepl zzd;

    @Nullable
    private final zzfkz zze;
    private final zzemf zzf;

    public zzeph(zzcnq zzcnqVar, zzdci zzdciVar, zzdiz zzdizVar, @Nullable zzfkz zzfkzVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzdizVar;
        this.zze = zzfkzVar;
        this.zzd = zzeplVar;
        this.zzf = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    protected final ListenableFuture zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzfkz zzfkzVar;
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeD)).booleanValue() && (zzfkzVar = this.zze) != null) {
            zzdciVar.zzf(zzfkzVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzf);
        }
        zzdvy zzdvyVarZzp = this.zza.zzp();
        zzdvyVarZzp.zzd(zzdciVar.zze());
        zzdvyVarZzp.zze(this.zzc);
        zzcze zzczeVarZza = zzdvyVarZzp.zzh().zza();
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }
}
