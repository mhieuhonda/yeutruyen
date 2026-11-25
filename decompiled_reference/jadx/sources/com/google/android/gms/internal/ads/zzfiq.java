package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfiq implements zzeua {
    private final Context zza;
    private final Executor zzb;
    private final zzcnq zzc;
    private final zzetk zzd;
    private final zzfjr zze;
    private zzbjs zzf;
    private final zzfqt zzg;
    private final zzflf zzh;
    private ListenableFuture zzi;

    public zzfiq(Context context, Executor executor, zzcnq zzcnqVar, zzetk zzetkVar, zzfjr zzfjrVar, zzflf zzflfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnqVar;
        this.zzd = zzetkVar;
        this.zzh = zzflfVar;
        this.zze = zzfjrVar;
        this.zzg = zzcnqVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) {
        zzdno zzdnoVarZzh;
        zzfqq zzfqqVarZzc;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkv)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfij) zzetyVar).zza;
        Bundle bundleZza = zzdze.zza(new Pair(zzdzc.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdzc.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzflf zzflfVar = this.zzh;
        zzflfVar.zzg(str);
        zzflfVar.zzc(zzrVar);
        zzflfVar.zza(zzmVar);
        zzflfVar.zzv(bundleZza);
        Context context = this.zza;
        zzflg zzflgVarZzB = zzflfVar.zzB();
        zzfqg zzfqgVarZzo = zzfqg.zzo(context, zzfqp.zzg(zzflgVarZzB), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjC)).booleanValue()) {
            zzdnn zzdnnVarZzm = this.zzc.zzm();
            zzdci zzdciVar = new zzdci();
            zzdciVar.zza(context);
            zzdciVar.zzb(zzflgVarZzB);
            zzdnnVarZzm.zze(zzdciVar.zze());
            zzdiy zzdiyVar = new zzdiy();
            zzetk zzetkVar = this.zzd;
            Executor executor = this.zzb;
            zzdiyVar.zzm(zzetkVar, executor);
            zzdiyVar.zze(zzetkVar, executor);
            zzdnnVarZzm.zzf(zzdiyVar.zzn());
            zzdnnVarZzm.zzd(new zzerq(this.zzf));
            zzdnoVarZzh = zzdnnVarZzm.zzh();
        } else {
            zzdiy zzdiyVar2 = new zzdiy();
            zzfjr zzfjrVar = this.zze;
            if (zzfjrVar != null) {
                Executor executor2 = this.zzb;
                zzdiyVar2.zza(zzfjrVar, executor2);
                zzdiyVar2.zzb(zzfjrVar, executor2);
                zzdiyVar2.zzc(zzfjrVar, executor2);
            }
            zzdnn zzdnnVarZzm2 = this.zzc.zzm();
            zzdci zzdciVar2 = new zzdci();
            zzdciVar2.zza(context);
            zzdciVar2.zzb(zzflgVarZzB);
            zzdnnVarZzm2.zze(zzdciVar2.zze());
            zzetk zzetkVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdiyVar2.zzm(zzetkVar2, executor3);
            zzdiyVar2.zza(zzetkVar2, executor3);
            zzdiyVar2.zzb(zzetkVar2, executor3);
            zzdiyVar2.zzc(zzetkVar2, executor3);
            zzdiyVar2.zzf(zzetkVar2, executor3);
            zzdiyVar2.zzg(zzetkVar2, executor3);
            zzdiyVar2.zze(zzetkVar2, executor3);
            zzdiyVar2.zzk(zzetkVar2, executor3);
            zzdiyVar2.zzd(zzetkVar2, executor3);
            zzdnnVarZzm2.zzf(zzdiyVar2.zzn());
            zzdnnVarZzm2.zzd(new zzerq(this.zzf));
            zzdnoVarZzh = zzdnnVarZzm2.zzh();
        }
        zzdno zzdnoVar = zzdnoVarZzh;
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzfqqVarZzc = zzdnoVar.zzc();
            zzfqqVarZzc.zzi(4);
            zzfqqVarZzc.zzc(zzmVar.zzp);
            zzfqqVarZzc.zzd(zzmVar.zzm);
        } else {
            zzfqqVarZzc = null;
        }
        zzcze zzczeVarZzb = zzdnoVar.zzb();
        ListenableFuture listenableFutureZzc = zzczeVarZzb.zzc(zzczeVarZzb.zzb());
        this.zzi = listenableFutureZzc;
        zzhcf.zzr(listenableFutureZzc, new zzfio(this, zzetzVar, zzfqqVarZzc, zzfqgVarZzo, zzdnoVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public final void zzc(zzbjs zzbjsVar) {
        this.zzf = zzbjsVar;
    }

    final /* synthetic */ void zzd() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ zzetk zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfjr zzg() {
        return this.zze;
    }

    final /* synthetic */ zzfqt zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(ListenableFuture listenableFuture) {
        this.zzi = null;
    }
}
