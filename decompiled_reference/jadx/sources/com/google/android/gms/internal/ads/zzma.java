package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzma {
    default void zza(zzqh zzqhVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void zzb(zzlz zzlzVar, zzzo zzzoVar, zzabb[] zzabbVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void zzc(zzqh zzqhVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void zzd(zzqh zzqhVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    zzabm zze(zzqh zzqhVar);

    default long zzf(zzqh zzqhVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean zzg(zzqh zzqhVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzh(zzlz zzlzVar) {
        long j = zzlzVar.zzd;
        throw null;
    }

    default boolean zzi(zzlz zzlzVar) {
        zzbf zzbfVar = zzlzVar.zzb;
        throw null;
    }

    default boolean zzj(zzqh zzqhVar, zzbf zzbfVar, zzxl zzxlVar, long j) {
        zzeh.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
