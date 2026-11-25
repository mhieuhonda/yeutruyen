package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepd extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzerq zzc;
    private final zzdiz zzd;
    private final zzdof zze;
    private final zzdga zzf;
    private final ViewGroup zzg;
    private final zzdif zzh;
    private final zzepl zzi;
    private final zzemf zzj;

    public zzepd(zzcnq zzcnqVar, zzdci zzdciVar, zzerq zzerqVar, zzdiz zzdizVar, zzdof zzdofVar, zzdga zzdgaVar, ViewGroup viewGroup, zzdif zzdifVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzerqVar;
        this.zzd = zzdizVar;
        this.zze = zzdofVar;
        this.zzf = zzdgaVar;
        this.zzg = viewGroup;
        this.zzh = zzdifVar;
        this.zzi = zzeplVar;
        this.zzj = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    protected final ListenableFuture zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzj);
        }
        zzcww zzcwwVarZzi = this.zza.zzi();
        zzcwwVarZzi.zzl(zzdciVar.zze());
        zzcwwVarZzi.zzm(this.zzd);
        zzcwwVarZzi.zzk(this.zzc);
        zzcwwVarZzi.zzd(this.zze);
        zzcwwVarZzi.zzg(new zzcxs(this.zzf, this.zzh));
        zzcwwVarZzi.zze(new zzcvp(this.zzg));
        zzcze zzczeVarZzc = zzcwwVarZzi.zzh().zzc();
        return zzczeVarZzc.zzc(zzczeVarZzc.zzb());
    }
}
