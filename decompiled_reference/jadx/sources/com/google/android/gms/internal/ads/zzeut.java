package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeut implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;

    zzeut(zzhcp zzhcpVar, zzflg zzflgVar, zzflw zzflwVar) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzeuu zzc() {
        List listAsList;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzie)).booleanValue()) {
            String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzig)).booleanValue()) {
                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzih)).split(","));
            } else {
                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzif)).split(","));
            }
            if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(strZzc))) {
                strZza = zzflw.zza();
            }
        }
        return new zzeuu(strZza);
    }
}
