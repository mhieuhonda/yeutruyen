package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaue {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzaue(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    static zzaue zza(zzauf zzaufVar) throws IOException {
        if (zzauh.zzi(zzaufVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzauh.zzm(zzaufVar);
        String strZzm2 = zzauh.zzm(zzaufVar);
        long jZzk = zzauh.zzk(zzaufVar);
        long jZzk2 = zzauh.zzk(zzaufVar);
        long jZzk3 = zzauh.zzk(zzaufVar);
        long jZzk4 = zzauh.zzk(zzaufVar);
        int iZzi = zzauh.zzi(zzaufVar);
        if (iZzi < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(iZzi);
            throw new IOException(sb.toString());
        }
        List listEmptyList = iZzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZzi; i++) {
            listEmptyList.add(new zzatd(zzauh.zzm(zzaufVar).intern(), zzauh.zzm(zzaufVar).intern()));
        }
        return new zzaue(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, listEmptyList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    zzaue(String str, zzasu zzasuVar) {
        String str2 = zzasuVar.zzb;
        long j = zzasuVar.zzc;
        long j2 = zzasuVar.zzd;
        long j3 = zzasuVar.zze;
        long j4 = zzasuVar.zzf;
        List arrayList = zzasuVar.zzh;
        if (arrayList == null) {
            Map map = zzasuVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzatd((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }
}
