package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfya {
    private final Context zza;
    private final Looper zzb;

    public zzfya(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfyk zzfykVarZza = zzfym.zza();
        Context context = this.zza;
        zzfykVarZza.zza(context.getPackageName());
        zzfykVarZza.zzc(2);
        zzfyi zzfyiVarZza = zzfyj.zza();
        zzfyiVarZza.zza(str);
        zzfyiVarZza.zzb(2);
        zzfykVarZza.zzb(zzfyiVarZza);
        new zzfyb(context, this.zzb, (zzfym) zzfykVarZza.zzbu()).zza();
    }
}
