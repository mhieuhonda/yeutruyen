package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfgw implements zzhcc {
    final /* synthetic */ zzfqq zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ zzcwx zzc;
    final /* synthetic */ zzfha zzd;

    zzfgw(zzfha zzfhaVar, zzfqq zzfqqVar, zzfqg zzfqgVar, zzcwx zzcwxVar) {
        this.zza = zzfqqVar;
        this.zzb = zzfqgVar;
        this.zzc = zzcwxVar;
        Objects.requireNonNull(zzfhaVar);
        this.zzd = zzfhaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqq zzfqqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzfha zzfhaVar = this.zzd;
        synchronized (zzfhaVar) {
            zzcwx zzcwxVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcwxVar.zzc().zzg(th);
            zzfhaVar.zzs(zzeVarZzg);
            zzcwxVar.zzb().zzdJ(zzeVarZzg);
            zzfmd.zza(zzeVarZzg.zza, th, "BannerAdLoader.onFailure");
            if (zzfhaVar.zzr()) {
                zzfhaVar.zzn();
                zzfhaVar.zzo().zzd(zzfhaVar.zzq().zzc());
            }
            if (!((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zza) == null) {
                zzfqt zzfqtVarZzp = zzfhaVar.zzp();
                zzfqg zzfqgVar = this.zzb;
                zzfqgVar.zzh(zzeVarZzg);
                zzfqgVar.zzj(th);
                zzfqgVar.zzd(false);
                zzfqtVarZzp.zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zzf(zzeVarZzg);
                zzfqg zzfqgVar2 = this.zzb;
                zzfqgVar2.zzj(th);
                zzfqgVar2.zzd(false);
                zzfqqVar.zza(zzfqgVar2);
                zzfqqVar.zzh();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0010 A[Catch: all -> 0x006c, TryCatch #0 {, blocks: (B:5:0x0007, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x0022, B:13:0x0026, B:15:0x006a, B:14:0x0046), top: B:20:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfqq zzfqqVar;
        zzfha zzfhaVar = this.zzd;
        zzcvs zzcvsVar = (zzcvs) obj;
        synchronized (zzfhaVar) {
            if (zzcvsVar != null) {
                zzcvsVar.zzt();
                if (zzfhaVar.zzr()) {
                    zzfhaVar.zzc();
                }
                if (((Boolean) zzbkq.zzc.zze()).booleanValue() || (zzfqqVar = this.zza) == null) {
                    zzfqt zzfqtVarZzp = zzfhaVar.zzp();
                    zzfqg zzfqgVar = this.zzb;
                    zzfqgVar.zzg(zzcvsVar.zzr().zzb);
                    zzfqgVar.zzi(zzcvsVar.zzn().zze());
                    zzfqgVar.zzd(true);
                    zzfqtVarZzp.zzb(zzfqgVar.zzm());
                } else {
                    zzfqqVar.zze(zzcvsVar.zzr().zzb);
                    zzfqqVar.zzg(zzcvsVar.zzn().zze());
                    zzfqg zzfqgVar2 = this.zzb;
                    zzfqgVar2.zzd(true);
                    zzfqqVar.zza(zzfqgVar2);
                    zzfqqVar.zzh();
                }
            } else {
                if (zzfhaVar.zzr()) {
                    zzfhaVar.zzc();
                }
                if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    zzfqt zzfqtVarZzp2 = zzfhaVar.zzp();
                    zzfqg zzfqgVar3 = this.zzb;
                    zzfqgVar3.zzg(zzcvsVar.zzr().zzb);
                    zzfqgVar3.zzi(zzcvsVar.zzn().zze());
                    zzfqgVar3.zzd(true);
                    zzfqtVarZzp2.zzb(zzfqgVar3.zzm());
                } else {
                    zzfqt zzfqtVarZzp3 = zzfhaVar.zzp();
                    zzfqg zzfqgVar4 = this.zzb;
                    zzfqgVar4.zzg(zzcvsVar.zzr().zzb);
                    zzfqgVar4.zzi(zzcvsVar.zzn().zze());
                    zzfqgVar4.zzd(true);
                    zzfqtVarZzp3.zzb(zzfqgVar4.zzm());
                }
            }
            throw th;
        }
    }
}
