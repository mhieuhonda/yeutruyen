package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexm implements zzfcs {
    private final zzhcp zza;
    private final zzdxp zzb;
    private final String zzc;
    private final zzflg zzd;

    public zzexm(zzhcp zzhcpVar, zzdxp zzdxpVar, zzflg zzflgVar, String str) {
        this.zza = zzhcpVar;
        this.zzb = zzdxpVar;
        this.zzd = zzflgVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 17;
    }

    final /* synthetic */ zzexn zzc() {
        zzflg zzflgVar = this.zzd;
        zzdxp zzdxpVar = this.zzb;
        return new zzexn(zzdxpVar.zzb(zzflgVar.zzg, this.zzc), zzdxpVar.zzc());
    }
}
