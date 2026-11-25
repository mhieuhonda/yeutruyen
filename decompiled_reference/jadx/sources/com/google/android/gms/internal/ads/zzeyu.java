package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyu implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeyu(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeyu zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeyu(zziniVar, zziniVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxd zzgxdVarZzh;
        zzezs zzezsVarZzb = ((zzezu) this.zza).zzb();
        Context contextZza = ((zzcnz) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmY)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(contextZza)) {
                zzgxdVarZzh = zzgxd.zzi(zzezsVarZzb);
            } else {
                zzgxdVarZzh = zzgxd.zzh();
            }
        } else {
            zzgxdVarZzh = zzgxd.zzh();
        }
        zzinh.zzb(zzgxdVarZzh);
        return zzgxdVarZzh;
    }
}
