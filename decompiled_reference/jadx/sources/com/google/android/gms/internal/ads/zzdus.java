package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdus implements zzbpx {
    private final zzbnm zza;
    private final zzdvf zzb;
    private final zzimt zzc;

    public zzdus(zzdql zzdqlVar, zzdqb zzdqbVar, zzdvf zzdvfVar, zzimt zzimtVar) {
        this.zza = zzdqlVar.zzg(zzdqbVar.zzS());
        this.zzb = zzdvfVar;
        this.zzc = zzimtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbnc) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            String string = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(string, e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
