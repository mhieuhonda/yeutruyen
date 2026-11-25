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
public final class zzfuq extends zzful {
    public zzfuq(ClientApi clientApi, Context context, int i, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock) {
        super(clientApi, context, i, zzfmcVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfowVar, zzftgVar, clock);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    @Override // com.google.android.gms.internal.ads.zzful
    protected final ListenableFuture zza(Context context) {
        zzfuq zzfuqVar;
        zzbvj zzbvjVarZzd = this.zzd.zzd();
        if (zzbvjVarZzd == null) {
            return zzhcf.zzc(new zzfsy(1, "Failed to create a rewarded ad."));
        }
        zzfke zzfkeVar = (zzfke) this.zza.zzl(ObjectWrapper.wrap(context), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzbvjVarZzd, this.zzc);
        if (zzfkeVar == null) {
            return zzhcf.zzc(new zzfsy(1, "Failed to create a rewarded ad."));
        }
        zzhcy zzhcyVarZze = zzhcy.zze();
        try {
            zzB(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            zzfsx zzfsxVar = this.zzf;
            if (zzfsxVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzY)).booleanValue()) {
                    zzfuqVar = this;
                    try {
                        zzfkeVar.zzu(new zzfti(zzfsxVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaa)).longValue(), zzfuqVar));
                    } catch (RemoteException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
                        return zzhcf.zzc(new zzfsy(1, "remote exception"));
                    }
                } else {
                    zzfuqVar = this;
                }
            } else {
                zzfuqVar = this;
            }
            zzfkeVar.zzc(((com.google.android.gms.ads.internal.client.zzfp) zzfuqVar.zze.get()).zzc, new zzfup(zzfkeVar, new zzfty(this, zzhcyVarZze), ((com.google.android.gms.ads.internal.client.zzfp) zzfuqVar.zze.get()).zza));
            return zzhcyVarZze;
        } catch (RemoteException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzful
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzW)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((zzccp) obj).zzm();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    public zzfuq(String str, ClientApi clientApi, Context context, int i, zzfmc zzfmcVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, Clock clock, zzfsx zzfsxVar) {
        super(str, clientApi, context, i, zzfmcVar, zzfpVar, zzceVar, scheduledExecutorService, zzfowVar, zzftgVar, clock, zzfsxVar);
    }
}
