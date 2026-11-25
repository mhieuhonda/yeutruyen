package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzenz implements zzdnw {
    final /* synthetic */ zzemd zza;
    final /* synthetic */ zzfkn zzb;
    final /* synthetic */ zzeoa zzc;

    zzenz(zzeoa zzeoaVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.zza = zzemdVar;
        this.zzb = zzfknVar;
        Objects.requireNonNull(zzeoaVar);
        this.zzc = zzeoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.zza.zzb;
            zzfmeVar.zzs(z);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbx)).intValue()) {
                zzfmeVar.zzd();
            } else {
                zzfmeVar.zze(context);
            }
        } catch (zzfln e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdnv(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzb;
    }
}
