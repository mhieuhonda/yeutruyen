package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzcsi implements zzhbn {
    static final /* synthetic */ zzcsi zza = new zzcsi();

    private /* synthetic */ zzcsi() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmb)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzj(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzhcf.zza(new GetTopicsResponse(zzgwt.zzi()));
    }
}
