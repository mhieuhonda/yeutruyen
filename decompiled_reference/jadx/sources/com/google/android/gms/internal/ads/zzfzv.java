package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzfzv {
    static String zzb(File file, String str, zzfzz zzfzzVar) {
        return new File(file, str).getPath();
    }

    default String zza(File file, String str) {
        return zzb(file, str, zzfzz.zza);
    }
}
