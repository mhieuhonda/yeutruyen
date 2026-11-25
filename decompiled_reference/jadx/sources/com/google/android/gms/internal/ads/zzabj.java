package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabj {
    public final int zza;
    public final zznf[] zzb;
    public final zzabb[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzabj(zznf[] zznfVarArr, zzabb[] zzabbVarArr, zzbn zzbnVar, Object obj) {
        int length = zznfVarArr.length;
        zzgtr.zza(length == zzabbVarArr.length);
        this.zzb = zznfVarArr;
        this.zzc = (zzabb[]) zzabbVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(zzabj zzabjVar, int i) {
        return zzabjVar != null && Objects.equals(this.zzb[i], zzabjVar.zzb[i]) && Objects.equals(this.zzc[i], zzabjVar.zzc[i]);
    }
}
