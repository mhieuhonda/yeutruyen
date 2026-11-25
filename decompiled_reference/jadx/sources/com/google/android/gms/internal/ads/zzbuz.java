package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbuz implements zzbqn {
    private final zzcgd zza;

    public zzbuz(zzbvb zzbvbVar, zzcgd zzcgdVar) {
        Objects.requireNonNull(zzbvbVar);
        this.zza = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(String str) {
        zzcgd zzcgdVar = this.zza;
        try {
            if (str == null) {
                zzcgdVar.zzd(new zzbue());
            } else {
                zzcgdVar.zzd(new zzbue(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
