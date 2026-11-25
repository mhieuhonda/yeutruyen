package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zznc extends zzmx {
    String zzV();

    default long zzW(long j, long j2) {
        if (zze() != 1) {
            return WorkRequest.MIN_BACKOFF_MILLIS;
        }
        if (zzab() || zzac()) {
            return 1000000L;
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    default boolean zzX(long j) {
        return false;
    }

    default void zzY(float f, float f2) throws zzjm {
    }

    default void zzZ() {
    }

    int zza();

    void zzaa(long j, long j2) throws zzjm;

    boolean zzab();

    boolean zzac();

    zzne zzb();

    void zzc(int i, zzqh zzqhVar, zzdp zzdpVar);

    void zzcT() throws zzjm;

    void zzcU(zzv[] zzvVarArr, zzzd zzzdVar, long j, long j2, zzxl zzxlVar) throws zzjm;

    zzzd zzcV();

    boolean zzcW();

    zzmd zzd();

    int zze();

    void zzf(zznf zznfVar, zzv[] zzvVarArr, zzzd zzzdVar, long j, boolean z, boolean z2, long j2, long j3, zzxl zzxlVar) throws zzjm;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j, boolean z) throws zzjm;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}
