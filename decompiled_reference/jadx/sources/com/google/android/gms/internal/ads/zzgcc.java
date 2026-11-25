package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgcc extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgbe zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcc(zzgbe zzgbeVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgbeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzgcc zzgccVar = new zzgcc(this.zzb, continuation);
        zzgccVar.zza = obj;
        return zzgccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcc) create((zzgbi) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzgbk zzgbkVarZza = zzgbj.zza((zzgbg) ((zzgbi) this.zza).zzcc());
        zziht zzihtVarZzb = zzgbkVarZza.zzb();
        zzgbe zzgbeVar = this.zzb;
        String strZza = zzgbeVar.zza();
        Intrinsics.checkNotNullExpressionValue(strZza, "getGwsQueryId(...)");
        zzgbkVarZza.zzc(zzihtVarZzb, strZza, zzgbeVar);
        return zzgbkVarZza.zza();
    }
}
