package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzctw implements zzhcc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcuc zzb;

    zzctw(zzcuc zzcucVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcucVar);
        this.zzb = zzcucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzcuc zzcucVar = this.zzb;
        zzcucVar.zzu().zza(zzcucVar.zzt().zzb(zzcucVar.zzr(), zzcucVar.zzs(), false, this.zza, null, zzcucVar.zzp(), zzcucVar.zzw(), zzcucVar.zzx()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzcuc zzcucVar = this.zzb;
        zzcucVar.zzu().zza(zzcucVar.zzt().zzb(zzcucVar.zzr(), zzcucVar.zzs(), false, str, str2, zzcucVar.zzp(), zzcucVar.zzw(), zzcucVar.zzx()), zzcucVar.zzv());
    }
}
