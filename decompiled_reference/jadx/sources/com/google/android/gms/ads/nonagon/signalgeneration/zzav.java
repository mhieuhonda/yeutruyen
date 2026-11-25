package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzinh;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzav implements zzimz {
    private final zzat zza;

    private zzav(zzat zzatVar) {
        this.zza = zzatVar;
    }

    public static zzav zza(zzat zzatVar) {
        return new zzav(zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        String strZzb = this.zza.zzb();
        zzinh.zzb(strZzb);
        return strZzb;
    }
}
