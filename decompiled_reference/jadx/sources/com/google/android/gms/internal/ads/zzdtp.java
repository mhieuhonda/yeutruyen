package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtp {
    private final Executor zza;
    private final zzdtk zzb;
    private final zzdzo zzc;

    zzdtp(Executor executor, zzdtk zzdtkVar, zzdzo zzdzoVar) {
        this.zza = executor;
        this.zzb = zzdtkVar;
        this.zzc = zzdzoVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFutureZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzhcf.zza(Collections.emptyList());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzc.zzf(zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZza = zzhcf.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (strOptString == null) {
                    listenableFutureZza = zzhcf.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                    listenableFutureZza = TypedValues.Custom.S_STRING.equals(strOptString2) ? zzhcf.zza(new zzdtm(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzhcf.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtn
                        @Override // com.google.android.gms.internal.ads.zzgti
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdtm(strOptString, (zzblw) obj);
                        }
                    }, this.zza) : zzhcf.zza(null);
                }
            }
            arrayList.add(listenableFutureZza);
        }
        return zzhcf.zzk(zzhcf.zzm(arrayList), zzdto.zza, this.zza);
    }
}
