package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcv extends zzgcu {
    private static zzgcv zzd;

    private zzgcv(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgcv zzh(Context context) {
        zzgcv zzgcvVar;
        synchronized (zzgcv.class) {
            if (zzd == null) {
                zzd = new zzgcv(context);
            }
            zzgcvVar = zzd;
        }
        return zzgcvVar;
    }

    public final zzgcr zzi(long j, boolean z) throws IOException {
        zzgcr zzgcrVarZza;
        synchronized (zzgcv.class) {
            zzgcrVarZza = zza(null, null, j, z);
        }
        return zzgcrVarZza;
    }

    public final zzgcr zzj(String str, String str2, long j, boolean z) throws IOException {
        zzgcr zzgcrVarZza;
        synchronized (zzgcv.class) {
            zzgcrVarZza = zza(str, str2, j, z);
        }
        return zzgcrVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzgcv.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzgcv.class) {
            zzc(true);
        }
    }
}
