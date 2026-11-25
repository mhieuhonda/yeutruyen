package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhb implements zzbfr {
    final /* synthetic */ zzbhe zza;

    zzbhb(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.zza = zzbheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z) {
        zzbhe zzbheVar = this.zza;
        if (z) {
            zzbheVar.zzf();
        } else {
            zzbheVar.zzg();
        }
    }
}
