package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzxg extends zzzq {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzxe zze;
    private zzxd zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzxg(zzxn zzxnVar, boolean z) {
        boolean z2;
        super(zzxnVar);
        if (z) {
            zzxnVar.zzJ();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzxnVar.zzI();
        this.zze = zzxe.zzp(zzxnVar.zzK());
    }

    private final Object zzL(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzxe.zzc)) ? obj : this.zze.zzs();
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzM(long j) {
        zzxd zzxdVar = this.zzf;
        int iZze = this.zze.zze(zzxdVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzxe zzxeVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzxeVar.zzd(iZze, zzbdVar, false);
        long j2 = zzbdVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzxdVar.zzg(j);
        return true;
    }

    public final zzbf zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzB(zzak zzakVar) {
        if (this.zzi) {
            zzxe zzxeVar = this.zze;
            this.zze = zzxeVar.zzr(zzzm.zzp(zzxeVar.zzb, zzakVar));
        } else {
            this.zze = zzxe.zzp(zzakVar);
        }
        this.zza.zzB(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzq
    public final void zzC() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzw(null, ((zzzq) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzq, com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final zzxd zzH(zzxl zzxlVar, zzabm zzabmVar, long j) {
        zzxd zzxdVar = new zzxd(zzxlVar, zzabmVar, j);
        zzxdVar.zzi(this.zza);
        if (this.zzh) {
            zzxdVar.zzj(zzxlVar.zza(zzL(zzxlVar.zza)));
            return zzxdVar;
        }
        this.zzf = zzxdVar;
        if (!this.zzg) {
            this.zzg = true;
            zzw(null, ((zzzq) this).zza);
        }
        return zzxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzq, com.google.android.gms.internal.ads.zzxn
    public final void zzE(zzxj zzxjVar) {
        ((zzxd) zzxjVar).zzk();
        if (zzxjVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzzq
    protected final void zzF(zzbf zzbfVar) {
        long jZza;
        zzxl zzxlVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbfVar);
            zzxd zzxdVar = this.zzf;
            if (zzxdVar != null) {
                zzM(zzxdVar.zzh());
            }
        } else if (zzbfVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzxe.zzq(zzbfVar, zzbe.zza, zzxe.zzc);
        } else {
            zzbe zzbeVar = this.zzc;
            zzbfVar.zzb(0, zzbeVar, 0L);
            Object obj = zzbeVar.zzb;
            zzxd zzxdVar2 = this.zzf;
            if (zzxdVar2 != null) {
                jZza = zzxdVar2.zza();
                this.zze.zzo(zzxdVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbeVar, 0L);
                if (jZza == 0) {
                    jZza = 0;
                }
            } else {
                jZza = 0;
            }
            Pair pairZzm = zzbfVar.zzm(zzbeVar, this.zzd, 0, jZza);
            Object obj2 = pairZzm.first;
            long jLongValue = ((Long) pairZzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzxe.zzq(zzbfVar, obj, obj2);
            zzxd zzxdVar3 = this.zzf;
            if (zzxdVar3 != null && zzM(jLongValue)) {
                zzxl zzxlVar = zzxdVar3.zza;
                zzxlVarZza = zzxlVar.zza(zzL(zzxlVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzxlVarZza != null) {
            zzxd zzxdVar4 = this.zzf;
            zzxdVar4.getClass();
            zzxdVar4.zzj(zzxlVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzq
    protected final zzxl zzG(zzxl zzxlVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzxlVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzxe.zzc;
        }
        return zzxlVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzwm
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }
}
