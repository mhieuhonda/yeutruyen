package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbog extends zzbnl {
    final /* synthetic */ zzboi zza;

    /* synthetic */ zzbog(zzboi zzboiVar, byte[] bArr) {
        Objects.requireNonNull(zzboiVar);
        this.zza = zzboiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zze(zzbnc zzbncVar, String str) {
        zzboi zzboiVar = this.zza;
        if (zzboiVar.zzd() == null) {
            return;
        }
        zzboiVar.zzd().zzc(zzboiVar.zze(zzbncVar), str);
    }
}
