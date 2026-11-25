package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhio extends zzhfh {
    private final zzhin zza;
    private final int zzb;

    private zzhio(zzhin zzhinVar, int i) {
        this.zza = zzhinVar;
        this.zzb = i;
    }

    public static zzhio zzb(zzhin zzhinVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhio(zzhinVar, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhio)) {
            return false;
        }
        zzhio zzhioVar = (zzhio) obj;
        return zzhioVar.zza == this.zza && zzhioVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhio.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(string);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhin.zzb;
    }

    public final zzhin zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
