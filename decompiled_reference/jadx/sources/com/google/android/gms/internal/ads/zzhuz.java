package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhuz extends zziep implements zziga {
    private static final zzhuz zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhuz zzhuzVar = new zzhuz();
        zzb = zzhuzVar;
        zziep.zzbu(zzhuz.class, zzhuzVar);
    }

    private zzhuz() {
    }

    public static zzhuz zzb(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhuz) zziep.zzbT(zzb, zzidlVar, zzidzVar);
    }

    public static zzhuz zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhuz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuy(bArr);
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
        synchronized (zzhuz.class) {
            zziekVar = zzc;
            if (zziekVar == null) {
                zziekVar = new zziek(zzb);
                zzc = zziekVar;
            }
        }
        return zziekVar;
    }
}
