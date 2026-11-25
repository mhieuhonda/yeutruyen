package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsl implements zzcsb {
    private final zzecz zza;

    zzcsl(zzecz zzeczVar) {
        this.zza = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsb
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkL)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
