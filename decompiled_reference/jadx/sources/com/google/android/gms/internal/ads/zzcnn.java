package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnn {
    private String zza;
    private zziid zzb;
    private zzilv zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    zzcnn(zzcna zzcnaVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String variationsHeader = WebViewFeature.isFeatureSupported("GET_VARIATIONS_HEADER") ? WebViewCompat.getVariationsHeader() : null;
            if (variationsHeader != null && !variationsHeader.isEmpty()) {
                this.zza = variationsHeader;
                byte[] bArrDecode = Base64.decode(variationsHeader, 10);
                this.zzb = zziid.zzc(bArrDecode, zzidz.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzko)).booleanValue()) {
                    this.zzc = zzilv.zzc(bArrDecode, zzidz.zzc());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkm)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkl)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnm
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkn)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzifh | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkl)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzilv zzilvVar = this.zzc;
        if (zzilvVar != null) {
            return Base64.encodeToString(zzilvVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zziid zzd() {
        return this.zzb;
    }
}
