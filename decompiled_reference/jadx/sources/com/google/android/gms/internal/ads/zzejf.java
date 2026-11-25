package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzejf implements zzhcc {
    final /* synthetic */ zzfos zza;

    zzejf(zzejh zzejhVar, zzfos zzfosVar) {
        this.zza = zzfosVar;
        Objects.requireNonNull(zzejhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        String message = th.getMessage();
        String.valueOf(message);
        String strValueOf = String.valueOf(message);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get offline signal database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            String message = e.getMessage();
            String.valueOf(message);
            String strValueOf = String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error executing function on offline signal database: ".concat(strValueOf));
        }
    }
}
