package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzggg implements zzhbn {
    static final /* synthetic */ zzggg zza = new zzggg();

    private /* synthetic */ zzggg() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        final zzggc zzggcVar = (zzggc) obj;
        return zzhcf.zzk(zzggcVar.zzb(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzggh
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj2) {
                return zzggcVar;
            }
        }, zzhcw.zza());
    }
}
