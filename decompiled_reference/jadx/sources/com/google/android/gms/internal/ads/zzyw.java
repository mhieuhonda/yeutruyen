package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyw implements zzabl {
    public long zza;
    public long zzb;
    public zzabk zzc;
    public zzyw zzd;

    public zzyw(long j, int i) {
        zza(j, 65536);
    }

    public final void zza(long j, int i) {
        zzgtr.zzi(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzyw zzc() {
        this.zzc = null;
        zzyw zzywVar = this.zzd;
        this.zzd = null;
        return zzywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final zzabl zze() {
        zzyw zzywVar = this.zzd;
        if (zzywVar == null || zzywVar.zzc == null) {
            return null;
        }
        return zzywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final zzabk zzd() {
        zzabk zzabkVar = this.zzc;
        zzabkVar.getClass();
        return zzabkVar;
    }
}
