package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgqw extends zzgre {
    private String zza;
    private String zzb;

    zzgqw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final zzgre zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final zzgre zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    public final zzgrf zzc() {
        return new zzgqx(this.zza, this.zzb, null);
    }
}
