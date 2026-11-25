package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfka implements zzeua {
    private final Context zza;
    private final Executor zzb;
    private final zzcnq zzc;
    private final zzfjr zzd;
    private final zzfie zze;
    private final zzfkz zzf;
    private final zzfqt zzg;
    private final zzflf zzh;
    private ListenableFuture zzi;

    public zzfka(Context context, Executor executor, zzcnq zzcnqVar, zzfie zzfieVar, zzfjr zzfjrVar, zzflf zzflfVar, zzfkz zzfkzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnqVar;
        this.zze = zzfieVar;
        this.zzd = zzfjrVar;
        this.zzh = zzflfVar;
        this.zzf = zzfkzVar;
        this.zzg = zzcnqVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdvy zze(zzfic zzficVar) {
        zzdvy zzdvyVarZzp = this.zzc.zzp();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zza(this.zza);
        zzdciVar.zzb(((zzfjz) zzficVar).zza);
        zzdciVar.zzf(this.zzf);
        zzdvyVarZzp.zzd(zzdciVar.zze());
        zzdvyVarZzp.zze(new zzdiy().zzn());
        return zzdvyVarZzp;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) throws RemoteException {
        zzfqq zzfqqVar;
        zzccd zzccdVar = new zzccd(zzmVar, str);
        String str2 = zzccdVar.zzb;
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzfie zzfieVar = this.zze;
            if (zzfieVar.zzd() != null) {
                zzfqq zzfqqVarZzd = ((zzdvz) zzfieVar.zzd()).zzd();
                zzfqqVarZzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzccdVar.zza;
                zzfqqVarZzd.zzc(zzmVar2.zzp);
                zzfqqVarZzd.zzd(zzmVar2.zzm);
                zzfqqVar = zzfqqVarZzd;
            } else {
                zzfqqVar = null;
            }
        } else {
            zzfqqVar = null;
        }
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzccdVar.zza;
        boolean z = zzmVar3.zzf;
        zzfmd.zzb(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkv)).booleanValue() && z) {
            this.zzc.zzw().zzc(true);
        }
        Bundle bundleZza = zzdze.zza(new Pair(zzdzc.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz)), new Pair(zzdzc.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzflf zzflfVar = this.zzh;
        zzflfVar.zzg(str2);
        zzflfVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzflfVar.zza(zzmVar3);
        zzflfVar.zzv(bundleZza);
        zzflg zzflgVarZzB = zzflfVar.zzB();
        zzfqg zzfqgVarZzo = zzfqg.zzo(context, zzfqp.zzg(zzflgVarZzB), 5, zzmVar3);
        zzfjz zzfjzVar = new zzfjz(null);
        zzfjzVar.zza = zzflgVarZzB;
        ListenableFuture listenableFutureZzc = this.zze.zzc(new zzfif(zzfjzVar, null), new zzfid() { // from class: com.google.android.gms.internal.ads.zzfjx
            @Override // com.google.android.gms.internal.ads.zzfid
            public final /* synthetic */ zzdcg zza(zzfic zzficVar) {
                return this.zza.zzd(zzficVar);
            }
        }, null);
        this.zzi = listenableFutureZzc;
        zzhcf.zzr(listenableFutureZzc, new zzfjw(this, zzetzVar, zzfqqVar, zzfqgVarZzo, zzfjzVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzfjr zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzfie zzh() {
        return this.zze;
    }

    final /* synthetic */ zzfqt zzi() {
        return this.zzg;
    }

    final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
