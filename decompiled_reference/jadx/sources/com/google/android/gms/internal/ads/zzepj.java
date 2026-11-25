package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzepj implements zzhcc {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfkq zzb;
    final /* synthetic */ zzfkn zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfsi zze;
    final /* synthetic */ zzfky zzf;
    final /* synthetic */ zzepl zzg;

    zzepj(zzepl zzeplVar, long j, zzfkq zzfkqVar, zzfkn zzfknVar, String str, zzfsi zzfsiVar, zzfky zzfkyVar) {
        this.zza = j;
        this.zzb = zzfkqVar;
        this.zzc = zzfknVar;
        this.zzd = str;
        this.zze = zzfsiVar;
        this.zzf = zzfkyVar;
        Objects.requireNonNull(zzeplVar);
        this.zzg = zzeplVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[Catch: all -> 0x00ef, DONT_GENERATE, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[Catch: all -> 0x00ef, TryCatch #0 {, blocks: (B:31:0x0064, B:33:0x006a, B:35:0x0076, B:36:0x0079, B:37:0x007f, B:39:0x0091, B:40:0x00a6, B:42:0x00ac, B:44:0x00ae, B:52:0x00e6, B:53:0x00ed, B:47:0x00cb, B:49:0x00cf, B:51:0x00d9), top: B:59:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        int i;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        Integer numValueOf;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i3;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzepl zzeplVar = this.zzg;
        long jElapsedRealtime = zzeplVar.zzj().elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzeot) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else {
                if (!(th instanceof zzfln)) {
                    if (th instanceof zzeel) {
                        i2 = zzfmi.zza(th).zza == 3 ? 1 : 6;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcs)).booleanValue() && (th instanceof zzeme) && (zzeVarZzb = ((zzeme) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                            i = i2;
                        }
                    } else {
                        i = 6;
                    }
                    synchronized (zzeplVar) {
                        if (zzeplVar.zzn()) {
                            zzeplVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzeme ? (zzeme) th : null, jElapsedRealtime);
                            jElapsedRealtime = jElapsedRealtime;
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjK)).booleanValue()) {
                            zzfsm zzfsmVarZzl = zzeplVar.zzl();
                            zzfsi zzfsiVar = this.zze;
                            zzfky zzfkyVar = this.zzf;
                            zzfkn zzfknVar = this.zzc;
                            zzfsmVarZzl.zza(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzn), zzfknVar.zzax);
                        }
                        if (zzeplVar.zzp()) {
                            return;
                        }
                        LinkedHashMap linkedHashMapZzm = zzeplVar.zzm();
                        zzfkn zzfknVar2 = this.zzc;
                        linkedHashMapZzm.put(zzfknVar2, new zzepk(this.zzd, zzfknVar2.zzaf, i, jElapsedRealtime, numValueOf));
                        zzeVarZza = zzfmi.zza(th);
                        i3 = zzeVarZza.zza;
                        if ((i3 != 3 || i3 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                        }
                        zzeplVar.zzo().zze(zzfknVar2, jElapsedRealtime, zzeVarZza);
                    }
                }
                i2 = 5;
            }
            numValueOf = null;
            synchronized (zzeplVar) {
                if (zzeplVar.zzn()) {
                    zzeplVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzeme ? (zzeme) th : null, jElapsedRealtime);
                    jElapsedRealtime = jElapsedRealtime;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjK)).booleanValue()) {
                    zzfsm zzfsmVarZzl2 = zzeplVar.zzl();
                    zzfsi zzfsiVar2 = this.zze;
                    zzfky zzfkyVar2 = this.zzf;
                    zzfkn zzfknVar3 = this.zzc;
                    zzfsmVarZzl2.zza(zzfsiVar2.zza(zzfkyVar2, zzfknVar3, zzfknVar3.zzn), zzfknVar3.zzax);
                }
                if (zzeplVar.zzp()) {
                    return;
                }
                LinkedHashMap linkedHashMapZzm2 = zzeplVar.zzm();
                zzfkn zzfknVar4 = this.zzc;
                linkedHashMapZzm2.put(zzfknVar4, new zzepk(this.zzd, zzfknVar4.zzaf, i, jElapsedRealtime, numValueOf));
                zzeVarZza = zzfmi.zza(th);
                i3 = zzeVarZza.zza;
                zzeVarZza = i3 != 3 ? zzfmi.zza(new zzeme(13, zzeVarZza.zzd)) : zzfmi.zza(new zzeme(13, zzeVarZza.zzd));
                zzeplVar.zzo().zze(zzfknVar4, jElapsedRealtime, zzeVarZza);
            }
        }
        i2 = 2;
        i = i2;
        numValueOf = null;
        synchronized (zzeplVar) {
            if (zzeplVar.zzn()) {
                zzeplVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzeme ? (zzeme) th : null, jElapsedRealtime);
                jElapsedRealtime = jElapsedRealtime;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjK)).booleanValue()) {
                zzfsm zzfsmVarZzl3 = zzeplVar.zzl();
                zzfsi zzfsiVar3 = this.zze;
                zzfky zzfkyVar3 = this.zzf;
                zzfkn zzfknVar5 = this.zzc;
                zzfsmVarZzl3.zza(zzfsiVar3.zza(zzfkyVar3, zzfknVar5, zzfknVar5.zzn), zzfknVar5.zzax);
            }
            if (zzeplVar.zzp()) {
                return;
            }
            LinkedHashMap linkedHashMapZzm3 = zzeplVar.zzm();
            zzfkn zzfknVar6 = this.zzc;
            linkedHashMapZzm3.put(zzfknVar6, new zzepk(this.zzd, zzfknVar6.zzaf, i, jElapsedRealtime, numValueOf));
            zzeVarZza = zzfmi.zza(th);
            i3 = zzeVarZza.zza;
            if (i3 != 3) {
            }
            zzeplVar.zzo().zze(zzfknVar6, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        long j;
        zzepl zzeplVar = this.zzg;
        long jElapsedRealtime = zzeplVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzeplVar) {
            if (zzeplVar.zzn()) {
                j = jElapsedRealtime;
                zzeplVar.zzk().zza(this.zzb, this.zzc, 0, null, j);
            } else {
                j = jElapsedRealtime;
            }
            if (zzeplVar.zzp()) {
                return;
            }
            zzfkn zzfknVar = this.zzc;
            if (zzeplVar.zzi(zzfknVar)) {
                ((zzepk) zzeplVar.zzm().get(zzfknVar)).zzd = j;
            } else {
                long j2 = j;
                j = j2;
                zzeplVar.zzm().put(zzfknVar, new zzepk(this.zzd, zzfknVar.zzaf, 0, j2, null));
            }
            zzeplVar.zzo().zzd(zzfknVar, j, null);
        }
    }
}
