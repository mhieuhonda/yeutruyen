package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqd extends zziep implements zziga {
    private static final zzfqd zzc;
    private static volatile zzigh zzd;
    private int zza;
    private long zzb;

    static {
        zzfqd zzfqdVar = new zzfqd();
        zzc = zzfqdVar;
        zziep.zzbu(zzfqd.class, zzfqdVar);
    }

    private zzfqd() {
    }

    public static zzfqc zza() {
        return (zzfqc) zzc.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfqd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqc(bArr);
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
        synchronized (zzfqd.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }
}
