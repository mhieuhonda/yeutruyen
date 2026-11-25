package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaak extends zzaar implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaak(int i, zzbg zzbgVar, int i2, zzaan zzaanVar, int i3) {
        super(i, zzbgVar, i2);
        this.zze = zzne.zzad(i3, zzaanVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaak zzaakVar) {
        return Integer.compare(this.zzf, zzaakVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        return false;
    }
}
