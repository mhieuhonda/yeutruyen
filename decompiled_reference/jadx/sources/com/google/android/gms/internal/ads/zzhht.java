package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhht extends zzhfh {
    private final zzhhs zza;
    private final String zzb;
    private final zzhhr zzc;
    private final zzhfh zzd;

    /* synthetic */ zzhht(zzhhs zzhhsVar, String str, zzhhr zzhhrVar, zzhfh zzhfhVar, byte[] bArr) {
        this.zza = zzhhsVar;
        this.zzb = str;
        this.zzc = zzhhrVar;
        this.zzd = zzhfhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhht)) {
            return false;
        }
        zzhht zzhhtVar = (zzhht) obj;
        return zzhhtVar.zzc.equals(this.zzc) && zzhhtVar.zzd.equals(this.zzd) && zzhhtVar.zzb.equals(this.zzb) && zzhhtVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhht.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzhhs zzhhsVar = this.zza;
        zzhfh zzhfhVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhfhVar);
        String strValueOf3 = String.valueOf(zzhhsVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + String.valueOf(strValueOf2).length() + 11 + String.valueOf(strValueOf3).length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(strValueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(strValueOf2);
        sb.append(", variant: ");
        sb.append(strValueOf3);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhhs.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzhhs zzc() {
        return this.zza;
    }

    public final zzhfh zzd() {
        return this.zzd;
    }
}
