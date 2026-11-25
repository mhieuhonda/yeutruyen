package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccz implements RewardItem {
    private final zzccm zza;

    public zzccz(zzccm zzccmVar) {
        this.zza = zzccmVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzccm zzccmVar = this.zza;
        if (zzccmVar != null) {
            try {
                return zzccmVar.zzf();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzccm zzccmVar = this.zza;
        if (zzccmVar != null) {
            try {
                return zzccmVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
