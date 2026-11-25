package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzahc implements zzahd {
    private final long zza;
    private final zzahb zzb;

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        return this.zzb;
    }

    public zzahc(long j, long j2) {
        this.zza = j;
        zzahe zzaheVar = j2 == 0 ? zzahe.zza : new zzahe(0L, j2);
        this.zzb = new zzahb(zzaheVar, zzaheVar);
    }
}
