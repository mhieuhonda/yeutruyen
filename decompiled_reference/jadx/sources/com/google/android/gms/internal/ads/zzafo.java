package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafo implements zzahd {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzafo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        int i = this.zza;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        long[] jArr = this.zze;
        int iZzo = zzfm.zzo(jArr, j, true, true);
        long j2 = jArr[iZzo];
        long[] jArr2 = this.zzc;
        zzahe zzaheVar = new zzahe(j2, jArr2[iZzo]);
        if (zzaheVar.zzb >= j || iZzo == this.zza - 1) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i = iZzo + 1;
        return new zzahb(zzaheVar, new zzahe(jArr[i], jArr2[i]));
    }
}
