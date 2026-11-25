package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwh implements zzimz {
    private final zzini zza;

    private zzcwh(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcwh zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwh(zzcvzVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxd zzgxdVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzon)).booleanValue() ? zzgxd.zzi(new zzdky(((zzcxl) this.zza).zzb(), zzcfy.zza)) : zzgxd.zzh();
        zzinh.zzb(zzgxdVarZzi);
        return zzgxdVarZzi;
    }
}
