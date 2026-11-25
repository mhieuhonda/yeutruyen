package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzboi {
    private final com.google.android.gms.ads.formats.zze zza;
    private final com.google.android.gms.ads.formats.zzd zzb;
    private zzbnd zzc;

    public zzboi(com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbnd zze(zzbnc zzbncVar) {
        zzbnd zzbndVar = this.zzc;
        if (zzbndVar != null) {
            return zzbndVar;
        }
        zzbnd zzbndVar2 = new zzbnd(zzbncVar);
        this.zzc = zzbndVar2;
        return zzbndVar2;
    }

    public final zzbnp zza() {
        return new zzboh(this, null);
    }

    public final zzbnm zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbog(this, null);
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
