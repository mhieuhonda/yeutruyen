package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoo implements zzimz {
    private final zzcns zza;

    private zzcoo(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
    }

    public static zzcoo zza(zzcns zzcnsVar) {
        return new zzcoo(zzcnsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        String strZze = this.zza.zze();
        zzinh.zzb(strZze);
        return strZze;
    }
}
