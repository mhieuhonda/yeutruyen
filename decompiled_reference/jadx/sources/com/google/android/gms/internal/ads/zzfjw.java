package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfjw implements zzhcc {
    final /* synthetic */ zzetz zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzfqg zzc;
    final /* synthetic */ zzfjz zzd;
    final /* synthetic */ zzfka zze;

    zzfjw(zzfka zzfkaVar, zzetz zzetzVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzfjz zzfjzVar) {
        this.zza = zzetzVar;
        this.zzb = zzfqqVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfjzVar;
        Objects.requireNonNull(zzfkaVar);
        this.zze = zzfkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfka zzfkaVar = this.zze;
        zzdvz zzdvzVar = (zzdvz) zzfkaVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdvzVar == null ? zzfmi.zzb(th, null) : zzdvzVar.zza().zzg(th);
        synchronized (zzfkaVar) {
            try {
                if (zzdvzVar != null) {
                    zzdvzVar.zze().zzdJ(zzeVarZzb);
                    zzfkaVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdJ(zzeVarZzb);
                        }
                    });
                } else {
                    zzfkaVar.zzg().zzdJ(zzeVarZzb);
                    zzfkaVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfmd.zza(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzi = zzfkaVar.zzi();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzh(zzeVarZzb);
                    zzfqgVar.zzj(th);
                    zzfqgVar.zzd(false);
                    zzfqtVarZzi.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zzf(zzeVarZzb);
                    zzfqg zzfqgVar2 = this.zzc;
                    zzfqgVar2.zzj(th);
                    zzfqgVar2.zzd(false);
                    zzfqqVar.zza(zzfqgVar2);
                    zzfqqVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0067 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0043, B:10:0x0047, B:12:0x008b, B:11:0x0067), top: B:17:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzfka zzfkaVar = this.zze;
        zzdvu zzdvuVar = (zzdvu) obj;
        synchronized (zzfkaVar) {
            if (zzdvuVar != null) {
                zzdvuVar.zzt();
                zzdvuVar.zzq().zzd(zzfkaVar.zzg());
                this.zza.zzb(zzdvuVar);
                Executor executorZzf = zzfkaVar.zzf();
                final zzfjr zzfjrVarZzg = zzfkaVar.zzg();
                Objects.requireNonNull(zzfjrVarZzg);
                executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfju
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfjrVarZzg.zzg();
                    }
                });
                zzfkaVar.zzg().onAdMetadataChanged();
                if (((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zzb) == null) {
                    zzfqt zzfqtVarZzi = zzfkaVar.zzi();
                    zzfqg zzfqgVar = this.zzc;
                    zzfqgVar.zzg(zzdvuVar.zzr().zzb);
                    zzfqgVar.zzi(zzdvuVar.zzn().zze());
                    zzfqgVar.zzd(true);
                    zzfqtVarZzi.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zze(zzdvuVar.zzr().zzb);
                    zzfqqVar.zzg(zzdvuVar.zzn().zze());
                    zzfqg zzfqgVar2 = this.zzc;
                    zzfqgVar2.zzd(true);
                    zzfqqVar.zza(zzfqgVar2);
                    zzfqqVar.zzh();
                }
            } else {
                zzdvuVar.zzq().zzd(zzfkaVar.zzg());
                this.zza.zzb(zzdvuVar);
                Executor executorZzf2 = zzfkaVar.zzf();
                final zzfjr zzfjrVarZzg2 = zzfkaVar.zzg();
                Objects.requireNonNull(zzfjrVarZzg2);
                executorZzf2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfju
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfjrVarZzg2.zzg();
                    }
                });
                zzfkaVar.zzg().onAdMetadataChanged();
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqt zzfqtVarZzi2 = zzfkaVar.zzi();
                    zzfqg zzfqgVar3 = this.zzc;
                    zzfqgVar3.zzg(zzdvuVar.zzr().zzb);
                    zzfqgVar3.zzi(zzdvuVar.zzn().zze());
                    zzfqgVar3.zzd(true);
                    zzfqtVarZzi2.zzb(zzfqgVar3.zzm());
                } else {
                    zzfqt zzfqtVarZzi3 = zzfkaVar.zzi();
                    zzfqg zzfqgVar4 = this.zzc;
                    zzfqgVar4.zzg(zzdvuVar.zzr().zzb);
                    zzfqgVar4.zzi(zzdvuVar.zzn().zze());
                    zzfqgVar4.zzd(true);
                    zzfqtVarZzi3.zzb(zzfqgVar4.zzm());
                }
            }
            throw th;
        }
    }
}
