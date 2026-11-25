package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class zzcgk {
    private final zzcgd zza;
    private final AtomicInteger zzb;

    public zzcgk() {
        zzcgd zzcgdVar = new zzcgd();
        this.zza = zzcgdVar;
        this.zzb = new AtomicInteger(0);
        zzhcf.zzr(zzcgdVar, new zzcgi(this), zzcfy.zzh);
    }

    @Deprecated
    public final void zze(zzcgh zzcghVar, zzcgf zzcgfVar) {
        zzhcf.zzr(this.zza, new zzcgj(this, zzcghVar, zzcgfVar), zzcfy.zzh);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
