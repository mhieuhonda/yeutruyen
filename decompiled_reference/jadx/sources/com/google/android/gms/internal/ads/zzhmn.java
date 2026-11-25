package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhmn extends zzheq {
    private final zzhoa zza;

    public zzhmn(zzhoa zzhoaVar) {
        this.zza = zzhoaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmn)) {
            return false;
        }
        zzhoa zzhoaVar = ((zzhmn) obj).zza;
        zzhoa zzhoaVar2 = this.zza;
        return zzhoaVar2.zzc().zzc().equals(zzhoaVar.zzc().zzc()) && zzhoaVar2.zzc().zza().equals(zzhoaVar.zzc().zza()) && zzhoaVar2.zzc().zzb().equals(zzhoaVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhoa zzhoaVar = this.zza;
        return Objects.hash(zzhoaVar.zzc(), zzhoaVar.zzf());
    }

    public final String toString() {
        String str;
        zzhoa zzhoaVar = this.zza;
        String strZza = zzhoaVar.zzc().zza();
        int iOrdinal = zzhoaVar.zzc().zzc().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZza, str);
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza.zzc().zzc() != zzhtx.RAW;
    }

    public final zzhoa zzb() {
        return this.zza;
    }
}
