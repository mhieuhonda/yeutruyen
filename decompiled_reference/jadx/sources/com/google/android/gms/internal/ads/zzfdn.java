package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdn implements zzfcq {
    final String zza;
    final int zzb;

    /* synthetic */ zzfdn(String str, int i, byte[] bArr) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzma)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("topics", str);
            }
            int i = this.zzb;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}
