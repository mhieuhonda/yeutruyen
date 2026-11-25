package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbch implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzbci zza;

    zzbch(zzbci zzbciVar) {
        Objects.requireNonNull(zzbciVar);
        this.zza = zzbciVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzbci zzbciVar = this.zza;
        if (z) {
            zzbciVar.zze(System.currentTimeMillis());
            zzbciVar.zzh(true);
            return;
        }
        long jZzf = zzbciVar.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbciVar.zzf()) {
            zzbciVar.zzg(jCurrentTimeMillis - zzbciVar.zzf());
        }
        zzbciVar.zzh(false);
    }
}
