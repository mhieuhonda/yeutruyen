package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdca implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfky zzc;
    private final zzfkn zzd;
    private final Clock zze;
    private final zzdzt zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfrm zza = zzfrn.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    zzdca(zzfky zzfkyVar, zzfkn zzfknVar, Clock clock, zzdzt zzdztVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfkyVar;
        this.zzd = zzfknVar;
        this.zze = clock;
        this.zzf = zzdztVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            zzdzt zzdztVar = this.zzf;
            String str = this.zzc.zzb.zzb.zzb;
            String strEncodeToString = Base64.encodeToString(((zzfrn) this.zza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoB)).booleanValue()) {
                zzdzs zzdzsVarZza = zzdztVar.zza();
                zzdzsVarZza.zzc("action", "pclma");
                zzdzsVarZza.zzc("pclmd", strEncodeToString);
                zzdzsVarZza.zzc("gqi", str);
                zzdzsVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            int i = this.zzd.zzaE;
            if (i > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, i, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            if (this.zzi) {
                return;
            }
            this.zzi = true;
            zzn();
        }
    }

    private final void zzo(int i) {
        synchronized (this.zzb) {
            if (!this.zzi && this.zzh) {
                zzfrm zzfrmVar = this.zza;
                zzfqc zzfqcVarZza = zzfqd.zza();
                zzfqcVarZza.zzb(i);
                zzfqcVarZza.zza(this.zze.currentTimeMillis());
                zzfrmVar.zza((zzfqd) zzfqcVarZza.zzbu());
                if (i == 10) {
                    zzn();
                    this.zzi = true;
                }
            }
        }
    }
}
