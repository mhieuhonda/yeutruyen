package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasc implements zzaga {
    private final zzeu zza = new zzeu(4);
    private final zzahf zzb = new zzahf(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(4);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        if (zzeuVar.zzz() != 1380533830) {
            return false;
        }
        zzagbVar.zzk(4);
        zzeuVar.zza(4);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        return zzeuVar.zzz() == 1464156752;
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
