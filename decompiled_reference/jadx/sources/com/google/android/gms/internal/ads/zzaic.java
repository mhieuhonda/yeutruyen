package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaic implements zzaga {
    private final zzeu zza = new zzeu(4);
    private final zzahf zzb = new zzahf(-1, -1, "image/avif");

    private final boolean zzh(zzagb zzagbVar, int i) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(4);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        return zzeuVar.zzz() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzagbVar.zzk(4);
        return zzh(zzagbVar, 1718909296) && zzh(zzagbVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzb.zzc(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        return this.zzb.zzd(zzagbVar, zzahaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzb.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }
}
