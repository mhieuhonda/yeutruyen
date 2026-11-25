package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfmy {
    private final zzfmx zza = new zzfmx();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzfmy() {
    }

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfmx zzf() {
        zzfmx zzfmxVar = this.zza;
        zzfmx zzfmxVarClone = zzfmxVar.clone();
        zzfmxVar.zza = false;
        zzfmxVar.zzb = false;
        return zzfmxVarClone;
    }

    public final String zzg() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + "\n";
    }
}
