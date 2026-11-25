package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbr {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcfy.zza.submit(new zzcbp(this, context));
    }

    final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
