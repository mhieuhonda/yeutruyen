package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public class zzclm extends WebViewClient implements zzcmz {
    public static final /* synthetic */ int zzc = 0;
    private zzdzt zzA;
    private zzdbv zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final zzekz zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzclb zza;
    protected zzcdu zzb;
    private final zzbhw zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcmx zzi;
    private zzcmy zzj;
    private zzbon zzk;
    private zzbop zzl;
    private zzdlg zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbym zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbyh zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgN)).split(",")));

    public zzclm(zzclb zzclbVar, zzbhw zzbhwVar, boolean z, zzbym zzbymVar, zzbyh zzbyhVar, zzekz zzekzVar) {
        this.zzd = zzbhwVar;
        this.zza = zzclbVar;
        this.zzs = z;
        this.zzx = zzbymVar;
        this.zzH = zzekzVar;
    }

    private final void zzac(final View view, final zzcdu zzcduVar, final int i) {
        if (!zzcduVar.zzc() || i <= 0) {
            return;
        }
        zzcduVar.zzd(view);
        if (zzcduVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(view, zzcduVar, i);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbA)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzaf(String str, Map map) throws Throwable {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                int i2 = zzgab.zzb;
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.util.zzs zzsVarZzc = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzclb zzclbVar = this.zza;
                    zzsVarZzc.zzb(zzclbVar.getContext(), zzclbVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    WebResourceResponse webResourceResponseZzc = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zzc(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        String contentType = httpURLConnection.getContentType();
                        String strTrim = "";
                        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        String contentType2 = httpURLConnection.getContentType();
                        if (!TextUtils.isEmpty(contentType2)) {
                            String[] strArrSplit = contentType2.split(";");
                            if (strArrSplit.length != 1) {
                                for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                                    if (strArrSplit[i3].trim().startsWith("charset")) {
                                        String[] strArrSplit2 = strArrSplit[i3].trim().split("=");
                                        if (strArrSplit2.length > 1) {
                                            strTrim = strArrSplit2[1].trim();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        String str2 = strTrim;
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        HashMap map2 = new HashMap(headerFields.size());
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                                map2.put(entry2.getKey(), entry2.getValue().get(0));
                            }
                        }
                        webResourceResponseZzc = com.google.android.gms.ads.internal.zzt.zzf().zzc(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                    } else {
                        String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        }
                        if (!headerField.startsWith("tel:")) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                                webResourceResponseZzc = zzae();
                            } else if (protocol.equals(ProxyConfig.MATCH_HTTP) || protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                                StringBuilder sb = new StringBuilder(headerField.length() + 15);
                                sb.append("Redirecting to ");
                                sb.append(headerField);
                                String string = sb.toString();
                                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                StringBuilder sb2 = new StringBuilder(protocol.length() + 20);
                                sb2.append("Unsupported scheme: ");
                                sb2.append(protocol);
                                String string2 = sb2.toString();
                                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                                webResourceResponseZzc = zzae();
                            }
                        }
                    }
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzc;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbpx) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    private static final boolean zzai(zzclb zzclbVar) {
        return zzclbVar.zzC() != null && zzclbVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z, zzclb zzclbVar) {
        return (!z || zzclbVar.zzN().zzg() || zzclbVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzQ(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            zzclb zzclbVar = this.zza;
            if (zzclbVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzclbVar.zzY();
                return;
            }
            this.zzC = true;
            zzcmy zzcmyVar = this.zzj;
            if (zzcmyVar != null) {
                zzcmyVar.zza();
                this.zzj = null;
            }
            zzu();
            zzclb zzclbVar2 = this.zza;
            if (zzclbVar2.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznD)).booleanValue()) {
                    zzclbVar2.zzL().zzz(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzL(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case WorkQueueKt.MASK /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZzd = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzQ(uriZzd);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcdu zzcduVar = this.zzb;
                        if (zzcduVar != null) {
                            zzcduVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdlg zzdlgVar = this.zzm;
                    if (zzdlgVar != null) {
                        zzdlgVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzclb zzclbVar = this.zza;
            if (zzclbVar.zzD().willNotDraw()) {
                String.valueOf(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzbaw zzbawVarZzS = zzclbVar.zzS();
                    zzflk zzflkVarZzT = zzclbVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznH)).booleanValue() || zzflkVarZzT == null) {
                        if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                            uriZzd = zzbawVarZzS.zzd(uriZzd, zzclbVar.getContext(), (View) zzclbVar, zzclbVar.zzj());
                        }
                    } else if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                        uriZzd = zzflkVarZzT.zza(uriZzd, zzclbVar.getContext(), (View) zzclbVar, zzclbVar.zzj());
                    }
                } catch (zzbax unused) {
                    String.valueOf(str);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzclb zzclbVar2 = this.zza;
                    zzv(zzcVar, true, false, zzclbVar2 != null ? zzclbVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbyh zzbyhVar = this.zzz;
        boolean zZzd = zzbyhVar != null ? zzbyhVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcduVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbpx zzbpxVar) {
        synchronized (this.zzf) {
            HashMap map = this.zze;
            List copyOnWriteArrayList = (List) map.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                map.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbpxVar);
        }
    }

    public final void zzC(String str, zzbpx zzbpxVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbpxVar);
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbpx> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbpx zzbpxVar : list) {
                if (predicate.apply(zzbpxVar)) {
                    arrayList.add(zzbpxVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzF() {
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            zzcduVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbyh zzbyhVar = this.zzz;
            if (zzbyhVar != null) {
                zzbyhVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzG(zzcmx zzcmxVar) {
        this.zzi = zzcmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzH(zzcmy zzcmyVar) {
        this.zzj = zzcmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final zzdzt zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzJ(zzdbv zzdbvVar) {
        this.zzB = zzdbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final zzdbv zzK() {
        return this.zzB;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0095  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fb A[Catch: all -> 0x01e1, TryCatch #3 {all -> 0x01e1, blocks: (B:59:0x018c, B:61:0x019e, B:62:0x01a5, B:71:0x01e9, B:73:0x01fb, B:74:0x0202), top: B:103:0x00df }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02bb A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:63:0x01b0, B:43:0x016f, B:88:0x02bb, B:91:0x02cb, B:93:0x02d1, B:95:0x02df, B:76:0x0238, B:77:0x026b, B:75:0x0206, B:42:0x013e, B:27:0x00d3, B:78:0x026c, B:80:0x0276, B:82:0x027c, B:84:0x02af), top: B:106:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02d1 A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:63:0x01b0, B:43:0x016f, B:88:0x02bb, B:91:0x02cb, B:93:0x02d1, B:95:0x02df, B:76:0x0238, B:77:0x026b, B:75:0x0206, B:42:0x013e, B:27:0x00d3, B:78:0x026c, B:80:0x0276, B:82:0x027c, B:84:0x02af), top: B:106:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    protected final WebResourceResponse zzL(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream inputStream;
        InputStream inputStreamZzb;
        Long l;
        final boolean z;
        final boolean z2;
        String string;
        try {
            Map map2 = new HashMap();
            zzclb zzclbVar = this.zza;
            if (zzclbVar.zzC() != null) {
                map2 = zzclbVar.zzC().zzaw;
            }
            String strZza = zzcei.zza(str, zzclbVar.getContext(), this.zzF, map2);
            if (!strZza.equals(str)) {
                return zzaf(strZza, map);
            }
            Parcelable.Creator<zzbhi> creator = zzbhi.CREATOR;
            zzbhi zzbhiVarZza = zzbhi.zza(Uri.parse(str));
            if (zzbhiVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZzg = zzgug.zza(zzgtf.zzd('-')).zzg(uri.getQueryParameter("range"));
                    if (listZzg.size() == 2) {
                        int i2 = Integer.parseInt((String) listZzg.get(0));
                        int i3 = Integer.parseInt((String) listZzg.get(1)) + 1;
                        if (i2 > 0) {
                            zzbhiVarZza.zzh = i2;
                        }
                        i = i3 - i2;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                final boolean z3 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfs)).booleanValue()) {
                    zzbhiVarZza.zzi = zzgui.zza(zzclbVar.zzn());
                    zzbhiVarZza.zzj = zzclbVar.zzp();
                    if (zzbhiVarZza.zzg) {
                        l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfu);
                    } else {
                        l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzft);
                    }
                    try {
                        long jLongValue = l.longValue();
                        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                        com.google.android.gms.ads.internal.zzt.zzz();
                        Future futureZza = zzbht.zza(zzclbVar.getContext(), zzbhiVarZza);
                        try {
                            zzbhu zzbhuVar = (zzbhu) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbhuVar.zzc()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbhuVar.zzd()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbhuVar.zzf()));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbhuVar.zze()));
                                    inputStreamZzb = zzbhuVar.zzb();
                                    if (i != -1) {
                                        try {
                                            inputStreamZzb = zzgzt.zzb(inputStreamZzb, i);
                                        } catch (InterruptedException e) {
                                            e = e;
                                            z2 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfx)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclg
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzX(z2, jElapsedRealtime2);
                                                }
                                            });
                                            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 24);
                                            sb.append("Cache connection took ");
                                            sb.append(jElapsedRealtime2);
                                            sb.append("ms");
                                            string = sb.toString();
                                        } catch (ExecutionException e2) {
                                            e = e2;
                                            z = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfx)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzW(z, jElapsedRealtime3);
                                                }
                                            });
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                                            sb2.append("Cache connection took ");
                                            sb2.append(jElapsedRealtime3);
                                            sb2.append("ms");
                                            string = sb2.toString();
                                        } catch (TimeoutException e3) {
                                            e = e3;
                                            z = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfx)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzW(z, jElapsedRealtime4);
                                                }
                                            });
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                                            sb3.append("Cache connection took ");
                                            sb3.append(jElapsedRealtime4);
                                            sb3.append("ms");
                                            string = sb3.toString();
                                        }
                                    }
                                    final long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    final boolean z4 = true;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z4, jElapsedRealtime5) { // from class: com.google.android.gms.internal.ads.zzcle
                                        private final /* synthetic */ long zzb;

                                        {
                                            this.zzb = jElapsedRealtime5;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzV(true, this.zzb);
                                        }
                                    });
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                                    sb4.append("Cache connection took ");
                                    sb4.append(jElapsedRealtime5);
                                    sb4.append("ms");
                                    string = sb4.toString();
                                } catch (Throwable th) {
                                    th = th;
                                    z3 = 1;
                                    final long jElapsedRealtime6 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclh
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzY(z3, jElapsedRealtime6);
                                        }
                                    });
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(jElapsedRealtime6).length() + 24);
                                    sb5.append("Cache connection took ");
                                    sb5.append(jElapsedRealtime6);
                                    sb5.append("ms");
                                    com.google.android.gms.ads.internal.util.zze.zza(sb5.toString());
                                    throw th;
                                }
                            } catch (InterruptedException e4) {
                                e = e4;
                                inputStreamZzb = null;
                            } catch (ExecutionException e5) {
                                e = e5;
                                inputStreamZzb = null;
                                z = true;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfx)).booleanValue()) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime7 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzW(z, jElapsedRealtime7);
                                    }
                                });
                                StringBuilder sb6 = new StringBuilder(String.valueOf(jElapsedRealtime7).length() + 24);
                                sb6.append("Cache connection took ");
                                sb6.append(jElapsedRealtime7);
                                sb6.append("ms");
                                string = sb6.toString();
                                com.google.android.gms.ads.internal.util.zze.zza(string);
                                inputStream = inputStreamZzb;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                }
                            } catch (TimeoutException e6) {
                                e = e6;
                                inputStreamZzb = null;
                                z = true;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfx)).booleanValue()) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime8 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzW(z, jElapsedRealtime8);
                                    }
                                });
                                StringBuilder sb7 = new StringBuilder(String.valueOf(jElapsedRealtime8).length() + 24);
                                sb7.append("Cache connection took ");
                                sb7.append(jElapsedRealtime8);
                                sb7.append("ms");
                                string = sb7.toString();
                                com.google.android.gms.ads.internal.util.zze.zza(string);
                                inputStream = inputStreamZzb;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                }
                            }
                        } catch (InterruptedException e7) {
                            e = e7;
                            inputStreamZzb = null;
                            z2 = false;
                        } catch (ExecutionException e8) {
                            e = e8;
                            inputStreamZzb = null;
                            z = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfx)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime9 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzW(z, jElapsedRealtime9);
                                }
                            });
                            StringBuilder sb8 = new StringBuilder(String.valueOf(jElapsedRealtime9).length() + 24);
                            sb8.append("Cache connection took ");
                            sb8.append(jElapsedRealtime9);
                            sb8.append("ms");
                            string = sb8.toString();
                            com.google.android.gms.ads.internal.util.zze.zza(string);
                            inputStream = inputStreamZzb;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                            }
                        } catch (TimeoutException e9) {
                            e = e9;
                            inputStreamZzb = null;
                            z = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfx)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime10 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzW(z, jElapsedRealtime10);
                                }
                            });
                            StringBuilder sb9 = new StringBuilder(String.valueOf(jElapsedRealtime10).length() + 24);
                            sb9.append("Cache connection took ");
                            sb9.append(jElapsedRealtime10);
                            sb9.append("ms");
                            string = sb9.toString();
                            com.google.android.gms.ads.internal.util.zze.zza(string);
                            inputStream = inputStreamZzb;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z3 = 0;
                        }
                        com.google.android.gms.ads.internal.util.zze.zza(string);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    zzbhf zzbhfVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(zzbhiVarZza);
                    if (zzbhfVarZzc == null || !zzbhfVarZzc.zza()) {
                        inputStream = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbhfVarZzc.zzd()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbhfVarZzc.zzg()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbhfVarZzc.zze()));
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbhfVarZzc.zzf()));
                        inputStreamZzb = zzbhfVarZzc.zzb();
                        if (i != -1) {
                            inputStreamZzb = zzgzt.zzb(inputStreamZzb, i);
                        }
                    }
                    if (inputStream != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                    }
                }
                inputStream = inputStreamZzb;
                if (inputStream != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbkt.zzb.zze()).booleanValue()) ? webResourceResponse : zzaf(str, map);
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    public final void zzM(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcli
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclb zzclbVar = this.zza.zza;
                    zzclbVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzclbVar.zzL();
                    if (zzmVarZzL != null) {
                        zzmVarZzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z) {
        this.zzF = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzP(int i, int i2) {
        zzbyh zzbyhVar = this.zzz;
        if (zzbyhVar != null) {
            zzbyhVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzQ(Uri uri) {
        String strValueOf = String.valueOf(uri);
        String.valueOf(strValueOf);
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(strValueOf)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            String strValueOf2 = String.valueOf(uri);
            String.valueOf(strValueOf2);
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(strValueOf2)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhN)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i = zzclm.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgM)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgO)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzhcf.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcld(this, list, path, uri), zzcfy.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzT(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzR(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzS(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzT(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    final /* synthetic */ void zzU(View view, zzcdu zzcduVar, int i) {
        zzac(view, zzcduVar, i - 1);
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzY(true, j);
    }

    final /* synthetic */ void zzZ(View view, zzcdu zzcduVar, int i) {
        zzac(view, zzcduVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zza(int i, int i2, boolean z) {
        zzbym zzbymVar = this.zzx;
        if (zzbymVar != null) {
            zzbymVar.zzb(i, i2);
        }
        zzbyh zzbyhVar = this.zzz;
        if (zzbyhVar != null) {
            zzbyhVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzab(com.google.android.gms.ads.internal.client.zza zzaVar, zzbon zzbonVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbop zzbopVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, zzbqa zzbqaVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbyo zzbyoVar, zzcdu zzcduVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzbqs zzbqsVar, zzdlg zzdlgVar, zzbqr zzbqrVar, zzbql zzbqlVar, zzbpy zzbpyVar, zzctq zzctqVar, zzeaw zzeawVar, zzdca zzdcaVar, zzdbv zzdbvVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcduVar, null) : zzbVar;
        zzclb zzclbVar = this.zza;
        this.zzz = new zzbyh(zzclbVar, zzbyoVar);
        this.zzb = zzcduVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbJ)).booleanValue()) {
            zzB("/adMetadata", new zzbom(zzbonVar));
        }
        if (zzbopVar != null) {
            zzB("/appEvent", new zzboo(zzbopVar));
        }
        zzB("/backButton", zzbpw.zzj);
        zzB("/refresh", zzbpw.zzk);
        zzB("/canOpenApp", zzbpw.zzb);
        zzB("/canOpenURLs", zzbpw.zza);
        zzB("/canOpenIntents", zzbpw.zzc);
        zzB("/close", zzbpw.zzd);
        zzB("/customClose", zzbpw.zze);
        zzB("/instrument", zzbpw.zzn);
        zzB("/delayPageLoaded", zzbpw.zzp);
        zzB("/delayPageClosed", zzbpw.zzq);
        zzB("/getLocationInfo", zzbpw.zzr);
        zzB("/log", zzbpw.zzg);
        zzB("/mraid", new zzbqe(zzbVar2, this.zzz, zzbyoVar));
        zzbym zzbymVar = this.zzx;
        if (zzbymVar != null) {
            zzB("/mraidLoaded", zzbymVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbqk(zzbVar3, this.zzz, zzekoVar, zzdztVar, zzctqVar, zzdcaVar));
        zzB("/precache", new zzcji());
        zzB("/touch", zzbpw.zzi);
        zzB("/video", zzbpw.zzl);
        zzB("/videoMeta", zzbpw.zzm);
        if (zzekoVar == null || zzfsmVar == null) {
            zzB("/click", zzbpw.zzb(zzdlgVar, zzctqVar));
            zzB("/httpTrack", zzbpw.zzf);
        } else {
            zzB("/click", zzflr.zza(zzekoVar, zzfsmVar, zzctqVar, zzdlgVar));
            zzB("/httpTrack", zzflr.zzb(zzekoVar, zzfsmVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zzb(zzclbVar.getContext())) {
            Map map = new HashMap();
            if (zzclbVar.zzC() != null) {
                map = zzclbVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbqd(zzclbVar.getContext(), map));
        }
        if (zzbqaVar != null) {
            zzB("/setInterstitialProperties", new zzbpz(zzbqaVar));
        }
        if (zzbqsVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkv)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbqsVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkO)).booleanValue() && zzbqrVar != null) {
            zzB("/shareSheet", zzbqrVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziQ)).booleanValue() && zzeawVar != null) {
            zzB("/onDeviceStorageEvent", new zzbqf(zzeawVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkT)).booleanValue() && zzbqlVar != null) {
            zzB("/inspectorOutOfContextTest", zzbqlVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkY)).booleanValue() && zzbpyVar != null) {
            zzB("/inspectorStorage", zzbpyVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzni)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbpw.zzu);
            zzB("/presentPlayStoreOverlay", zzbpw.zzv);
            zzB("/expandPlayStoreOverlay", zzbpw.zzw);
            zzB("/collapsePlayStoreOverlay", zzbpw.zzx);
            zzB("/closePlayStoreOverlay", zzbpw.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeq)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbpw.zzA);
            zzB("/resetPAID", zzbpw.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznC)).booleanValue() && zzclbVar.zzC() != null && zzclbVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbpw.zzB);
            zzB("/clearLocalStorageKeys", zzbpw.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbonVar;
        this.zzl = zzbopVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdlgVar;
        this.zzA = zzdztVar;
        this.zzB = zzdbvVar;
        this.zzn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzb(zzfkn zzfknVar) {
        zzclb zzclbVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zzb(zzclbVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbqd(zzclbVar.getContext(), zzfknVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzc(zzctq zzctqVar) {
        zzD("/click");
        zzB("/click", zzbpw.zzb(this.zzm, zzctqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzd(zzctq zzctqVar, zzeko zzekoVar, zzfsm zzfsmVar) {
        zzD("/click");
        if (zzekoVar == null || zzfsmVar == null) {
            zzB("/click", zzbpw.zzb(this.zzm, zzctqVar));
        } else {
            zzB("/click", zzflr.zza(zzekoVar, zzfsmVar, zzctqVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzdlg zzdlgVar = this.zzm;
        if (zzdlgVar != null) {
            zzdlgVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzdlg zzdlgVar = this.zzm;
        if (zzdlgVar != null) {
            zzdlgVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zze(zzctq zzctqVar, zzeko zzekoVar, zzdzt zzdztVar) {
        zzD("/open");
        zzB("/open", new zzbqk(this.zzy, this.zzz, zzekoVar, zzdztVar, zzctqVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzj(zzcdu zzcduVar) {
        this.zzb = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final boolean zzk() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzq() {
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            zzclb zzclbVar = this.zza;
            WebView webViewZzD = zzclbVar.zzD();
            if (ViewCompat.isAttachedToWindow(webViewZzD)) {
                zzac(webViewZzD, zzcduVar, 10);
                return;
            }
            zzad();
            zzclc zzclcVar = new zzclc(this, zzcduVar);
            this.zzI = zzclcVar;
            ((View) zzclbVar).addOnAttachStateChangeListener(zzclcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmz
    public final void zzt() {
        zzbhw zzbhwVar = this.zzd;
        if (zzbhwVar != null) {
            zzbhwVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue()) {
                zzclb zzclbVar = this.zza;
                if (zzclbVar.zzq() != null) {
                    zzbje.zza(zzclbVar.zzq().zzc(), zzclbVar.zzi(), "awfllc");
                }
            }
            this.zzi.zza((this.zzD || this.zzo) ? false : true, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        zzclb zzclbVar = this.zza;
        boolean zZzW = zzclbVar.zzW();
        boolean z3 = false;
        boolean z4 = zzaj(zZzW, zzclbVar) || z2;
        if (z4 || !z) {
            z3 = true;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z4 ? null : this.zzg, zZzW ? null : this.zzh, this.zzw, zzclbVar.zzs(), zzclbVar, z3 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzekz zzekzVar = this.zzH;
        zzclb zzclbVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzclbVar, zzclbVar.zzs(), str, str2, 14, zzekzVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbzb] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z, int i, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdlg zzdlgVar;
        zzclb zzclbVar = this.zza;
        boolean zZzaj = zzaj(zzclbVar.zzW(), zzclbVar);
        boolean z3 = true;
        if (!zZzaj && z2) {
            z3 = false;
        }
        if (zZzaj) {
            zzaVar = null;
            zzdlgVar = null;
        } else {
            zzaVar = this.zzg;
            zzdlgVar = null;
        }
        zzdlg zzdlgVar2 = zzdlgVar;
        zzA(new AdOverlayInfoParcel(zzaVar, this.zzh, this.zzw, zzclbVar, z, i, zzclbVar.zzs(), z3 ? zzdlgVar2 : this.zzm, zzai(zzclbVar) ? this.zzH : zzdlgVar2));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        zzclb zzclbVar = this.zza;
        boolean zZzW = zzclbVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzclbVar);
        boolean z4 = true;
        if (!zZzaj && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzaj ? null : this.zzg;
        zzcll zzcllVar = zZzW ? null : new zzcll(zzclbVar, this.zzh);
        zzbon zzbonVar = this.zzk;
        zzekz zzekzVar = null;
        zzbop zzbopVar = this.zzl;
        boolean z5 = z4;
        zzcll zzcllVar2 = zzcllVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzclbVar.zzs();
        zzdlg zzdlgVar = z5 ? null : this.zzm;
        if (zzai(zzclbVar)) {
            zzekzVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcllVar2, zzbonVar, zzbopVar, zzadVar, zzclbVar, z, i, str, versionInfoParcelZzs, zzdlgVar, zzekzVar, z3));
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzclb zzclbVar = this.zza;
        boolean zZzW = zzclbVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzclbVar);
        boolean z3 = true;
        if (!zZzaj && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzaj ? null : this.zzg;
        zzcll zzcllVar = zZzW ? null : new zzcll(zzclbVar, this.zzh);
        zzbon zzbonVar = this.zzk;
        zzekz zzekzVar = null;
        zzbop zzbopVar = this.zzl;
        boolean z4 = z3;
        zzcll zzcllVar2 = zzcllVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzclbVar.zzs();
        zzdlg zzdlgVar = z4 ? null : this.zzm;
        if (zzai(zzclbVar)) {
            zzekzVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcllVar2, zzbonVar, zzbopVar, zzadVar, zzclbVar, z, i, str, str2, versionInfoParcelZzs, zzdlgVar, zzekzVar));
    }
}
