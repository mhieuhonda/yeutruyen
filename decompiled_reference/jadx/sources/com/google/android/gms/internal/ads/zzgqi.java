package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgqi implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzgqk zza;

    zzgqi(zzgqk zzgqkVar) {
        Objects.requireNonNull(zzgqkVar);
        this.zza = zzgqkVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgqk zzgqkVar = this.zza;
        synchronized (zzgqkVar) {
            try {
                if (z) {
                    zzgqkVar.zzg(System.currentTimeMillis());
                    zzgqkVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgqkVar.zzh() > 0 && jCurrentTimeMillis >= zzgqkVar.zzh()) {
                        zzgqkVar.zzi(jCurrentTimeMillis - zzgqkVar.zzh());
                    }
                    zzgqkVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
