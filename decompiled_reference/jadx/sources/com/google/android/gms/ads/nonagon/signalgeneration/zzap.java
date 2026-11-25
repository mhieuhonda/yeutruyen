package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzdci;
import com.google.android.gms.internal.ads.zzdiy;
import com.google.android.gms.internal.ads.zzdvf;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzflf;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzgti;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzhbm;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbx;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzap extends zzces {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbkc zzI;
    private final zzj zzJ;
    private final zza zzK;
    private final zzcnq zzf;
    private Context zzg;
    private final zzbaw zzh;
    private final zzflk zzi;
    private final zzfmf zzj;
    private final zzhcp zzk;
    private final ScheduledExecutorService zzl;
    private zzcaa zzm;
    private final zzdzy zzp;
    private final zzfsm zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziq)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzip)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzis)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziu)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzit);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziv);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziw);

    zzap(zzcnq zzcnqVar, Context context, zzbaw zzbawVar, zzfmf zzfmfVar, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzdzy zzdzyVar, zzfsm zzfsmVar, VersionInfoParcel versionInfoParcel, zzbkc zzbkcVar, zzflk zzflkVar, zzj zzjVar, zza zzaVar) {
        List listZzaa;
        this.zzf = zzcnqVar;
        this.zzg = context;
        this.zzh = zzbawVar;
        this.zzi = zzflkVar;
        this.zzj = zzfmfVar;
        this.zzk = zzhcpVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdzyVar;
        this.zzq = zzfsmVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbkcVar;
        this.zzJ = zzjVar;
        this.zzK = zzaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzix)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziy));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziz));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziA));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziB));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    private final void zzR(final List list, final IObjectWrapper iObjectWrapper, zzbzx zzbzxVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziG)).booleanValue()) {
            try {
                zzbzxVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        zzhcp zzhcpVar = this.zzk;
        ListenableFuture listenableFutureSubmit = zzhcpVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzo(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            listenableFutureSubmit = zzhcf.zzj(listenableFutureSubmit, new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzp((ArrayList) obj);
                }
            }, zzhcpVar);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzhcf.zzr(listenableFutureSubmit, new zzz(this, zzbzxVar, z), this.zzf.zzb());
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbzx zzbzxVar, boolean z) {
        ListenableFuture listenableFutureSubmit;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziG)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbzxVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            String strValueOf = String.valueOf(list);
            String.valueOf(strValueOf);
            String strValueOf2 = String.valueOf(strValueOf);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(strValueOf2));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzd(uri)) {
                zzhcp zzhcpVar = this.zzk;
                listenableFutureSubmit = zzhcpVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.zza.zzq(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    listenableFutureSubmit = zzhcf.zzj(listenableFutureSubmit, new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zzr((Uri) obj);
                        }
                    }, zzhcpVar);
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String strValueOf3 = String.valueOf(uri);
                String.valueOf(strValueOf3);
                String strValueOf4 = String.valueOf(strValueOf3);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf4));
                listenableFutureSubmit = zzhcf.zza(uri);
            }
            arrayList.add(listenableFutureSubmit);
        }
        zzhcf.zzr(zzhcf.zzm(arrayList), new zzaa(this, zzbzxVar, z), this.zzf.zzb());
    }

    private final void zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzli)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzll)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlp)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        zzap zzapVar;
        ListenableFuture listenableFutureZzc;
        if (((Boolean) zzblc.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmJ)).booleanValue()) {
            listenableFutureZzc = zzhcf.zzf(new zzhbm() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                @Override // com.google.android.gms.internal.ads.zzhbm
                public final /* synthetic */ ListenableFuture zza() {
                    return this.zza.zzs();
                }
            }, zzcfy.zza);
            zzapVar = this;
        } else {
            try {
                zzapVar = this;
                try {
                    listenableFutureZzc = zzapVar.zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
                } catch (NullPointerException e) {
                    e = e;
                    listenableFutureZzc = zzhcf.zzc(e);
                }
            } catch (NullPointerException e2) {
                e = e2;
                zzapVar = this;
            }
        }
        zzhcf.zzr(listenableFutureZzc, new zzab(this), zzapVar.zzf.zzb());
    }

    private static boolean zzV(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    private final zzx zzW(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        zzflf zzflfVar = new zzflf();
        if ("REWARDED".equals(str2)) {
            zzflfVar.zzj().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzflfVar.zzj().zza(3);
        }
        zzw zzwVarZzr = this.zzf.zzr();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zza(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzflfVar.zzg(str);
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzflfVar.zza(zzmVar);
        if (zzrVar == null) {
            switch (str2) {
                case "NATIVE":
                    zzrVar = com.google.android.gms.ads.internal.client.zzr.zzb();
                    break;
                case "APP_OPEN_AD":
                    zzrVar = com.google.android.gms.ads.internal.client.zzr.zzd();
                    break;
                case "REWARDED":
                case "REWARDED_INTERSTITIAL":
                    zzrVar = com.google.android.gms.ads.internal.client.zzr.zzc();
                    break;
                case "BANNER":
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
                    break;
                default:
                    zzrVar = new com.google.android.gms.ads.internal.client.zzr();
                    break;
            }
        }
        zzflfVar.zzc(zzrVar);
        zzflfVar.zzu(true);
        zzflfVar.zzv(bundle);
        zzdciVar.zzb(zzflfVar.zzB());
        zzwVarZzr.zzc(zzdciVar.zze());
        zzas zzasVar = new zzas();
        zzasVar.zza(str2);
        zzwVarZzr.zzb(new zzat(zzasVar, null));
        new zzdiy();
        return zzwVarZzr.zza();
    }

    private final ListenableFuture zzX(final String str) {
        final zzdvf[] zzdvfVarArr = new zzdvf[1];
        ListenableFuture listenableFutureZzb = this.zzj.zzb();
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzu(zzdvfVarArr, str, (zzdvf) obj);
            }
        };
        zzhcp zzhcpVar = this.zzk;
        ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZzb, zzhbnVar, zzhcpVar);
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzv(zzdvfVarArr);
            }
        }, zzhcpVar);
        return (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzi(zzhbx.zzw(listenableFutureZzj), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziH)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzal.zza, zzhcpVar), Exception.class, zzam.zza, zzhcpVar);
    }

    private final boolean zzY() {
        Map map;
        zzcaa zzcaaVar = this.zzm;
        return (zzcaaVar == null || (map = zzcaaVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzgui.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* synthetic */ zzfqq zzy(ListenableFuture listenableFuture, zzcex zzcexVar) {
        if (!zzfqt.zza() || !((Boolean) zzbkq.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfqq zzfqqVarZzb = ((zzx) zzhcf.zzs(listenableFuture)).zzb();
            zzfqqVarZzb.zzb(new ArrayList(Collections.singletonList(zzcexVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcexVar.zzd;
            zzfqqVarZzb.zzc(zzmVar == null ? "" : zzmVar.zzp);
            zzfqqVarZzb.zzd(zzmVar.zzm);
            return zzfqqVarZzb;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ zzdzy zzA() {
        return this.zzp;
    }

    final /* synthetic */ zzfsm zzB() {
        return this.zzq;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    final /* synthetic */ String zzG() {
        return this.zzv;
    }

    final /* synthetic */ String zzH() {
        return this.zzw;
    }

    final /* synthetic */ AtomicInteger zzI() {
        return this.zzx;
    }

    final /* synthetic */ VersionInfoParcel zzJ() {
        return this.zzy;
    }

    final /* synthetic */ String zzK() {
        return this.zzz;
    }

    final /* synthetic */ void zzL(String str) {
        this.zzz = str;
    }

    final /* synthetic */ String zzM() {
        return this.zzA;
    }

    final /* synthetic */ AtomicBoolean zzN() {
        return this.zzG;
    }

    final /* synthetic */ AtomicInteger zzO() {
        return this.zzH;
    }

    final boolean zzc(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    final boolean zzd(Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00df  */
    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zze(IObjectWrapper iObjectWrapper, final zzcex zzcexVar, zzceq zzceqVar) {
        ListenableFuture listenableFutureZza;
        ListenableFuture listenableFutureZzc;
        ListenableFuture listenableFutureZzc2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue()) {
            bundle.putLong(zzdzc.PUBLIC_API_CALL.zza(), zzcexVar.zzd.zzz);
            bundle.putLong(zzdzc.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        this.zzg = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        zzfqg zzfqgVarZzn = zzfqg.zzn(this.zzg, 22);
        zzfqgVarZzn.zza();
        if ("UNKNOWN".equals(zzcexVar.zzb)) {
            List arrayList = new ArrayList();
            zzbio zzbioVar = zzbix.zziF;
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).split(","));
            }
            if (arrayList.contains(zzv.zzc(zzcexVar.zzd))) {
                listenableFutureZzc2 = zzhcf.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFutureZzc = zzhcf.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmJ)).booleanValue()) {
                    zzhcp zzhcpVar = zzcfy.zza;
                    listenableFutureZza = zzhcpVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzn(zzcexVar, bundle);
                        }
                    });
                    try {
                        listenableFutureZzc = zzhcf.zzj(listenableFutureZza, zzac.zza, zzhcpVar);
                    } catch (NullPointerException e) {
                        listenableFutureZzc = zzhcf.zzc(e);
                    }
                } else {
                    zzx zzxVarZzW = zzW(this.zzg, zzcexVar.zza, zzcexVar.zzb, zzcexVar.zzc, zzcexVar.zzd, bundle);
                    listenableFutureZza = zzhcf.zza(zzxVarZzW);
                    try {
                        listenableFutureZzc = zzxVarZzW.zza();
                    } catch (NullPointerException e2) {
                        listenableFutureZzc = zzhcf.zzc(e2);
                    }
                }
                listenableFutureZzc2 = listenableFutureZza;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmJ)).booleanValue()) {
                zzhcp zzhcpVar2 = zzcfy.zza;
                listenableFutureZza = zzhcpVar2.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.zza.zzn(zzcexVar, bundle);
                    }
                });
                listenableFutureZzc = zzhcf.zzj(listenableFutureZza, zzac.zza, zzhcpVar2);
            } else {
                zzx zzxVarZzW2 = zzW(this.zzg, zzcexVar.zza, zzcexVar.zzb, zzcexVar.zzc, zzcexVar.zzd, bundle);
                listenableFutureZza = zzhcf.zza(zzxVarZzW2);
                listenableFutureZzc = zzxVarZzW2.zza();
            }
            listenableFutureZzc2 = listenableFutureZza;
        }
        zzhcf.zzr(listenableFutureZzc, new zzy(this, listenableFutureZzc2, zzcexVar, zzceqVar, zzfqgVarZzn), this.zzf.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziG)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzcaa zzcaaVar = this.zzm;
            this.zzn = zzbs.zzh(motionEvent, zzcaaVar == null ? null : zzcaaVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzc(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) {
        zzR(list, iObjectWrapper, zzbzxVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) {
        zzS(list, iObjectWrapper, zzbzxVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzi(zzcaa zzcaaVar) {
        this.zzm = zzcaaVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlh)).booleanValue()) {
            zzbio zzbioVar = zzbix.zziE;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                zzT();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zza zzaVar = this.zzK;
            zze zzeVar = new zze(webView, zzaVar, zzcfy.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzaVar, zzeVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlr)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzn();
            }
            if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
                zzaVar.zza(webView);
                if (((Boolean) zzblc.zzd.zze()).booleanValue()) {
                    zzeVar.zza();
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) {
        zzR(list, iObjectWrapper, zzbzxVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) {
        zzS(list, iObjectWrapper, zzbzxVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlv)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        CustomTabsClient customTabsClient = (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2);
        CustomTabsCallback customTabsCallback = (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbkc zzbkcVar = this.zzI;
        zzbkcVar.zza(context, customTabsClient, str, customTabsCallback);
        if (((Boolean) zzblc.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzblc.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return ObjectWrapper.wrap(zzbkcVar.zzb());
    }

    final /* synthetic */ zzx zzn(zzcex zzcexVar, Bundle bundle) {
        return zzW(this.zzg, zzcexVar.zza, zzcexVar.zzb, zzcexVar.zzc, zzcexVar.zzd, bundle);
    }

    final /* synthetic */ ArrayList zzo(List list, IObjectWrapper iObjectWrapper) throws Exception {
        zzbaw zzbawVar = this.zzh;
        String strZzj = zzbawVar.zzb() != null ? zzbawVar.zzb().zzj(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzj));
            } else {
                String strValueOf = String.valueOf(uri);
                String.valueOf(strValueOf);
                String strValueOf2 = String.valueOf(strValueOf);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf2));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzp(final ArrayList arrayList) {
        return zzhcf.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgti() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzt(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ Uri zzq(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzflk zzflkVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznH)).booleanValue() || (zzflkVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzflkVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzbax e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ ListenableFuture zzr(final Uri uri) {
        return zzhcf.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgti(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return zzap.zzQ(uri, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ ListenableFuture zzs() {
        try {
            return zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zza();
        } catch (NullPointerException e) {
            return zzhcf.zzc(e);
        }
    }

    final /* synthetic */ ArrayList zzt(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ListenableFuture zzu(zzdvf[] zzdvfVarArr, String str, zzdvf zzdvfVar) throws JSONException {
        zzdvfVarArr[0] = zzdvfVar;
        Context context = this.zzg;
        zzcaa zzcaaVar = this.zzm;
        Map map = zzcaaVar.zzb;
        JSONObject jSONObjectZze = zzbs.zze(context, map, map, zzcaaVar.zza, null);
        JSONObject jSONObjectZzb = zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzc = zzbs.zzc(this.zzm.zza);
        JSONObject jSONObjectZzd = zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZze);
        jSONObject.put("ad_view_signal", jSONObjectZzb);
        jSONObject.put("scroll_view_signal", jSONObjectZzc);
        jSONObject.put("lock_screen_signal", jSONObjectZzd);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdvfVar.zzc(str, jSONObject);
    }

    final /* synthetic */ void zzv(zzdvf[] zzdvfVarArr) {
        zzdvf zzdvfVar = zzdvfVarArr[0];
        if (zzdvfVar != null) {
            this.zzj.zzc(zzhcf.zza(zzdvfVar));
        }
    }

    final /* synthetic */ void zzw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    final /* synthetic */ Context zzz() {
        return this.zzg;
    }
}
