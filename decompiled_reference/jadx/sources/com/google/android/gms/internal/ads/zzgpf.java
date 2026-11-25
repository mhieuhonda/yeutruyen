package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgpf implements zzgpe {
    private final zzimt zza;
    private final zzgqo zzb;
    private final long zzc;

    zzgpf(zzimt zzimtVar, zzgqo zzgqoVar, zzgcy zzgcyVar, long j) {
        this.zza = zzimtVar;
        this.zzb = zzgqoVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zza(zzggb zzggbVar) {
        if (zzggbVar == null || zzggbVar.equals(zzggb.zzh())) {
            this.zzb.zzb(15104);
            return true;
        }
        if (zzggbVar.zzc() != this.zza.zzb()) {
            this.zzb.zzb(15105);
            return true;
        }
        boolean z = (zzggbVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
        if (z) {
            this.zzb.zzb(15106);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zzb(zzggb zzggbVar) {
        if (zzggbVar == null || zzggbVar.equals(zzggb.zzh())) {
            this.zzb.zzb(15102);
            return false;
        }
        if (zzggbVar.zzc() == this.zza.zzb()) {
            return true;
        }
        this.zzb.zzb(15103);
        return false;
    }
}
