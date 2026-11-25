package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfkj implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    final /* synthetic */ zzfkk zzb;

    zzfkj(zzfkk zzfkkVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zza = zzbyVar;
        Objects.requireNonNull(zzfkkVar);
        this.zzb = zzfkkVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzw() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
