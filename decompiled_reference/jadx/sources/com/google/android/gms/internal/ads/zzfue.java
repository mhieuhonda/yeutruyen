package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfue implements Runnable {
    final /* synthetic */ zzful zza;

    zzfue(zzful zzfulVar) {
        Objects.requireNonNull(zzfulVar);
        this.zza = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzful zzfulVar = this.zza;
        if (zzfulVar.zzN() != null) {
            long jCurrentTimeMillis = zzfulVar.zzO().currentTimeMillis();
            int iZzs = zzfulVar.zzs();
            String strZzM = zzfulVar.zzM();
            zzfulVar.zzN().zzj(jCurrentTimeMillis, zzfulVar.zzP(), iZzs, strZzM);
        }
    }
}
