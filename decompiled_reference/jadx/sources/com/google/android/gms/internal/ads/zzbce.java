package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbce implements Runnable {
    final /* synthetic */ zzbcg zza;

    zzbce(zzbcg zzbcgVar) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }
}
