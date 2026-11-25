package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqb extends zziep implements zziga {
    private static final zzfqb zzg;
    private static volatile zzigh zzh;
    private long zza;
    private zziex zzb = zzbC();
    private zzifb zzc = zzbM();
    private zzifb zzd = zzbM();
    private zzifb zze = zzbM();
    private zzifb zzf = zzbM();

    static {
        zzfqb zzfqbVar = new zzfqb();
        zzg = zzfqbVar;
        zziep.zzbu(zzfqb.class, zzfqbVar);
    }

    private zzfqb() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfqb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqa(bArr);
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
        synchronized (zzfqb.class) {
            zziekVar = zzh;
            if (zziekVar == null) {
                zziekVar = new zziek(zzg);
                zzh = zziekVar;
            }
        }
        return zziekVar;
    }
}
