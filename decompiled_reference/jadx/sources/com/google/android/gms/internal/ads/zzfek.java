package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfek implements zzfcs {
    private final JSONObject zza;

    zzfek(Context context) {
        this.zza = zzcbg.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznF)).booleanValue() ? zzhcf.zza(zzfei.zza) : zzhcf.zza(new zzfcq() { // from class: com.google.android.gms.internal.ads.zzfej
            @Override // com.google.android.gms.internal.ads.zzfcq
            public final /* synthetic */ void zza(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 46;
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
