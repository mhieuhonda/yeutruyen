package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfg extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcfk zza;

    zzcfg(zzcfk zzcfkVar) {
        Objects.requireNonNull(zzcfkVar);
        this.zza = zzcfkVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcfk zzcfkVar = this.zza;
        zzbja zzbjaVar = new zzbja(zzcfkVar.zzA(), zzcfkVar.zzB().afmaVersion);
        synchronized (zzcfkVar.zzz()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbjd.zza(zzcfkVar.zzC(), zzbjaVar);
            } catch (IllegalArgumentException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}
