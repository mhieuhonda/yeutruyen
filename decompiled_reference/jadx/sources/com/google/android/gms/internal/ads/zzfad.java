package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfad implements zzfcs {
    private final Context zza;
    private final Intent zzb;

    zzfad(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoy)).booleanValue()) {
            return zzhcf.zza(new zzfae(null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzhcf.zza(new zzfae(Boolean.valueOf(z)));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 60;
    }
}
