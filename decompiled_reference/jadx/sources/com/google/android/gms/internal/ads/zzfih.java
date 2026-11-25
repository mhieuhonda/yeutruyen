package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfih implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfih(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzfih zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfih(zziniVar, zziniVar2, zziniVar3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfie zzb() {
        zzfie zzfhuVar;
        Context context = (Context) this.zza.zzb();
        zzfmr zzfmrVar = (zzfmr) this.zzb.zzb();
        zzfnj zzfnjVar = (zzfnj) this.zzc.zzb();
        zzcff zzcffVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhs)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzp().zzj();
        boolean z = false;
        if (zzcffVarZzi != null && zzcffVarZzi.zzi()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhu)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhr)).booleanValue() || z) {
                zzfni zzfniVarZza = zzfnjVar.zza(zzfmz.Rewarded, context, zzfmrVar, new zzfhh(new zzfhg()));
                zzfhv zzfhvVar = new zzfhv(new zzfhu());
                zzfmv zzfmvVar = zzfniVarZza.zza;
                zzhcp zzhcpVar = zzcfy.zza;
                zzfhuVar = new zzfhl(zzfhvVar, new zzfhr(zzfmvVar, zzhcpVar), zzfniVarZza.zzb, zzfmvVar.zze().zzf, zzhcpVar);
            } else {
                zzfhuVar = new zzfhu();
            }
        } else {
            zzfhuVar = new zzfhu();
        }
        return zzfhuVar;
    }
}
