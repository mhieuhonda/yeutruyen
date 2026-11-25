package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqn extends BroadcastReceiver {
    final /* synthetic */ zzqp zza;

    /* synthetic */ zzqn(zzqp zzqpVar, byte[] bArr) {
        Objects.requireNonNull(zzqpVar);
        this.zza = zzqpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzqp zzqpVar = this.zza;
        zzqpVar.zzh(zzqj.zzb(context, intent, zzqpVar.zzl(), zzqpVar.zzj(), zzqpVar.zzg()));
    }
}
