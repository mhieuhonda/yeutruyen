package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzilg extends zziep implements zziga {
    private static final zzilg zzb;
    private static volatile zzigh zzc;
    private zzifb zza = zzbM();

    static {
        zzilg zzilgVar = new zzilg();
        zzb = zzilgVar;
        zziep.zzbu(zzilg.class, zzilgVar);
    }

    private zzilg() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzile.class});
        }
        if (iOrdinal == 3) {
            return new zzilg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilf(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzilg.class) {
            zziekVar = zzc;
            if (zziekVar == null) {
                zziekVar = new zziek(zzb);
                zzc = zziekVar;
            }
        }
        return zziekVar;
    }
}
