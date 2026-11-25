package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfz extends zzgb {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfz(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final String toString() {
        List list = this.zzb;
        String strZze = zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb.append(strZze);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final void zza(zzga zzgaVar) {
        this.zzb.add(zzgaVar);
    }

    public final void zzb(zzfz zzfzVar) {
        this.zzc.add(zzfzVar);
    }

    public final zzga zzc(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzga zzgaVar = (zzga) list.get(i2);
            if (zzgaVar.zzd == i) {
                return zzgaVar;
            }
        }
        return null;
    }

    public final zzfz zzd(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfz zzfzVar = (zzfz) list.get(i2);
            if (zzfzVar.zzd == i) {
                return zzfzVar;
            }
        }
        return null;
    }
}
