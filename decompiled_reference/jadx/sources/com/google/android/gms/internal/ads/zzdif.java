package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdif implements zzdgf {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbX)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoC)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final synchronized void zzdQ(zzfky zzfkyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbY)).booleanValue()) {
            try {
                zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
                this.zza = zzfkqVar.zzc;
                this.zzb = zzfkqVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
