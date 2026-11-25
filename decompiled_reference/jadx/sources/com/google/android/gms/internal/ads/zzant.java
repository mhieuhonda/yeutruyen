package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzant implements zzagd {
    private final zzagd zzb;
    private final zzanq zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzant(zzagd zzagdVar, zzanq zzanqVar) {
        this.zzb = zzagdVar;
        this.zzc = zzanqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final zzahm zzs(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.zze = true;
        }
        if (i2 != 3) {
            return this.zzb.zzs(i, i2);
        }
        SparseArray sparseArray = this.zzd;
        zzanv zzanvVar = (zzanv) sparseArray.get(i);
        if (zzanvVar != null) {
            return zzanvVar;
        }
        zzanv zzanvVar2 = new zzanv(this.zzb.zzs(i, 3), this.zzc);
        sparseArray.put(i, zzanvVar2);
        return zzanvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzanv) sparseArray.valueAt(i)).zzf(true);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzw(zzahd zzahdVar) {
        this.zzb.zzw(zzahdVar);
    }
}
