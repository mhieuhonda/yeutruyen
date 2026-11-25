package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcbp implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbr zzb;

    zzcbp(zzcbr zzcbrVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcbrVar);
        this.zzb = zzcbrVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcbo zzcboVarZza;
        zzcbr zzcbrVar = this.zzb;
        WeakHashMap weakHashMapZzb = zzcbrVar.zzb();
        Context context = this.zza;
        zzcbq zzcbqVar = (zzcbq) weakHashMapZzb.get(context);
        if (zzcbqVar != null) {
            if (zzcbqVar.zza + ((Long) zzbkm.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zzcboVarZza = new zzcbn(context).zza();
            } else {
                zzcboVarZza = new zzcbn(context, zzcbqVar.zzb).zza();
            }
        } else {
            zzcboVarZza = new zzcbn(context).zza();
        }
        zzcbrVar.zzb().put(context, new zzcbq(zzcbrVar, zzcboVarZza));
        return zzcboVarZza;
    }
}
