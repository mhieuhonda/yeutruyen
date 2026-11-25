package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcop implements zzimz {
    private final zzcns zza;

    private zzcop(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
    }

    public static zzcop zzc(zzcns zzcnsVar) {
        return new zzcop(zzcnsVar);
    }

    public static VersionInfoParcel zzd(zzcns zzcnsVar) {
        VersionInfoParcel versionInfoParcelZzd = zzcnsVar.zzd();
        zzinh.zzb(versionInfoParcelZzd);
        return versionInfoParcelZzd;
    }

    public final VersionInfoParcel zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
