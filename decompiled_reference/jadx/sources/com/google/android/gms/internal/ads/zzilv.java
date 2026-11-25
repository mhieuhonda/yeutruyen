package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzilv extends zziep implements zziga {
    private static final zzilv zzl;
    private static volatile zzigh zzm;
    private int zza;
    private long zzd;
    private zzilx zzi;
    private zzilz zzj;
    private zzibo zzk;
    private zzidl zzb = zzidl.zza;
    private zziex zzc = zzbC();
    private zziex zze = zzbC();
    private zzifb zzf = zzbM();
    private String zzg = "";
    private zzifb zzh = zzbM();

    static {
        zzilv zzilvVar = new zzilv();
        zzl = zzilvVar;
        zziep.zzbu(zzilv.class, zzilvVar);
    }

    private zzilv() {
    }

    public static zzilv zzc(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zzilv) zziep.zzbV(zzl, bArr, zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zzilk.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzilv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilu(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzm;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzilv.class) {
            zziekVar = zzm;
            if (zziekVar == null) {
                zziekVar = new zziek(zzl);
                zzm = zziekVar;
            }
        }
        return zziekVar;
    }
}
