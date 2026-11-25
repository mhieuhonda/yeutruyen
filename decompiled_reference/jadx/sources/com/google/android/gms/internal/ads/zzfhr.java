package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhr implements zzfie {
    private final zzfmv zza;
    private final Executor zzb;
    private final zzhcc zzc = new zzfho(this);

    public zzfhr(zzfmv zzfmvVar, Executor executor) {
        this.zza = zzfmvVar;
        this.zzb = executor;
    }

    public final ListenableFuture zza(zzfif zzfifVar, zzfid zzfidVar, final zzdch zzdchVar) {
        zzfmv zzfmvVar = this.zza;
        Executor executor = this.zzb;
        return (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzj(zzhbx.zzw(new zzfia(zzfmvVar, zzdchVar, executor).zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhp
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzdchVar, (zzfhy) obj);
            }
        }, executor), Exception.class, new zzfhn(this), executor);
    }

    final /* synthetic */ ListenableFuture zzb(zzdch zzdchVar, zzfhy zzfhyVar) {
        zzfmv zzfmvVar = this.zza;
        zzfnf zzfnfVar = zzfhyVar.zzb;
        zzcbk zzcbkVar = zzfhyVar.zza;
        zzfne zzfneVarZza = zzfmvVar.zza(zzfnfVar);
        if (zzfneVarZza != null && zzcbkVar != null) {
            zzhcf.zzr(zzdchVar.zza().zzf(zzcbkVar), this.zzc, this.zzb);
        }
        return zzhcf.zza(new zzfhq(zzfnfVar, zzcbkVar, zzfneVarZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfif zzfifVar, zzfid zzfidVar, Object obj) {
        return zza(zzfifVar, zzfidVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
