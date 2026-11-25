package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrw extends zzgqu {
    final /* synthetic */ zzgry zza;
    private final zzgsd zzb;

    zzgrw(zzgry zzgryVar, zzgsd zzgsdVar) {
        Objects.requireNonNull(zzgryVar);
        this.zza = zzgryVar;
        this.zzb = zzgsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqv
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        zzgsb zzgsbVarZze = zzgsc.zze();
        zzgsbVarZze.zza(i);
        if (string != null) {
            zzgsbVarZze.zzb(string);
        }
        zzgsbVarZze.zzc(i2);
        if (bundle.containsKey("userInteracted")) {
            zzgsbVarZze.zzd(Boolean.valueOf(bundle.getBoolean("userInteracted")));
        }
        this.zzb.zza(zzgsbVarZze.zze());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
