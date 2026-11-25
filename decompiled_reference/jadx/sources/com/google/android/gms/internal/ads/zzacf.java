package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacf {
    public static final zzabz zza = new zzabz(2, -9223372036854775807L, null);
    public static final zzabz zzb = new zzabz(3, -9223372036854775807L, null);
    private final zzacl zzc = zzacl.zzb(zzfm.zzg("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzaby.zza);
    private zzaca zzd;
    private IOException zze;

    public zzacf(String str) {
    }

    public static zzabz zza(boolean z, long j) {
        return new zzabz(z ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzacb zzacbVar, zzabx zzabxVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzaca(this, looperMyLooper, zzacbVar, zzabxVar, i, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzg(zzacc zzaccVar) {
        zzaca zzacaVar = this.zzd;
        if (zzacaVar != null) {
            zzacaVar.zzc(true);
        }
        zzacl zzaclVar = this.zzc;
        zzaclVar.execute(new zzacd(zzaccVar));
        zzaclVar.zza();
    }

    public final void zzh(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzaca zzacaVar = this.zzd;
        if (zzacaVar != null) {
            zzacaVar.zza(i);
        }
    }

    final /* synthetic */ zzacl zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzaca zzj() {
        return this.zzd;
    }

    final /* synthetic */ void zzk(zzaca zzacaVar) {
        this.zzd = zzacaVar;
    }

    final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }

    public final void zzf() {
        zzaca zzacaVar = this.zzd;
        zzacaVar.getClass();
        zzacaVar.zzc(false);
    }
}
