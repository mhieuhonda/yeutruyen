package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeuu implements zzfcq {
    private final String zza;

    public zzeuu(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
