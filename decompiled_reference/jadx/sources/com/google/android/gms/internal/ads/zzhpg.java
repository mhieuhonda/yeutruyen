package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhpg extends zzhpj {
    private final int zza;
    private final int zzb;
    private final zzhpf zzc;
    private final zzhpe zzd;

    /* synthetic */ zzhpg(int i, int i2, zzhpf zzhpfVar, zzhpe zzhpeVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhpfVar;
        this.zzd = zzhpeVar;
    }

    public static zzhpd zzb() {
        return new zzhpd(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpg)) {
            return false;
        }
        zzhpg zzhpgVar = (zzhpg) obj;
        return zzhpgVar.zza == this.zza && zzhpgVar.zze() == zze() && zzhpgVar.zzc == this.zzc && zzhpgVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhpg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhpe zzhpeVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhpeVar);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int i = this.zzb;
        int length3 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzc != zzhpf.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhpf zzhpfVar = this.zzc;
        if (zzhpfVar == zzhpf.zzd) {
            return this.zzb;
        }
        if (zzhpfVar == zzhpf.zza || zzhpfVar == zzhpf.zzb || zzhpfVar == zzhpf.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhpf zzf() {
        return this.zzc;
    }

    public final zzhpe zzg() {
        return this.zzd;
    }
}
