package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzakw implements zzao {
    public final float zza;
    public final zzakv zzb;
    public final zzakv zzc;

    private zzakw(float f, zzakv zzakvVar, zzakv zzakvVar2) {
        this.zza = f;
        this.zzb = zzakvVar;
        this.zzc = zzakvVar2;
    }

    public static zzakw zzb(float f, int i, int i2) {
        zzakv zzakvVarZza = zzakv.zza(i);
        zzakv zzakvVarZza2 = zzakv.zza(i2);
        if (f <= 0.0f && zzakvVarZza == null && zzakvVarZza2 == null) {
            return null;
        }
        return new zzakw(f, zzakvVarZza, zzakvVarZza2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakw)) {
            return false;
        }
        zzakw zzakwVar = (zzakw) obj;
        return Float.compare(this.zza, zzakwVar.zza) == 0 && Objects.equals(this.zzb, zzakwVar.zzb) && Objects.equals(this.zzc, zzakwVar.zzc);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.zza) * 31;
        zzakv zzakvVar = this.zzb;
        int iHashCode2 = (iHashCode + (zzakvVar != null ? zzakvVar.hashCode() : 0)) * 31;
        zzakv zzakvVar2 = this.zzc;
        return iHashCode2 + (zzakvVar2 != null ? zzakvVar2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        float f = this.zza;
        int length = String.valueOf(f).length();
        StringBuilder sb = new StringBuilder(length + 37 + String.valueOf(strValueOf).length() + 10 + String.valueOf(strValueOf2).length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f);
        sb.append(", field 1=");
        sb.append(strValueOf);
        sb.append(", field 2=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
