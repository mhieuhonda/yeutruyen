package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaal implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaal(zzv zzvVar, int i) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zzne.zzad(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaal zzaalVar) {
        return zzgwg.zzg().zzd(this.zzb, zzaalVar.zzb).zzd(this.zza, zzaalVar.zza).zze();
    }
}
