package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbus implements zzbqn {
    final /* synthetic */ zzbut zza;
    private final zzbtv zzb;
    private final zzcgd zzc;

    public zzbus(zzbut zzbutVar, zzbtv zzbtvVar, zzcgd zzcgdVar) {
        Objects.requireNonNull(zzbutVar);
        this.zza = zzbutVar;
        this.zzb = zzbtvVar;
        this.zzc = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(String str) {
        zzcgd zzcgdVar = this.zzc;
        try {
            if (str == null) {
                zzcgdVar.zzd(new zzbue());
            } else {
                zzcgdVar.zzd(new zzbue(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zza();
        }
    }
}
