package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtk implements zzcgh {
    final /* synthetic */ zzbua zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ zzbub zzc;

    zzbtk(zzbub zzbubVar, zzbua zzbuaVar, zzfqg zzfqgVar) {
        this.zza = zzbuaVar;
        this.zzb = zzfqgVar;
        Objects.requireNonNull(zzbubVar);
        this.zzc = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbub zzbubVar = this.zzc;
        synchronized (zzbubVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            zzbubVar.zzl(0);
            if (zzbubVar.zzi() != null && this.zza != zzbubVar.zzi()) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                zzbubVar.zzi().zzc();
            }
            zzbubVar.zzj(this.zza);
            if (((Boolean) zzbkq.zzd.zze()).booleanValue() && zzbubVar.zzh() != null) {
                zzfqt zzfqtVarZzh = zzbubVar.zzh();
                zzfqg zzfqgVar = this.zzb;
                zzfqgVar.zzd(true);
                zzfqtVarZzh.zzb(zzfqgVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
