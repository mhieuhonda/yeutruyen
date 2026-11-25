package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfuu {
    public static zzfuu zze(zzfuv zzfuvVar, zzfuw zzfuwVar) {
        zzfws.zza();
        return new zzfuy(zzfuvVar, zzfuwVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfvb zzfvbVar, String str);
}
