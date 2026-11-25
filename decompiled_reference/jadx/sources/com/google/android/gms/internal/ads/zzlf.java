package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlf implements zzmi {
    private final Object zza;
    private zzbf zzb;

    public zzlf(Object obj, zzxg zzxgVar) {
        this.zza = obj;
        this.zzb = zzxgVar.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
