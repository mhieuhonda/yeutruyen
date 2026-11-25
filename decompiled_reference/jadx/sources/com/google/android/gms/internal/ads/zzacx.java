package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzacx implements zzaew {
    private final zzadw zza;
    private final zzadx zzb;
    private final zzaee zzc;
    private final Queue zzd;
    private Surface zze;
    private zzv zzf;
    private long zzg;
    private zzaet zzh;
    private Executor zzi;
    private zzadt zzj;

    public zzacx(zzadw zzadwVar, zzadx zzadxVar, zzdp zzdpVar) {
        this.zza = zzadwVar;
        this.zzb = zzadxVar;
        zzadwVar.zzg(zzdpVar);
        this.zzc = new zzaee(new zzacw(this, null), zzadwVar, zzadxVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzt().zzP();
        this.zzg = -9223372036854775807L;
        this.zzh = zzaet.zzb;
        this.zzi = zzacs.zza;
        this.zzj = zzacq.zza;
    }

    final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    final /* synthetic */ zzaet zzB() {
        return this.zzh;
    }

    final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    final /* synthetic */ zzadt zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzc(zzaet zzaetVar, Executor executor) {
        this.zzh = zzaetVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzg(boolean z) {
        if (z) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzh(boolean z) {
        return this.zza.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzl(zzadt zzadtVar) {
        this.zzj = zzadtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzm(float f) {
        this.zza.zzn(f);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzo(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzp(Surface surface, zzev zzevVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzr(int i) {
        this.zza.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzs(int i, zzv zzvVar, long j, int i2, List list) {
        zzgtr.zzi(list.isEmpty());
        int i3 = zzvVar.zzw;
        zzv zzvVar2 = this.zzf;
        if (i3 != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx) {
            this.zzc.zzc(i3, zzvVar.zzx);
        }
        float f = zzvVar.zzA;
        if (f != this.zzf.zzA) {
            this.zza.zze(f);
        }
        this.zzf = zzvVar;
        if (j != this.zzg) {
            this.zzc.zzd(i2, j);
            this.zzg = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzu(long j, zzaeu zzaeuVar) {
        this.zzd.add(zzaeuVar);
        this.zzc.zze(j);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzw(boolean z) {
        this.zza.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzx() {
    }

    final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    final /* synthetic */ Queue zzz() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzv(long j, long j2) throws zzaev {
        try {
            this.zzc.zzb(j, j2);
        } catch (zzjm e) {
            throw new zzaev(e, this.zzf);
        }
    }
}
