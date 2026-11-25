package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhde extends zzhbw implements RunnableFuture {
    private volatile zzhcm zza;

    zzhde(zzhbm zzhbmVar) {
        this.zza = new zzhdc(this, zzhbmVar);
    }

    static zzhde zze(Runnable runnable, Object obj) {
        return new zzhde(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzhcm zzhcmVar = this.zza;
        if (zzhcmVar != null) {
            zzhcmVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    protected final void zzc() {
        zzhcm zzhcmVar;
        if (zzj() && (zzhcmVar = this.zza) != null) {
            zzhcmVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    protected final String zzd() {
        zzhcm zzhcmVar = this.zza;
        if (zzhcmVar == null) {
            return super.zzd();
        }
        String string = zzhcmVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 7);
        sb.append("task=[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }

    zzhde(Callable callable) {
        this.zza = new zzhdd(this, callable);
    }
}
