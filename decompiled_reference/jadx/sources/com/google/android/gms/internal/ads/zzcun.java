package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcun implements zzbex, zzddu, com.google.android.gms.ads.internal.overlay.zzr, zzddt {
    private final zzcui zza;
    private final zzcuj zzb;
    private final zzbvb zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcum zzh = new zzcum();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcun(zzbuy zzbuyVar, zzcuj zzcujVar, Executor executor, zzcui zzcuiVar, Clock clock) {
        this.zza = zzcuiVar;
        zzbuj zzbujVar = zzbum.zza;
        this.zzd = zzbuyVar.zza("google.afma.activeView.handleUpdate", zzbujVar, zzbujVar);
        this.zzb = zzcujVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzclb) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zza(Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zzc(Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final synchronized void zzdj(zzbew zzbewVar) {
        zzcum zzcumVar = this.zzh;
        zzcumVar.zza = zzbewVar.zzj;
        zzcumVar.zzf = zzbewVar;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final synchronized void zzl() {
        if (this.zzj.get() == null) {
            zzm();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            zzcum zzcumVar = this.zzh;
            zzcumVar.zzd = this.zzf.elapsedRealtime();
            final JSONObject jSONObjectZza = this.zzb.zzb(zzcumVar);
            for (final zzclb zzclbVar : this.zzc) {
                this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcul
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        JSONObject jSONObject = jSONObjectZza;
                        String string = jSONObject.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 31);
                        sb.append("Calling AFMA_updateActiveView(");
                        sb.append(string);
                        sb.append(")");
                        String string2 = sb.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
                        zzclbVar.zzb("AFMA_updateActiveView", jSONObject);
                    }
                });
            }
            zzcgb.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzclb zzclbVar) {
        this.zzc.add(zzclbVar);
        this.zza.zzb(zzclbVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}
