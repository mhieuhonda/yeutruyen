package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzffr implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzffs zzd;
    final /* synthetic */ zzffv zze;

    zzffr(zzffv zzffvVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzffs zzffsVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzffsVar;
        Objects.requireNonNull(zzffvVar);
        this.zze = zzffvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzffv zzffvVar = this.zze;
        zzcvc zzcvcVar = (zzcvc) zzffvVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcvcVar == null ? zzfmi.zzb(th, null) : zzcvcVar.zza().zzg(th);
        synchronized (zzffvVar) {
            zzffvVar.zzl(null);
            if (zzcvcVar != null) {
                zzcvcVar.zze().zzdJ(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjB)).booleanValue()) {
                    zzffvVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzi().zzdJ(zzeVarZzb);
                        }
                    });
                }
            } else {
                zzffvVar.zzi().zzdJ(zzeVarZzb);
                ((zzcvc) zzffvVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            zzfmd.zza(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                zzfqt zzfqtVarZzk = zzffvVar.zzk();
                zzfqg zzfqgVar = this.zzc;
                zzfqgVar.zzh(zzeVarZzb);
                zzfqgVar.zzj(th);
                zzfqgVar.zzd(false);
                zzfqtVarZzk.zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zzf(zzeVarZzb);
                zzfqg zzfqgVar2 = this.zzc;
                zzfqgVar2.zzj(th);
                zzfqgVar2.zzd(false);
                zzfqqVar.zza(zzfqgVar2);
                zzfqqVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020 A[Catch: all -> 0x0089, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0020, B:9:0x002b, B:11:0x003f, B:13:0x0043, B:15:0x0087, B:14:0x0063), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzffv zzffvVar = this.zze;
        zzcya zzcyaVar = (zzcya) obj;
        synchronized (zzffvVar) {
            if (zzcyaVar != null) {
                zzcyaVar.zzt();
                zzffvVar.zzl(null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjB)).booleanValue()) {
                    zzcyaVar.zzq().zzc(zzffvVar.zzi());
                }
                this.zza.zzb(zzcyaVar);
                if (((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzk = zzffvVar.zzk();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzg(zzcyaVar.zzr().zzb);
                    zzfqgVar.zzi(zzcyaVar.zzn().zze());
                    zzfqgVar.zzd(true);
                    zzfqtVarZzk.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zze(zzcyaVar.zzr().zzb);
                    zzfqqVar.zzg(zzcyaVar.zzn().zze());
                    zzfqg zzfqgVar2 = this.zzc;
                    zzfqgVar2.zzd(true);
                    zzfqqVar.zza(zzfqgVar2);
                    zzfqqVar.zzh();
                }
            } else {
                zzffvVar.zzl(null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjB)).booleanValue()) {
                    zzcyaVar.zzq().zzc(zzffvVar.zzi());
                }
                this.zza.zzb(zzcyaVar);
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqt zzfqtVarZzk2 = zzffvVar.zzk();
                    zzfqg zzfqgVar3 = this.zzc;
                    zzfqgVar3.zzg(zzcyaVar.zzr().zzb);
                    zzfqgVar3.zzi(zzcyaVar.zzn().zze());
                    zzfqgVar3.zzd(true);
                    zzfqtVarZzk2.zzb(zzfqgVar3.zzm());
                } else {
                    zzfqt zzfqtVarZzk3 = zzffvVar.zzk();
                    zzfqg zzfqgVar4 = this.zzc;
                    zzfqgVar4.zzg(zzcyaVar.zzr().zzb);
                    zzfqgVar4.zzi(zzcyaVar.zzn().zze());
                    zzfqgVar4.zzd(true);
                    zzfqtVarZzk3.zzb(zzfqgVar4.zzm());
                }
            }
            throw th;
        }
    }
}
