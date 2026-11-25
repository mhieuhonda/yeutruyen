package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcgj implements zzhcc {
    final /* synthetic */ zzcgh zza;
    final /* synthetic */ zzcgf zzb;

    zzcgj(zzcgk zzcgkVar, zzcgh zzcghVar, zzcgf zzcgfVar) {
        this.zza = zzcghVar;
        this.zzb = zzcgfVar;
        Objects.requireNonNull(zzcgkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
