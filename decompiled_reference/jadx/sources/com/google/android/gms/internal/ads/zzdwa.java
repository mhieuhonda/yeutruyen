package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwa implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdwa(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzdwa zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdwa(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        int i = ((zzdcq) this.zzc).zza().zzp.zza;
        if (i != 0) {
            return i + (-1) != 0 ? ((zzerd) this.zzb).zzb() : ((zzerd) this.zza).zzb();
        }
        throw null;
    }
}
