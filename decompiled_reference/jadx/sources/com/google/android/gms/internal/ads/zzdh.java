package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdh {
    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static String zza(String str) {
        zzgtr.zza(!TextUtils.isEmpty(str));
        return str;
    }
}
