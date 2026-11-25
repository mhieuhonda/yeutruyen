package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzng {
    private final zznc zza;
    private final int zzb;
    private final zznc zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzng(zznc zzncVar, zznc zzncVar2, int i) {
        this.zza = zzncVar;
        this.zzb = i;
        this.zzc = zzncVar2;
    }

    private final boolean zzN() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzme zzmeVar, zznc zzncVar) {
        if (zzncVar == null) {
            return true;
        }
        zzzd[] zzzdVarArr = zzmeVar.zzc;
        int i = this.zzb;
        zzzd zzzdVar = zzzdVarArr[i];
        if (zzncVar.zzcV() != null) {
            if (zzncVar.zzcV() == zzzdVar) {
                if (zzzdVar != null && !zzncVar.zzcW()) {
                    zzmeVar.zzp();
                    boolean z = zzmeVar.zzg.zzf;
                }
            }
            zzme zzmeVarZzp = zzmeVar.zzp();
            return zzmeVarZzp != null && zzmeVarZzp.zzc[i] == zzncVar.zzcV();
        }
        return true;
    }

    private final void zzR(zznc zzncVar, zzzd zzzdVar, zzjk zzjkVar, long j, boolean z) throws zzjm {
        if (zzW(zzncVar)) {
            if (zzzdVar != zzncVar.zzcV()) {
                zzS(zzncVar, zzjkVar);
            } else if (z) {
                zzncVar.zzp(j, true);
            }
        }
    }

    private final void zzS(zznc zzncVar, zzjk zzjkVar) {
        boolean z = true;
        if (this.zza != zzncVar && this.zzc != zzncVar) {
            z = false;
        }
        zzgtr.zzi(z);
        if (zzW(zzncVar)) {
            zzjkVar.zze(zzncVar);
            zzY(zzncVar);
            zzncVar.zzr();
        }
    }

    private final void zzT(boolean z) {
        if (z) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zznc zzncVar = this.zzc;
            zzncVar.getClass();
            zzncVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zznc zzncVar, zzme zzmeVar, zzabj zzabjVar, zzjk zzjkVar) throws zzjm {
        if (zzncVar != null && zzW(zzncVar)) {
            zznc zzncVar2 = this.zza;
            boolean z = zzncVar != zzncVar2;
            if ((zzncVar != zzncVar2 || !zzN()) && (zzncVar != this.zzc || !zzO())) {
                zzzd zzzdVarZzcV = zzncVar.zzcV();
                zzzd[] zzzdVarArr = zzmeVar.zzc;
                int i = this.zzb;
                zzzd zzzdVar = zzzdVarArr[i];
                boolean zZza = zzabjVar.zza(i);
                if (zZza && zzzdVarZzcV == zzzdVar) {
                    return 1;
                }
                if (!zzncVar.zzm()) {
                    zzv[] zzvVarArrZzV = zzV(zzabjVar.zzc[i]);
                    zzzd zzzdVar2 = zzzdVarArr[i];
                    zzzdVar2.getClass();
                    zzncVar.zzcU(zzvVarArrZzV, zzzdVar2, zzmeVar.zzc(), zzmeVar.zza(), zzmeVar.zzg.zza);
                    return 3;
                }
                if (!zzncVar.zzac()) {
                    return 0;
                }
                zzS(zzncVar, zzjkVar);
                if (!zZza || zzc()) {
                    zzT(!z);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzabb zzabbVar) {
        int iZze = zzabbVar != null ? zzabbVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[iZze];
        for (int i = 0; i < iZze; i++) {
            zzabbVar.getClass();
            zzvVarArr[i] = zzabbVar.zzb(i);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zznc zzncVar) {
        return zzncVar.zze() != 0;
    }

    private final zznc zzX(zzme zzmeVar) {
        if (zzmeVar != null) {
            int i = this.zzb;
            zzzd[] zzzdVarArr = zzmeVar.zzc;
            if (zzzdVarArr[i] != null) {
                zznc zzncVar = this.zza;
                zzzd zzzdVarZzcV = zzncVar.zzcV();
                zzzd zzzdVar = zzzdVarArr[i];
                if (zzzdVarZzcV == zzzdVar) {
                    return zzncVar;
                }
                zznc zzncVar2 = this.zzc;
                if (zzncVar2 != null && zzncVar2.zzcV() == zzzdVar) {
                    return zzncVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zznc zzncVar) {
        if (zzncVar.zze() == 2) {
            zzncVar.zzq();
        }
    }

    private static final void zzZ(zznc zzncVar, long j) {
        zzncVar.zzl();
        if (zzncVar instanceof zzzs) {
            throw null;
        }
    }

    public final void zzA(zzjk zzjkVar) throws zzjm {
        zzS(this.zza, zzjkVar);
        zznc zzncVar = this.zzc;
        if (zzncVar != null) {
            boolean z = zzW(zzncVar) && this.zzd != 3;
            zzS(zzncVar, zzjkVar);
            zzT(false);
            if (z) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zzjm {
        int i = this.zzd;
        if (i == 3 || i == 4) {
            zzQ(i == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzD(zzzd zzzdVar, zzjk zzjkVar, long j, boolean z) throws zzjm {
        zzR(this.zza, zzzdVar, zzjkVar, j, z);
        zznc zzncVar = this.zzc;
        if (zzncVar != null) {
            zzR(zzncVar, zzzdVar, zzjkVar, j, z);
        }
    }

    public final void zzE(zzme zzmeVar, long j, boolean z) throws zzjm {
        zznc zzncVarZzX = zzX(zzmeVar);
        if (zzncVarZzX != null) {
            zzncVarZzX.zzp(j, z);
        }
    }

    public final boolean zzF(zzme zzmeVar, long j) {
        zznc zzncVarZzX = zzX(zzmeVar);
        return zzncVarZzX != null && zzncVarZzX.zzX(j);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zznc zzncVar = this.zzc;
        if (zzncVar == null || zzW(zzncVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzme zzmeVar, zzabj zzabjVar, zzjk zzjkVar) throws zzjm {
        int iZzU = zzU(this.zza, zzmeVar, zzabjVar, zzjkVar);
        return iZzU == 1 ? zzU(this.zzc, zzmeVar, zzabjVar, zzjkVar) : iZzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zznc zzncVar = this.zzc;
        if (zzncVar != null) {
            zzncVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) throws zzjm {
        if (zze() != 2) {
            return;
        }
        int i = this.zzd;
        if (i != 4 && i != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zznc zzncVar = this.zzc;
        zzncVar.getClass();
        zzncVar.zzx(1, obj);
    }

    public final void zzK(zzadt zzadtVar) throws zzjm {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzadtVar);
        zznc zzncVar = this.zzc;
        if (zzncVar != null) {
            zzncVar.zzx(7, zzadtVar);
        }
    }

    public final void zzL(float f) throws zzjm {
        if (zze() != 1) {
            return;
        }
        zznc zzncVar = this.zza;
        Float fValueOf = Float.valueOf(f);
        zzncVar.zzx(2, fValueOf);
        zznc zzncVar2 = this.zzc;
        if (zzncVar2 != null) {
            zzncVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzM() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzW(this.zza);
        }
        zznc zzncVar = this.zzc;
        zzncVar.getClass();
        return zzW(zzncVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i;
        zzgtr.zzi(!zzc());
        if (zzW(this.zza)) {
            i = 3;
        } else {
            zznc zzncVar = this.zzc;
            i = (zzncVar == null || !zzW(zzncVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zznc zzncVar = this.zzc;
        boolean zZzW = zzW(this.zza);
        int i = 0;
        if (zzncVar != null && zzW(zzncVar)) {
            i = 1;
        }
        return (zZzW ? 1 : 0) + i;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzme zzmeVar) {
        return ((zznc) Objects.requireNonNull(zzX(zzmeVar))).zzk();
    }

    public final boolean zzg(zzme zzmeVar) {
        zznc zzncVarZzX = zzX(zzmeVar);
        zzncVarZzX.getClass();
        return zzncVarZzX.zzcW();
    }

    public final void zzh(zzme zzmeVar, long j) {
        zznc zzncVarZzX = zzX(zzmeVar);
        zzncVarZzX.getClass();
        zzZ(zzncVarZzX, j);
    }

    public final void zzi(zzabj zzabjVar, zzabj zzabjVar2, long j) {
        int i;
        int i2 = this.zzb;
        boolean zZza = zzabjVar.zza(i2);
        boolean zZza2 = zzabjVar2.zza(i2);
        zznc zzncVar = this.zzc;
        if (zzncVar == null || (i = this.zzd) == 3 || (i == 0 && zzW(this.zza))) {
            zzncVar = this.zza;
        }
        if (!zZza || zzncVar.zzm()) {
            return;
        }
        zze();
        zznf zznfVar = zzabjVar.zzb[i2];
        zznf zznfVar2 = zzabjVar2.zzb[i2];
        if (zZza2 && Objects.equals(zznfVar2, zznfVar) && !zzc()) {
            return;
        }
        zzZ(zzncVar, j);
    }

    public final void zzj(long j) {
        int i;
        zznc zzncVar = this.zza;
        if (zzW(zzncVar) && (i = this.zzd) != 4 && i != 2) {
            zzZ(zzncVar, j);
        }
        zznc zzncVar2 = this.zzc;
        if (zzncVar2 == null || !zzW(zzncVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzncVar2, j);
    }

    public final long zzk(long j, long j2) {
        zznc zzncVar = this.zza;
        long jZzW = zzW(zzncVar) ? zzncVar.zzW(j, j2) : Long.MAX_VALUE;
        zznc zzncVar2 = this.zzc;
        return (zzncVar2 == null || !zzW(zzncVar2)) ? jZzW : Math.min(jZzW, zzncVar2.zzW(j, j2));
    }

    public final void zzl() {
        zznc zzncVar = this.zza;
        if (zzW(zzncVar)) {
            zzncVar.zzZ();
            return;
        }
        zznc zzncVar2 = this.zzc;
        if (zzncVar2 == null || !zzW(zzncVar2)) {
            return;
        }
        zzncVar2.zzZ();
    }

    public final void zzm(float f, float f2) throws zzjm {
        this.zza.zzY(f, f2);
        zznc zzncVar = this.zzc;
        if (zzncVar != null) {
            zzncVar.zzY(f, f2);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zznc zzncVar = this.zzc;
        if (zzncVar != null) {
            zzncVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zznc zzncVar = this.zza;
        boolean zZzac = zzW(zzncVar) ? zzncVar.zzac() : true;
        zznc zzncVar2 = this.zzc;
        return (zzncVar2 == null || !zzW(zzncVar2)) ? zZzac : zZzac & zzncVar2.zzac();
    }

    public final boolean zzp(zzme zzmeVar) {
        return zzX(zzmeVar) != null;
    }

    public final boolean zzq(zzme zzmeVar) {
        return (zzN() && zzX(zzmeVar) == this.zza) || (zzO() && zzX(zzmeVar) == this.zzc);
    }

    public final boolean zzr(zzme zzmeVar) {
        return zzP(zzmeVar, this.zza) && zzP(zzmeVar, this.zzc);
    }

    public final void zzs(long j, long j2) throws zzjm {
        zznc zzncVar = this.zza;
        if (zzW(zzncVar)) {
            zzncVar.zzaa(j, j2);
        }
        zznc zzncVar2 = this.zzc;
        if (zzncVar2 == null || !zzW(zzncVar2)) {
            return;
        }
        zzncVar2.zzaa(j, j2);
    }

    public final boolean zzt(zzme zzmeVar) {
        zznc zzncVarZzX = zzX(zzmeVar);
        return zzncVarZzX == null || zzncVarZzX.zzcW() || zzncVarZzX.zzab() || zzncVarZzX.zzac();
    }

    public final void zzu(zzme zzmeVar) throws IOException {
        zznc zzncVarZzX = zzX(zzmeVar);
        zzncVarZzX.getClass();
        zzncVarZzX.zzn();
    }

    public final void zzv() throws zzjm {
        zznc zzncVar = this.zza;
        if (zzncVar.zze() == 1 && this.zzd != 4) {
            zzncVar.zzcT();
            return;
        }
        zznc zzncVar2 = this.zzc;
        if (zzncVar2 == null || zzncVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzncVar2.zzcT();
    }

    public final void zzw() {
        zznc zzncVar = this.zza;
        if (zzW(zzncVar)) {
            zzY(zzncVar);
        }
        zznc zzncVar2 = this.zzc;
        if (zzncVar2 == null || !zzW(zzncVar2)) {
            return;
        }
        zzY(zzncVar2);
    }

    public final void zzx(zznf zznfVar, zzabb zzabbVar, zzzd zzzdVar, long j, boolean z, boolean z2, long j2, long j3, zzxl zzxlVar, zzjk zzjkVar) throws zzjm {
        zzv[] zzvVarArrZzV = zzV(zzabbVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zznc zzncVar = this.zza;
            zzncVar.zzf(zznfVar, zzvVarArrZzV, zzzdVar, j, z, z2, j2, j3, zzxlVar);
            zzjkVar.zzd(zzncVar);
            return;
        }
        this.zzf = true;
        zznc zzncVar2 = this.zzc;
        zzncVar2.getClass();
        zzncVar2.zzf(zznfVar, zzvVarArrZzV, zzzdVar, j, z, z2, j2, j3, zzxlVar);
        zzjkVar.zzd(zzncVar2);
    }

    public final void zzy(int i, Object obj, zzme zzmeVar) throws zzjm {
        zznc zzncVarZzX = zzX(zzmeVar);
        zzncVarZzX.getClass();
        zzncVarZzX.zzx(11, obj);
    }

    public final void zzz(zznj zznjVar) throws zzjm {
        this.zza.zzx(18, zznjVar);
        zznc zzncVar = this.zzc;
        if (zzncVar != null) {
            zzncVar.zzx(18, zznjVar);
        }
    }

    private final void zzQ(boolean z) throws zzjm {
        if (z) {
            zznc zzncVar = this.zzc;
            zzncVar.getClass();
            zzncVar.zzx(17, this.zza);
        } else {
            zznc zzncVar2 = this.zza;
            zznc zzncVar3 = this.zzc;
            zzncVar3.getClass();
            zzncVar2.zzx(17, zzncVar3);
        }
    }

    public final void zzC(zzjk zzjkVar) {
        boolean z;
        zznc zzncVar;
        if (zzc()) {
            int i = this.zzd;
            if (i == 4) {
                z = true;
            } else if (i == 2) {
                i = 2;
                z = true;
            } else {
                z = false;
            }
            try {
                if (z) {
                    zzncVar = this.zza;
                } else {
                    zzncVar = this.zzc;
                    if (zzncVar == null) {
                        throw null;
                    }
                }
                zzS(zzncVar, zzjkVar);
            } catch (RuntimeException e) {
                zzeh.zzf("RendererHolder", "Disable prewarming failed.", e);
            }
            try {
                zzT(z);
            } catch (RuntimeException e2) {
                zzeh.zzf("RendererHolder", "Reset prewarming failed.", e2);
            }
            this.zzd = i == 4 ? 1 : 0;
        }
    }
}
