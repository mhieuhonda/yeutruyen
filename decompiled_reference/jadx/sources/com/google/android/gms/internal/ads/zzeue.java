package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeue implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzdok zzd;
    final /* synthetic */ zzeuh zze;

    zzeue(zzeuh zzeuhVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzdok zzdokVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzdokVar;
        Objects.requireNonNull(zzeuhVar);
        this.zze = zzeuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdok zzdokVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzdokVar.zza().zzg(th);
        zzdokVar.zzb().zzdJ(zzeVarZzg);
        zzeuh zzeuhVar = this.zze;
        zzeuhVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze.zzf().zze().zzdJ(zzeVarZzg);
            }
        });
        zzfmd.zza(zzeVarZzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
            zzfqt zzfqtVarZzg = zzeuhVar.zzg();
            zzfqg zzfqgVar = this.zzc;
            zzfqgVar.zzh(zzeVarZzg);
            zzfqgVar.zzj(th);
            zzfqgVar.zzd(false);
            zzfqtVarZzg.zzb(zzfqgVar.zzm());
            return;
        }
        zzfqqVar.zzf(zzeVarZzg);
        zzfqg zzfqgVar2 = this.zzc;
        zzfqgVar2.zzj(th);
        zzfqgVar2.zzd(false);
        zzfqqVar.zza(zzfqgVar2);
        zzfqqVar.zzh();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0061 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x003d, B:10:0x0041, B:12:0x0085, B:11:0x0061), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzeuh zzeuhVar = this.zze;
        zzcya zzcyaVar = (zzcya) obj;
        synchronized (zzeuhVar) {
            if (zzcyaVar != null) {
                zzcyaVar.zzt();
                zzcyaVar.zzq().zza(zzeuhVar.zzf().zzc());
                this.zza.zzb(zzcyaVar);
                zzeuhVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeud
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzd().zzg();
                    }
                });
                if (((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzg = zzeuhVar.zzg();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzg(zzcyaVar.zzr().zzb);
                    zzfqgVar.zzi(zzcyaVar.zzn().zze());
                    zzfqgVar.zzd(true);
                    zzfqtVarZzg.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zze(zzcyaVar.zzr().zzb);
                    zzfqqVar.zzg(zzcyaVar.zzn().zze());
                    zzfqg zzfqgVar2 = this.zzc;
                    zzfqgVar2.zzd(true);
                    zzfqqVar.zza(zzfqgVar2);
                    zzfqqVar.zzh();
                }
            } else {
                zzcyaVar.zzq().zza(zzeuhVar.zzf().zzc());
                this.zza.zzb(zzcyaVar);
                zzeuhVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeud
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zze.zzf().zzd().zzg();
                    }
                });
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqt zzfqtVarZzg2 = zzeuhVar.zzg();
                    zzfqg zzfqgVar3 = this.zzc;
                    zzfqgVar3.zzg(zzcyaVar.zzr().zzb);
                    zzfqgVar3.zzi(zzcyaVar.zzn().zze());
                    zzfqgVar3.zzd(true);
                    zzfqtVarZzg2.zzb(zzfqgVar3.zzm());
                } else {
                    zzfqt zzfqtVarZzg3 = zzeuhVar.zzg();
                    zzfqg zzfqgVar4 = this.zzc;
                    zzfqgVar4.zzg(zzcyaVar.zzr().zzb);
                    zzfqgVar4.zzi(zzcyaVar.zzn().zze());
                    zzfqgVar4.zzd(true);
                    zzfqtVarZzg3.zzb(zzfqgVar4.zzm());
                }
            }
            throw th;
        }
    }
}
