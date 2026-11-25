package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffh implements zzfcs {
    private final zzcfk zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzhcp zzd;
    private final int zze;

    zzffh(zzcfk zzcfkVar, boolean z, zzcfa zzcfaVar, zzhcp zzhcpVar, String str, ScheduledExecutorService scheduledExecutorService, int i) {
        this.zza = zzcfkVar;
        this.zzb = z;
        this.zzd = zzhcpVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzid)).booleanValue() && this.zzb) {
            return zzhcf.zza(new zzffi(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzif)).split(",")).contains(String.valueOf(this.zze))) {
            return zzhcf.zza(new zzffi(null));
        }
        ListenableFuture listenableFutureZza = zzhcf.zza(null);
        zzhcp zzhcpVar = this.zzd;
        return zzhcf.zzg(zzhcf.zzi(zzhcf.zzk(listenableFutureZza, zzffg.zza, zzhcpVar), ((Long) zzblm.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfff
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((Exception) obj);
            }
        }, zzhcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 50;
    }

    final /* synthetic */ zzffi zzc(Exception exc) {
        this.zza.zzh(exc, "TrustlessTokenSignal");
        return new zzffi(null);
    }
}
