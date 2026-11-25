package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbps implements zzbpx {
    static final /* synthetic */ zzbps zza = new zzbps();

    private /* synthetic */ zzbps() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        zzbpx zzbpxVar = zzbpw.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzg)).booleanValue() && str.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            zzcks zzcksVar = (zzcks) zzcmnVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzcmnVar.getContext(), ((zzcmv) zzcmnVar).zzs().afmaVersion, str, null, zzcksVar.zzC() != null ? zzcksVar.zzC().zzax : null).zzb();
        }
    }
}
