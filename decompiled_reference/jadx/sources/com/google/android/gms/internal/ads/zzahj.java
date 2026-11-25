package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahj extends zzagp {
    final /* synthetic */ zzahd zza;
    final /* synthetic */ zzahk zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzahj(zzahk zzahkVar, zzahd zzahdVar, zzahd zzahdVar2) {
        super(zzahdVar);
        this.zza = zzahdVar2;
        Objects.requireNonNull(zzahkVar);
        this.zzb = zzahkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagp, com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        zzahb zzahbVarZzc = this.zza.zzc(j);
        zzahe zzaheVar = zzahbVarZzc.zza;
        long j2 = zzaheVar.zzb;
        zzahk zzahkVar = this.zzb;
        zzahe zzaheVar2 = new zzahe(j2, zzaheVar.zzc + zzahkVar.zza());
        zzahe zzaheVar3 = zzahbVarZzc.zzb;
        return new zzahb(zzaheVar2, new zzahe(zzaheVar3.zzb, zzaheVar3.zzc + zzahkVar.zza()));
    }
}
