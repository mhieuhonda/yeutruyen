package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzqr implements Function {
    static final /* synthetic */ zzqr zza = new zzqr();

    private /* synthetic */ zzqr() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
