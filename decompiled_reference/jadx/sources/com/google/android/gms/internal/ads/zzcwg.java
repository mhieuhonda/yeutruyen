package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwg implements zzimz {
    private final zzini zza;

    private zzcwg(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcwg zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwg(zzcvzVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky(((zzcwv) this.zza).zzb(), zzcfy.zza);
    }
}
