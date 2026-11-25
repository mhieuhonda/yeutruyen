package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzadk {
    private final Context zza;
    private final zzadw zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final zzadx zzh = new zzadx(1.0f);
    private zzdp zze = zzdp.zza;

    public zzadk(Context context, zzadw zzadwVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzadwVar;
    }

    public final zzadk zza(boolean z) {
        this.zzd = true;
        return this;
    }

    public final zzadk zzb(zzdp zzdpVar) {
        this.zze = zzdpVar;
        return this;
    }

    public final zzadk zzc(long j) {
        this.zzg = j;
        return this;
    }

    public final zzads zzd() {
        zzgtr.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzadq(false);
        }
        zzads zzadsVar = new zzads(this, null);
        this.zzf = true;
        return zzadsVar;
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzadw zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ zzdp zzi() {
        return this.zze;
    }

    final /* synthetic */ long zzj() {
        return this.zzg;
    }

    final /* synthetic */ zzadx zzk() {
        return this.zzh;
    }
}
