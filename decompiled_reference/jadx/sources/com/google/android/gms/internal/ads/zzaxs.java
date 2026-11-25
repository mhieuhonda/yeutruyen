package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxs extends zziep implements zziga {
    private static final zzaxs zzg;
    private static volatile zzigh zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzaxs zzaxsVar = new zzaxs();
        zzg = zzaxsVar;
        zziep.zzbu(zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
    }

    public static zzaxs zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzaxs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxr(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzh;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzaxs.class) {
            zziekVar = zzh;
            if (zziekVar == null) {
                zziekVar = new zziek(zzg);
                zzh = zziekVar;
            }
        }
        return zziekVar;
    }
}
