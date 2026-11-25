package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaam extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzaam() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    protected final zzaam zzx(zzbl zzblVar) {
        super.zza(zzblVar);
        return this;
    }

    public final zzaam zzy(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i) == z) {
            return this;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
            return this;
        }
        sparseBooleanArray.delete(i);
        return this;
    }

    final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    /* synthetic */ zzaam(zzaan zzaanVar, byte[] bArr) {
        super(zzaanVar);
        this.zza = zzaanVar.zzK;
        this.zzb = zzaanVar.zzM;
        this.zzc = zzaanVar.zzO;
        this.zzd = zzaanVar.zzT;
        this.zze = zzaanVar.zzU;
        this.zzf = zzaanVar.zzV;
        this.zzg = zzaanVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArrayZze = zzaanVar.zze();
            if (i < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i), new HashMap((Map) sparseArrayZze.valueAt(i)));
                i++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzaanVar.zzf().clone();
                return;
            }
        }
    }
}
