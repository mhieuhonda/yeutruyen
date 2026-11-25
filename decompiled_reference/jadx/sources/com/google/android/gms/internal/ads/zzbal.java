package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbal implements zzfyo {
    final /* synthetic */ zzfxq zza;

    zzbal(zzfxq zzfxqVar) {
        this.zza = zzfxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public final void zza(int i, long j) {
        this.zza.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public final void zzb(int i, long j, String str) {
        this.zza.zzf(i, System.currentTimeMillis() - j, str);
    }
}
