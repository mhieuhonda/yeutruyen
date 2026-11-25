package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzekf extends zzelb {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzekf(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzelb) {
            zzelb zzelbVar = (zzelb) obj;
            if (this.zza.equals(zzelbVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzelbVar.zzb()) : zzelbVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzelbVar.zzc()) : zzelbVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzelbVar.zzd()) : zzelbVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = String.valueOf(strValueOf).length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        sb.append("OfflineUtilsParams{activity=");
        sb.append(string);
        sb.append(", adOverlay=");
        sb.append(strValueOf);
        sb.append(", gwsQueryId=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final String zzd() {
        return this.zzd;
    }
}
