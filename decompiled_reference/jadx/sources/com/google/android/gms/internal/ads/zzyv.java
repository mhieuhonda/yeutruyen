package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyv extends zzwm implements zzyj {
    private final zzhq zza;
    private final zzyd zzb;
    private final zzuq zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private zzip zzj;
    private zzak zzk;
    private final zzabw zzl;

    /* synthetic */ zzyv(zzak zzakVar, zzhq zzhqVar, zzyd zzydVar, zzuq zzuqVar, zzabw zzabwVar, int i, boolean z, int i2, zzv zzvVar, zzguj zzgujVar, byte[] bArr) {
        this.zzk = zzakVar;
        this.zza = zzhqVar;
        this.zzb = zzydVar;
        this.zzc = zzuqVar;
        this.zzl = zzabwVar;
        this.zzd = i;
    }

    private final void zzv() {
        long j = this.zzf;
        boolean z = this.zzg;
        boolean z2 = this.zzh;
        zzak zzakVarZzK = zzK();
        zzbf zzzhVar = new zzzh(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzakVarZzK, z2 ? zzakVarZzK.zzc : null);
        if (this.zze) {
            zzzhVar = new zzys(this, zzzhVar);
        }
        zze(zzzhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final synchronized void zzB(zzak zzakVar) {
        this.zzk = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzE(zzxj zzxjVar) {
        ((zzyr) zzxjVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final zzxj zzH(zzxl zzxlVar, zzabm zzabmVar, long j) {
        zzhr zzhrVarZza = this.zza.zza();
        zzip zzipVar = this.zzj;
        if (zzipVar != null) {
            zzhrVarZza.zze(zzipVar);
        }
        zzag zzagVar = zzK().zzb;
        zzagVar.getClass();
        return new zzyr(zzagVar.zza, zzhrVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzxlVar), this.zzl, zzf(zzxlVar), this, zzabmVar, null, this.zzd, false, 0, null, zzfm.zzt(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final synchronized zzak zzK() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    protected final void zza(zzip zzipVar) {
        this.zzj = zzipVar;
        Looper.myLooper().getClass();
        zzk();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzb(long j, zzahd zzahdVar, boolean z) {
        if (this.zzi && zzahdVar.zzj()) {
            return;
        }
        this.zzi = !zzahdVar.zzj();
        if (j == -9223372036854775807L) {
            j = this.zzf;
        }
        boolean zZzb = zzahdVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zZzb && this.zzh == z) {
            return;
        }
        this.zzf = j;
        this.zzg = zZzb;
        this.zzh = z;
        this.zze = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzu() {
    }
}
