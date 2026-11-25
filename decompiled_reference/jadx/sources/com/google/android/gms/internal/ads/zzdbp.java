package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbp implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdbp(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzdbp zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdbp(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcop) this.zzb).zza();
        final zzflg zzflgVarZza = ((zzdcq) this.zzc).zza();
        return new zzgti() { // from class: com.google.android.gms.internal.ads.zzdbo
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzfkn zzfknVar = (zzfkn) obj;
                com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
                zzatVar.zze(zzfknVar.zzB);
                zzatVar.zzf(zzfknVar.zzC.toString());
                zzatVar.zzd(versionInfoParcelZza.afmaVersion);
                zzatVar.zzc(zzflgVarZza.zzg);
                return zzatVar;
            }
        };
    }
}
