package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzgti;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzal implements zzgti {
    static final /* synthetic */ zzal zza = new zzal();

    private /* synthetic */ zzal() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        int i = zzap.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
