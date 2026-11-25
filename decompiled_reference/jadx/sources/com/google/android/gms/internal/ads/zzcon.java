package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcon implements zzimz {
    private final zzini zza;

    private zzcon(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcon zza(zzini zziniVar) {
        return new zzcon(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcnz) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznd)).booleanValue()) {
            return com.google.android.gms.ads.internal.util.client.zzf.zzf(contextZza);
        }
        return null;
    }
}
