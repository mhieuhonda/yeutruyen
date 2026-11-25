package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoq implements zzimz {
    private final zzcns zza;

    private zzcoq(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
    }

    public static zzcoq zza(zzcns zzcnsVar) {
        return new zzcoq(zzcnsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Long.valueOf(this.zza.zzi());
    }
}
