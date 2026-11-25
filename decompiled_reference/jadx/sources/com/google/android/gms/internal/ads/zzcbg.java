package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbg extends zzcbd {
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbuf zzd;
    private final VersionInfoParcel zze;
    private final Executor zzg;
    private final Object zza = new Object();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzcbg(Context context, zzbuf zzbufVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbufVar;
        this.zzg = executor;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbkx.zzf.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbkx.zzg.zze());
            jSONObject.put("cl", "910357297");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final ListenableFuture zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbkx.zzh.zze()).longValue()) {
            return zzhcf.zza(null);
        }
        return zzhcf.zzk(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzgti() { // from class: com.google.android.gms.internal.ads.zzcbe
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zze((JSONObject) obj);
                return null;
            }
        }, ((Boolean) zzbkx.zzm.zze()).booleanValue() ? this.zzg : zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final ListenableFuture zzb() {
        if (!((Boolean) zzbkx.zza.zze()).booleanValue()) {
            return zza();
        }
        if (!this.zzf.compareAndSet(false, true)) {
            return zzhcf.zzb();
        }
        ListenableFuture listenableFutureZza = zza();
        listenableFutureZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        }, zzcfy.zzh);
        return listenableFutureZza;
    }

    final /* synthetic */ void zzd() {
        this.zzf.set(false);
    }

    final /* synthetic */ Void zze(JSONObject jSONObject) {
        zzbio zzbioVar = zzbix.zza;
        com.google.android.gms.ads.internal.client.zzba.zza();
        Context context = this.zzb;
        SharedPreferences sharedPreferencesZzb = zzbiq.zzb(context);
        if (sharedPreferencesZzb == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZzb.edit();
        Objects.requireNonNull(com.google.android.gms.ads.internal.client.zzba.zzb());
        int i = zzbkn.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb().zzd(editorEdit, 1, jSONObject);
        if ((((Boolean) zzbkx.zzo.zze()).booleanValue() || ((Boolean) zzbkx.zzp.zze()).booleanValue()) && !ClientLibraryUtils.isPackageSide()) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            editorEdit.apply();
        } else {
            com.google.android.gms.ads.internal.client.zzba.zza();
            editorEdit.commit();
        }
        if (((Boolean) zzbkx.zze.zze()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            SharedPreferences sharedPreferencesZza = zzbiq.zza(context);
            if (sharedPreferencesZza != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferencesZza.edit();
                com.google.android.gms.ads.internal.client.zzba.zzb();
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(next, jSONObject.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
                editorEdit2.putString("flag_configuration", jSONObject2.toString());
                editorEdit2.apply();
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()).apply();
        return null;
    }
}
