package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzetr implements zzetz {
    final /* synthetic */ zzets zza;

    zzetr(zzets zzetsVar) {
        Objects.requireNonNull(zzetsVar);
        this.zza = zzetsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzets zzetsVar = this.zza;
        synchronized (zzetsVar) {
            zzetsVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzets zzetsVar = this.zza;
        zzdmh zzdmhVar = (zzdmh) obj;
        synchronized (zzetsVar) {
            zzetsVar.zzN(zzdmhVar);
            zzetsVar.zzM().zzj();
        }
    }
}
