package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzaua implements zzate {
    protected final zzauc zza;
    private final zzatz zzb;

    public zzaua(zzatz zzatzVar) {
        zzauc zzaucVar = new zzauc(4096);
        this.zzb = zzatzVar;
        this.zza = zzaucVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01da  */
    /* JADX WARN: Code duplicated, block: B:116:0x020f  */
    /* JADX WARN: Code duplicated, block: B:143:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c1 A[DONT_INVERT] */
    @Override // com.google.android.gms.internal.ads.zzate
    public zzath zza(zzatl zzatlVar) throws Throwable {
        byte[] bArr;
        int iZza;
        zzatu zzatgVar;
        String str;
        zzath zzathVar;
        int iZzo;
        Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            zzauj zzaujVar = null;
            try {
                zzasu zzasuVarZzk = zzatlVar.zzk();
                if (zzasuVarZzk == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str2 = zzasuVarZzk.zzb;
                    if (str2 != null) {
                        map.put(HttpHeaders.IF_NONE_MATCH, str2);
                    }
                    long j = zzasuVarZzk.zzd;
                    if (j > 0) {
                        map.put(HttpHeaders.IF_MODIFIED_SINCE, zzaui.zzc(j));
                    }
                    mapEmptyMap = map;
                }
                zzauj zzaujVarZza = this.zzb.zza(zzatlVar, mapEmptyMap);
                try {
                    int iZza2 = zzaujVarZza.zza();
                    List listZzb = zzaujVarZza.zzb();
                    if (iZza2 == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzasu zzasuVarZzk2 = zzatlVar.zzk();
                        if (zzasuVarZzk2 == null) {
                            return new zzath(304, (byte[]) null, true, jElapsedRealtime2, listZzb);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzb.isEmpty()) {
                            Iterator it = listZzb.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzatd) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzb);
                        List list = zzasuVarZzk2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzatd zzatdVar : zzasuVarZzk2.zzh) {
                                    if (!treeSet.contains(zzatdVar.zza())) {
                                        arrayList.add(zzatdVar);
                                    }
                                }
                            }
                        } else if (!zzasuVarZzk2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzasuVarZzk2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzatd((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzath(304, zzasuVarZzk2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzd = zzaujVarZza.zzd();
                    if (inputStreamZzd != null) {
                        int iZzc = zzaujVarZza.zzc();
                        zzauc zzaucVar = this.zza;
                        zzaun zzaunVar = new zzaun(zzaucVar, iZzc);
                        try {
                            bArrZza = zzaucVar.zza(1024);
                            while (true) {
                                try {
                                    int i = inputStreamZzd.read(bArrZza);
                                    if (i == -1) {
                                        break;
                                    }
                                    zzaunVar.write(bArrZza, 0, i);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzd.close();
                                    } catch (IOException unused) {
                                        zzatx.zza("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzaucVar.zzb(bArrZza);
                                    zzaunVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzaunVar.toByteArray();
                            try {
                                inputStreamZzd.close();
                            } catch (IOException unused2) {
                                zzatx.zza("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzaucVar.zzb(bArrZza);
                            zzaunVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZza = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    byte[] bArr2 = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzatx.zzb || jElapsedRealtime3 > 3000) {
                            zzatx.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzatlVar, Long.valueOf(jElapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(iZza2), Integer.valueOf(zzatlVar.zzy().zzb()));
                        }
                        if (iZza2 < 200 || iZza2 > 299) {
                            throw new IOException();
                        }
                        return new zzath(iZza2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                    } catch (IOException e) {
                        e = e;
                        zzaujVar = zzaujVarZza;
                        bArr = bArr2;
                        if (e instanceof SocketTimeoutException) {
                            zzatgVar = new zzatt();
                            str = "socket";
                        } else {
                            if (!(e instanceof MalformedURLException)) {
                                String strZzh = zzatlVar.zzh();
                                String.valueOf(strZzh);
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(strZzh)), e);
                            }
                            if (zzaujVar != null) {
                                throw new zzati(e);
                            }
                            iZza = zzaujVar.zza();
                            zzatx.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzatlVar.zzh());
                            if (bArr != null) {
                                zzathVar = new zzath(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaujVar.zzb());
                                if (iZza == 401 && iZza != 403) {
                                    if (iZza < 400 || iZza > 499) {
                                        throw new zzats(zzathVar);
                                    }
                                    throw new zzasy(zzathVar);
                                }
                                zzatgVar = new zzast(zzathVar);
                                str = "auth";
                            } else {
                                zzatgVar = new zzatg();
                                str = "network";
                            }
                        }
                        zzasz zzaszVarZzy = zzatlVar.zzy();
                        iZzo = zzatlVar.zzo();
                        try {
                            zzaszVarZzy.zzc(zzatgVar);
                            zzatlVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                        } catch (zzatu e2) {
                            zzatlVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iZzo)));
                            throw e2;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                    zzaujVar = zzaujVarZza;
                    if (e instanceof SocketTimeoutException) {
                        zzatgVar = new zzatt();
                        str = "socket";
                    } else {
                        if (!(e instanceof MalformedURLException)) {
                            String strZzh2 = zzatlVar.zzh();
                            String.valueOf(strZzh2);
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(strZzh2)), e);
                        }
                        if (zzaujVar != null) {
                            throw new zzati(e);
                        }
                        iZza = zzaujVar.zza();
                        zzatx.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza), zzatlVar.zzh());
                        if (bArr != null) {
                            zzathVar = new zzath(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaujVar.zzb());
                            if (iZza == 401) {
                            }
                            zzatgVar = new zzast(zzathVar);
                            str = "auth";
                        } else {
                            zzatgVar = new zzatg();
                            str = "network";
                        }
                    }
                    zzasz zzaszVarZzy2 = zzatlVar.zzy();
                    iZzo = zzatlVar.zzo();
                    zzaszVarZzy2.zzc(zzatgVar);
                    zzatlVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                }
            } catch (IOException e4) {
                e = e4;
                bArr = null;
            }
            zzatlVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
        }
    }
}
