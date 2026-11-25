package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzagg {
    static {
        int i = zzagf.zza;
    }

    zzaga[] zza();

    default zzaga[] zzb(Uri uri, Map map) {
        return zza();
    }
}
