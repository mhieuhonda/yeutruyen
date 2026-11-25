package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpf implements zzimz {
    private final zzini zza;

    private zzdpf(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzdpf zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdpf(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZza = ((zzcop) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbeu(UUID.randomUUID().toString(), versionInfoParcelZza, "native", new JSONObject(), false, true);
    }
}
