package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdou implements zzbpx {
    private final WeakReference zza;
    private final zzfsm zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzfqq zzd;

    /* synthetic */ zzdou(zzdov zzdovVar, zzfsm zzfsmVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfqq zzfqqVar, byte[] bArr) {
        this.zza = new WeakReference(zzdovVar);
        this.zzb = zzfsmVar;
        this.zzc = zzvVar;
        this.zzd = zzfqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.zza.get();
        String str = (String) map.get("u");
        if (zzdovVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdovVar.zzF());
    }
}
