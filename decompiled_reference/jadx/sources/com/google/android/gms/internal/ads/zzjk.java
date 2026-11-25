package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjk implements zzmd {
    private final zznn zza;
    private final zzjj zzb;
    private zznc zzc;
    private zzmd zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzjk(zzjj zzjjVar, zzdp zzdpVar) {
        this.zzb = zzjjVar;
        this.zza = new zznn(zzdpVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(zznc zzncVar) throws zzjm {
        zzmd zzmdVar;
        zzmd zzmdVarZzd = zzncVar.zzd();
        if (zzmdVarZzd == null || zzmdVarZzd == (zzmdVar = this.zzd)) {
            return;
        }
        if (zzmdVar != null) {
            throw zzjm.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzmdVarZzd;
        this.zzc = zzncVar;
        zzmdVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zznc zzncVar) {
        if (zzncVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    public final long zzf(boolean z) {
        zznn zznnVar;
        zzav zzavVarZzj;
        zznc zzncVar = this.zzc;
        if (zzncVar == null || zzncVar.zzac() || ((z && this.zzc.zze() != 2) || (!this.zzc.zzab() && (z || this.zzc.zzcW())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzmd zzmdVar = this.zzd;
            zzmdVar.getClass();
            long jZzg = zzmdVar.zzg();
            if (this.zze) {
                zznn zznnVar2 = this.zza;
                if (jZzg < zznnVar2.zzg()) {
                    zznnVar2.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zznnVar2.zza();
                    }
                    zznnVar = this.zza;
                    zznnVar.zzc(jZzg);
                    zzavVarZzj = zzmdVar.zzj();
                    if (!zzavVarZzj.equals(zznnVar.zzj())) {
                        zznnVar.zzi(zzavVarZzj);
                        this.zzb.zzc(zzavVarZzj);
                    }
                }
            } else {
                zznnVar = this.zza;
                zznnVar.zzc(jZzg);
                zzavVarZzj = zzmdVar.zzj();
                if (!zzavVarZzj.equals(zznnVar.zzj())) {
                    zznnVar.zzi(zzavVarZzj);
                    this.zzb.zzc(zzavVarZzj);
                }
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzmd zzmdVar = this.zzd;
        zzmdVar.getClass();
        return zzmdVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzi(zzav zzavVar) {
        zzmd zzmdVar = this.zzd;
        if (zzmdVar != null) {
            zzmdVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        zzmd zzmdVar = this.zzd;
        return zzmdVar != null ? zzmdVar.zzj() : this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzmd zzmdVar = this.zzd;
        zzmdVar.getClass();
        return zzmdVar.zzh();
    }
}
