package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztn {
    private final Context zza;
    private final zzqj zzb;
    private boolean zzc;
    private zztm zzd;
    private zzrh zze;
    private zztp zzf;
    private zztk zzg;

    @Deprecated
    public zztn() {
        this.zza = null;
        this.zzb = zzqj.zza;
    }

    public final zztu zza() {
        zzgtr.zzi(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zztp(new zzcp[0]);
        }
        zzrh zzrhVar = this.zze;
        zztk zztkVar = this.zzg;
        if (zzrhVar == null) {
            if (zztkVar == null) {
                this.zzg = new zztk(this.zza);
            }
            if (this.zzd == null) {
                this.zzd = zztm.zza;
            }
            Context context = this.zza;
            zzte zzteVar = new zzte(context);
            zzteVar.zzb(context != null ? null : this.zzb);
            zzteVar.zzf(this.zzg);
            zzteVar.zza(this.zzd);
            this.zze = zzteVar.zzc();
        } else {
            zzgtr.zzi(zztkVar == null);
            zzgtr.zzi(this.zzd == null);
        }
        return new zztu(this, null);
    }

    final /* synthetic */ Context zzb() {
        return this.zza;
    }

    final /* synthetic */ zzrh zzc() {
        return this.zze;
    }

    final /* synthetic */ zztp zzd() {
        return this.zzf;
    }

    public zztn(Context context) {
        this.zza = context;
        this.zzb = zzqj.zza;
    }
}
