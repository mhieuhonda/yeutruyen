package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdms implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzdms(zzdml zzdmlVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzdms zza(zzdml zzdmlVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzdms(zzdmlVar, zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcop) this.zzb).zza();
        final zzfkn zzfknVarZza = ((zzcyr) this.zzc).zza();
        final zzflg zzflgVarZza = ((zzdcq) this.zzd).zza();
        return new zzdky(new zzden() { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // com.google.android.gms.internal.ads.zzden
            public final /* synthetic */ void zzg() {
                zzflg zzflgVar = zzflgVarZza;
                JSONObject jSONObject = zzfknVarZza.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcelZza.afmaVersion, jSONObject.toString(), zzflgVar.zzg);
            }
        }, zzcfy.zzh);
    }
}
