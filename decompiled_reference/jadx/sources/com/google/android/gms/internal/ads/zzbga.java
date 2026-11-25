package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbga implements Comparator {
    zzbga(zzbgc zzbgcVar) {
        Objects.requireNonNull(zzbgcVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbgf zzbgfVar = (zzbgf) obj;
        zzbgf zzbgfVar2 = (zzbgf) obj2;
        int i = zzbgfVar.zzc - zzbgfVar2.zzc;
        return i != 0 ? i : Long.compare(zzbgfVar.zza, zzbgfVar2.zza);
    }
}
