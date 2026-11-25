package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzic extends zzhj implements zzik {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzij zze;
    private final zzij zzf;
    private zzhv zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzic(String str, int i, int i2, boolean z, boolean z2, zzij zzijVar, zzgts zzgtsVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzijVar;
        this.zzf = new zzij();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, string);
        }
        String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = zzhv.zzh;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhv zzhvVar) throws zzig {
        if (str == null) {
            throw new zzig("Null location redirect", zzhvVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                String.valueOf(protocol);
                throw new zzig("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhvVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + String.valueOf(protocol).length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzig(sb.toString(), zzhvVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzig(e, zzhvVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzeh.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzig {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.zzi;
            String str = zzfm.zza;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.zzm += (long) i3;
            zzh(i3);
            return i3;
        } catch (IOException e) {
            zzhv zzhvVar = this.zzg;
            String str2 = zzfm.zza;
            throw zzig.zza(e, zzhvVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws zzig {
        zzic zzicVar;
        long j;
        int i;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j2;
        zzic zzicVar2 = this;
        zzicVar2.zzg = zzhvVar;
        long j3 = 0;
        zzicVar2.zzm = 0L;
        zzicVar2.zzl = 0L;
        zzf(zzhvVar);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            URL url = new URL(zzhvVar.zza.toString());
            int i2 = zzhvVar.zzb;
            byte[] bArr = zzhvVar.zzc;
            long j4 = zzhvVar.zze;
            long j5 = zzhvVar.zzf;
            boolean zZza = zzhvVar.zza(1);
            int i3 = 0;
            try {
                if (zzicVar2.zza) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i3 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i5);
                            throw new zzig(new NoRouteToHostException(sb.toString()), zzhvVar, 2001, 1);
                        }
                        j = j3;
                        i = i4;
                        zzicVar2 = this;
                        HttpURLConnection httpURLConnectionZzk2 = zzicVar2.zzk(url, 1, null, j4, j5, zZza, false, zzhvVar.zzd);
                        URL url2 = url;
                        long j6 = j5;
                        zzicVar = zzicVar2;
                        try {
                            int responseCode = httpURLConnectionZzk2.getResponseCode();
                            String headerField = httpURLConnectionZzk2.getHeaderField(HttpHeaders.LOCATION);
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionZzk = httpURLConnectionZzk2;
                                break;
                            }
                            httpURLConnectionZzk2.disconnect();
                            URL urlZzl = zzicVar.zzl(url2, headerField, zzhvVar);
                            j5 = j6;
                            url = urlZzl;
                            i4 = i;
                            i3 = i5;
                            j3 = j;
                        } catch (IOException e) {
                            e = e;
                        }
                        zzicVar.zzm();
                        throw zzig.zza(e, zzhvVar, 1);
                    }
                }
                httpURLConnectionZzk = zzicVar2.zzk(url, 1, null, j4, j5, zZza, true, zzhvVar.zzd);
                zzicVar = this;
                j = 0;
                i = 0;
                zzicVar.zzh = httpURLConnectionZzk;
                zzicVar.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i6 = zzicVar.zzk;
                if (i6 < 200 || i6 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (zzicVar.zzk == 416) {
                        if (zzhvVar.zze == zzil.zza(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                            zzicVar.zzj = true;
                            zzg(zzhvVar);
                            long j7 = zzhvVar.zzf;
                            return j7 != -1 ? j7 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgzt.zza(errorStream) : zzfm.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzfm.zzb;
                    }
                    zzicVar.zzm();
                    throw new zzii(zzicVar.zzk, responseMessage, zzicVar.zzk == 416 ? new zzhs(2008) : null, headerFields, zzhvVar, bArrZza);
                }
                httpURLConnectionZzk.getContentType();
                if (zzicVar.zzk == 200) {
                    j2 = zzhvVar.zze;
                    if (j2 == j) {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                if (zEqualsIgnoreCase) {
                    zzicVar.zzl = zzhvVar.zzf;
                } else {
                    long j8 = zzhvVar.zzf;
                    if (j8 != -1) {
                        zzicVar.zzl = j8;
                    } else {
                        long jZzb = zzil.zzb(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        zzicVar.zzl = jZzb != -1 ? jZzb - j2 : -1L;
                    }
                }
                try {
                    zzicVar.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        zzicVar.zzi = new GZIPInputStream(zzicVar.zzi);
                    }
                    zzicVar.zzj = true;
                    zzg(zzhvVar);
                    if (j2 != j) {
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (j2 > j) {
                                int iMin = (int) Math.min(j2, 4096L);
                                InputStream inputStream = zzicVar.zzi;
                                String str = zzfm.zza;
                                int i7 = inputStream.read(bArr2, i, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzig(new InterruptedIOException(), zzhvVar, 2000, 1);
                                }
                                if (i7 == -1) {
                                    throw new zzig(zzhvVar, 2008, 1);
                                }
                                j2 -= (long) i7;
                                zzicVar.zzh(i7);
                            }
                        } catch (IOException e2) {
                            zzicVar.zzm();
                            if (e2 instanceof zzig) {
                                throw ((zzig) e2);
                            }
                            throw new zzig(e2, zzhvVar, 2000, 1);
                        }
                    }
                    return zzicVar.zzl;
                } catch (IOException e3) {
                    zzicVar.zzm();
                    throw new zzig(e3, zzhvVar, 2000, 1);
                }
            } catch (IOException e4) {
                e = e4;
                zzicVar = this;
            }
        } catch (IOException e5) {
            e = e5;
            zzicVar = zzicVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhv zzhvVar = this.zzg;
        if (zzhvVar != null) {
            return zzhvVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws zzig {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhv zzhvVar = this.zzg;
                    String str = zzfm.zza;
                    throw new zzig(e, zzhvVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgww.zza() : new zzib(httpURLConnection.getHeaderFields());
    }
}
