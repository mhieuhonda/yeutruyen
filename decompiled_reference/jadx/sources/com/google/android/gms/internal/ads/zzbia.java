package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbia {
    final /* synthetic */ zzbib zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbia(zzbib zzbibVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbibVar);
        this.zza = zzbibVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbib zzbibVar = this.zza;
            if (zzbibVar.zzb) {
                zzbibVar.zza.zzh(this.zzb);
                zzbibVar.zza.zzi(0);
                zzbibVar.zza.zzj(this.zzc);
                zzbibVar.zza.zzg(null);
                zzbibVar.zza.zzf();
                return;
            }
            return;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e);
            return;
        }
        throw th;
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbia zzb(int i) {
        this.zzc = i;
        return this;
    }
}
