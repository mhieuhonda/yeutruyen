package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbth implements zzbpx {
    final /* synthetic */ zzbsw zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv zzb;
    final /* synthetic */ zzbub zzc;

    zzbth(zzbub zzbubVar, zzbaw zzbawVar, zzbsw zzbswVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.zza = zzbswVar;
        this.zzb = zzbvVar;
        Objects.requireNonNull(zzbubVar);
        this.zzc = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbub zzbubVar = this.zzc;
        synchronized (zzbubVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzo.zzh("JS Engine is requesting an update");
            if (zzbubVar.zzk() == 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Starting reload.");
                zzbubVar.zzl(2);
                zzbubVar.zza(null);
            }
            this.zza.zzn("/requestReload", (zzbpx) this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
