package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefd implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzefd(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzefd zza(zzini zziniVar, zzini zziniVar2) {
        return new zzefd(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        zzfps zzfpsVar = (zzfps) this.zza.zzb();
        final CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza((Context) this.zzb.zzb());
        zzfpm zzfpmVar = zzfpm.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfpsVar);
        return zzfpd.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbE));
            }
        }, zzfpmVar, zzfpsVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzeev.zza).zzi();
    }
}
