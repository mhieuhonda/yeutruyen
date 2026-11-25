package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdrz implements zzhcc {
    final /* synthetic */ zzdsb zza;

    zzdrz(zzdsb zzdsbVar) {
        Objects.requireNonNull(zzdsbVar);
        this.zza = zzdsbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgy)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzclb zzclbVar = (zzclb) list.get(0);
            if (zzclbVar != null) {
                this.zza.zza(zzclbVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgy)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid native display exp");
            }
        }
    }
}
