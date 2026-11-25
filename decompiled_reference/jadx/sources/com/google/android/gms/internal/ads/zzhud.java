package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhud extends zziep implements zziga {
    private static final zzhud zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhud zzhudVar = new zzhud();
        zzb = zzhudVar;
        zziep.zzbu(zzhud.class, zzhudVar);
    }

    private zzhud() {
    }

    public static zzhuc zzb() {
        return (zzhuc) zzb.zzbn();
    }

    public static zzhud zzc() {
        return zzb;
    }

    public final zzhss zza() {
        zzhss zzhssVarZzb = zzhss.zzb(this.zza);
        return zzhssVarZzb == null ? zzhss.UNRECOGNIZED : zzhssVarZzb;
    }

    final /* synthetic */ void zzd(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhud();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuc(bArr);
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
        synchronized (zzhud.class) {
            zziekVar = zzc;
            if (zziekVar == null) {
                zziekVar = new zziek(zzb);
                zzc = zziekVar;
            }
        }
        return zziekVar;
    }
}
