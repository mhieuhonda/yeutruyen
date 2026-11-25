package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxt implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzdxt(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
    }

    public static zzdxt zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzdxt(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcnz) this.zza).zza();
        final String strZzb = ((zzefg) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcop) this.zzc).zza();
        final zzbic.zza.EnumC0012zza enumC0012zza = (zzbic.zza.EnumC0012zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbhw zzbhwVar = new zzbhw(new zzbib(contextZza));
        zzbic.zzar.zza zzaVarZzs = zzbic.zzar.zzs();
        zzaVarZzs.zzc(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzs.zzg(versionInfoParcelZza.clientJarVersion);
        zzaVarZzs.zzk(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbic.zzar zzarVarZzbu = zzaVarZzs.zzbu();
        zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzbic.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbVarZzcc.zzc(enumC0012zza);
                zzaVar.zzaa(zzbVarZzcc);
                zzbic.zzm.zza zzaVarZzcc = zzaVar.zzG().zzcc();
                zzaVarZzcc.zzd(strZzb);
                zzaVarZzcc.zzs(zzarVarZzbu);
                zzaVar.zzI(zzaVarZzcc);
                zzaVar.zzh(str);
            }
        });
        return zzbhwVar;
    }
}
