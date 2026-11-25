package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwb extends BroadcastReceiver {
    final /* synthetic */ zzfwc zza;

    zzfwb(zzfwc zzfwcVar) {
        Objects.requireNonNull(zzfwcVar);
        this.zza = zzfwcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfwc zzfwcVar = this.zza;
            zzfwcVar.zzd(true, zzfwcVar.zzf());
            zzfwcVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfwc zzfwcVar2 = this.zza;
            zzfwcVar2.zzd(false, zzfwcVar2.zzf());
            zzfwcVar2.zze(false);
        }
    }
}
