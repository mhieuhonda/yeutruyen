package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfha implements zzeua {
    private final Context zza;
    private final Executor zzb;
    private final zzcnq zzc;
    private final zzetk zzd;
    private final zzeto zze;
    private final ViewGroup zzf;
    private zzbjs zzg;
    private final zzdga zzh;
    private final zzfqt zzi;
    private final zzdif zzj;
    private final zzflf zzk;
    private ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzetz zzo;

    public zzfha(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcnq zzcnqVar, zzetk zzetkVar, zzeto zzetoVar, zzflf zzflfVar, zzdif zzdifVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnqVar;
        this.zzd = zzetkVar;
        this.zze = zzetoVar;
        this.zzk = zzflfVar;
        this.zzh = zzcnqVar.zzd();
        this.zzi = zzcnqVar.zzx();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdifVar;
        zzflfVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjA)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzeVar);
                }
            });
        }
        zzetz zzetzVar = this.zzo;
        if (zzetzVar != null) {
            zzetzVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) throws RemoteException {
        zzcwx zzcwxVarZza;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzc();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkv)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzw().zzc(true);
            }
            Bundle bundleZza = zzdze.zza(new Pair(zzdzc.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdzc.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzflf zzflfVar = this.zzk;
            zzflfVar.zzg(str);
            zzflfVar.zza(zzmVar);
            zzflfVar.zzv(bundleZza);
            Context context = this.zza;
            zzflg zzflgVarZzB = zzflfVar.zzB();
            zzfqg zzfqgVarZzo = zzfqg.zzo(context, zzfqp.zzg(zzflgVarZzB), 3, zzmVar);
            zzfqq zzfqqVarZze = null;
            if (!((Boolean) zzbld.zzf.zze()).booleanValue() || !zzflfVar.zzf().zzk) {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjA)).booleanValue();
                zzcnq zzcnqVar = this.zzc;
                if (zBooleanValue) {
                    zzcww zzcwwVarZzi = zzcnqVar.zzi();
                    zzdci zzdciVar = new zzdci();
                    zzdciVar.zza(context);
                    zzdciVar.zzb(zzflgVarZzB);
                    zzcwwVarZzi.zzl(zzdciVar.zze());
                    zzdiy zzdiyVar = new zzdiy();
                    zzetk zzetkVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdiyVar.zzm(zzetkVar, executor);
                    zzdiyVar.zze(zzetkVar, executor);
                    zzcwwVarZzi.zzm(zzdiyVar.zzn());
                    zzcwwVarZzi.zzk(new zzerq(this.zzg));
                    zzcwwVarZzi.zzd(new zzdof(zzdql.zza, null));
                    zzcwwVarZzi.zzg(new zzcxs(this.zzh, this.zzj));
                    zzcwwVarZzi.zze(new zzcvp(this.zzf));
                    zzcwxVarZza = zzcwwVarZzi.zzh();
                } else {
                    zzcww zzcwwVarZzi2 = zzcnqVar.zzi();
                    zzdci zzdciVar2 = new zzdci();
                    zzdciVar2.zza(context);
                    zzdciVar2.zzb(zzflgVarZzB);
                    zzcwwVarZzi2.zzl(zzdciVar2.zze());
                    zzdiy zzdiyVar2 = new zzdiy();
                    zzetk zzetkVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdiyVar2.zzm(zzetkVar2, executor2);
                    zzdiyVar2.zzf(zzetkVar2, executor2);
                    zzdiyVar2.zzf(this.zze, executor2);
                    zzdiyVar2.zzg(zzetkVar2, executor2);
                    zzdiyVar2.zzh(zzetkVar2, executor2);
                    zzdiyVar2.zza(zzetkVar2, executor2);
                    zzdiyVar2.zzb(zzetkVar2, executor2);
                    zzdiyVar2.zzc(zzetkVar2, executor2);
                    zzdiyVar2.zze(zzetkVar2, executor2);
                    zzdiyVar2.zzk(zzetkVar2, executor2);
                    zzcwwVarZzi2.zzm(zzdiyVar2.zzn());
                    zzcwwVarZzi2.zzk(new zzerq(this.zzg));
                    zzcwwVarZzi2.zzd(new zzdof(zzdql.zza, null));
                    zzcwwVarZzi2.zzg(new zzcxs(this.zzh, this.zzj));
                    zzcwwVarZzi2.zze(new zzcvp(this.zzf));
                    zzcwxVarZza = zzcwwVarZzi2.zzh();
                }
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqqVarZze = zzcwxVarZza.zze();
                    zzfqqVarZze.zzi(3);
                    zzfqqVarZze.zzc(zzmVar.zzp);
                    zzfqqVarZze.zzd(zzmVar.zzm);
                }
                this.zzo = zzetzVar;
                zzcze zzczeVarZzc = zzcwxVarZza.zzc();
                ListenableFuture listenableFutureZzc = zzczeVarZzc.zzc(zzczeVarZzc.zzb());
                this.zzl = listenableFutureZzc;
                zzhcf.zzr(listenableFutureZzc, new zzfgw(this, zzfqqVarZze, zzfqgVarZzo, zzcwxVarZza), this.zzb);
                return true;
            }
            zzetk zzetkVar3 = this.zzd;
            if (zzetkVar3 != null) {
                zzetkVar3.zzdJ(zzfmi.zzd(7, null, null));
            }
        } else if (!this.zzk.zzC()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc() {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzl;
            if (listenableFuture != null && listenableFuture.isDone()) {
                try {
                    zzcvs zzcvsVar = (zzcvs) this.zzl.get();
                    this.zzl = null;
                    ViewGroup viewGroup = this.zzf;
                    viewGroup.removeAllViews();
                    zzcvsVar.zza();
                    ViewParent parent = zzcvsVar.zza().getParent();
                    if (parent instanceof ViewGroup) {
                        String strZze = zzcvsVar.zzn() != null ? zzcvsVar.zzn().zze() : "";
                        StringBuilder sb = new StringBuilder(String.valueOf(strZze).length() + 78);
                        sb.append("Banner view provided from ");
                        sb.append(strZze);
                        sb.append(" already has a parent view. Removing its old parent.");
                        String string = sb.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                        ((ViewGroup) parent).removeView(zzcvsVar.zza());
                    }
                    zzbio zzbioVar = zzbix.zzjA;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                        zzdgp zzdgpVarZzq = zzcvsVar.zzq();
                        zzdgpVarZzq.zza(this.zzd);
                        zzdgpVarZzq.zzb(this.zze);
                    }
                    viewGroup.addView(zzcvsVar.zza());
                    zzetz zzetzVar = this.zzo;
                    if (zzetzVar != null) {
                        zzetzVar.zzb(zzcvsVar);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                        Executor executor = this.zzb;
                        final zzetk zzetkVar = this.zzd;
                        Objects.requireNonNull(zzetkVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgz
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzetkVar.zzg();
                            }
                        });
                    }
                    if (zzcvsVar.zzh() >= 0) {
                        this.zzm = false;
                        zzdga zzdgaVar = this.zzh;
                        zzdgaVar.zzd(zzcvsVar.zzh());
                        zzdgaVar.zze(zzcvsVar.zzg());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcvsVar.zzg());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    zzn();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zzc();
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbjs zzbjsVar) {
        this.zzg = zzbjsVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final zzflf zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzab(view, view.getContext());
    }

    public final void zzi(zzdfv zzdfvVar) {
        this.zzh.zzq(zzdfvVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    final /* synthetic */ void zzl() {
        this.zzd.zzdJ(zzfmi.zzd(6, null, null));
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdJ(zzeVar);
    }

    final /* synthetic */ zzdga zzo() {
        return this.zzh;
    }

    final /* synthetic */ zzfqt zzp() {
        return this.zzi;
    }

    final /* synthetic */ zzdif zzq() {
        return this.zzj;
    }

    final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}
