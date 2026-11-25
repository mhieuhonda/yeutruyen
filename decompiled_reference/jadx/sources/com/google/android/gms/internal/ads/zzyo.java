package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyo implements zzzd {
    final /* synthetic */ zzyr zza;
    private final int zzb;

    public zzyo(zzyr zzyrVar, int i) {
        Objects.requireNonNull(zzyrVar);
        this.zza = zzyrVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zza() {
        return this.zza.zzh(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() throws IOException {
        this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzc(zzly zzlyVar, zzix zzixVar, int i) {
        return this.zza.zzk(this.zzb, zzlyVar, zzixVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzd(long j) {
        return this.zza.zzp(this.zzb, j);
    }

    final /* synthetic */ int zze() {
        return this.zzb;
    }
}
