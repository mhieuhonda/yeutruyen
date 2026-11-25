package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzboh extends zzbno {
    final /* synthetic */ zzboi zza;

    /* synthetic */ zzboh(zzboi zzboiVar, byte[] bArr) {
        Objects.requireNonNull(zzboiVar);
        this.zza = zzboiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnp
    public final void zze(zzbnc zzbncVar) {
        zzboi zzboiVar = this.zza;
        zzboiVar.zzc().zzb(zzboiVar.zze(zzbncVar));
    }
}
