package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesh extends zzbxk {
    private final String zza;
    private final zzbxi zzb;
    private final zzcgd zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzesh(String str, zzbxi zzbxiVar, zzcgd zzcgdVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcgdVar;
        this.zza = str;
        this.zzb = zzbxiVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbxiVar.zzf().toString());
            jSONObject.put("sdk_version", zzbxiVar.zzg().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzd(String str, zzcgd zzcgdVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcq)).booleanValue()) {
                jSONObject.put("signal_error_code", 1);
            }
            zzcgdVar.zzc(jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final synchronized void zzh(String str, int i) {
        if (this.zzf) {
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signal_error", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcr)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcq)).booleanValue()) {
                jSONObject.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcq)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcr)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcq)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
