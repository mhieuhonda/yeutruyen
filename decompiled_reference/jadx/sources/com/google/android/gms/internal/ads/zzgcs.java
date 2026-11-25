package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcs {
    private static zzgcs zzb;
    final zzgct zza;

    private zzgcs(Context context) {
        this.zza = zzgct.zza(context);
    }

    public static final zzgcs zza(Context context) {
        zzgcs zzgcsVar;
        synchronized (zzgcs.class) {
            if (zzb == null) {
                zzb = new zzgcs(context);
            }
            zzgcsVar = zzb;
        }
        return zzgcsVar;
    }

    public final void zzb(boolean z) throws IOException {
        synchronized (zzgcs.class) {
            zzgct zzgctVar = this.zza;
            zzgctVar.zzb("paidv2_publisher_option", Boolean.valueOf(z));
            if (!z) {
                zzgctVar.zzf("paidv2_creation_time");
                zzgctVar.zzf("paidv2_id");
                zzgctVar.zzf("vendor_scoped_gpid_v2_id");
                zzgctVar.zzf("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgcs.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z) throws IOException {
        synchronized (zzgcs.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgcs.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}
