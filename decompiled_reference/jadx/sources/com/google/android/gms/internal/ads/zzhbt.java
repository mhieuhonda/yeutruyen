package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbt extends zzhbh {
    private zzhbs zza;

    zzhbt(zzgwp zzgwpVar, boolean z, Executor executor, Callable callable) {
        super(zzgwpVar, z, false);
        this.zza = new zzhbr(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzhbs zzhbsVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    protected final void zzi() {
        zzhbs zzhbsVar = this.zza;
        if (zzhbsVar != null) {
            zzhbsVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    final void zzw(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    final void zzx() {
        zzhbs zzhbsVar = this.zza;
        if (zzhbsVar != null) {
            zzhbsVar.zze();
        }
    }
}
