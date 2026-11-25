package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhed {
    private boolean zza;

    @Nullable
    private final zzheq zzc;
    private final zzheb zzb = zzheb.zza;
    private zzhee zzd = null;

    @Nullable
    private zzhef zze = null;

    /* synthetic */ zzhed(zzheq zzheqVar, byte[] bArr) {
        this.zzc = zzheqVar;
    }

    public final zzhed zza() {
        zzhef zzhefVar = this.zze;
        if (zzhefVar != null) {
            zzhefVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhed zzb() {
        this.zzd = zzhee.zza;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zza = false;
    }

    final /* synthetic */ zzheb zze() {
        return this.zzb;
    }

    final /* synthetic */ zzheq zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzhee zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzhef zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(zzhef zzhefVar) {
        this.zze = zzhefVar;
    }
}
