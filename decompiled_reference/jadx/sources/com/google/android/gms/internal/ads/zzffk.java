package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzffk implements Callable {
    static final /* synthetic */ zzffk zza = new zzffk();

    private /* synthetic */ zzffk() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        HashMap map = new HashMap();
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaC);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaD)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                }
            }
        }
        return new zzffm(map);
    }
}
