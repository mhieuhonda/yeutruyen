package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcur implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzcur(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzcur zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcur(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZza = ((zzcop) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean zEquals = "native".equals(str);
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbeu(UUID.randomUUID().toString(), versionInfoParcelZza, str, jSONObject, false, zEquals);
    }
}
