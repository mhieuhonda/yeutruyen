package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaju extends zzajs {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaju(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaju zzajuVar = (zzaju) obj;
            if (Objects.equals(this.zzb, zzajuVar.zzb) && Objects.equals(this.zza, zzajuVar.zza) && Objects.equals(this.zzc, zzajuVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = length + 9 + str2.length();
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(length2 + 14 + str3.length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }
}
