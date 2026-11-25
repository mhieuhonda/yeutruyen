package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgra extends zzgsb {
    private int zza;
    private String zzb;
    private int zzc;
    private Boolean zzd;
    private byte zze;

    zzgra() {
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zza(int i) {
        this.zza = i;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zzc(int i) {
        this.zzc = i;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsb zzd(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsb
    public final zzgsc zze() {
        if (this.zze == 3) {
            return new zzgrb(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zze & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.zze & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
