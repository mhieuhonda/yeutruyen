package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgml implements zzglm {
    private final zzggd zza;
    private final zzgpe zzb;
    private final zzgop zzc;
    private final ExecutorService zzd;
    private final zzgpj zze;
    private final zzgqo zzf;
    private final Object zzg = new Object();
    private final String zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final boolean zzl;
    private zzgmk zzm;

    zzgml(zzggd zzggdVar, zzino zzinoVar, zzgpe zzgpeVar, zzgop zzgopVar, zzgpj zzgpjVar, zzgqo zzgqoVar, zzgdq zzgdqVar, ExecutorService executorService) {
        this.zza = zzggdVar;
        this.zzb = zzgpeVar;
        this.zzc = zzgopVar;
        this.zzd = executorService;
        this.zze = zzgpjVar;
        this.zzf = zzgqoVar;
        this.zzh = zzgdqVar.zzd();
        this.zzi = zzgdqVar.zzm();
        this.zzj = zzgdqVar.zzl();
        this.zzk = zzgdqVar.zzb();
        this.zzl = zzgdqVar.zzc();
    }

    private final ListenableFuture zzs() {
        return zzhcf.zzk(this.zzc.zzf(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmf
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzo((byte[]) obj);
                return null;
            }
        }, zzhcw.zza());
    }

    private final void zzt(zzave zzaveVar, byte[] bArr, boolean z) {
        zzgqm zzgqmVarZza = this.zzf.zza(20102);
        try {
            try {
                zzgqmVarZza.zza();
                synchronized (this.zzg) {
                    this.zzm = zzgmk.zza(zzaveVar, bArr, z);
                }
                zzgqmVarZza.zzc();
            } catch (zzavc e) {
                e = e;
                zzgqmVarZza.zzb(e);
                throw new zzgln(2, e);
            } catch (zzavg e2) {
                e = e2;
                zzgqmVarZza.zzb(e);
                throw new zzgln(2, e);
            } catch (Throwable th) {
                zzgqmVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgqmVarZza.zzc();
            throw th2;
        }
    }

    private final String zzu(Map map) throws zzavg, zzavc {
        String strZzb;
        zzgqo zzgqoVar = this.zzf;
        zzgqm zzgqmVarZza = zzgqoVar.zza(20110);
        try {
            zzgqmVarZza.zza();
            synchronized (this.zzg) {
                zzgmk zzgmkVar = this.zzm;
                if (zzgmkVar == null) {
                    zzgqoVar.zzb(20109);
                    strZzb = "";
                } else {
                    strZzb = zzgmkVar.zzb(map);
                }
            }
            zzgqmVarZza.zzc();
            return strZzb;
        } catch (Throwable th) {
            try {
                zzgqmVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgqmVarZza.zzc();
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final String zza() {
        synchronized (this.zzg) {
            zzgmk zzgmkVar = this.zzm;
            if (zzgmkVar == null) {
                return "3.893135394.-1";
            }
            return zzgmkVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final ListenableFuture zzb() {
        if (this.zzl) {
            return zzs();
        }
        zzhbx zzhbxVarZzw = zzhbx.zzw(this.zzc.zzb());
        ExecutorService executorService = this.zzd;
        return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzg(zzhbxVarZzw, Throwable.class, zzgmj.zza, executorService), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzglz
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi((zzggb) obj);
            }
        }, executorService), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj((Throwable) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final ListenableFuture zzc(final Context context) {
        return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(context);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhcf.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgmc
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhcf.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgmd
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzg) {
                zzgmk zzgmkVar = this.zzm;
                if (zzgmkVar != null) {
                    HashMap map = new HashMap();
                    map.put("evt", inputEvent);
                    zzgmkVar.zzc(map);
                } else {
                    this.zzf.zzb(20105);
                }
            }
        } catch (zzavc | zzavg e) {
            this.zzf.zzd(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglm
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    final void zzh(Map map) {
        String strZzb;
        zzgqm zzgqmVarZza;
        String str;
        map.put("v", this.zzh);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
        byte[] bArrZzaN = null;
        long jZzd = -1;
        if (listenableFuture != null) {
            zzgqm zzgqmVarZza2 = this.zzf.zza(20107);
            try {
                try {
                    zzgqmVarZza2.zza();
                    zzayt zzaytVar = (zzayt) listenableFuture.get(this.zzj, TimeUnit.MILLISECONDS);
                    if (zzaytVar != null) {
                        bArrZzaN = zzaytVar.zzh().zzaN();
                        strZzb = zzaytVar.zzb().length() > 1 ? zzaytVar.zzb() : ExifInterface.LONGITUDE_EAST;
                        try {
                            if (zzaytVar.zzc()) {
                                jZzd = zzaytVar.zzd();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            zzgqmVarZza2.zzb(e);
                        } catch (InterruptedException e2) {
                            e = e2;
                            zzgqmVarZza2.zzb(e);
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zzgqmVarZza2.zzb(e);
                        } catch (TimeoutException e4) {
                            e = e4;
                            zzgqmVarZza2.zzb(e);
                        }
                    } else {
                        strZzb = ExifInterface.LONGITUDE_EAST;
                    }
                } catch (Throwable th) {
                    zzgqmVarZza2.zzc();
                    throw th;
                }
            } catch (ClassCastException e5) {
                e = e5;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgqmVarZza2.zzb(e);
                zzgqmVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgqmVarZza = this.zzf.zza(20108);
                    try {
                        try {
                            zzgqmVarZza.zza();
                            str = (String) listenableFuture2.get(this.zzi, TimeUnit.MILLISECONDS);
                            if (true != zzgui.zzc(str)) {
                                strZzb = str;
                            }
                        } catch (ClassCastException e6) {
                            e = e6;
                            zzgqmVarZza.zzb(e);
                        } catch (InterruptedException e7) {
                            e = e7;
                            zzgqmVarZza.zzb(e);
                        } catch (ExecutionException e8) {
                            e = e8;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zzgqmVarZza.zzb(e);
                        } catch (TimeoutException e9) {
                            e = e9;
                            zzgqmVarZza.zzb(e);
                        }
                        zzgqmVarZza.zzc();
                    } catch (Throwable th2) {
                        zzgqmVarZza.zzc();
                        throw th2;
                    }
                }
                map.put("int", strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            } catch (InterruptedException e10) {
                e = e10;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgqmVarZza2.zzb(e);
                zzgqmVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgqmVarZza = this.zzf.zza(20108);
                    zzgqmVarZza.zza();
                    str = (String) listenableFuture2.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (true != zzgui.zzc(str)) {
                        strZzb = str;
                    }
                    zzgqmVarZza.zzc();
                }
                map.put("int", strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            } catch (ExecutionException e11) {
                e = e11;
                strZzb = ExifInterface.LONGITUDE_EAST;
            } catch (TimeoutException e12) {
                e = e12;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgqmVarZza2.zzb(e);
                zzgqmVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgqmVarZza = this.zzf.zza(20108);
                    zzgqmVarZza.zza();
                    str = (String) listenableFuture2.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (true != zzgui.zzc(str)) {
                        strZzb = str;
                    }
                    zzgqmVarZza.zzc();
                }
                map.put("int", strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            }
            zzgqmVarZza2.zzc();
        } else {
            strZzb = ExifInterface.LONGITUDE_EAST;
        }
        if (strZzb.equals(ExifInterface.LONGITUDE_EAST) && listenableFuture2 != null) {
            zzgqmVarZza = this.zzf.zza(20108);
            zzgqmVarZza.zza();
            str = (String) listenableFuture2.get(this.zzi, TimeUnit.MILLISECONDS);
            if (true != zzgui.zzc(str)) {
                strZzb = str;
            }
            zzgqmVarZza.zzc();
        }
        map.put("int", strZzb);
        if (bArrZzaN != null) {
            map.put("att", bArrZzaN);
        }
        map.put("gv", Long.valueOf(jZzd));
    }

    final /* synthetic */ ListenableFuture zzi(zzggb zzggbVar) {
        if (zzggbVar != null) {
            this.zza.zzd(zzggbVar.zzd());
        }
        if (this.zzb.zzb(zzggbVar)) {
            return zzhcf.zzk(this.zzc.zze(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgme
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzn((byte[]) obj);
                    return null;
                }
            }, zzhcw.zza());
        }
        this.zzf.zzb(20103);
        throw new zzgln(1);
    }

    final /* synthetic */ ListenableFuture zzj(Throwable th) {
        return this.zzk ? zzs() : zzhcf.zzc(th);
    }

    final /* synthetic */ String zzk(final Context context) throws zzavg, zzavc {
        final HashMap map = new HashMap();
        this.zzf.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(map, context);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    final /* synthetic */ String zzl(final Context context, String str, final View view, final Activity activity) throws zzavg, zzavc {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zzf.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgmh
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    final /* synthetic */ String zzm(final Context context, final String str, final View view, Activity activity) throws zzavg, zzavc {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zzf.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgmi
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    final /* synthetic */ Void zzn(byte[] bArr) {
        zzt(zzgmo.zzc(), bArr, false);
        return null;
    }

    final /* synthetic */ Void zzo(byte[] bArr) {
        zzt(zzgmo.zzc(), bArr, true);
        return null;
    }

    final /* synthetic */ void zzp(Map map, Context context) {
        map.putAll(this.zze.zzb());
        zzh(map);
        map.put("f", "q");
        map.put("ctx", context);
    }

    final /* synthetic */ void zzq(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzc(context, view));
        zzh(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", null);
    }

    final /* synthetic */ void zzr(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzd());
        zzh(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", null);
        map.put("bds", str);
    }
}
