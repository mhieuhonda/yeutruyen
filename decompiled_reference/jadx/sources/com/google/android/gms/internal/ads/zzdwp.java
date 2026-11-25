package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwp {
    private final zzdcx zza;
    private final zzdle zzb;
    private final zzdeg zzc;
    private final zzdet zzd;
    private final zzdfk zze;
    private final zzdid zzf;
    private final Executor zzg;
    private final zzdla zzh;
    private final zzcun zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzcdu zzk;
    private final zzbaw zzl;
    private final zzdhu zzm;
    private final zzeko zzn;
    private final zzfsm zzo;
    private final zzdzt zzp;
    private final zzctq zzq;
    private final zzdwv zzr;
    private final zzeaw zzs;
    private final zzdca zzt;
    private final zzdbv zzu;

    public zzdwp(zzdcx zzdcxVar, zzdeg zzdegVar, zzdet zzdetVar, zzdfk zzdfkVar, zzdid zzdidVar, Executor executor, zzdla zzdlaVar, zzcun zzcunVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar, zzbaw zzbawVar, zzdhu zzdhuVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzdle zzdleVar, zzctq zzctqVar, zzdwv zzdwvVar, zzeaw zzeawVar, zzdca zzdcaVar, zzdbv zzdbvVar) {
        this.zza = zzdcxVar;
        this.zzc = zzdegVar;
        this.zzd = zzdetVar;
        this.zze = zzdfkVar;
        this.zzf = zzdidVar;
        this.zzg = executor;
        this.zzh = zzdlaVar;
        this.zzi = zzcunVar;
        this.zzj = zzbVar;
        this.zzk = zzcduVar;
        this.zzl = zzbawVar;
        this.zzm = zzdhuVar;
        this.zzn = zzekoVar;
        this.zzo = zzfsmVar;
        this.zzp = zzdztVar;
        this.zzb = zzdleVar;
        this.zzq = zzctqVar;
        this.zzr = zzdwvVar;
        this.zzs = zzeawVar;
        this.zzt = zzdcaVar;
        this.zzu = zzdbvVar;
    }

    public static final ListenableFuture zzj(zzclb zzclbVar, String str, String str2, final zzdzo zzdzoVar, zzfqq zzfqqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcV)).booleanValue()) {
            zzdzoVar.zzf(zzdzc.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final zzcgd zzcgdVar = new zzcgd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkq)).booleanValue()) {
            zzfqg zzfqgVarZzn = zzfqg.zzn(zzclbVar.getContext(), 112);
            zzfqgVarZzn.zza();
            zzfqp.zzd(zzcgdVar, zzfqqVar, zzfqgVarZzn);
        }
        zzclbVar.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdwn
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcgd zzcgdVar2 = zzcgdVar;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcV)).booleanValue()) {
                        zzdzoVar.zzf(zzdzc.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    zzcgdVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcgdVar2.zzd(new Exception(sb.toString()));
            }
        });
        zzclbVar.zzau(str, str2, null);
        return zzcgdVar;
    }

    final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlH)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    final /* synthetic */ void zze(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzf(zzclb zzclbVar, zzclb zzclbVar2, Map map) {
        this.zzi.zzn(zzclbVar);
    }

    final /* synthetic */ zzdeg zzg() {
        return this.zzc;
    }

    final /* synthetic */ zzdhu zzh() {
        return this.zzm;
    }

    public final void zzi(final zzclb zzclbVar, boolean z, zzbqa zzbqaVar, zzdzo zzdzoVar) {
        zzbar zzbarVarZzb;
        zzbio zzbioVar = zzbix.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            zzdzoVar.zzf(zzdzc.RENDERING_CONFIGURE_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzclbVar.zzP().zzab(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdwo
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzbop() { // from class: com.google.android.gms.internal.ads.zzdwh
            @Override // com.google.android.gms.internal.ads.zzbop
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdwi
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z, zzbqaVar, this.zzj, new zzdwg(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu);
        zzclbVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdwj
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzclbVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.zza.zze(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdE)).booleanValue() && (zzbarVarZzb = this.zzl.zzb()) != null) {
            zzbarVarZzb.zzh(zzclbVar.zzE());
        }
        zzdla zzdlaVar = this.zzh;
        Executor executor = this.zzg;
        zzdlaVar.zzq(zzclbVar, executor);
        zzdlaVar.zzq(new zzbex() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzbex
            public final /* synthetic */ void zzdj(zzbew zzbewVar) {
                Rect rect = zzbewVar.zzd;
                zzclbVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzdlaVar.zza(zzclbVar.zzE());
        zzclbVar.zzab("/trackActiveViewUnit", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzclbVar, (zzclb) obj, map);
            }
        });
        this.zzi.zzo(zzclbVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            zzdzoVar.zzf(zzdzc.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }
}
