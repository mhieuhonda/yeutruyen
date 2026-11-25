package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhdq extends zziep implements zziga {
    private static final zzhdq zzb;
    private static volatile zzigh zzc;
    private zzifb zza = zzbM();

    static {
        zzhdq zzhdqVar = new zzhdq();
        zzb = zzhdqVar;
        zziep.zzbu(zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
    }

    public static zzhdn zzb() {
        return (zzhdn) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    final /* synthetic */ void zzc(zzhdp zzhdpVar) {
        zzhdpVar.getClass();
        zzifb zzifbVar = this.zza;
        if (!zzifbVar.zza()) {
            this.zza = zziep.zzbN(zzifbVar);
        }
        this.zza.add(zzhdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzhdp.class});
        }
        if (iOrdinal == 3) {
            return new zzhdq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdn(bArr);
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
        synchronized (zzhdq.class) {
            zziekVar = zzc;
            if (zziekVar == null) {
                zziekVar = new zziek(zzb);
                zzc = zziekVar;
            }
        }
        return zziekVar;
    }
}
