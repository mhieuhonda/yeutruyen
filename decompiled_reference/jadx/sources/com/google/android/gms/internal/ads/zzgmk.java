package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgmk {
    private final zzave zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgmk(zzave zzaveVar, long j, long j2, String str) {
        this.zza = zzaveVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
    }

    static /* synthetic */ zzgmk zza(zzave zzaveVar, byte[] bArr, boolean z) throws zzavg, zzavc {
        zzaveVar.zza();
        zzaveVar.zzb(bArr);
        List list = (List) zzaveVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzaveVar.zzd(jLongValue, Optional.empty());
        String strZza = zzgel.zza(zzavh.zza(), false);
        int length = strZza.length();
        String str = true != z ? "" : "-s";
        StringBuilder sb = new StringBuilder(length + 12 + str.length());
        sb.append("3.893135394.");
        sb.append(strZza);
        sb.append(str);
        return new zzgmk(zzaveVar, jLongValue2, jLongValue3, sb.toString());
    }

    final /* synthetic */ String zzb(Map map) {
        return zzgel.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    final /* synthetic */ void zzc(Map map) throws zzavg, zzavc {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
