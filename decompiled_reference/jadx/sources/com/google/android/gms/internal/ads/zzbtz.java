package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtz implements zzcgh {
    final /* synthetic */ zzbua zza;

    zzbtz(zzbua zzbuaVar) {
        Objects.requireNonNull(zzbuaVar);
        this.zza = zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbsw zzbswVar = (zzbsw) obj;
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbty
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy > Destroying engine.");
                zzbsw zzbswVar2 = zzbswVar;
                zzbswVar2.zzn("/result", zzbpw.zzo);
                zzbswVar2.zzj();
            }
        });
    }
}
