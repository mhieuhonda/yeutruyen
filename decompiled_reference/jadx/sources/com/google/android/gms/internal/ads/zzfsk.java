package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfsk implements zzhcc {
    final /* synthetic */ zzfqg zza;
    final /* synthetic */ zzfqq zzb;
    final /* synthetic */ zzdfo zzc;
    final /* synthetic */ zzfsm zzd;

    zzfsk(zzfsm zzfsmVar, zzfqg zzfqgVar, zzfqq zzfqqVar, zzdfo zzdfoVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfqqVar;
        this.zzc = zzdfoVar;
        Objects.requireNonNull(zzfsmVar);
        this.zzd = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfqg zzfqgVar = this.zza;
        if (zzfqgVar == null) {
            return;
        }
        zzfqgVar.zzd(false);
        zzfqq zzfqqVar = this.zzb;
        if (zzfqqVar != null) {
            zzfqqVar.zza(zzfqgVar);
            zzfqqVar.zzh();
        } else {
            zzfsm zzfsmVar = this.zzd;
            zzfsmVar.zze().zzb(zzfqgVar.zzm());
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i;
        zzfqg zzfqgVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfqgVar != null) {
            zzfqgVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfqq zzfqqVar = this.zzb;
            if (zzfqqVar == null) {
                this.zzd.zze().zzb(zzfqgVar.zzm());
            } else {
                zzfqqVar.zza(zzfqgVar);
                zzfqqVar.zzh();
            }
        }
        zzdfo zzdfoVar = this.zzc;
        if (zzdfoVar != null) {
            String strZzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(strZzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strZzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String strOptString = jSONObject.optString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString("currency");
                long jOptLong = jSONObject.optLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
                int iHashCode = strOptString.hashCode();
                int i2 = 3;
                if (iHashCode != 66934) {
                    if (iHashCode != 66944) {
                        if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                            jOptLong /= 1000;
                            i = 3;
                        } else {
                            i = 0;
                        }
                    } else if (strOptString.equals("CPM")) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                } else if (strOptString.equals("CPC")) {
                    i = 2;
                } else {
                    i = 0;
                }
                int iHashCode2 = strOptString2.hashCode();
                if (iHashCode2 != -2131980260) {
                    if (iHashCode2 != 399232571) {
                        if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                            i2 = 2;
                        } else {
                            i2 = 0;
                        }
                    } else if (!strOptString2.equals("PRECISE")) {
                        i2 = 0;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                zzdfoVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, i2, strOptString3, jOptLong));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "UrlPinger.pingUrl");
            }
        }
    }
}
