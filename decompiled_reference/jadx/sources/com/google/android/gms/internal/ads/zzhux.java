package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhux extends zziep implements zziga {
    private static final zzhux zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzidl zzb = zzidl.zza;

    static {
        zzhux zzhuxVar = new zzhux();
        zzc = zzhuxVar;
        zziep.zzbu(zzhux.class, zzhuxVar);
    }

    private zzhux() {
    }

    public static zzhux zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhux) zziep.zzbT(zzc, zzidlVar, zzidzVar);
    }

    public static zzhuw zzd() {
        return (zzhuw) zzc.zzbn();
    }

    public static zzigh zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzidl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhux();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuw(bArr);
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
        synchronized (zzhux.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zzg(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
    }
}
