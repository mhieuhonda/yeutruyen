package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzs extends zzfzy {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfzs() {
    }

    public final zzfzy zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final zzfzy zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    final zzfzy zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final zzfzy zze(int i) {
        this.zzd = 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final zzfzz zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfzt(this.zza, false, this.zzc, null, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
