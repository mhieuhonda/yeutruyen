package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzl {
    final /* synthetic */ zzfzm zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfzl(zzfzm zzfzmVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfzmVar);
        this.zza = zzfzmVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfzm zzfzmVar = this.zza;
            if (zzfzmVar.zzb) {
                zzfzp zzfzpVar = zzfzmVar.zza;
                zzfzpVar.zzg(this.zzb);
                zzfzpVar.zzh(this.zzc);
                zzfzpVar.zzi(this.zzd);
                zzfzpVar.zzf(null);
                zzfzpVar.zze();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public final zzfzl zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final zzfzl zzc(int i) {
        this.zzd = i;
        return this;
    }
}
