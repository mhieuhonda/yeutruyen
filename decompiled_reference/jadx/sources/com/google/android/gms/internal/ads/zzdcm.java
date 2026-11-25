package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcm implements zzimz {
    private final zzdcj zza;

    private zzdcm(zzdcj zzdcjVar) {
        this.zza = zzdcjVar;
    }

    public static zzdcm zzc(zzdcj zzdcjVar) {
        return new zzdcm(zzdcjVar);
    }

    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
