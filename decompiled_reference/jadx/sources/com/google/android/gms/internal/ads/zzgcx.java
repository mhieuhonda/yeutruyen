package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcx {
    private static zzgcx zzb;
    final zzgct zza;

    private zzgcx(Context context) {
        this.zza = zzgct.zza(context);
        zzgcs.zza(context);
    }

    public static final zzgcx zza(Context context) {
        zzgcx zzgcxVar;
        synchronized (zzgcx.class) {
            if (zzb == null) {
                zzb = new zzgcx(context);
            }
            zzgcxVar = zzb;
        }
        return zzgcxVar;
    }

    public final void zzb(zzgcr zzgcrVar) throws IOException {
        synchronized (zzgcx.class) {
            zzgct zzgctVar = this.zza;
            zzgctVar.zzf("vendor_scoped_gpid_v2_id");
            zzgctVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
