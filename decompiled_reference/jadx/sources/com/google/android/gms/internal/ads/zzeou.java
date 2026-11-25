package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeou implements zzhcc {
    final /* synthetic */ zzfkn zza;
    final /* synthetic */ zzeov zzb;

    zzeou(zzeov zzeovVar, zzfkn zzfknVar) {
        this.zza = zzfknVar;
        Objects.requireNonNull(zzeovVar);
        this.zzb = zzeovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzeov zzeovVar = this.zzb;
        synchronized (zzeovVar) {
            zzeow zzeowVarZzc = zzeovVar.zzc();
            zzfkn zzfknVar = this.zza;
            zzeowVarZzc.zzc(th, zzfknVar);
            zzfkn zzfknVarZza = zzeovVar.zzc().zza();
            if (zzfknVar.zzav) {
                while (zzfknVarZza != null) {
                    zzeovVar.zzb(zzfknVarZza);
                    zzfknVarZza = zzeovVar.zzc().zza();
                }
            } else if (zzfknVarZza != null) {
                zzeovVar.zzb(zzfknVarZza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeov zzeovVar = this.zzb;
        zzepm zzepmVar = (zzepm) obj;
        synchronized (zzeovVar) {
            zzeovVar.zzc().zzb(zzepmVar, this.zza);
            zzfkn zzfknVarZza = zzeovVar.zzc().zza();
            if (zzfknVarZza != null) {
                zzeovVar.zzb(zzfknVarZza);
            }
        }
    }
}
