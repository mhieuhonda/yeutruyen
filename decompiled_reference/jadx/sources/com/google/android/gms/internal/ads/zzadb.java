package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadb implements zzaet {
    final /* synthetic */ zzadg zza;

    zzadb(zzadg zzadgVar) {
        Objects.requireNonNull(zzadgVar);
        this.zza = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void zza() {
        zznb zznbVarZzbe = this.zza.zzbe();
        if (zznbVarZzbe != null) {
            zznbVarZzbe.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void zzb() {
        zzadg zzadgVar = this.zza;
        if (zzadgVar.zzbr() != null) {
            zzadgVar.zzbq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void zzc() {
        zzadg zzadgVar = this.zza;
        if (zzadgVar.zzbr() != null) {
            zzadgVar.zzaB(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void zzd(zzbv zzbvVar) {
    }
}
