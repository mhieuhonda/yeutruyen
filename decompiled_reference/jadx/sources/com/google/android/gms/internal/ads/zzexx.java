package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexx implements zzimz {
    public static zzexx zza() {
        return zzexw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbio zzbioVar = zzbix.zznu;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).split(","));
        }
        zzinh.zzb(arrayList);
        return arrayList;
    }
}
