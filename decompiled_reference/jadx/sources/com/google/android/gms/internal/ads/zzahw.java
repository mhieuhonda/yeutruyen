package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahw implements zzahs {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzahw(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzahw zzb(zzeu zzeuVar) {
        int iZzC = zzeuVar.zzC();
        zzeuVar.zzk(8);
        int iZzC2 = zzeuVar.zzC();
        int iZzC3 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        int iZzC4 = zzeuVar.zzC();
        zzeuVar.zzk(12);
        return new zzahw(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return 1751742049;
    }
}
