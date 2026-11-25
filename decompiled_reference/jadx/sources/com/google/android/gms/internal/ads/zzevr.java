package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevr implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    zzevr(zzhcp zzhcpVar, Context context) {
        this.zzb = zzhcpVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoD)).booleanValue()) {
            return zzhcf.zza(new zzevs(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzhcf.zza(new zzevs(null, false)) : this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzevs(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 61;
    }
}
