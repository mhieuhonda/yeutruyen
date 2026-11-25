package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzetn implements zzdfq {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfht.zza(this.zza, new zzfhs() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // com.google.android.gms.internal.ads.zzfhs
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
            }
        });
    }
}
