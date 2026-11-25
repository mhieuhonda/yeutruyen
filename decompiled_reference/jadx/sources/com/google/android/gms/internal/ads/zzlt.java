package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlt {
    public zzmu zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlt(zzmu zzmuVar) {
        this.zza = zzmuVar;
    }

    public final void zza(int i) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(zzmu zzmuVar) {
        this.zze |= this.zza != zzmuVar;
        this.zza = zzmuVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            zzgtr.zza(i == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i;
    }

    final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
