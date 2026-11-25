package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzsg {
    void zzA(float f);

    void zzB();

    void zzC();

    void zzD();

    default void zzE() {
    }

    void zza(zzsd zzsdVar);

    default void zzb(zzqh zzqhVar) {
    }

    default void zzc(zzdp zzdpVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzqu zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z);

    default void zzh(zzrz zzrzVar) throws zzsb {
        throw null;
    }

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzsc, zzsf;

    void zzl() throws zzsf;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z);

    void zzr(zzd zzdVar);

    default zzqj zzs() {
        throw null;
    }

    void zzt(int i);

    void zzu(zze zzeVar);

    default void zzv(AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzw(int i) {
    }

    default void zzx(long j) {
    }

    long zzy();

    default void zzz(int i, int i2) {
    }
}
