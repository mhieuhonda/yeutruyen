package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakz implements zzaky {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzakz(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzakz zze(long j, long j2, zzagx zzagxVar, zzeu zzeuVar) {
        int iZzs;
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.zzk(6);
        int iZzB = zzeuVar2.zzB();
        long j3 = zzagxVar.zzc;
        long j4 = iZzB;
        int iZzB2 = zzeuVar2.zzB();
        if (iZzB2 <= 0) {
            return null;
        }
        long jZzu = zzfm.zzu((((long) iZzB2) * ((long) zzagxVar.zzg)) - 1, zzagxVar.zzd);
        int iZzt = zzeuVar2.zzt();
        int iZzt2 = zzeuVar2.zzt();
        int iZzt3 = zzeuVar2.zzt();
        zzeuVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i = 0;
        long j5 = j2 + ((long) zzagxVar.zzc);
        while (i < iZzt) {
            long j6 = j3;
            jArr[i] = (((long) i) * jZzu) / ((long) iZzt);
            jArr2[i] = j5;
            if (iZzt3 == 1) {
                iZzs = zzeuVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzeuVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzeuVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzeuVar2.zzH();
            }
            j5 += ((long) iZzs) * ((long) iZzt2);
            i++;
            zzeuVar2 = zzeuVar;
            iZzt = iZzt;
            j3 = j6;
        }
        long j7 = j2 + j3;
        long jMax = j7 + j4;
        if (j != -1 && j != jMax) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(jMax).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(jMax);
            zzeh.zzc("VbriSeeker", sb.toString());
        }
        if (jMax != j5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMax).length() + 43 + String.valueOf(j5).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(jMax);
            sb2.append(", ");
            sb2.append(j5);
            sb2.append("\nSeeking will be inaccurate.");
            zzeh.zzc("VbriSeeker", sb2.toString());
            jMax = Math.max(jMax, j5);
        }
        return new zzakz(jArr, jArr2, jZzu, j7, jMax, zzagxVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        long[] jArr = this.zza;
        int iZzo = zzfm.zzo(jArr, j, true, true);
        long j2 = jArr[iZzo];
        long[] jArr2 = this.zzb;
        zzahe zzaheVar = new zzahe(j2, jArr2[iZzo]);
        if (zzaheVar.zzb >= j || iZzo == jArr.length - 1) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i = iZzo + 1;
        return new zzahb(zzaheVar, new zzahe(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzf(long j) {
        return this.zza[zzfm.zzo(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.zze;
    }
}
