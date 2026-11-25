package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbav extends zzbau {
    private zzbav(Context context, zzbat zzbatVar) {
        super(context, zzbatVar);
    }

    public static zzbav zzt(Context context, zzawv zzawvVar) {
        zzbat zzbatVar = new zzbat(zzawvVar);
        zzo(context, zzbatVar);
        return new zzbav(context, zzbatVar);
    }
}
