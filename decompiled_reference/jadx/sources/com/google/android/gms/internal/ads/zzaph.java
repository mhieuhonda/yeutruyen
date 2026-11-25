package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaph implements Comparable {
    public final int zza;
    public final zzapc zzb;

    public zzaph(int i, zzapc zzapcVar) {
        this.zza = i;
        this.zzb = zzapcVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzaph) obj).zza);
    }
}
