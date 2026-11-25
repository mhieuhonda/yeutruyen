package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxy extends zzabd {
    private final zzbg zza;

    public zzxy(zzabb zzabbVar, zzbg zzbgVar) {
        super(zzabbVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzxy)) {
            return this.zza.equals(((zzxy) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final int hashCode() {
        return (super.hashCode() * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabg
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabg
    public final zzv zzb(int i) {
        return this.zza.zza(zzd().zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabb
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
