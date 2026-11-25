package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdid extends zzdix implements zzbop {
    public zzdid(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdic
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
