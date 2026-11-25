package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhj implements zzhr {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhv zzd;

    protected zzhj(boolean z) {
        this.zza = z;
    }

    protected final void zzf(zzhv zzhvVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzip) this.zzb.get(i)).zza(this, zzhvVar, this.zza);
        }
    }

    protected final void zzg(zzhv zzhvVar) {
        this.zzd = zzhvVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzip) this.zzb.get(i)).zzb(this, zzhvVar, this.zza);
        }
    }

    protected final void zzh(int i) {
        zzhv zzhvVar = this.zzd;
        String str = zzfm.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzip) this.zzb.get(i2)).zzc(this, zzhvVar, this.zza, i);
        }
    }

    protected final void zzi() {
        zzhv zzhvVar = this.zzd;
        String str = zzfm.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((zzip) this.zzb.get(i)).zzd(this, zzhvVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
        zzipVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzipVar)) {
            return;
        }
        arrayList.add(zzipVar);
        this.zzc++;
    }
}
