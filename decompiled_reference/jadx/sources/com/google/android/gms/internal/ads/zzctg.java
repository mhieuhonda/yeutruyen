package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctg implements zzddu {
    private final zzfme zza;

    public zzctg(zzfme zzfmeVar) {
        this.zza = zzfmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfln e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb(Context context) {
        try {
            zzfme zzfmeVar = this.zza;
            zzfmeVar.zzj();
            if (context != null) {
                zzfmeVar.zzp(context);
            }
        } catch (zzfln e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfln e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
