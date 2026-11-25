package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcw extends zzgcu {
    private static zzgcw zzd;

    private zzgcw(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgcw zzh(Context context) {
        zzgcw zzgcwVar;
        synchronized (zzgcw.class) {
            if (zzd == null) {
                zzd = new zzgcw(context);
            }
            zzgcwVar = zzd;
        }
        return zzgcwVar;
    }

    public final zzgcr zzi(long j, boolean z) throws IOException {
        synchronized (zzgcw.class) {
            if (this.zzc.zzc()) {
                return zza(null, null, j, z);
            }
            return new zzgcr();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgcw.class) {
            if (zzg(false)) {
                zzc(false);
            }
        }
    }
}
