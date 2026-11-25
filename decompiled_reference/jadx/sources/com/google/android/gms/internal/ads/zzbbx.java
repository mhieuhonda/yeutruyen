package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbbx implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbbz zzb;

    zzbbx(zzbbz zzbbzVar, int i, boolean z) {
        this.zza = i;
        Objects.requireNonNull(zzbbzVar);
        this.zzb = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayt zzaytVarZza;
        int i = this.zza;
        zzbbz zzbbzVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbbzVar.zza;
            zzaytVarZza = zzfxx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaytVarZza = null;
        }
        zzbbz zzbbzVar2 = this.zzb;
        zzbbzVar2.zzs(zzaytVarZza);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzaytVarZza != null && zzaytVarZza.zza() && !zzaytVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaytVarZza.zzg() && zzaytVarZza.zzh().zza() && zzaytVarZza.zzh().zzb() != -2) {
                return;
            }
            zzbbzVar2.zzp(i2 + 1, true);
        }
    }
}
