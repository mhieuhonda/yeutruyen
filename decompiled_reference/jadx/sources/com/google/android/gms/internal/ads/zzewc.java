package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzewc implements zzhbn {
    static final /* synthetic */ zzewc zza = new zzewc();

    private /* synthetic */ zzewc() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzhcf.zza(new zzewg(null, -1)) : zzhcf.zza(new zzewg(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
