package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahk implements zzagd {
    private final long zzb;
    private final zzagd zzc;

    public zzahk(long j, zzagd zzagdVar) {
        this.zzb = j;
        this.zzc = zzagdVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final zzahm zzs(int i, int i2) {
        return this.zzc.zzs(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzw(zzahd zzahdVar) {
        this.zzc.zzw(new zzahj(this, zzahdVar, zzahdVar));
    }
}
