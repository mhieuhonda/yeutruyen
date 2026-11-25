package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadm implements zzaew {
    final /* synthetic */ zzads zza;
    private zzgwt zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzadm(zzads zzadsVar, Context context, int i) {
        Objects.requireNonNull(zzadsVar);
        this.zza = zzadsVar;
        zzfm.zzW(context);
        this.zzb = zzgwt.zzi();
        this.zze = -9223372036854775807L;
        zzaet zzaetVar = zzaet.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzE(zzads.zzC(zzvVar.zzF));
        zztVarZza.zzP();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zza() {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzt()) {
            zzadsVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzb() {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzt()) {
            zzadsVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzc(zzaet zzaetVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzd(zzv zzvVar) throws zzaev {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzg(boolean z) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzh(boolean z) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzi() {
        zzads zzadsVar = this.zza;
        zzadsVar.zzA(this.zze);
        if (zzadsVar.zzy() >= zzadsVar.zzz()) {
            zzadsVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Surface zzk() {
        zzgtr.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzl(zzadt zzadtVar) {
        this.zza.zzp(zzadtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzm(float f) {
        this.zza.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgwt.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzo(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzp(Surface surface, zzev zzevVar) {
        this.zza.zzc(surface, zzevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzr(int i) {
        this.zza.zzr(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzs(int i, zzv zzvVar, long j, int i2, List list) {
        zzgtr.zzi(false);
        this.zzb = zzgwt.zzq(list);
        this.zzc = zzvVar;
        zzads zzadsVar = this.zza;
        zzadsVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzadsVar.zzt()) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        long j4 = j3;
        zzadsVar.zzw().zza(j4, new zzadr(j + this.zzd, i2, j4));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzt() {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzw().zzc() == 0) {
            zzadsVar.zzo();
            return;
        }
        zzfi zzfiVar = new zzfi(10);
        boolean z = true;
        while (zzadsVar.zzw().zzc() > 0) {
            zzadr zzadrVar = (zzadr) zzadsVar.zzw().zzd();
            zzadrVar.getClass();
            if (z) {
                int i = zzadrVar.zzb;
                if (i == 0 || i == 1) {
                    zzadrVar = new zzadr(zzadrVar.zza, 0, zzadrVar.zzc);
                } else {
                    zzadsVar.zzo();
                }
            }
            zzfiVar.zza(zzadrVar.zzc, zzadrVar);
            z = false;
        }
        zzadsVar.zzx(zzfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzu(long j, zzaeu zzaeuVar) {
        int i;
        zzgtr.zzi(false);
        long j2 = j + this.zzd;
        zzads zzadsVar = this.zza;
        long jZzb = zzadsVar.zzv().zzb(j2);
        if (jZzb == -9223372036854775807L || jZzb >= zzadsVar.zzu() || (i = this.zzf) >= 2) {
            if (zzadsVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i + 1;
        zzaeuVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzv(long j, long j2) throws zzaev {
        this.zza.zzl(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzw(boolean z) {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzt()) {
            zzadsVar.zzn(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzx() {
        this.zza.zzg();
    }
}
