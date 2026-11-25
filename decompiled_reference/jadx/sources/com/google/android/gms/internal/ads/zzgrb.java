package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrb extends zzgsc {
    private final int zza;
    private final String zzb;
    private final int zzc;
    private final Boolean zzd;

    /* synthetic */ zzgrb(int i, String str, int i2, Boolean bool, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = bool;
    }

    public final boolean equals(Object obj) {
        String str;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgsc) {
            zzgsc zzgscVar = (zzgsc) obj;
            if (this.zza == zzgscVar.zza() && ((str = this.zzb) != null ? str.equals(zzgscVar.zzb()) : zzgscVar.zzb() == null) && this.zzc == zzgscVar.zzc() && ((bool = this.zzd) != null ? bool.equals(zzgscVar.zzd()) : zzgscVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i2 = this.zzc;
        int length3 = String.valueOf(i2).length();
        Boolean bool = this.zzd;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i2);
        sb.append(", userInteracted=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final Boolean zzd() {
        return this.zzd;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.zza;
        int i2 = this.zzc;
        Boolean bool = this.zzd;
        return ((((iHashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i2) * 1000003) ^ (bool != null ? bool.hashCode() : 0);
    }
}
