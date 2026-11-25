package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaxh extends zziep implements zziga {
    private static final zzaxh zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb = 2;

    static {
        zzaxh zzaxhVar = new zzaxh();
        zzc = zzaxhVar;
        zziep.zzbu(zzaxh.class, zzaxhVar);
    }

    private zzaxh() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", zzaxi.zza});
        }
        if (iOrdinal == 3) {
            return new zzaxh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxg(bArr);
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
        synchronized (zzaxh.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }
}
