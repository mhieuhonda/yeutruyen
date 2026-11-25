package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgsu extends FunctionReferenceImpl implements Function2, SuspendFunction {
    public static final zzgsu zza = new zzgsu();

    zzgsu() {
        super(2, zzgsw.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return zzgsw.zzd((Mutex) obj, (Continuation) obj2);
    }
}
