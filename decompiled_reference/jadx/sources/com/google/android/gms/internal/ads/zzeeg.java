package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeeg {
    zzcah zza;
    zzcah zzb;
    private final Context zzc;
    private final zzeed zzd;
    private final zzdzt zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;

    zzeeg(zzeed zzeedVar, zzdzt zzdztVar, Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeedVar;
        this.zze = zzdztVar;
        this.zzc = context;
        this.zzf = zzgVar;
    }

    public final void zza() {
        try {
            if (this.zzf.zzP()) {
                return;
            }
            zzeed zzeedVar = this.zzd;
            zzeedVar.zza();
            zzeedVar.zzb(new zzeef(this));
        } catch (Exception e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfZ)).booleanValue()) {
                if (this.zzb == null) {
                    this.zzb = zzcaf.zzc(this.zzc);
                }
                this.zzb.zzh(e, "InstallReferrerUnsampled.initializeAndReport");
            } else {
                if (this.zza == null) {
                    this.zza = zzcaf.zza(this.zzc);
                }
                this.zza.zzh(e, "InstallReferrer.initializeAndReport");
            }
        }
    }

    final /* synthetic */ Context zzb() {
        return this.zzc;
    }

    final /* synthetic */ zzeed zzc() {
        return this.zzd;
    }

    final /* synthetic */ zzdzt zzd() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.zzg zze() {
        return this.zzf;
    }
}
