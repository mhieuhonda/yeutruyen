package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfas implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzfas(zzhcp zzhcpVar, zzflg zzflgVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 26;
    }

    final /* synthetic */ zzfat zzc() {
        return new zzfat(this.zzb, this.zzc, this.zzd);
    }
}
