package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidv implements zzihs {
    private final zzidu zza;

    private zzidv(zzidu zziduVar) {
        zziduVar.getClass();
        this.zza = zziduVar;
        zziduVar.zza = this;
    }

    public static zzidv zza(zzidu zziduVar) {
        Object obj = zziduVar.zza;
        return obj != null ? (zzidv) obj : new zzidv(zziduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzj(i, (zzidl) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzM(int i, zzifr zzifrVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            zziduVar.zzr(zzifs.zzc(zzifrVar, entry.getKey(), entry.getValue()));
            zzifs.zzb(zziduVar, zzifrVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zze(int i, float f) throws IOException {
        this.zza.zze(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzg(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzh(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzj(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzh(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzm(int i, String str) throws IOException {
        this.zza.zzi(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzn(int i, zzidl zzidlVar) throws IOException {
        this.zza.zzj(i, zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzd(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzq(int i, long j) throws IOException {
        this.zza.zzf(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzr(int i, Object obj, zzigr zzigrVar) throws IOException {
        zzidu zziduVar = this.zza;
        zzicu zzicuVar = (zzicu) obj;
        zziduVar.zzb(i, 2);
        zziduVar.zzr(zzicuVar.zzaT(zzigrVar));
        zzigrVar.zzf(zzicuVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzs(int i, Object obj, zzigr zzigrVar) throws IOException {
        zzidu zziduVar = this.zza;
        zziduVar.zzb(i, 3);
        zzigrVar.zzf((zzicu) obj, this);
        zziduVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzv(int i, Object obj) throws IOException {
        boolean z = obj instanceof zzidl;
        zzidu zziduVar = this.zza;
        if (z) {
            zziduVar.zzn(i, (zzidl) obj);
        } else {
            zziduVar.zzm(i, (zzifz) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifk)) {
            while (i2 < list.size()) {
                this.zza.zzi(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzifk zzifkVar = (zzifk) list;
        while (i2 < list.size()) {
            Object objZzc = zzifkVar.zzc();
            boolean z = objZzc instanceof String;
            zzidu zziduVar = this.zza;
            if (z) {
                zziduVar.zzi(i, (String) objZzc);
            } else {
                zziduVar.zzj(i, (zzidl) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zziduVar.zzr(i3);
            while (i2 < list.size()) {
                zziduVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zzg(i, zzifnVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            zzifnVar.zzc(i6);
            i5 += 8;
        }
        zziduVar2.zzr(i5);
        while (i2 < zzifnVar.size()) {
            zziduVar2.zzu(zzifnVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int iZzF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzF += zzidu.zzF(((Integer) list.get(i3)).intValue());
            }
            zziduVar.zzr(iZzF);
            while (i2 < list.size()) {
                zziduVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zzd(i, zzieqVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int iZzF2 = 0;
        for (int i4 = 0; i4 < zzieqVar.size(); i4++) {
            iZzF2 += zzidu.zzF(zzieqVar.zzf(i4));
        }
        zziduVar2.zzr(iZzF2);
        while (i2 < zzieqVar.size()) {
            zziduVar2.zzr(zzieqVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zziduVar.zzr(i3);
            while (i2 < list.size()) {
                zziduVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zze(i, zzieqVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzieqVar.size(); i6++) {
            zzieqVar.zzf(i6);
            i5 += 4;
        }
        zziduVar2.zzr(i5);
        while (i2 < zzieqVar.size()) {
            zziduVar2.zzs(zzieqVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int iZzG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzG += zzidu.zzG(((Long) list.get(i3)).longValue());
            }
            zziduVar.zzr(iZzG);
            while (i2 < list.size()) {
                zziduVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zzf(i, zzifnVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int iZzG2 = 0;
        for (int i4 = 0; i4 < zzifnVar.size(); i4++) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i4));
        }
        zziduVar2.zzr(iZzG2);
        while (i2 < zzifnVar.size()) {
            zziduVar2.zzt(zzifnVar.zzc(i2));
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzidb)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zziduVar.zzr(i3);
            while (i2 < list.size()) {
                zziduVar.zzp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzidb zzidbVar = (zzidb) list;
        if (!z) {
            while (i2 < zzidbVar.size()) {
                this.zza.zzh(i, zzidbVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidbVar.size(); i6++) {
            zzidbVar.zzf(i6);
            i5++;
        }
        zziduVar2.zzr(i5);
        while (i2 < zzidbVar.size()) {
            zziduVar2.zzp(zzidbVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int iZzG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzG += zzidu.zzG(((Integer) list.get(i3)).intValue());
            }
            zziduVar.zzr(iZzG);
            while (i2 < list.size()) {
                zziduVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zzc(i, zzieqVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int iZzG2 = 0;
        for (int i4 = 0; i4 < zzieqVar.size(); i4++) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i4));
        }
        zziduVar2.zzr(iZzG2);
        while (i2 < zzieqVar.size()) {
            zziduVar2.zzq(zzieqVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieg)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zziduVar.zzr(i3);
            while (i2 < list.size()) {
                zziduVar.zzs(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzieg zziegVar = (zzieg) list;
        if (!z) {
            while (i2 < zziegVar.size()) {
                this.zza.zze(i, Float.floatToRawIntBits(zziegVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziegVar.size(); i6++) {
            zziegVar.zzf(i6);
            i5 += 4;
        }
        zziduVar2.zzr(i5);
        while (i2 < zziegVar.size()) {
            zziduVar2.zzs(Float.floatToRawIntBits(zziegVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzidw)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zziduVar.zzr(i3);
            while (i2 < list.size()) {
                zziduVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzidw zzidwVar = (zzidw) list;
        if (!z) {
            while (i2 < zzidwVar.size()) {
                this.zza.zzg(i, Double.doubleToRawLongBits(zzidwVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzidwVar.size(); i6++) {
            zzidwVar.zzf(i6);
            i5 += 8;
        }
        zziduVar2.zzr(i5);
        while (i2 < zzidwVar.size()) {
            zziduVar2.zzu(Double.doubleToRawLongBits(zzidwVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zze(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zziduVar.zzr(i3);
            while (i2 < list.size()) {
                zziduVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zze(i, zzieqVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzieqVar.size(); i6++) {
            zzieqVar.zzf(i6);
            i5 += 4;
        }
        zziduVar2.zzr(i5);
        while (i2 < zzieqVar.size()) {
            zziduVar2.zzs(zzieqVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zziduVar.zzr(i3);
            while (i2 < list.size()) {
                zziduVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zzg(i, zzifnVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzifnVar.size(); i6++) {
            zzifnVar.zzc(i6);
            i5 += 8;
        }
        zziduVar2.zzr(i5);
        while (i2 < zzifnVar.size()) {
            zziduVar2.zzu(zzifnVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int iZzG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzG += zzidu.zzG(((Integer) list.get(i3)).intValue());
            }
            zziduVar.zzr(iZzG);
            while (i2 < list.size()) {
                zziduVar.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                this.zza.zzc(i, zzieqVar.zzf(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int iZzG2 = 0;
        for (int i4 = 0; i4 < zzieqVar.size(); i4++) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i4));
        }
        zziduVar2.zzr(iZzG2);
        while (i2 < zzieqVar.size()) {
            zziduVar2.zzq(zzieqVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzieq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzidu zziduVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zziduVar.zzd(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            zzidu zziduVar2 = this.zza;
            zziduVar2.zzb(i, 2);
            int iZzF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzF += zzidu.zzF((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zziduVar2.zzr(iZzF);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zziduVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzieq zzieqVar = (zzieq) list;
        if (!z) {
            while (i2 < zzieqVar.size()) {
                zzidu zziduVar3 = this.zza;
                int iZzf = zzieqVar.zzf(i2);
                zziduVar3.zzd(i, (iZzf >> 31) ^ (iZzf + iZzf));
                i2++;
            }
            return;
        }
        zzidu zziduVar4 = this.zza;
        zziduVar4.zzb(i, 2);
        int iZzF2 = 0;
        for (int i4 = 0; i4 < zzieqVar.size(); i4++) {
            int iZzf2 = zzieqVar.zzf(i4);
            iZzF2 += zzidu.zzF((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zziduVar4.zzr(iZzF2);
        while (i2 < zzieqVar.size()) {
            int iZzf3 = zzieqVar.zzf(i2);
            zziduVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzidu zziduVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zziduVar.zzf(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            zzidu zziduVar2 = this.zza;
            zziduVar2.zzb(i, 2);
            int iZzG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzG += zzidu.zzG((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zziduVar2.zzr(iZzG);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zziduVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                zzidu zziduVar3 = this.zza;
                long jZzc = zzifnVar.zzc(i2);
                zziduVar3.zzf(i, (jZzc >> 63) ^ (jZzc + jZzc));
                i2++;
            }
            return;
        }
        zzidu zziduVar4 = this.zza;
        zziduVar4.zzb(i, 2);
        int iZzG2 = 0;
        for (int i4 = 0; i4 < zzifnVar.size(); i4++) {
            long jZzc2 = zzifnVar.zzc(i4);
            iZzG2 += zzidu.zzG((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zziduVar4.zzr(iZzG2);
        while (i2 < zzifnVar.size()) {
            long jZzc3 = zzifnVar.zzc(i2);
            zziduVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihs
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzifn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzidu zziduVar = this.zza;
            zziduVar.zzb(i, 2);
            int iZzG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzG += zzidu.zzG(((Long) list.get(i3)).longValue());
            }
            zziduVar.zzr(iZzG);
            while (i2 < list.size()) {
                zziduVar.zzt(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzifn zzifnVar = (zzifn) list;
        if (!z) {
            while (i2 < zzifnVar.size()) {
                this.zza.zzf(i, zzifnVar.zzc(i2));
                i2++;
            }
            return;
        }
        zzidu zziduVar2 = this.zza;
        zziduVar2.zzb(i, 2);
        int iZzG2 = 0;
        for (int i4 = 0; i4 < zzifnVar.size(); i4++) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i4));
        }
        zziduVar2.zzr(iZzG2);
        while (i2 < zzifnVar.size()) {
            zziduVar2.zzt(zzifnVar.zzc(i2));
            i2++;
        }
    }
}
