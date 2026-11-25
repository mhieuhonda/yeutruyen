package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzarz {
    public final int zza;
    public final long zzb;

    private zzarz(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzarz zza(zzagb zzagbVar, zzeu zzeuVar) throws IOException {
        zzagbVar.zzi(zzeuVar.zzi(), 0, 8);
        zzeuVar.zzh(0);
        return new zzarz(zzeuVar.zzB(), zzeuVar.zzA());
    }
}
