package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftp implements zzbfr {
    final /* synthetic */ zzftr zza;

    zzftp(zzftr zzftrVar) {
        Objects.requireNonNull(zzftrVar);
        this.zza = zzftrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzD)).booleanValue()) {
            this.zza.zzj(z);
        }
    }
}
