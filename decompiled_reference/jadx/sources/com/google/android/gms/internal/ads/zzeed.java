package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeed {
    private final Context zza;
    private zzase zzb;

    zzeed(Context context) {
        this.zza = context;
    }

    public final void zza() {
        this.zzb = zzasd.zza(this.zza);
    }

    public final void zzb(zzash zzashVar) {
        this.zzb.zzb(zzashVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    public final zzasi zzd() {
        try {
            zzase zzaseVar = this.zzb;
            if (zzaseVar == null || !zzaseVar.zza()) {
                return null;
            }
            return zzaseVar.zzd();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
