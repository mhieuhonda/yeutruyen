package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqv implements zzemc {
    private final zzerz zza;
    private final zzdxk zzb;

    zzeqv(zzerz zzerzVar, zzdxk zzdxkVar) {
        this.zza = zzerzVar;
        this.zzb = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    public final zzemd zza(String str, JSONObject jSONObject) throws zzfln {
        zzbxi zzbxiVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcu)).booleanValue()) {
            try {
                zzbxiVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbxiVarZzb = null;
            }
        } else {
            zzbxiVarZzb = this.zza.zzb(str);
        }
        if (zzbxiVarZzb == null) {
            return null;
        }
        return new zzemd(zzbxiVarZzb, new zzenp(), str);
    }
}
