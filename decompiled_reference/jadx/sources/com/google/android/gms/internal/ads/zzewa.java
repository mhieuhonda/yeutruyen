package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewa implements zzfcq {
    final ArrayList zza;

    public zzewa(ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzflv.zzg((Bundle) obj, "android_permissions", this.zza);
    }
}
