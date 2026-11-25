package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcox implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcox(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcox zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcox(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbd zzb() {
        Context contextZza = ((zzcnz) this.zza).zza();
        zzfqt zzfqtVar = (zzfqt) this.zzb.zzb();
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        zzbup zzbupVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfqtVar);
        zzbuj zzbujVar = zzbum.zza;
        zzbupVarZza.zza("google.afma.request.getAdDictionary", zzbujVar, zzbujVar);
        return new zzcbg(contextZza, com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzfqtVar).zza("google.afma.sdkConstants.getSdkConstants", zzbujVar, zzbujVar), VersionInfoParcel.forPackage(), zzhcpVarZzc);
    }
}
