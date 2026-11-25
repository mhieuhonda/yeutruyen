package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefu implements zzhcc {
    final /* synthetic */ zzega zza;

    zzefu(zzega zzegaVar) {
        Objects.requireNonNull(zzegaVar);
        this.zza = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfky zzfkyVar = (zzfky) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcX)).booleanValue()) {
            this.zza.zzf().zzdQ(zzfkyVar);
        }
    }
}
