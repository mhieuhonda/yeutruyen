package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgax extends Handler {
    public zzgax() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    protected void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzgax(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
