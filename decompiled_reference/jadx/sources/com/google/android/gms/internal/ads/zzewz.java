package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewz implements zzimz {
    private final zzini zza;

    private zzewz(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzewz zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzewz(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewx zzb() {
        return new zzewx(zzfoi.zzc(), ((zzcnz) this.zza).zza());
    }
}
