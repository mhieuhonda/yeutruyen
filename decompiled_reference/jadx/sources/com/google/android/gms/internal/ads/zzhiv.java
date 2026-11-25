package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhiv extends zzhfh {
    private final zzhiu zza;

    private zzhiv(zzhiu zzhiuVar) {
        this.zza = zzhiuVar;
    }

    public static zzhiv zzb(zzhiu zzhiuVar) {
        return new zzhiv(zzhiuVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhiv) && ((zzhiv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhiv.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhiu.zzc;
    }

    public final zzhiu zzc() {
        return this.zza;
    }
}
