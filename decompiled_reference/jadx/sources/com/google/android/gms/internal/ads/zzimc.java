package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzimc extends zziep implements zziga {
    private static final zzimc zze;
    private static volatile zzigh zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        zzimc zzimcVar = new zzimc();
        zze = zzimcVar;
        zziep.zzbu(zzimc.class, zzimcVar);
    }

    private zzimc() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", zzimf.zza, "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzimc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzimb(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzimc.class) {
            zziekVar = zzf;
            if (zziekVar == null) {
                zziekVar = new zziek(zze);
                zzf = zziekVar;
            }
        }
        return zziekVar;
    }
}
