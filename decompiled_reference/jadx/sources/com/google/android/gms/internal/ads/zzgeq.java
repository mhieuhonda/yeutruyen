package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgeq implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgeq(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzgeq zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgeq(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgdq zzgdqVar = (zzgdq) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        sb.append("Mozilla/5.0 (Linux; Android ");
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        sb.append(")");
        return new zzgev(executorService, sb.toString(), zzgdqVar.zzn());
    }
}
