package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfg implements zzdz {
    private Message zza;

    private zzfg() {
        throw null;
    }

    /* synthetic */ zzfg(byte[] bArr) {
    }

    public final zzfg zzb(Message message, zzfh zzfhVar) {
        this.zza = message;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzfh.zzo(this);
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzfh.zzo(this);
        return zSendMessageAtFrontOfQueue;
    }
}
