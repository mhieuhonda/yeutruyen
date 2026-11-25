package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbv extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbv(String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzgbv zzgbvVar = new zzgbv(this.zzb, continuation);
        zzgbvVar.zza = obj;
        return zzgbvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbv) create((zzgbi) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzgbk zzgbkVarZza = zzgbj.zza((zzgbg) ((zzgbi) this.zza).zzcc());
        zzgbkVarZza.zzd(zzgbkVarZza.zzb(), this.zzb);
        return zzgbkVarZza.zza();
    }
}
