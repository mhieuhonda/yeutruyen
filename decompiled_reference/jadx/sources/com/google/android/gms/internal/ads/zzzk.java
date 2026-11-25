package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzk implements zzzd {
    private final zzzd zza;
    private final long zzb;

    public zzzk(zzzd zzzdVar, long j) {
        this.zza = zzzdVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() throws IOException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzc(zzly zzlyVar, zzix zzixVar, int i) {
        int iZzc = this.zza.zzc(zzlyVar, zzixVar, i);
        if (iZzc != -4) {
            return iZzc;
        }
        zzixVar.zzd += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzd(long j) {
        return this.zza.zzd(j - this.zzb);
    }

    public final zzzd zze() {
        return this.zza;
    }
}
