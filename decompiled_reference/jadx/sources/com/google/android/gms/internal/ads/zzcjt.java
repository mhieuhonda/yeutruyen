package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcjt implements zzma {
    private final zzabs zza = new zzabs(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcjt() {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zza(zzqh zzqhVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzb(zzlz zzlzVar, zzzo zzzoVar, zzabb[] zzabbVarArr) {
        int i;
        this.zzf = 0;
        for (zzabb zzabbVar : zzabbVarArr) {
            if (zzabbVar != null) {
                int i2 = this.zzf;
                int i3 = zzabbVar.zza().zzc;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzc(zzqh zzqhVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final void zzd(zzqh zzqhVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final zzabm zze(zzqh zzqhVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final long zzf(zzqh zzqhVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzg(zzqh zzqhVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzh(zzlz zzlzVar) {
        char c;
        long j = zzlzVar.zze;
        boolean z = true;
        if (j > this.zzc) {
            c = 0;
        } else {
            c = j < this.zzb ? (char) 2 : (char) 1;
        }
        int iZzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || iZzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final boolean zzi(zzlz zzlzVar) {
        long j = zzlzVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzlzVar.zze >= j;
    }

    public final synchronized void zzk(int i) {
        this.zzb = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zze = ((long) i) * 1000;
    }

    final void zzo(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }
}
