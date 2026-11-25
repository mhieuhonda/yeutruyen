package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbio {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* synthetic */ zzbio(int i, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().zza(this);
    }

    public static zzbio zzh(int i, String str, int i2, int i3) {
        return new zzbik(1, str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static zzbio zzi(int i, String str, long j, long j2) {
        return new zzbil(1, str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static zzbio zzj(int i, String str, float f, float f2) {
        return new zzbim(1, str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static zzbio zzk(int i, String str) {
        zzbin zzbinVar = new zzbin(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzb(zzbinVar);
        return zzbinVar;
    }

    public static zzbio zzl(int i, String str) {
        zzbin zzbinVar = new zzbin(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzc(zzbinVar);
        return zzbinVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    protected abstract Object zzc(JSONObject jSONObject);

    protected abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
