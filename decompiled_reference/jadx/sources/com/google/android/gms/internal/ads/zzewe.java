package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzewe implements zzgti {
    static final /* synthetic */ zzewe zza = new zzewe();

    private /* synthetic */ zzewe() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzewg(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
