package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcc implements zzfcs {
    private final zzceg zza;
    private final zzhcp zzb;
    private final Context zzc;

    public zzfcc(zzceg zzcegVar, zzhcp zzhcpVar, Context context) {
        this.zza = zzcegVar;
        this.zzb = zzhcpVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 34;
    }

    final /* synthetic */ zzfcd zzc() {
        zzceg zzcegVar = this.zza;
        Context context = this.zzc;
        if (!zzcegVar.zzb(context)) {
            return new zzfcd(null, null, null, null, null);
        }
        String strZzi = zzcegVar.zzi(context);
        String str = strZzi == null ? "" : strZzi;
        String strZzj = zzcegVar.zzj(context);
        String str2 = strZzj == null ? "" : strZzj;
        String strZzk = zzcegVar.zzk(context);
        String str3 = strZzk == null ? "" : strZzk;
        boolean zZzb = zzcegVar.zzb(context);
        Long l = null;
        String str4 = true != zZzb ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzba);
        }
        return new zzfcd(str, str2, str3, str4 == null ? "" : str4, l);
    }
}
