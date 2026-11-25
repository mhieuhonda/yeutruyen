package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzakb implements zzao {
    public final float zza;
    public final int zzb;

    public zzakb(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzakb zzakbVar = (zzakb) obj;
            if (this.zza == zzakbVar.zza && this.zzb == zzakbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int length = String.valueOf(f).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
