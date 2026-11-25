package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziib extends zziep implements zziga {
    private static final zziib zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private zziex zzc = zzbC();

    static {
        zziib zziibVar = new zziib();
        zzd = zziibVar;
        zziep.zzbu(zziib.class, zziibVar);
    }

    private zziib() {
    }

    public static zziia zzc() {
        return (zziia) zzd.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zziib();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziia(bArr);
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
        synchronized (zziib.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = 15;
    }
}
