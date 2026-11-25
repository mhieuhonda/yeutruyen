package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgz extends zzhfh {
    private final zzhgy zza;

    private zzhgz(zzhgy zzhgyVar) {
        this.zza = zzhgyVar;
    }

    public static zzhgz zzb(zzhgy zzhgyVar) {
        return new zzhgz(zzhgyVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhgz) && ((zzhgz) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhgz.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhgy.zzc;
    }

    public final zzhgy zzc() {
        return this.zza;
    }
}
