package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzade {
    private final Context zza;
    private boolean zzb;
    private zzvy zzc = zzvy.zzb;
    private final zzvk zzd;
    private Handler zze;
    private zzaer zzf;

    public zzade(Context context) {
        this.zza = context;
        this.zzd = new zzve(context, null, null);
    }

    public final zzade zza(zzvy zzvyVar) {
        this.zzc = zzvyVar;
        return this;
    }

    public final zzade zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzade zzc(zzaer zzaerVar) {
        this.zzf = zzaerVar;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final zzadg zzd() {
        boolean z;
        zzgtr.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler == null && this.zzf == null) {
            z = true;
        } else {
            z = false;
            if (handler != null && this.zzf != null) {
                z = true;
            }
        }
        zzgtr.zzi(z);
        this.zzb = true;
        return new zzadg(this);
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzvy zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzvk zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzaer zzi() {
        return this.zzf;
    }
}
