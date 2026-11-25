package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzto {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzrg zze;
    private final zzck zzf;
    private final zzbf zzg;
    private final Object zzh;

    private zzto(zzv zzvVar, zzv zzvVar2, int i, int i2, zzrg zzrgVar, zzck zzckVar, zzbf zzbfVar, Object obj) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzrgVar;
        this.zzf = zzckVar;
        this.zzg = zzbfVar;
        this.zzh = obj;
    }

    /* synthetic */ zzto(zzv zzvVar, zzv zzvVar2, int i, int i2, zzrg zzrgVar, zzck zzckVar, zzbf zzbfVar, Object obj, byte[] bArr) {
        this(zzvVar, zzvVar2, i, i2, zzrgVar, zzckVar, zzbfVar, obj);
    }

    final /* synthetic */ zzto zza(zzrg zzrgVar) {
        return new zzto(this.zza, this.zzb, this.zzc, this.zzd, zzrgVar, this.zzf, this.zzg, this.zzh);
    }

    final /* synthetic */ long zzb(long j) {
        return zzfm.zzu(j, this.zza.zzJ);
    }

    final /* synthetic */ long zzc(long j) {
        return zzfm.zzu(j, this.zze.zzb);
    }

    final /* synthetic */ zzsa zzd() {
        zzrg zzrgVar = this.zze;
        return new zzsa(zzrgVar.zza, zzrgVar.zzb, zzrgVar.zzc, false, false, zzrgVar.zze);
    }

    final /* synthetic */ boolean zze() {
        return Objects.equals(this.zza.zzp, "audio/raw");
    }

    final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ zzv zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzrg zzj() {
        return this.zze;
    }

    final /* synthetic */ zzck zzk() {
        return this.zzf;
    }

    final /* synthetic */ zzbf zzl() {
        return this.zzg;
    }

    final /* synthetic */ Object zzm() {
        return this.zzh;
    }
}
