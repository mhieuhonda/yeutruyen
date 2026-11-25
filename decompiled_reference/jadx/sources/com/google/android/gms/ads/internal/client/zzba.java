package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbig;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiv;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzba {
    private static final zzba zza = new zzba();
    private final zzbip zzb;
    private final zzbiq zzc;
    private final zzbiv zzd;
    private final zzbig zze;

    protected zzba() {
        zzbip zzbipVar = new zzbip();
        zzbiq zzbiqVar = new zzbiq();
        zzbiv zzbivVar = new zzbiv();
        zzbig zzbigVar = new zzbig();
        this.zzb = zzbipVar;
        this.zzc = zzbiqVar;
        this.zzd = zzbivVar;
        this.zze = zzbigVar;
    }

    public static zzbiq zza() {
        return zza.zzc;
    }

    public static zzbip zzb() {
        return zza.zzb;
    }

    public static zzbiv zzc() {
        return zza.zzd;
    }

    public static zzbig zzd() {
        return zza.zze;
    }
}
