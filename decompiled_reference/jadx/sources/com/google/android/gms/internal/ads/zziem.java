package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziem implements zzied {
    final int zza;
    final zzihq zzb;
    final boolean zzc;
    final boolean zzd;

    zziem(zzieu zzieuVar, int i, zzihq zzihqVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zzihqVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zziem) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final zzihq zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final zzihr zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzied
    public final boolean zze() {
        return this.zzd;
    }
}
