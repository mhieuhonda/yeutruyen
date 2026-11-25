package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyt implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdyt(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar4;
    }

    public static zzdyt zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzdyt(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        final String strZza = ((zzffc) this.zza).zza();
        Context contextZza = ((zzcnz) this.zzb).zza();
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        Map mapZzb = ((zzind) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgk)).booleanValue()) {
            zzbhw zzbhwVar = new zzbhw(new zzbib(contextZza));
            zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyu
                @Override // com.google.android.gms.internal.ads.zzbhv
                public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                    zzaVar.zzh(strZza);
                }
            });
            setEmptySet = Collections.singleton(new zzdky(new zzdyw(zzbhwVar, mapZzb), zzhcpVarZzc));
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzinh.zzb(setEmptySet);
        return setEmptySet;
    }
}
