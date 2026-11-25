package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfua implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zza;
    final /* synthetic */ zzful zzb;

    zzfua(zzful zzfulVar, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = zzdxVar;
        Objects.requireNonNull(zzfulVar);
        this.zzb = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK(this.zza);
    }
}
