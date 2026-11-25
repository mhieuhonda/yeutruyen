package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzegh implements zzhcc {
    final /* synthetic */ Context zza;

    zzegh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) zzbkp.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbii.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbkp.zzj.zze()).booleanValue()) {
            zzbii.zze(this.zza);
        }
    }
}
