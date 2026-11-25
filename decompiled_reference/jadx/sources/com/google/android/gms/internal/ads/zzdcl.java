package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcl implements zzimz {
    private final zzdcj zza;
    private final zzini zzb;

    private zzdcl(zzdcj zzdcjVar, zzini zziniVar) {
        this.zza = zzdcjVar;
        this.zzb = zziniVar;
    }

    public static zzdcl zza(zzdcj zzdcjVar, zzini zziniVar) {
        return new zzdcl(zzdcjVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzf = this.zza.zzf(((zzcnz) this.zzb).zza());
        zzinh.zzb(contextZzf);
        return contextZzf;
    }
}
