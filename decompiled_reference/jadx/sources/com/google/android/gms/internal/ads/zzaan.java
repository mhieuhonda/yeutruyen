package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaan extends zzbl {
    public static final zzaan zzJ = new zzaan(new zzaam());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzfm.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(1004, 36);
        Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
    }

    private zzaan(zzaam zzaamVar) {
        super(zzaamVar);
        this.zzK = zzaamVar.zzz();
        this.zzL = false;
        this.zzM = zzaamVar.zzA();
        this.zzN = false;
        this.zzO = zzaamVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzaamVar.zzC();
        this.zzU = zzaamVar.zzD();
        this.zzV = zzaamVar.zzE();
        this.zzW = false;
        this.zzX = zzaamVar.zzF();
        this.zzY = false;
        this.zzZ = zzaamVar.zzG();
        this.zzaa = zzaamVar.zzH();
    }

    /* synthetic */ zzaan(zzaam zzaamVar, byte[] bArr) {
        this(zzaamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaan zzaanVar = (zzaan) obj;
            if (super.equals(zzaanVar) && this.zzK == zzaanVar.zzK && this.zzM == zzaanVar.zzM && this.zzO == zzaanVar.zzO && this.zzT == zzaanVar.zzT && this.zzU == zzaanVar.zzU && this.zzV == zzaanVar.zzV && this.zzX == zzaanVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzaanVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzZ;
                    SparseArray sparseArray2 = zzaanVar.zzZ;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzzo zzzoVar = (zzzo) entry.getKey();
                                        if (!map2.containsKey(zzzoVar) || !Objects.equals(entry.getValue(), map2.get(zzzoVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i) {
        return this.zzaa.get(i);
    }

    @Deprecated
    public final boolean zzb(int i, zzzo zzzoVar) {
        Map map = (Map) this.zzZ.get(i);
        return map != null && map.containsKey(zzzoVar);
    }

    @Deprecated
    public final zzaao zzc(int i, zzzo zzzoVar) {
        Map map = (Map) this.zzZ.get(i);
        if (map != null) {
            return (zzaao) map.get(zzzoVar);
        }
        return null;
    }

    public final zzaam zzd() {
        return new zzaam(this, null);
    }

    final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }
}
