package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzfea implements zzhbn {
    static final /* synthetic */ zzfea zza = new zzfea();

    private /* synthetic */ zzfea() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzhcf.zza(new zzfec(null, -1)) : zzhcf.zza(new zzfec(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
