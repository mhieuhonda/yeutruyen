package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcst implements zzimz {
    private final zzini zza;

    private zzcst(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcst zza(zzini zziniVar) {
        return new zzcst(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcss(((zzcnt) this.zza).zzb());
    }
}
