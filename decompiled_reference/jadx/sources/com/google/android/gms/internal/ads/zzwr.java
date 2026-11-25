package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwr implements zzxw, zzum {
    final /* synthetic */ zzwt zza;
    private final Object zzb;
    private zzxv zzc;
    private zzul zzd;

    public zzwr(zzwt zzwtVar, Object obj) {
        Objects.requireNonNull(zzwtVar);
        this.zza = zzwtVar;
        this.zzc = zzwtVar.zzf(null);
        this.zzd = zzwtVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzxl zzxlVar) {
        zzxl zzxlVarZzy;
        if (zzxlVar != null) {
            zzxlVarZzy = this.zza.zzy(this.zzb, zzxlVar);
            if (zzxlVarZzy == null) {
                return false;
            }
        } else {
            zzxlVarZzy = null;
        }
        zzwt zzwtVar = this.zza;
        zzwtVar.zzx(this.zzb, 0);
        zzxv zzxvVar = this.zzc;
        int i2 = zzxvVar.zza;
        if (!Objects.equals(zzxvVar.zzb, zzxlVarZzy)) {
            this.zzc = zzwtVar.zzg(0, zzxlVarZzy);
        }
        zzul zzulVar = this.zzd;
        int i3 = zzulVar.zza;
        if (Objects.equals(zzulVar.zzb, zzxlVarZzy)) {
            return true;
        }
        this.zzd = zzwtVar.zzi(0, zzxlVarZzy);
        return true;
    }

    private final zzxh zzg(zzxh zzxhVar, zzxl zzxlVar) {
        zzwt zzwtVar = this.zza;
        Object obj = this.zzb;
        zzwtVar.zzz(obj, zzxhVar.zzc, zzxlVar);
        zzwtVar.zzz(obj, zzxhVar.zzd, zzxlVar);
        return zzxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzai(int i, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar, int i2) {
        if (zzf(0, zzxlVar)) {
            zzxv zzxvVar = this.zzc;
            zzg(zzxhVar, zzxlVar);
            zzxvVar.zzd(zzxcVar, zzxhVar, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzaj(int i, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar) {
        if (zzf(0, zzxlVar)) {
            zzxv zzxvVar = this.zzc;
            zzg(zzxhVar, zzxlVar);
            zzxvVar.zze(zzxcVar, zzxhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzak(int i, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar) {
        if (zzf(0, zzxlVar)) {
            zzxv zzxvVar = this.zzc;
            zzg(zzxhVar, zzxlVar);
            zzxvVar.zzf(zzxcVar, zzxhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzal(int i, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar, IOException iOException, boolean z) {
        if (zzf(0, zzxlVar)) {
            zzxv zzxvVar = this.zzc;
            zzg(zzxhVar, zzxlVar);
            zzxvVar.zzg(zzxcVar, zzxhVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzam(int i, zzxl zzxlVar, zzxh zzxhVar) {
        if (zzf(0, zzxlVar)) {
            zzxv zzxvVar = this.zzc;
            zzg(zzxhVar, zzxlVar);
            zzxvVar.zzh(zzxhVar);
        }
    }
}
