package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhrt extends zziep implements zziga {
    private static final zzhrt zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb;

    static {
        zzhrt zzhrtVar = new zzhrt();
        zzc = zzhrtVar;
        zziep.zzbu(zzhrt.class, zzhrtVar);
    }

    private zzhrt() {
    }

    public static zzhrt zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhrt) zziep.zzbT(zzc, zzidlVar, zzidzVar);
    }

    public static zzhrs zzd() {
        return (zzhrs) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
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
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhrt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrs(bArr);
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
        synchronized (zzhrt.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
