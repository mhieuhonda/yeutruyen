package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziln extends zziep implements zziga {
    private static final zziln zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private int zzc;

    static {
        zziln zzilnVar = new zziln();
        zzd = zzilnVar;
        zziep.zzbu(zziln.class, zzilnVar);
    }

    private zziln() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzima.zza});
        }
        if (iOrdinal == 3) {
            return new zziln();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilm(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziln.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }
}
