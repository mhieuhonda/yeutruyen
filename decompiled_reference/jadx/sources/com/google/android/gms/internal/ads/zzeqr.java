package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeqr implements zzdnw {
    final /* synthetic */ zzemd zza;
    final /* synthetic */ zzfkn zzb;

    zzeqr(zzeqt zzeqtVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.zza = zzemdVar;
        this.zzb = zzfknVar;
        Objects.requireNonNull(zzeqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.zza.zzb;
            zzfmeVar.zzs(z);
            zzfmeVar.zzm();
        } catch (zzfln e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot show rewarded video.", e);
            throw new zzdnv(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzb;
    }
}
