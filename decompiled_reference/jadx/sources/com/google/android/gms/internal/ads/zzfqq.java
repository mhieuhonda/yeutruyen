package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqq implements Runnable {
    private final zzfqt zzb;
    private String zzc;
    private String zze;
    private zzfkx zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfqv zzd = zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED;

    zzfqq(zzfqt zzfqtVar) {
        this.zzb = zzfqtVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfqq zza(zzfqg zzfqgVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfqgVar.zzc();
            list.add(zzfqgVar);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzcfy.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkh)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfqq zzb(ArrayList arrayList) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                this.zzi = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                this.zzi = 4;
            } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                this.zzi = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                this.zzi = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.zzi = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                this.zzi = 6;
            }
        }
        return this;
    }

    public final synchronized zzfqq zzc(String str) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue() && zzfqp.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfqq zzd(Bundle bundle) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(bundle);
        }
        return this;
    }

    public final synchronized zzfqq zze(zzfkx zzfkxVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzf = zzfkxVar;
        }
        return this;
    }

    public final synchronized zzfqq zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfqq zzg(String str) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            List<zzfqg> list = this.zza;
            for (zzfqg zzfqgVar : list) {
                int i = this.zzi;
                if (i != 2) {
                    zzfqgVar.zzp(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfqgVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zze) && !zzfqgVar.zzl()) {
                    zzfqgVar.zzi(this.zze);
                }
                zzfkx zzfkxVar = this.zzf;
                if (zzfkxVar != null) {
                    zzfqgVar.zzg(zzfkxVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                    if (zzeVar != null) {
                        zzfqgVar.zzh(zzeVar);
                    }
                }
                zzfqgVar.zzf(this.zzd);
                this.zzb.zzb(zzfqgVar.zzm());
            }
            list.clear();
        }
    }

    public final synchronized zzfqq zzi(int i) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
