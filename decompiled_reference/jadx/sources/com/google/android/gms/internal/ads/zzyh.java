package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyh extends zzagq {
    private final zzzc zza;
    private final zzafx zzb;
    private final AtomicReference zzc;

    zzyh(zzzc zzzcVar) {
        super(zzzcVar);
        this.zza = zzzcVar;
        this.zzb = new zzafx();
        this.zzc = new AtomicReference(zzyg.PASS_THROUGH);
    }

    private final zzahm zzh() {
        return this.zzc.get() == zzyg.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final int zza(zzj zzjVar, int i, boolean z) throws IOException {
        return zzh().zza(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        return zzh().zzb(zzjVar, i, z, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final void zzc(zzeu zzeuVar, int i) {
        zzh().zzc(zzeuVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i, int i2) {
        zzh().zzd(zzeuVar, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final void zze(long j, int i, int i2, int i3, zzahl zzahlVar) {
        zzh().zze(j, i, i2, i3, zzahlVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzyg.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzyg.DISCARDING);
        }
    }

    final boolean zzf() {
        return this.zzc.get() == zzyg.PASS_THROUGH;
    }
}
