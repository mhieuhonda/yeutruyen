package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgpu implements zzgpl, zzgfo {
    private final Context zza;
    private final zzgqo zzb;
    private final zzhcp zzc;
    private final zzgdq zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private ListenableFuture zzf = zzhcf.zza(null);

    zzgpu(Context context, zzgqo zzgqoVar, zzhcp zzhcpVar, zzgdq zzgdqVar) {
        this.zza = context;
        this.zzb = zzgqoVar;
        this.zzc = zzhcpVar;
        this.zzd = zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final ListenableFuture zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zze()) ? zzhcf.zzb() : this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    final /* synthetic */ void zze() {
        ListenableFuture listenableFutureSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzgps
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        });
        this.zzb.zze(53, listenableFutureSubmit);
        this.zzf = listenableFutureSubmit;
    }

    final /* synthetic */ zzayt zzf() {
        Context context = this.zza;
        try {
            return zzfxx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}
