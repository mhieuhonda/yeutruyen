package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqb {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private zzbme zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzew zzg;
    private Bundle zzh;
    private zzclb zzi;
    private zzclb zzj;
    private zzclb zzk;
    private zzelv zzl;
    private ListenableFuture zzm;
    private zzcgd zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbml zzs;
    private zzbml zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdqb zzaf(zzbvy zzbvyVar) {
        try {
            return zzak(zzam(zzbvyVar.zzn(), zzbvyVar), zzbvyVar.zzo(), (View) zzal(zzbvyVar.zzp()), zzbvyVar.zze(), zzbvyVar.zzf(), zzbvyVar.zzg(), zzbvyVar.zzs(), zzbvyVar.zzi(), (View) zzal(zzbvyVar.zzq()), zzbvyVar.zzr(), zzbvyVar.zzl(), zzbvyVar.zzm(), zzbvyVar.zzk(), zzbvyVar.zzh(), zzbvyVar.zzj(), zzbvyVar.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdqb zzag(zzbvv zzbvvVar) {
        try {
            zzdqa zzdqaVarZzam = zzam(zzbvvVar.zzs(), null);
            zzbme zzbmeVarZzt = zzbvvVar.zzt();
            View view = (View) zzal(zzbvvVar.zzr());
            String strZze = zzbvvVar.zze();
            List listZzf = zzbvvVar.zzf();
            String strZzg = zzbvvVar.zzg();
            Bundle bundleZzp = zzbvvVar.zzp();
            String strZzi = zzbvvVar.zzi();
            View view2 = (View) zzal(zzbvvVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbvvVar.zzv();
            String strZzj = zzbvvVar.zzj();
            zzbml zzbmlVarZzh = zzbvvVar.zzh();
            zzdqb zzdqbVar = new zzdqb();
            zzdqbVar.zza = 1;
            zzdqbVar.zzb = zzdqaVarZzam;
            zzdqbVar.zzc = zzbmeVarZzt;
            zzdqbVar.zzd = view;
            zzdqbVar.zzs("headline", strZze);
            zzdqbVar.zze = listZzf;
            zzdqbVar.zzs("body", strZzg);
            zzdqbVar.zzh = bundleZzp;
            zzdqbVar.zzs("call_to_action", strZzi);
            zzdqbVar.zzo = view2;
            zzdqbVar.zzq = iObjectWrapperZzv;
            zzdqbVar.zzs("advertiser", strZzj);
            zzdqbVar.zzt = zzbmlVarZzh;
            return zzdqbVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdqb zzah(zzbvu zzbvuVar) {
        try {
            zzdqa zzdqaVarZzam = zzam(zzbvuVar.zzt(), null);
            zzbme zzbmeVarZzv = zzbvuVar.zzv();
            View view = (View) zzal(zzbvuVar.zzu());
            String strZze = zzbvuVar.zze();
            List listZzf = zzbvuVar.zzf();
            String strZzg = zzbvuVar.zzg();
            Bundle bundleZzr = zzbvuVar.zzr();
            String strZzi = zzbvuVar.zzi();
            View view2 = (View) zzal(zzbvuVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbvuVar.zzx();
            String strZzk = zzbvuVar.zzk();
            String strZzl = zzbvuVar.zzl();
            double dZzj = zzbvuVar.zzj();
            zzbml zzbmlVarZzh = zzbvuVar.zzh();
            try {
                zzdqb zzdqbVar = new zzdqb();
                zzdqbVar.zza = 2;
                zzdqbVar.zzb = zzdqaVarZzam;
                zzdqbVar.zzc = zzbmeVarZzv;
                zzdqbVar.zzd = view;
                zzdqbVar.zzs("headline", strZze);
                zzdqbVar.zze = listZzf;
                zzdqbVar.zzs("body", strZzg);
                zzdqbVar.zzh = bundleZzr;
                zzdqbVar.zzs("call_to_action", strZzi);
                zzdqbVar.zzo = view2;
                zzdqbVar.zzq = iObjectWrapperZzx;
                zzdqbVar.zzs("store", strZzk);
                zzdqbVar.zzs("price", strZzl);
                zzdqbVar.zzr = dZzj;
                zzdqbVar.zzs = zzbmlVarZzh;
                return zzdqbVar;
            } catch (RemoteException e) {
                e = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    public static zzdqb zzai(zzbvu zzbvuVar) {
        try {
            return zzak(zzam(zzbvuVar.zzt(), null), zzbvuVar.zzv(), (View) zzal(zzbvuVar.zzu()), zzbvuVar.zze(), zzbvuVar.zzf(), zzbvuVar.zzg(), zzbvuVar.zzr(), zzbvuVar.zzi(), (View) zzal(zzbvuVar.zzw()), zzbvuVar.zzx(), zzbvuVar.zzk(), zzbvuVar.zzl(), zzbvuVar.zzj(), zzbvuVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdqb zzaj(zzbvv zzbvvVar) {
        try {
            return zzak(zzam(zzbvvVar.zzs(), null), zzbvvVar.zzt(), (View) zzal(zzbvvVar.zzr()), zzbvvVar.zze(), zzbvvVar.zzf(), zzbvvVar.zzg(), zzbvvVar.zzp(), zzbvvVar.zzi(), (View) zzal(zzbvvVar.zzu()), zzbvvVar.zzv(), null, null, -1.0d, zzbvvVar.zzh(), zzbvvVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdqb zzak(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbme zzbmeVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbml zzbmlVar, String str6, float f) {
        zzdqb zzdqbVar = new zzdqb();
        zzdqbVar.zza = 6;
        zzdqbVar.zzb = zzeaVar;
        zzdqbVar.zzc = zzbmeVar;
        zzdqbVar.zzd = view;
        zzdqbVar.zzs("headline", str);
        zzdqbVar.zze = list;
        zzdqbVar.zzs("body", str2);
        zzdqbVar.zzh = bundle;
        zzdqbVar.zzs("call_to_action", str3);
        zzdqbVar.zzo = view2;
        zzdqbVar.zzq = iObjectWrapper;
        zzdqbVar.zzs("store", str4);
        zzdqbVar.zzs("price", str5);
        zzdqbVar.zzr = d;
        zzdqbVar.zzs = zzbmlVar;
        zzdqbVar.zzs("advertiser", str6);
        zzdqbVar.zzu(f);
        return zzdqbVar;
    }

    private static Object zzal(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdqa zzam(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbvy zzbvyVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new zzdqa(zzeaVar, zzbvyVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbml zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbmk.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzew zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw("store");
    }

    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbml zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    public final synchronized zzbml zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzclb zzT() {
        return this.zzi;
    }

    public final synchronized zzclb zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzclb zzW() {
        return this.zzk;
    }

    public final synchronized ListenableFuture zzX() {
        return this.zzm;
    }

    public final synchronized zzcgd zzY() {
        return this.zzn;
    }

    public final synchronized zzelv zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        zzclb zzclbVar = this.zzi;
        if (zzclbVar != null) {
            zzclbVar.destroy();
            this.zzi = null;
        }
        zzclb zzclbVar2 = this.zzj;
        if (zzclbVar2 != null) {
            zzclbVar2.destroy();
            this.zzj = null;
        }
        zzclb zzclbVar3 = this.zzk;
        if (zzclbVar3 != null) {
            zzclbVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcgd zzcgdVar = this.zzn;
        if (zzcgdVar != null) {
            zzcgdVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzb = zzeaVar;
    }

    public final synchronized void zzc(zzbme zzbmeVar) {
        this.zzc = zzbmeVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zzg = zzewVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(zzbml zzbmlVar) {
        this.zzs = zzbmlVar;
    }

    public final synchronized void zzk(zzbml zzbmlVar) {
        this.zzt = zzbmlVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzclb zzclbVar) {
        this.zzi = zzclbVar;
    }

    public final synchronized void zzn(zzclb zzclbVar) {
        this.zzj = zzclbVar;
    }

    public final synchronized void zzo(zzclb zzclbVar) {
        this.zzk = zzclbVar;
    }

    public final synchronized void zzp(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(zzelv zzelvVar) {
        this.zzl = zzelvVar;
    }

    public final synchronized void zzr(zzcgd zzcgdVar) {
        this.zzn = zzcgdVar;
    }

    public final synchronized void zzs(String str, String str2) {
        SimpleArrayMap simpleArrayMap = this.zzw;
        try {
            if (str2 == null) {
                simpleArrayMap.remove(str);
            } else {
                simpleArrayMap.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzt(String str, zzblw zzblwVar) {
        SimpleArrayMap simpleArrayMap = this.zzv;
        try {
            if (zzblwVar == null) {
                simpleArrayMap.remove(str);
            } else {
                simpleArrayMap.put(str, zzblwVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzea zzy() {
        return this.zzb;
    }

    public final synchronized zzbme zzz() {
        return this.zzc;
    }
}
