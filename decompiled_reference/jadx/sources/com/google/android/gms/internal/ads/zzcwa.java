package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwa implements zzimz {
    private final zzcvz zza;
    private final zzini zzb;

    private zzcwa(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zzcvzVar;
        this.zzb = zziniVar;
    }

    public static zzcwa zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwa(zzcvzVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zzinl) this.zzb).zzb());
    }
}
