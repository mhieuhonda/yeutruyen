package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfoe implements zzimz {
    public static zzfoe zza() {
        return zzfod.zza;
    }

    public static zzhcp zzc() {
        zzhcp zzhcpVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgQ)).booleanValue()) {
            zzhcpVar = zzcfy.zzc;
        } else {
            zzhcpVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgP)).booleanValue() ? zzcfy.zza : zzcfy.zzf;
        }
        zzinh.zzb(zzhcpVar);
        return zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
