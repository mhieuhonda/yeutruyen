package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcxa implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcxa(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzcxa zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcxa(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        boolean zBooleanValue = Boolean.valueOf(zzcwy.zza()).booleanValue();
        zzema zzemaVarZzb = ((zzepe) this.zza).zzb();
        zzerc zzercVarZzb = ((zzerd) this.zzb).zzb();
        if (true != zBooleanValue) {
            zzemaVarZzb = zzercVarZzb;
        }
        return zzemaVarZzb;
    }
}
