package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzesn implements zzetz {
    final /* synthetic */ zzeso zza;

    zzesn(zzeso zzesoVar) {
        Objects.requireNonNull(zzesoVar);
        this.zza = zzesoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzeso zzesoVar = this.zza;
        synchronized (zzesoVar) {
            zzesoVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeso zzesoVar = this.zza;
        zzcvs zzcvsVar = (zzcvs) obj;
        synchronized (zzesoVar) {
            if (zzesoVar.zzM() != null) {
                if (zzcvsVar.zzo() != null && zzesoVar.zzM().zzo() != null) {
                    zzcvsVar.zzo().zzb(zzesoVar.zzM().zzo().zza());
                }
                zzesoVar.zzM().zzd();
            }
            zzesoVar.zzN(zzcvsVar);
            zzesoVar.zzM().zzj();
        }
    }
}
