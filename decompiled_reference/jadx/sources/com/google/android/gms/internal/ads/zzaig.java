package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaig extends zzafm {
    public zzaig(final zzagn zzagnVar, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(zzagnVar);
        zzafj zzafjVar = new zzafj() { // from class: com.google.android.gms.internal.ads.zzaie
            @Override // com.google.android.gms.internal.ads.zzafj
            public final /* synthetic */ long zza(long j4) {
                return zzagnVar.zzb(j4);
            }
        };
        zzaif zzaifVar = new zzaif(zzagnVar, i, null);
        long jZza = zzagnVar.zza();
        long j4 = zzagnVar.zzj;
        int i2 = zzagnVar.zzd;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) zzagnVar.zzc)) / 2) + 1;
        } else {
            int i3 = zzagnVar.zza;
            long j5 = 4096;
            if (i3 == zzagnVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * ((long) zzagnVar.zzg)) * ((long) zzagnVar.zzh)) / 8);
        }
        super(zzafjVar, zzaifVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzagnVar.zzc));
    }
}
