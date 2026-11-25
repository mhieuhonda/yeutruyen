package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcgi implements zzhcc {
    final /* synthetic */ zzcgk zza;

    zzcgi(zzcgk zzcgkVar) {
        Objects.requireNonNull(zzcgkVar);
        this.zza = zzcgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}
