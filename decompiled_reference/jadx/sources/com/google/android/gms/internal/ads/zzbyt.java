package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyt extends zzbnl {
    final /* synthetic */ zzbyv zza;

    /* synthetic */ zzbyt(zzbyv zzbyvVar, byte[] bArr) {
        Objects.requireNonNull(zzbyvVar);
        this.zza = zzbyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zze(zzbnc zzbncVar, String str) {
        zzbyv zzbyvVar = this.zza;
        if (zzbyvVar.zze() == null) {
            return;
        }
        zzbyvVar.zze().onCustomClick(zzbyvVar.zzc(zzbncVar), str);
    }
}
