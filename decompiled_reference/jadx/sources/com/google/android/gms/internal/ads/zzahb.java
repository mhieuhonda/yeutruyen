package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahb {
    public final zzahe zza;
    public final zzahe zzb;

    public zzahb(zzahe zzaheVar, zzahe zzaheVar2) {
        this.zza = zzaheVar;
        this.zzb = zzaheVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahb zzahbVar = (zzahb) obj;
            if (this.zza.equals(zzahbVar.zza) && this.zzb.equals(zzahbVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzahe zzaheVar = this.zza;
        zzahe zzaheVar2 = this.zzb;
        String string = zzaheVar.toString();
        String strConcat = zzaheVar.equals(zzaheVar2) ? "" : ", ".concat(zzaheVar2.toString());
        StringBuilder sb = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb.append("[");
        sb.append(string);
        sb.append(strConcat);
        sb.append("]");
        return sb.toString();
    }
}
