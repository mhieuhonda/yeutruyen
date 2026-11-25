package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftk extends zzful {
    public zzftk(ClientApi clientApi, Context context, int i, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock) {
        super(clientApi, context, i, zzfmcVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfowVar, zzftgVar, clock);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    @Override // com.google.android.gms.internal.ads.zzful
    protected final ListenableFuture zza(Context context) {
        zzftk zzftkVar;
        zzbvj zzbvjVarZzd = this.zzd.zzd();
        if (zzbvjVarZzd == null) {
            return zzhcf.zzc(new zzfsy(1, "Failed to create an interstitial ad manager."));
        }
        zzets zzetsVar = (zzets) this.zza.zzc(ObjectWrapper.wrap(context), new com.google.android.gms.ads.internal.client.zzr(), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzbvjVarZzd, this.zzc);
        if (zzetsVar == null) {
            return zzhcf.zzc(new zzfsy(1, "Failed to create an interstitial ad manager."));
        }
        zzhcy zzhcyVarZze = zzhcy.zze();
        try {
            zzB(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            zzfsx zzfsxVar = this.zzf;
            if (zzfsxVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzY)).booleanValue()) {
                    zzftkVar = this;
                    try {
                        zzetsVar.zzL(new zzfti(zzfsxVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzZ)).longValue(), zzftkVar));
                    } catch (RemoteException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e);
                        return zzhcf.zzc(new zzfsy(1, "remote exception"));
                    }
                } else {
                    zzftkVar = this;
                }
            } else {
                zzftkVar = this;
            }
            zzetsVar.zzQ(((com.google.android.gms.ads.internal.client.zzfp) zzftkVar.zze.get()).zzc, new zzftj(zzetsVar, new zzfty(this, zzhcyVarZze), ((com.google.android.gms.ads.internal.client.zzfp) zzftkVar.zze.get()).zza));
            return zzhcyVarZze;
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzful
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzV)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbu) obj).zzt();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e);
            return null;
        }
    }

    public zzftk(String str, ClientApi clientApi, Context context, int i, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock, zzfsx zzfsxVar) {
        super(str, clientApi, context, i, zzfmcVar, zzfpVar, zzceVar, scheduledExecutorService, zzfowVar, zzftgVar, clock, zzfsxVar);
    }
}
