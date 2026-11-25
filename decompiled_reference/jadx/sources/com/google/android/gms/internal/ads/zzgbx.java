package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbx extends ContinuationImpl {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzgcp zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbx(zzgcp zzgcpVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzgcpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzA(this);
    }
}
