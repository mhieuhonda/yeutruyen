package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzciz extends com.google.android.gms.ads.internal.util.zzb {
    final zzchu zza;
    final zzcjh zzb;
    private final String zzc;
    private final String[] zzd;

    zzciz(zzchu zzchuVar, zzcjh zzcjhVar, String str, String[] strArr) {
        this.zza = zzchuVar;
        this.zzb = zzcjhVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().zzc(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcix(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcM)).booleanValue() && (this.zzb instanceof zzcjq)) ? zzcfy.zzf.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzciy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zze();
            }
        }) : super.zzb();
    }

    public final String zzd() {
        return this.zzc;
    }

    final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}
