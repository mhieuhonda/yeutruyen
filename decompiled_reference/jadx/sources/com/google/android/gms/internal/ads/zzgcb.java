package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgcb extends ContinuationImpl {
    Object zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgcp zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcb(zzgcp zzgcpVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzgcpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzC(this);
    }
}
