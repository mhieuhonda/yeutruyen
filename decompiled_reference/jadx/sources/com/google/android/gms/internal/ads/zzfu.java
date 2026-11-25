package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfu {
    private boolean zza;

    public zzfu(Context context, Looper looper, zzdp zzdpVar) {
        context.getApplicationContext();
        zzdpVar.zzd(looper, null);
        zzdpVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z) {
        if (this.zza == z) {
            return;
        }
        this.zza = z;
    }
}
