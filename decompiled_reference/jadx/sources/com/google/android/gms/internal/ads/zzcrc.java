package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcrc implements zzimz {
    private final zzini zza;

    private zzcrc(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcrc zza(zzini zziniVar) {
        return new zzcrc(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfya(((zzcnz) this.zza).zza(), com.google.android.gms.ads.internal.zzt.zzs().zza());
    }
}
