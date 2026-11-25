package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsb implements zzddt {
    private final zzdqb zza;
    private final zzdqg zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdsb(zzdqb zzdqbVar, zzdqg zzdqgVar, Executor executor, Executor executor2) {
        this.zza = zzdqbVar;
        this.zzb = zzdqgVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzclb zzclbVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclbVar.zze("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdqb zzdqbVar = this.zza;
            zzelv zzelvVarZzZ = zzdqbVar.zzZ();
            if (zzelvVarZzZ == null && zzdqbVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgx)).booleanValue()) {
                ListenableFuture listenableFutureZzX = zzdqbVar.zzX();
                zzcgd zzcgdVarZzY = zzdqbVar.zzY();
                if (listenableFutureZzX == null || zzcgdVarZzY == null) {
                    return;
                }
                zzhcf.zzr(zzhcf.zzq(listenableFutureZzX, zzcgdVarZzY), new zzdrz(this), this.zzd);
                return;
            }
            if (zzelvVarZzZ != null) {
                zzclb zzclbVarZzW = zzdqbVar.zzW();
                zzclb zzclbVarZzT = zzdqbVar.zzT();
                if (zzclbVarZzW == null) {
                    zzclbVarZzW = zzclbVarZzT == null ? null : zzclbVarZzT;
                }
                if (zzclbVarZzW != null) {
                    zza(zzclbVarZzW);
                }
            }
        }
    }
}
