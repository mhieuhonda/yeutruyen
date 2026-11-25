package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhvf extends zzhxt {
    private final zzhvd zza;
    private final zzhvb zzb;
    private final zzhvc zzc;
    private final zzhve zzd;

    /* synthetic */ zzhvf(zzhvd zzhvdVar, zzhvb zzhvbVar, zzhvc zzhvcVar, zzhve zzhveVar, byte[] bArr) {
        this.zza = zzhvdVar;
        this.zzb = zzhvbVar;
        this.zzc = zzhvcVar;
        this.zzd = zzhveVar;
    }

    public static zzhva zzb() {
        return new zzhva(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvf)) {
            return false;
        }
        zzhvf zzhvfVar = (zzhvf) obj;
        return zzhvfVar.zza == this.zza && zzhvfVar.zzb == this.zzb && zzhvfVar.zzc == this.zzc && zzhvfVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhvf.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(string);
        sb.append(", hashType: ");
        sb.append(string2);
        sb.append(", encoding: ");
        sb.append(string3);
        sb.append(", curve: ");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhve.zzd;
    }

    public final zzhvd zzc() {
        return this.zza;
    }

    public final zzhvb zzd() {
        return this.zzb;
    }

    public final zzhvc zze() {
        return this.zzc;
    }

    public final zzhve zzf() {
        return this.zzd;
    }
}
