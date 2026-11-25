package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflm {
    public static com.google.android.gms.ads.internal.client.zzr zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfko zzfkoVar = (zzfko) it.next();
            if (zzfkoVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfkoVar.zza, zzfkoVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzr(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfko zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzi ? new zzfko(-3, 0, true) : new zzfko(zzrVar.zze, zzrVar.zzb, false);
    }
}
