package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhvp extends zzhxt {
    private final zzhvo zza;

    private zzhvp(zzhvo zzhvoVar) {
        this.zza = zzhvoVar;
    }

    public static zzhvp zzb(zzhvo zzhvoVar) {
        return new zzhvp(zzhvoVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhvp) && ((zzhvp) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhvp.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhvo.zzd;
    }

    public final zzhvo zzc() {
        return this.zza;
    }
}
