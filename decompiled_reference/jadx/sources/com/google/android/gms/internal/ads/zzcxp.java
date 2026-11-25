package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcxp implements zzden, zzbex, zzdib {
    private final zzfkn zza;
    private final zzddr zzb;
    private final zzdew zzc;
    private final zzdfs zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcxp(zzfkn zzfknVar, zzddr zzddrVar, zzdew zzdewVar, zzdfs zzdfsVar) {
        this.zza = zzfknVar;
        this.zzb = zzddrVar;
        this.zzc = zzdewVar;
        this.zzf = zzdfsVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdH() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzg() {
        int i = this.zza.zze;
        if (i == 1 || i == 4) {
            return;
        }
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        int i = this.zza.zze;
        if (i == 1) {
            if (zzbewVar.zzj) {
                zzd();
            }
        } else if (i == 4 && zzbewVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbewVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }
}
