package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzfuh implements Comparator {
    static final /* synthetic */ zzfuh zza = new zzfuh();

    private /* synthetic */ zzfuh() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzftw zzftwVar = (zzftw) obj2;
        zzftw zzftwVar2 = (zzftw) obj;
        int iCompare = Double.compare(zzftwVar.zze(), zzftwVar2.zze());
        return iCompare == 0 ? Long.compare(zzftwVar2.zzd(), zzftwVar.zzd()) : iCompare;
    }
}
