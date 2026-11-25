package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzffv implements zzeua {
    protected final zzcnq zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfgm zzd;
    private final zzfie zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfqt zzh;
    private final zzflf zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzffv(Context context, Executor executor, zzcnq zzcnqVar, zzfie zzfieVar, zzfgm zzfgmVar, zzflf zzflfVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnqVar;
        this.zze = zzfieVar;
        this.zzd = zzfgmVar;
        this.zzi = zzflfVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnqVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdcg zzg(zzfic zzficVar) {
        zzffs zzffsVar = (zzffs) zzficVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjB)).booleanValue()) {
            zzcvp zzcvpVar = new zzcvp(this.zzg);
            zzdci zzdciVar = new zzdci();
            zzdciVar.zza(this.zzb);
            zzdciVar.zzb(zzffsVar.zza);
            zzdcj zzdcjVarZze = zzdciVar.zze();
            zzdiy zzdiyVar = new zzdiy();
            zzfgm zzfgmVar = this.zzd;
            Executor executor = this.zzc;
            zzdiyVar.zzd(zzfgmVar, executor);
            zzdiyVar.zzg(zzfgmVar, executor);
            return zzc(zzcvpVar, zzdcjVarZze, zzdiyVar.zzn());
        }
        zzfgm zzfgmVarZzn = zzfgm.zzn(this.zzd);
        zzdiy zzdiyVar2 = new zzdiy();
        Executor executor2 = this.zzc;
        zzdiyVar2.zzc(zzfgmVarZzn, executor2);
        zzdiyVar2.zzi(zzfgmVarZzn, executor2);
        zzdiyVar2.zzj(zzfgmVarZzn, executor2);
        zzdiyVar2.zzk(zzfgmVarZzn, executor2);
        zzdiyVar2.zzd(zzfgmVarZzn, executor2);
        zzdiyVar2.zzg(zzfgmVarZzn, executor2);
        zzdiyVar2.zzl(zzfgmVarZzn);
        zzcvp zzcvpVar2 = new zzcvp(this.zzg);
        zzdci zzdciVar2 = new zzdci();
        zzdciVar2.zza(this.zzb);
        zzdciVar2.zzb(zzffsVar.zza);
        return zzc(zzcvpVar2, zzdciVar2.zze(), zzdiyVar2.zzn());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzeua
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) throws Throwable {
        Throwable th;
        boolean z;
        zzfqq zzfqqVar;
        zzcvc zzcvcVar;
        try {
            try {
                if (!zzmVar.zzb()) {
                    if (((Boolean) zzbkv.zzd.zze()).booleanValue()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmO)).booleanValue()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        z = false;
                    }
                    if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmP)).intValue() || !z) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffu
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzay.zzc();
                }
                if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzcvcVar = (zzcvc) this.zze.zzd()) == null) {
                    zzfqqVar = null;
                } else {
                    zzfqq zzfqqVarZzd = zzcvcVar.zzd();
                    zzfqqVarZzd.zzi(7);
                    zzfqqVarZzd.zzc(zzmVar.zzp);
                    zzfqqVarZzd.zzd(zzmVar.zzm);
                    zzfqqVar = zzfqqVarZzd;
                }
                Context context = this.zzb;
                boolean z2 = zzmVar.zzf;
                zzfmd.zzb(context, z2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkv)).booleanValue() && z2) {
                    this.zza.zzw().zzc(true);
                }
                Bundle bundleZza = zzdze.zza(new Pair(zzdzc.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdzc.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzflf zzflfVar = this.zzi;
                zzflfVar.zzg(str);
                zzflfVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzd());
                zzflfVar.zza(zzmVar);
                zzflfVar.zzv(bundleZza);
                zzflg zzflgVarZzB = zzflfVar.zzB();
                zzfqg zzfqgVarZzo = zzfqg.zzo(context, zzfqp.zzg(zzflgVarZzB), 7, zzmVar);
                zzffs zzffsVar = new zzffs(null);
                zzffsVar.zza = zzflgVarZzB;
                ListenableFuture listenableFutureZzc = this.zze.zzc(new zzfif(zzffsVar, null), new zzfid() { // from class: com.google.android.gms.internal.ads.zzfft
                    @Override // com.google.android.gms.internal.ads.zzfid
                    public final /* synthetic */ zzdcg zza(zzfic zzficVar) {
                        return this.zza.zzf(zzficVar);
                    }
                }, null);
                this.zzj = listenableFutureZzc;
                zzhcf.zzr(listenableFutureZzc, new zzffr(this, zzetzVar, zzfqqVar, zzfqgVarZzo, zzffsVar), this.zzc);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    protected abstract zzdcg zzc(zzcvp zzcvpVar, zzdcj zzdcjVar, zzdiz zzdizVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    final /* synthetic */ void zze() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzfgm zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzfie zzj() {
        return this.zze;
    }

    final /* synthetic */ zzfqt zzk() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(ListenableFuture listenableFuture) {
        this.zzj = null;
    }
}
