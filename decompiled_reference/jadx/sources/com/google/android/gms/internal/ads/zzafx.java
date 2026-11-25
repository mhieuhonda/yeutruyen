package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafx implements zzahm {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzA(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i, int i2) {
        zzeuVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zze(long j, int i, int i2, int i3, zzahl zzahlVar) {
    }
}
