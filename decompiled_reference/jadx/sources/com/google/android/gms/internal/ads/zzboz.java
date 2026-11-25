package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzboz implements zzbpx {
    zzboz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            zzgcv.zzh(zzclbVar.getContext()).zzk();
            zzgcw.zzh(zzclbVar.getContext()).zzj();
            zzgcx.zza(zzclbVar.getContext()).zzb(null);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
