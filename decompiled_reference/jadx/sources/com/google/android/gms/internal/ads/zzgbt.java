package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbt {
    public static final zzgbr zza(final ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new zzgbr() { // from class: com.google.android.gms.internal.ads.zzgbs
            @Override // com.google.android.gms.internal.ads.zzgbr
            public final /* synthetic */ CoroutineScope zza() {
                return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorService));
            }
        };
    }
}
