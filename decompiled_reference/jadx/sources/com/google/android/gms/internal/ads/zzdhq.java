package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhq implements AppEventListener, OnAdMetadataChangedListener, zzdcz, com.google.android.gms.ads.internal.client.zza, zzdfq, zzddt, zzdey, com.google.android.gms.ads.internal.overlay.zzr, zzddp, zzdlg {
    private final zzdgp zza = new zzdgp(this, null);

    @Nullable
    private zzetk zzb;

    @Nullable
    private zzeto zzc;

    @Nullable
    private zzfgm zzd;

    @Nullable
    private zzfjr zze;

    private static void zzs(Object obj, zzdhp zzdhpVar) {
        if (obj != null) {
            zzdhpVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, zzdgu.zza);
        zzs(this.zzc, zzdhh.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdhn.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgh
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzetk) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(final zzcbw zzcbwVar, final String str, final String str2) {
        zzs(this.zzb, new zzdhp(zzcbwVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgg
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfjr) obj).zzd(zzcbwVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
        zzs(this.zzb, zzdgr.zza);
        zzs(this.zze, zzdhj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzs(this.zzb, zzdgv.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        zzs(this.zzd, zzdhb.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(final int i) {
        zzs(this.zzd, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgn
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfgm) obj).zzdU(i);
            }
        });
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
    public final void zzdr() {
        zzs(this.zzb, zzdgx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        zzs(this.zzb, zzdgq.zza);
        zzs(this.zze, zzdhi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzs(this.zzb, zzdgy.zza);
        zzs(this.zze, zzdho.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzs(this.zzb, zzdgw.zza);
        zzs(this.zzc, zzdhg.zza);
        zzs(this.zze, zzdhm.zza);
        zzs(this.zzd, zzdhf.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzs(this.zzd, zzdhc.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzs(this.zzd, zzdhd.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzs(this.zzd, zzdhe.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
        zzs(this.zzb, zzdgs.zza);
        zzs(this.zze, zzdhk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
        zzs(this.zzb, zzdgt.zza);
        zzs(this.zze, zzdhl.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, zzdha.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgl
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfjr) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgm
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzetk) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zzl() {
        zzs(this.zzd, zzdgz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgi
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzetk) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgj
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfjr) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdhp() { // from class: com.google.android.gms.internal.ads.zzdgk
            @Override // com.google.android.gms.internal.ads.zzdhp
            public final /* synthetic */ void zza(Object obj) {
                ((zzfgm) obj).zzm(zztVar);
            }
        });
    }

    public final zzdgp zzn() {
        return this.zza;
    }

    final /* synthetic */ void zzo(zzetk zzetkVar) {
        this.zzb = zzetkVar;
    }

    final /* synthetic */ void zzp(zzeto zzetoVar) {
        this.zzc = zzetoVar;
    }

    final /* synthetic */ void zzq(zzfgm zzfgmVar) {
        this.zzd = zzfgmVar;
    }

    final /* synthetic */ void zzr(zzfjr zzfjrVar) {
        this.zze = zzfjrVar;
    }
}
