package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqz extends zziep implements zziga {
    private static final zzfqz zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzfqw zzb;

    static {
        zzfqz zzfqzVar = new zzfqz();
        zzc = zzfqzVar;
        zziep.zzbu(zzfqz.class, zzfqzVar);
    }

    private zzfqz() {
    }

    public static zzfqy zza() {
        return (zzfqy) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfqw zzfqwVar) {
        zzfqwVar.getClass();
        this.zzb = zzfqwVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfqz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqy(bArr);
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
        synchronized (zzfqz.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }
}
