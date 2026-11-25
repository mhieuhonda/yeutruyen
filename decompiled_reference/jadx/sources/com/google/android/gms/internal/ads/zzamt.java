package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamt implements zzahh {
    public final int zza;
    public final zzham zzb;

    public zzamt(int i, int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzham.zzf(iArr) : zzham.zza();
    }

    public final String toString() {
        zzham zzhamVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzhamVar.zzh());
        for (int i = 0; i < zzhamVar.zzh(); i++) {
            arrayList.add(zzfm.zzA(zzhamVar.zzi(i)));
        }
        String strZzA = zzfm.zzA(this.zza);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(strZzA.length() + 37 + string.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(strZzA);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
