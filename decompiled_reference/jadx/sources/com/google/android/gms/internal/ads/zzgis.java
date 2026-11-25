package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgis implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgis(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgis zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgis(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgir((zzaxt) this.zza.zzb(), (zzgie) this.zzb.zzb(), (zzgqo) this.zzc.zzb());
    }
}
