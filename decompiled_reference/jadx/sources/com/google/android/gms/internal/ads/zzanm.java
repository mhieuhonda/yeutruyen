package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzanm {
    public static void zza(zzann zzannVar, zzanr zzanrVar, zzdu zzduVar) {
        for (int i = 0; i < zzannVar.zza(); i++) {
            long jZzb = zzannVar.zzb(i);
            List listZzc = zzannVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzannVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzannVar.zzb(i + 1) - zzannVar.zzb(i);
                if (jZzb2 > 0) {
                    zzduVar.zza(new zzank(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
