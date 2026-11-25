package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeuh implements zzeua {
    private final zzflf zza;
    private final zzcnq zzb;
    private final Context zzc;
    private final zzetx zzd;
    private final zzfqt zze;
    private zzcyp zzf;

    public zzeuh(zzcnq zzcnqVar, Context context, zzetx zzetxVar, zzflf zzflfVar) {
        this.zzb = zzcnqVar;
        this.zzc = context;
        this.zzd = zzetxVar;
        this.zza = zzflfVar;
        this.zze = zzcnqVar.zzx();
        zzflfVar.zzt(zzetxVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzety zzetyVar, zzetz zzetzVar) throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeug
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        boolean z = zzmVar.zzf;
        zzfmd.zzb(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkv)).booleanValue() && z) {
            this.zzb.zzw().zzc(true);
        }
        int i3 = ((zzeub) zzetyVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String strZza = zzdzc.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdze.zza(new Pair(strZza, lValueOf), new Pair(zzdzc.DYNAMITE_ENTER.zza(), lValueOf));
        zzflf zzflfVar = this.zza;
        zzflfVar.zza(zzmVar);
        zzflfVar.zzv(bundleZza);
        zzflfVar.zzl(i3);
        zzflg zzflgVarZzB = zzflfVar.zzB();
        zzfqg zzfqgVarZzo = zzfqg.zzo(context, zzfqp.zzg(zzflgVarZzB), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcl zzclVar = zzflgVarZzB.zzo;
        if (zzclVar != null) {
            this.zzd.zzc().zzo(zzclVar);
        }
        zzcnq zzcnqVar = this.zzb;
        zzdoj zzdojVarZzo = zzcnqVar.zzo();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zza(context);
        zzdciVar.zzb(zzflgVarZzB);
        zzdojVarZzo.zzf(zzdciVar.zze());
        zzdiy zzdiyVar = new zzdiy();
        zzetx zzetxVar = this.zzd;
        zzdiyVar.zze(zzetxVar.zzc(), zzcnqVar.zzb());
        zzdojVarZzo.zzg(zzdiyVar.zzn());
        zzdojVarZzo.zze(zzetxVar.zzb());
        zzfqq zzfqqVarZzc = null;
        zzdojVarZzo.zzd(new zzcvp(null));
        zzdok zzdokVarZzh = zzdojVarZzo.zzh();
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            zzfqqVarZzc = zzdokVarZzh.zzc();
            zzfqqVarZzc.zzi(8);
            zzfqqVarZzc.zzc(zzmVar.zzp);
            zzfqqVarZzc.zzd(zzmVar.zzm);
        }
        zzfqq zzfqqVar = zzfqqVarZzc;
        zzcnqVar.zzv().zza(1);
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzc = zzcnqVar.zzc();
        zzcze zzczeVarZza = zzdokVarZzh.zza();
        zzcyp zzcypVar = new zzcyp(zzhcpVarZzc, scheduledExecutorServiceZzc, zzczeVarZza.zzc(zzczeVarZza.zzb()));
        this.zzf = zzcypVar;
        zzcypVar.zza(new zzeue(this, zzetzVar, zzfqqVar, zzfqgVarZzo, zzdokVarZzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeua
    public final boolean zzb() {
        zzcyp zzcypVar = this.zzf;
        return zzcypVar != null && zzcypVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdJ(zzfmi.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdJ(zzfmi.zzd(6, null, null));
    }

    final /* synthetic */ zzcnq zze() {
        return this.zzb;
    }

    final /* synthetic */ zzetx zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfqt zzg() {
        return this.zze;
    }
}
