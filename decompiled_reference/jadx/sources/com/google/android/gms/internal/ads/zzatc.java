package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatc {
    private final Executor zza;

    public zzatc(Handler handler) {
        this.zza = new zzata(this, handler);
    }

    public final void zza(zzatl zzatlVar, zzatr zzatrVar, Runnable runnable) {
        zzatlVar.zzp();
        zzatlVar.zzc("post-response");
        ((zzata) this.zza).zza.post(new zzatb(zzatlVar, zzatrVar, runnable));
    }

    public final void zzb(zzatl zzatlVar, zzatu zzatuVar) {
        zzatlVar.zzc("post-error");
        ((zzata) this.zza).zza.post(new zzatb(zzatlVar, zzatr.zzb(zzatuVar), null));
    }
}
