package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhts extends zziep implements zziga {
    private static final zzhts zzb;
    private static volatile zzigh zzc;
    private String zza = "";

    static {
        zzhts zzhtsVar = new zzhts();
        zzb = zzhtsVar;
        zziep.zzbu(zzhts.class, zzhtsVar);
    }

    private zzhts() {
    }

    public static zzhts zzb(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhts) zziep.zzbT(zzb, zzidlVar, zzidzVar);
    }

    public static zzhtr zzc() {
        return (zzhtr) zzb.zzbn();
    }

    public static zzhts zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhts();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtr(bArr);
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
        synchronized (zzhts.class) {
            zziekVar = zzc;
            if (zziekVar == null) {
                zziekVar = new zziek(zzb);
                zzc = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
