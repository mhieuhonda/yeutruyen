package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfab implements zzfcq {
    private final Boolean zza;

    public zzfab(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.zza;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
