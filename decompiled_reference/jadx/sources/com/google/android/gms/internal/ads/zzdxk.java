package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxk {
    private final zzfmc zza;
    private final zzdxh zzb;

    zzdxk(zzfmc zzfmcVar, zzdxh zzdxhVar) {
        this.zza = zzfmcVar;
        this.zzb = zzdxhVar;
    }

    public final zzfme zza(String str, JSONObject jSONObject) throws zzfln {
        zzbvm zzbvmVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbvmVarZzb = new zzbwk(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbvmVarZzb = new zzbwk(new zzbyb());
            } else {
                zzbvj zzbvjVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbvjVarZzd.zzc(string)) {
                            zzbvmVarZzb = zzbvjVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbvmVarZzb = zzbvjVarZzd.zzd(string) ? zzbvjVarZzd.zzb(string) : zzbvjVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                        zzbvmVarZzb = zzbvjVarZzd.zzb(str);
                    }
                } else {
                    zzbvmVarZzb = zzbvjVarZzd.zzb(str);
                }
            }
            zzfme zzfmeVar = new zzfme(zzbvmVarZzb);
            this.zzb.zza(str, zzfmeVar);
            return zzfmeVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkS)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfln(th);
        }
    }

    public final zzbxi zzb(String str) throws RemoteException {
        zzbxi zzbxiVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbxiVarZze);
        return zzbxiVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    final zzbvj zzd() throws RemoteException {
        zzbvj zzbvjVarZzd = this.zza.zzd();
        if (zzbvjVarZzd != null) {
            return zzbvjVarZzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
