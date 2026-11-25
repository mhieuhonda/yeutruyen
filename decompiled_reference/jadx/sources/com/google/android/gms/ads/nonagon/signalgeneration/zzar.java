package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdlv;
import com.google.android.gms.internal.ads.zzhcc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzar implements zzhcc {
    final /* synthetic */ zzdlv zza;

    zzar(zzdlv zzdlvVar) {
        this.zza = zzdlvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* synthetic */ void zzb(Object obj) {
        this.zza.zza((zzbc) obj);
    }
}
