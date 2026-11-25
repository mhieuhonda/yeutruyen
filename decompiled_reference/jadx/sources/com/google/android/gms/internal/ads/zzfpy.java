package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfpy implements zzdkl, zzddp, zzdkp {
    private final zzfqq zza;
    private final zzfqg zzb;

    zzfpy(Context context, zzfqq zzfqqVar) {
        this.zza = zzfqqVar;
        this.zzb = zzfqg.zzn(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final void zza() {
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            zzfqq zzfqqVar = this.zza;
            zzfqg zzfqgVar = this.zzb;
            zzfqgVar.zzd(true);
            zzfqqVar.zza(zzfqgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkq.zzd.zze()).booleanValue()) {
            zzfqq zzfqqVar = this.zza;
            zzfqg zzfqgVar = this.zzb;
            zzfqgVar.zzk(zzeVar.zza().toString());
            zzfqgVar.zzd(false);
            zzfqqVar.zza(zzfqgVar);
        }
    }
}
