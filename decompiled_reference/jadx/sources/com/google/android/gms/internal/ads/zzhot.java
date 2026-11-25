package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhot extends zzhpj {
    private final int zza;
    private final int zzb;
    private final zzhos zzc;

    /* synthetic */ zzhot(int i, int i2, zzhos zzhosVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhosVar;
    }

    public static zzhor zzb() {
        return new zzhor(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhot)) {
            return false;
        }
        zzhot zzhotVar = (zzhot) obj;
        return zzhotVar.zza == this.zza && zzhotVar.zze() == zze() && zzhotVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhot.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = String.valueOf(strValueOf).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzc != zzhos.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhos zzhosVar = this.zzc;
        if (zzhosVar == zzhos.zzd) {
            return this.zzb;
        }
        if (zzhosVar == zzhos.zza || zzhosVar == zzhos.zzb || zzhosVar == zzhos.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhos zzf() {
        return this.zzc;
    }
}
