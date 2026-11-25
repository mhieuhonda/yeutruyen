package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfut {
    private boolean zza;

    final boolean zza() {
        return this.zza;
    }

    final void zzb(Context context) {
        zzfws.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfwa.zza().zzb(context);
        zzfvr.zza().zzd(context);
        zzfwn.zza(context);
        zzfwo.zza(context);
        zzfwr.zza(context);
        zzfvx.zza().zzc(context);
        zzfvq.zza().zzc(context);
        zzfwc.zza().zzb(context);
    }
}
