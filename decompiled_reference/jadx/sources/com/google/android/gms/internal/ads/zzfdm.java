package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdm implements zzfcs {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzhcp zzc;
    private final ScheduledExecutorService zzd;
    private final zzely zze;
    private final zzflg zzf;
    private final VersionInfoParcel zzg;

    zzfdm(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzely zzelyVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzhcpVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzelyVar;
        this.zzf = zzflgVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzfcs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdm.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th) {
        zzfdn zzfdnVar;
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmb)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzj(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzfdnVar = new zzfdn("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzfdnVar = new zzfdn("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzfdnVar = new zzfdn("", 4, null);
        } else {
            zzfdnVar = th instanceof TimeoutException ? new zzfdn("", 5, null) : new zzfdn("", 0, null);
        }
        return zzhcf.zza(zzfdnVar);
    }
}
