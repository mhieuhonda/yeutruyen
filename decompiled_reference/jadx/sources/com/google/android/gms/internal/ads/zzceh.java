package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzceh {
    static zzceh zzi;

    public static synchronized zzceh zzb(Context context) {
        zzceh zzcehVar = zzi;
        if (zzcehVar != null) {
            return zzcehVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbix.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzp = com.google.android.gms.ads.internal.zzt.zzh().zzp();
        zzgVarZzp.zza(applicationContext);
        zzceb zzcebVar = new zzceb(null);
        zzcebVar.zza(applicationContext);
        zzcebVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
        zzcebVar.zzc(zzgVarZzp);
        zzcebVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
        zzceh zzcehVarZze = zzcebVar.zze();
        zzi = zzcehVarZze;
        ((zzcdv) ((zzcec) zzcehVarZze).zzc.zzb()).zza();
        final zzcem zzcemVar = (zzcem) ((zzcec) zzi).zzh.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbk)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Map mapZzx = com.google.android.gms.ads.internal.util.zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbl));
            Iterator it = mapZzx.keySet().iterator();
            while (it.hasNext()) {
                zzcemVar.zzb((String) it.next());
            }
            zzcemVar.zza(new zzcek() { // from class: com.google.android.gms.internal.ads.zzcel
                @Override // com.google.android.gms.internal.ads.zzcek
                public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                    zzcemVar.zzc(mapZzx, sharedPreferences, str, str2);
                }
            });
        }
        return zzi;
    }

    abstract zzcdz zza();
}
