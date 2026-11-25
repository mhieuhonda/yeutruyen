package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzenl implements zzdnw {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzfkn zzb;
    final /* synthetic */ zzenn zzc;

    zzenl(zzenn zzennVar, zzcgd zzcgdVar, zzfkn zzfknVar) {
        this.zza = zzcgdVar;
        this.zzb = zzfknVar;
        Objects.requireNonNull(zzennVar);
        this.zzc = zzennVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z, Context context, zzddm zzddmVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzb;
    }
}
