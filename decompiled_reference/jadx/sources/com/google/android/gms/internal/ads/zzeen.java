package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeen implements zzdgf, zzdls, zzden, zzddt {
    private final Context zza;
    private final zzdzt zzb;

    zzeen(Context context, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzdztVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfI)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzt.zzn().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfL)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfK)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfN)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfM)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
