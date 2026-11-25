package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbpt implements zzbpx {
    static final /* synthetic */ zzbpt zza = new zzbpt();

    private /* synthetic */ zzbpt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmu zzcmuVar = (zzcmu) obj;
        zzbpx zzbpxVar = zzbpw.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            zzbaw zzbawVarZzS = zzcmuVar.zzS();
            if (zzbawVarZzS != null) {
                zzbawVarZzS.zzb().zze(i, i2, i3);
            }
        } catch (NumberFormatException unused) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
