package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaht implements zzahd {
    final /* synthetic */ zzahv zza;
    private final long zzb;

    public zzaht(zzahv zzahvVar, long j) {
        Objects.requireNonNull(zzahvVar);
        this.zza = zzahvVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        zzahv zzahvVar = this.zza;
        zzahb zzahbVarZzg = zzahvVar.zzh()[0].zzg(j);
        for (int i = 1; i < zzahvVar.zzh().length; i++) {
            zzahb zzahbVarZzg2 = zzahvVar.zzh()[i].zzg(j);
            if (zzahbVarZzg2.zza.zzc < zzahbVarZzg.zza.zzc) {
                zzahbVarZzg = zzahbVarZzg2;
            }
        }
        return zzahbVarZzg;
    }
}
