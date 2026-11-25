package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfio implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzdno zzd;
    final /* synthetic */ zzfiq zze;

    zzfio(zzfiq zzfiqVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzdno zzdnoVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzdnoVar;
        Objects.requireNonNull(zzfiqVar);
        this.zze = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdno zzdnoVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdnoVar.zzb().zzg(th);
        zzfiq zzfiqVar = this.zze;
        synchronized (zzfiqVar) {
            zzfiqVar.zzi(null);
            zzdnoVar.zza().zzdJ(zzeVarZzg);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjC)).booleanValue()) {
                zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfil
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzdJ(zzeVarZzg);
                    }
                });
                zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfim
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzg().zzdJ(zzeVarZzg);
                    }
                });
            }
            zzfmd.zza(zzeVarZzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                zzfqt zzfqtVarZzh = zzfiqVar.zzh();
                zzfqg zzfqgVar = this.zzc;
                zzfqgVar.zzh(zzeVarZzg);
                zzfqgVar.zzj(th);
                zzfqgVar.zzd(false);
                zzfqtVarZzh.zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zzf(zzeVarZzg);
                zzfqg zzfqgVar2 = this.zzc;
                zzfqgVar2.zzj(th);
                zzfqgVar2.zzd(false);
                zzfqqVar.zza(zzfqgVar2);
                zzfqqVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0092 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020 A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x0032, B:11:0x0047, B:12:0x005f, B:14:0x006e, B:16:0x0072, B:18:0x00b6, B:17:0x0092), top: B:23:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbio zzbioVar;
        zzfqq zzfqqVar;
        zzfiq zzfiqVar = this.zze;
        zzdmh zzdmhVar = (zzdmh) obj;
        synchronized (zzfiqVar) {
            if (zzdmhVar != null) {
                zzdmhVar.zzt();
                zzfiqVar.zzi(null);
                zzbioVar = zzbix.zzjC;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                    zzdgp zzdgpVarZzq = zzdmhVar.zzq();
                    zzdgpVarZzq.zza(zzfiqVar.zzf());
                    zzdgpVarZzq.zzd(zzfiqVar.zzg());
                }
                this.zza.zzb(zzdmhVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                    zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfin
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzg();
                        }
                    });
                    zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfik
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzg();
                        }
                    });
                }
                if (((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzh = zzfiqVar.zzh();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzg(zzdmhVar.zzr().zzb);
                    zzfqgVar.zzi(zzdmhVar.zzn().zze());
                    zzfqgVar.zzd(true);
                    zzfqtVarZzh.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zze(zzdmhVar.zzr().zzb);
                    zzfqqVar.zzg(zzdmhVar.zzn().zze());
                    zzfqg zzfqgVar2 = this.zzc;
                    zzfqgVar2.zzd(true);
                    zzfqqVar.zza(zzfqgVar2);
                    zzfqqVar.zzh();
                }
            } else {
                zzfiqVar.zzi(null);
                zzbioVar = zzbix.zzjC;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                    zzdgp zzdgpVarZzq2 = zzdmhVar.zzq();
                    zzdgpVarZzq2.zza(zzfiqVar.zzf());
                    zzdgpVarZzq2.zzd(zzfiqVar.zzg());
                }
                this.zza.zzb(zzdmhVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                    zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfin
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzf().zzg();
                        }
                    });
                    zzfiqVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfik
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzg();
                        }
                    });
                }
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqt zzfqtVarZzh2 = zzfiqVar.zzh();
                    zzfqg zzfqgVar3 = this.zzc;
                    zzfqgVar3.zzg(zzdmhVar.zzr().zzb);
                    zzfqgVar3.zzi(zzdmhVar.zzn().zze());
                    zzfqgVar3.zzd(true);
                    zzfqtVarZzh2.zzb(zzfqgVar3.zzm());
                } else {
                    zzfqt zzfqtVarZzh3 = zzfiqVar.zzh();
                    zzfqg zzfqgVar4 = this.zzc;
                    zzfqgVar4.zzg(zzdmhVar.zzr().zzb);
                    zzfqgVar4.zzi(zzdmhVar.zzn().zze());
                    zzfqgVar4.zzd(true);
                    zzfqtVarZzh3.zzb(zzfqgVar4.zzm());
                }
            }
            throw th;
        }
    }
}
