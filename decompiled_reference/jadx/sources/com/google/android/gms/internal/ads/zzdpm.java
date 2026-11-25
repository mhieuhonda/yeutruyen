package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdpm implements zzhcc {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdpw zzb;

    zzdpm(zzdpw zzdpwVar, String str, boolean z) {
        Objects.requireNonNull(zzdpwVar);
        this.zzb = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgy)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdpw zzdpwVar = this.zzb;
        zzdpwVar.zzZ().zzo((zzclb) obj);
        String str = this.zza;
        zzcgd zzcgdVarZzY = zzdpwVar.zzZ().zzY();
        zzelv zzelvVarZzL = zzdpwVar.zzL(str, true);
        if (zzelvVarZzL != null && zzcgdVarZzY != null) {
            zzcgdVarZzY.zzc(zzelvVarZzL);
        } else if (zzcgdVarZzY != null) {
            zzcgdVarZzY.cancel(false);
        }
    }
}
