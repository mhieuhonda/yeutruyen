package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzifq {
    private static final zzifx zzb = new zzifo();
    private final zzifx zza;

    public zzifq() {
        zzifx zzifxVar = zzb;
        int i = zzicy.zza;
        this.zza = new zzifp(zziei.zza(), zzifxVar);
    }

    public final zzigr zza(Class cls) {
        int i = zzigs.zza;
        if (!zziep.class.isAssignableFrom(cls)) {
            int i2 = zzicy.zza;
        }
        zzifw zzifwVarZzc = this.zza.zzc(cls);
        if (zzifwVarZzc.zza()) {
            int i3 = zzicy.zza;
            return zzigd.zzh(zzigs.zzE(), zziec.zza(), zzifwVarZzc.zzb());
        }
        int i4 = zzicy.zza;
        return zzigc.zzm(cls, zzifwVarZzc, zzigg.zza(), zzifm.zza(), zzigs.zzE(), zzifwVarZzc.zzc() + (-1) != 1 ? zziec.zza() : null, zzifv.zza());
    }
}
