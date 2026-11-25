package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfub implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzb;
    final /* synthetic */ zzful zzc;

    zzfub(zzful zzfulVar, long j, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza = j;
        this.zzb = zzdxVar;
        Objects.requireNonNull(zzfulVar);
        this.zzc = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzful zzfulVar = this.zzc;
        if (zzfulVar.zzN() != null) {
            long j = this.zza;
            String strZzV = zzful.zzV(this.zzb);
            int iZzs = zzfulVar.zzs();
            int iZzt = zzfulVar.zzt();
            String strZzM = zzfulVar.zzM();
            zzfulVar.zzN().zzi(j, strZzV, zzfulVar.zzP(), iZzs, iZzt, strZzM);
        }
    }
}
