package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfrn extends zziep implements zziga {
    private static final zzfrn zzc;
    private static volatile zzigh zzd;
    private zzifb zza = zzbM();
    private long zzb;

    static {
        zzfrn zzfrnVar = new zzfrn();
        zzc = zzfrnVar;
        zziep.zzbu(zzfrn.class, zzfrnVar);
    }

    private zzfrn() {
    }

    public static zzfrm zza() {
        return (zzfrm) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfqd zzfqdVar) {
        zzfqdVar.getClass();
        zzifb zzifbVar = this.zza;
        if (!zzifbVar.zza()) {
            this.zza = zziep.zzbN(zzifbVar);
        }
        this.zza.add(zzfqdVar);
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfqd.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfrn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrm(bArr);
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
        synchronized (zzfrn.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }
}
