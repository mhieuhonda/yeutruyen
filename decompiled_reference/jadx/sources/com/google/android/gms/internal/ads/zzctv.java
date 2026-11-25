package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzctv implements zzhcc {
    final /* synthetic */ zzcuc zza;

    zzctv(zzcuc zzcucVar) {
        Objects.requireNonNull(zzcucVar);
        this.zza = zzcucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuc zzcucVar = this.zza;
        zzcucVar.zzu().zzb(zzcucVar.zzt().zzb(zzcucVar.zzr(), zzcucVar.zzs(), false, "", (String) obj, zzcucVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzt(zzcucVar.zzq()) ? 2 : 1);
    }
}
