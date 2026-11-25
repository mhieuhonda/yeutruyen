package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfef implements zzfcs {
    final zzhcp zza;

    public zzfef(zzbhl zzbhlVar, zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzfee
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfeg(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 45;
    }
}
