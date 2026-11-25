package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcuy implements zzimz {
    private final zzini zza;

    private zzcuy(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcuy zza(zzini zziniVar) {
        return new zzcuy(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcyr) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
