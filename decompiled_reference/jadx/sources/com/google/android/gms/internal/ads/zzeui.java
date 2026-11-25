package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeui implements zzfcs {
    private final Context zza;

    zzeui(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zza(new zzeuj(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 2;
    }
}
