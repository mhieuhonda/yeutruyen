package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfhh implements zzfno {
    private final zzfie zza;

    public zzfhh(zzfie zzfieVar) {
        this.zza = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfno
    public final ListenableFuture zza(zzfnp zzfnpVar) {
        zzfhk zzfhkVar = (zzfhk) zzfnpVar;
        return ((zzfhg) this.zza).zzb(zzfhkVar.zzb, zzfhkVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfno
    public final void zzb(zzfne zzfneVar) {
        zzfneVar.zza = ((zzfhg) this.zza).zza();
    }
}
