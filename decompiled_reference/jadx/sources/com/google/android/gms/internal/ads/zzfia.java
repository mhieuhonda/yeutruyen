package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfia {
    private final zzfmv zza;
    private final zzdch zzb;
    private final Executor zzc;
    private zzfhy zzd;

    public zzfia(zzfmv zzfmvVar, zzdch zzdchVar, Executor executor) {
        this.zza = zzfmvVar;
        this.zzb = zzdchVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzfnf zzb() {
        zzflg zzflgVarZzb = this.zzb.zzb();
        return this.zza.zzd(zzflgVarZzb.zzd, zzflgVarZzb.zzg, zzflgVarZzb.zzk);
    }

    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza;
        zzfhy zzfhyVar = this.zzd;
        if (zzfhyVar != null) {
            return zzhcf.zza(zzfhyVar);
        }
        if (((Boolean) zzble.zza.zze()).booleanValue()) {
            zzhbx zzhbxVarZzw = zzhbx.zzw(this.zzb.zza().zze(this.zza.zze()));
            zzfhx zzfhxVar = new zzfhx(this);
            Executor executor = this.zzc;
            listenableFutureZza = (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk(zzhbxVarZzw, zzfhxVar, executor), zzegz.class, new zzfhw(this), executor);
        } else {
            zzfhy zzfhyVar2 = new zzfhy(null, zzb(), null);
            this.zzd = zzfhyVar2;
            listenableFutureZza = zzhcf.zza(zzfhyVar2);
        }
        return zzhcf.zzk(listenableFutureZza, zzfhz.zza, this.zzc);
    }

    final /* synthetic */ zzfhy zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzd(zzfhy zzfhyVar) {
        this.zzd = zzfhyVar;
    }
}
