package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagl implements zzahd {
    private final zzagn zza;
    private final long zzb;

    public zzagl(zzagn zzagnVar, long j) {
        this.zza = zzagnVar;
        this.zzb = j;
    }

    private final zzahe zze(long j, long j2) {
        return new zzahe((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        zzagn zzagnVar = this.zza;
        zzagm zzagmVar = zzagnVar.zzk;
        zzagmVar.getClass();
        long jZzb = zzagnVar.zzb(j);
        long[] jArr = zzagmVar.zza;
        int iZzo = zzfm.zzo(jArr, jZzb, true, false);
        long j2 = iZzo == -1 ? 0L : jArr[iZzo];
        long[] jArr2 = zzagmVar.zzb;
        zzahe zzaheVarZze = zze(j2, iZzo != -1 ? jArr2[iZzo] : 0L);
        if (zzaheVarZze.zzb == j || iZzo == jArr.length - 1) {
            return new zzahb(zzaheVarZze, zzaheVarZze);
        }
        int i = iZzo + 1;
        return new zzahb(zzaheVarZze, zze(jArr[i], jArr2[i]));
    }
}
