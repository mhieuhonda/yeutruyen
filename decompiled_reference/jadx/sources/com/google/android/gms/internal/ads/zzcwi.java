package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwi implements zzimz {
    private final zzcvz zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzcwi(zzcvz zzcvzVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zzcvzVar;
        this.zzb = zziniVar;
        this.zzc = zziniVar2;
        this.zzd = zziniVar3;
        this.zze = zziniVar4;
    }

    public static zzcwi zza(zzcvz zzcvzVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzcwi(zzcvzVar, zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    public static zzdky zzc(zzcvz zzcvzVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfkn zzfknVar, final zzflg zzflgVar) {
        return new zzdky(new zzden() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // com.google.android.gms.internal.ads.zzden
            public final /* synthetic */ void zzg() {
                zzflg zzflgVar2 = zzflgVar;
                JSONObject jSONObject = zzfknVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzflgVar2.zzg);
            }
        }, zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzcop) this.zzc).zza(), ((zzcyr) this.zzd).zza(), ((zzdcq) this.zze).zza());
    }
}
