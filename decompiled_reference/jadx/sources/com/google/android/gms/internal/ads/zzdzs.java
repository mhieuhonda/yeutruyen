package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzs {
    final /* synthetic */ zzdzt zza;
    private final Map zzb;

    zzdzs(zzdzt zzdztVar) {
        Objects.requireNonNull(zzdztVar);
        this.zza = zzdztVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdzs zza(zzfkq zzfkqVar) {
        zzc("gqi", zzfkqVar.zzb);
        return this;
    }

    public final zzdzs zzb(zzfkn zzfknVar) {
        zzc("aai", zzfknVar.zzw);
        zzc("request_id", zzfknVar.zzan);
        zzc("ad_format", zzfkn.zza(zzfknVar.zzb));
        return this;
    }

    public final zzdzs zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpU)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzdzt zzdztVar = this.zza;
        return zzdztVar.zzc().zze(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    final /* synthetic */ void zzh() {
        this.zza.zzc().zzb(this.zzb);
    }

    final /* synthetic */ void zzi() {
        this.zza.zzc().zzf(this.zzb);
    }

    final /* synthetic */ zzdzs zzj() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
