package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzayf extends zziep implements zziga {
    private static final zzayf zzc;
    private static volatile zzigh zzd;
    private int zza;
    private long zzb = -1;

    static {
        zzayf zzayfVar = new zzayf();
        zzc = zzayfVar;
        zziep.zzbu(zzayf.class, zzayfVar);
    }

    private zzayf() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzayf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaye(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzayf.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }
}
