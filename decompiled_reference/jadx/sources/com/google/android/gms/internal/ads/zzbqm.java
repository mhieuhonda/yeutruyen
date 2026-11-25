package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbqm implements zzbqn {
    final /* synthetic */ zzcgd zza;

    zzbqm(zzbqo zzbqoVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(String str) {
        this.zza.zzd(new zzbue(str));
    }
}
