package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbqh implements com.google.android.gms.ads.internal.overlay.zzaa {
    final /* synthetic */ zzbqk zza;

    zzbqh(zzbqk zzbqkVar) {
        Objects.requireNonNull(zzbqkVar);
        this.zza = zzbqkVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
        this.zza.zzg(i);
    }
}
