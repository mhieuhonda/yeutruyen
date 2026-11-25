package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzatj implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzatl zzc;

    zzatj(zzatl zzatlVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzatlVar);
        this.zzc = zzatlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatl zzatlVar = this.zzc;
        zzatlVar.zzx().zza(this.zza, this.zzb);
        zzatlVar.zzx().zzb(zzatlVar.toString());
    }
}
