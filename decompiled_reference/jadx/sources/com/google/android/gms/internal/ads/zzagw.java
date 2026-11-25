package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagw implements zzahd {
    private final zzei zza;
    private final zzei zzb;
    private long zzc;

    public zzagw(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgtr.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzei(length2);
            this.zzb = new zzei(length2);
        } else {
            int i = length2 + 1;
            zzei zzeiVar = new zzei(i);
            this.zza = zzeiVar;
            zzei zzeiVar2 = new zzei(i);
            this.zzb = zzeiVar2;
            zzeiVar.zza(0L);
            zzeiVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        zzei zzeiVar = this.zzb;
        if (zzeiVar.zzd() == 0) {
            zzahe zzaheVar = zzahe.zza;
            return new zzahb(zzaheVar, zzaheVar);
        }
        int iZzp = zzfm.zzp(zzeiVar, j, true, true);
        long jZzc = zzeiVar.zzc(iZzp);
        zzei zzeiVar2 = this.zza;
        zzahe zzaheVar2 = new zzahe(jZzc, zzeiVar2.zzc(iZzp));
        if (zzaheVar2.zzb == j || iZzp == zzeiVar.zzd() - 1) {
            return new zzahb(zzaheVar2, zzaheVar2);
        }
        int i = iZzp + 1;
        return new zzahb(zzaheVar2, new zzahe(zzeiVar.zzc(i), zzeiVar2.zzc(i)));
    }
}
