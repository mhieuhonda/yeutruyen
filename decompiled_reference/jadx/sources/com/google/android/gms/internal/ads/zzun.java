package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzun implements zzuq {
    zzun() {
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final zzuj zza(zzul zzulVar, zzv zzvVar) {
        if (zzvVar.zzt == null) {
            return null;
        }
        return new zzur(new zzui(new zzus(1), 6001));
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final int zzb(zzv zzvVar) {
        return zzvVar.zzt != null ? 1 : 0;
    }
}
