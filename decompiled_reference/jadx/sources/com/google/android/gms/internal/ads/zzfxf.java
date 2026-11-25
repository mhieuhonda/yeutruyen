package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxf {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfxe zzd = null;

    public zzfxf() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfxe zzfxeVar = (zzfxe) this.zzc.poll();
        this.zzd = zzfxeVar;
        if (zzfxeVar != null) {
            zzfxeVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfxe zzfxeVar) {
        zzfxeVar.zzb(this);
        this.zzc.add(zzfxeVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfxe zzfxeVar) {
        this.zzd = null;
        zzc();
    }
}
