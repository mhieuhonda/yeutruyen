package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzegs implements zzdgf {
    private final Context zza;
    private final zzceg zzb;

    zzegs(Context context, zzceg zzcegVar) {
        this.zza = context;
        this.zzb = zzcegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        String str = zzfkyVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzceg zzcegVar = this.zzb;
        Context context = this.zza;
        zzcegVar.zzd(context, zzfkyVar.zza.zza.zzd);
        zzcegVar.zzn(context, str);
    }
}
