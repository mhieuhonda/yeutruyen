package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaji extends zzajs {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaji(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaji zzajiVar = (zzaji) obj;
            if (this.zzc == zzajiVar.zzc && Objects.equals(this.zza, zzajiVar.zza) && Objects.equals(this.zzb, zzajiVar.zzb) && Arrays.equals(this.zzd, zzajiVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzd, this.zzc);
    }
}
