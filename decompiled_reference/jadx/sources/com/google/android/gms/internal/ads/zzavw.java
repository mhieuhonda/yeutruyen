package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavw implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzavx zzavxVar = (zzavx) obj;
        zzavx zzavxVar2 = (zzavx) obj2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzavxVar.zza.length;
            if (i >= length || i2 >= zzavxVar2.zza.length) {
                break;
            }
            int iCompare = Integer.compare(zzavx.zzg(zzavxVar.zzb(i)), zzavx.zzg(zzavxVar2.zzb(i2)));
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
            i2++;
        }
        return Integer.compare(length, zzavxVar2.zza.length);
    }
}
