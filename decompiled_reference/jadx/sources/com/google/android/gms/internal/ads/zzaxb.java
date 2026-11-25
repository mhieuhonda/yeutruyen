package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxb extends zziep implements zziga {
    private static final zzaxb zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        zzaxb zzaxbVar = new zzaxb();
        zzd = zzaxbVar;
        zziep.zzbu(zzaxb.class, zzaxbVar);
    }

    private zzaxb() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzaxb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxa(bArr);
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
        synchronized (zzaxb.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }
}
