package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhvz extends zzhxt {
    private final zzhvx zza;
    private final zzhvy zzb;

    private zzhvz(zzhvx zzhvxVar, zzhvy zzhvyVar) {
        this.zza = zzhvxVar;
        this.zzb = zzhvyVar;
    }

    public static zzhvz zzb(zzhvx zzhvxVar, zzhvy zzhvyVar) {
        return new zzhvz(zzhvxVar, zzhvyVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvz)) {
            return false;
        }
        zzhvz zzhvzVar = (zzhvz) obj;
        return zzhvzVar.zza == this.zza && zzhvzVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhvz.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 1);
        sb.append("ML-DSA Parameters (ML-DSA instance: ");
        sb.append(string);
        sb.append(", variant: ");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzb != zzhvy.zzb;
    }
}
