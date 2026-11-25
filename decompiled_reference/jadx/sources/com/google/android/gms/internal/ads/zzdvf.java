package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvf {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdzt zzd;
    private final Executor zze;
    private final zzbaw zzf;
    private final VersionInfoParcel zzg;
    private final zzeko zzi;
    private final zzfsm zzj;
    private final zzekz zzk;
    private final zzflk zzl;
    private ListenableFuture zzm;
    private final zzdut zza = new zzdut();
    private final zzbqo zzh = new zzbqo();

    zzdvf(zzdvd zzdvdVar) {
        this.zzc = zzdvdVar.zzb();
        this.zze = zzdvdVar.zze();
        this.zzf = zzdvdVar.zzf();
        this.zzg = zzdvdVar.zzg();
        this.zzb = zzdvdVar.zza();
        this.zzi = zzdvdVar.zzd();
        this.zzj = zzdvdVar.zzh();
        this.zzd = zzdvdVar.zzc();
        this.zzk = zzdvdVar.zzi();
        this.zzl = zzdvdVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeN);
        zzbaw zzbawVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzekz zzekzVar = this.zzk;
        ListenableFuture listenableFutureZzk = zzhcf.zzk(zzclr.zzb(this.zzc, this.zzg, str, zzbawVar, zzaVar, zzekzVar, this.zzl, this.zzd), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdvc
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzclb zzclbVar = (zzclb) obj;
                this.zza.zzi(zzclbVar);
                return zzclbVar;
            }
        }, this.zze);
        this.zzm = listenableFutureZzk;
        zzcgb.zza(listenableFutureZzk, "NativeJavascriptExecutor.initializeEngine", zzcfy.zzh);
    }

    public final synchronized void zzb() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhcf.zzr(listenableFuture, new zzduu(this), this.zze);
        this.zzm = null;
    }

    public final synchronized ListenableFuture zzc(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzhcf.zza(null);
        }
        return zzhcf.zzj(listenableFuture, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdvb
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzclb) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzbpx zzbpxVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhcf.zzr(listenableFuture, new zzduv(this, str, zzbpxVar), this.zze);
    }

    public final synchronized void zze(String str, zzbpx zzbpxVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhcf.zzr(listenableFuture, new zzduw(this, str, zzbpxVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhcf.zzr(listenableFuture, new zzdux(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhcf.zzr(listenableFuture, new zzduy(this, zzfknVar, zzfkqVar, zzctqVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzbpx zzbpxVar) {
        zzd(str, new zzdve(this, weakReference, str, zzbpxVar, null));
    }

    final /* synthetic */ zzclb zzi(zzclb zzclbVar) {
        zzclbVar.zzab("/result", this.zzh);
        zzcmz zzcmzVarZzP = zzclbVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzeko zzekoVar = this.zzi;
        zzfsm zzfsmVar = this.zzj;
        zzdzt zzdztVar = this.zzd;
        zzdut zzdutVar = this.zza;
        zzcmzVarZzP.zzab(null, zzdutVar, zzdutVar, zzdutVar, zzdutVar, false, null, zzbVar, null, null, zzekoVar, zzfsmVar, zzdztVar, null, null, null, null, null, null, null, null, null);
        return zzclbVar;
    }

    final /* synthetic */ ListenableFuture zzj(String str, JSONObject jSONObject, zzclb zzclbVar) {
        return this.zzh.zzc(zzclbVar, str, jSONObject);
    }

    final /* synthetic */ zzdut zzk() {
        return this.zza;
    }

    final /* synthetic */ zzdzt zzl() {
        return this.zzd;
    }

    final /* synthetic */ zzeko zzm() {
        return this.zzi;
    }

    final /* synthetic */ zzfsm zzn() {
        return this.zzj;
    }
}
