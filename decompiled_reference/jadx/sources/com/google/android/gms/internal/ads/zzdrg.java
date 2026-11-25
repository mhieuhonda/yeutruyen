package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdrg implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdvf zzd;
    private final Clock zze;
    private zzbnz zzf;
    private zzbpx zzg;

    public zzdrg(zzdvf zzdvfVar, Clock clock) {
        this.zzd = zzdvfVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final void zza(final zzbnz zzbnzVar) {
        this.zzf = zzbnzVar;
        zzbpx zzbpxVar = this.zzg;
        if (zzbpxVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbpxVar);
        }
        zzbpx zzbpxVar2 = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdrg zzdrgVar = this.zza;
                try {
                    zzdrgVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbnz zzbnzVar2 = zzbnzVar;
                zzdrgVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbnzVar2 == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbnzVar2.zze(str);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        };
        this.zzg = zzbpxVar2;
        this.zzd.zzd("/unconfirmedClick", zzbpxVar2);
    }

    public final zzbnz zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
