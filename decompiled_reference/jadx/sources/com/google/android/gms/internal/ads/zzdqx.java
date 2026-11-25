package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdqx implements zzbly {
    final /* synthetic */ zzdry zza;
    final /* synthetic */ ViewGroup zzb;

    zzdqx(zzdry zzdryVar, ViewGroup viewGroup) {
        this.zza = zzdryVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza() {
        zzgwt zzgwtVar = zzdqw.zza;
        zzdry zzdryVar = this.zza;
        Map mapZzj = zzdryVar.zzj();
        if (mapZzj == null) {
            return;
        }
        int size = zzgwtVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzj.get((String) zzgwtVar.get(i));
            i++;
            if (obj != null) {
                zzdryVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzc() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzd() {
        return this.zza.zzp();
    }
}
