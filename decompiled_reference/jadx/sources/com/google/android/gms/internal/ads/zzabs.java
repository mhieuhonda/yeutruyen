package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabs implements zzabm {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzabk[] zzd = new zzabk[100];

    public zzabs(boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized zzabk zza() {
        zzabk zzabkVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzabk[] zzabkVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzabkVar = zzabkVarArr[i2];
            if (zzabkVar == null) {
                throw null;
            }
            zzabkVarArr[i2] = null;
        } else {
            zzabkVar = new zzabk(new byte[65536], 0);
            int i3 = this.zzb;
            zzabk[] zzabkVarArr2 = this.zzd;
            int length = zzabkVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzabk[]) Arrays.copyOf(zzabkVarArr2, length + length);
                return zzabkVar;
            }
        }
        return zzabkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzb(zzabk zzabkVar) {
        zzabk[] zzabkVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzabkVarArr[i] = zzabkVar;
        this.zzb--;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzc(zzabl zzablVar) {
        while (zzablVar != null) {
            zzabk[] zzabkVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzabkVarArr[i] = zzablVar.zzd();
            this.zzb--;
            zzablVar = zzablVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzd() {
        int i = this.zza;
        String str = zzfm.zza;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i2 = this.zzc;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i2, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }

    public final synchronized int zzh() {
        return this.zzc * 65536;
    }
}
