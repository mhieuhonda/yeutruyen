package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzere extends zzbvo {
    private final zzdcx zza;
    private final zzdle zzb;
    private final zzddr zzc;
    private final zzdeg zzd;
    private final zzdel zze;
    private final zzdid zzf;
    private final zzdfk zzg;
    private final zzdmc zzh;
    private final zzdhz zzi;
    private final zzddm zzj;

    public zzere(zzdcx zzdcxVar, zzdle zzdleVar, zzddr zzddrVar, zzdeg zzdegVar, zzdel zzdelVar, zzdid zzdidVar, zzdfk zzdfkVar, zzdmc zzdmcVar, zzdhz zzdhzVar, zzddm zzddmVar) {
        this.zza = zzdcxVar;
        this.zzb = zzdleVar;
        this.zzc = zzddrVar;
        this.zzd = zzdegVar;
        this.zze = zzdelVar;
        this.zzf = zzdidVar;
        this.zzg = zzdfkVar;
        this.zzh = zzdmcVar;
        this.zzi = zzdhzVar;
        this.zzj = zzddmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf() {
        this.zzg.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzm(zzbnc zzbncVar, String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(zzcci zzcciVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(zzccm zzccmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    @Deprecated
    public final void zzs(int i) throws RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzu() throws RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzw(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfmi.zzc(8, zzeVar));
    }

    public void zzz() throws RemoteException {
    }
}
