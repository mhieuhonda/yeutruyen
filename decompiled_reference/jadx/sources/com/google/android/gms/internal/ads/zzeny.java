package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeny implements zzdnw {
    private final zzfkn zza;
    private final zzbxi zzb;
    private final AdFormat zzc;
    private zzddr zzd = null;

    zzeny(zzfkn zzfknVar, zzbxi zzbxiVar, AdFormat adFormat) {
        this.zza = zzfknVar;
        this.zzb = zzbxiVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z, Context context, zzddm zzddmVar) throws zzdnv {
        boolean zZzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdnv("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zZzk) {
                zzddr zzddrVar = this.zzd;
                if (zzddrVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcm)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzddrVar.zza();
                return;
            }
            throw new zzdnv("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdnv(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zza;
    }

    public final void zzc(zzddr zzddrVar) {
        this.zzd = zzddrVar;
    }
}
