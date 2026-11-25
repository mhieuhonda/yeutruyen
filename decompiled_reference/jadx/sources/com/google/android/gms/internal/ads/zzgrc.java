package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrc extends zzgse {
    private String zza;
    private String zzb;

    zzgrc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    public final zzgse zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    public final zzgse zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    public final zzgsf zzc() {
        return new zzgrd(this.zza, this.zzb, null);
    }
}
