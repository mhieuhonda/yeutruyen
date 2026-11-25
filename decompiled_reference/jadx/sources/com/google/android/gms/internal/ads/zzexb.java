package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexb implements zzfcs {
    private final zzfhm zza;

    zzexb(zzfhm zzfhmVar) {
        this.zza = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzfhm zzfhmVar = this.zza;
        if (zzfhmVar == null) {
            return zzhcf.zza(new zzexa(null));
        }
        String strZza = zzfhmVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzhcf.zza(new zzexa(null)) : zzhcf.zza(new zzexa(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 15;
    }
}
