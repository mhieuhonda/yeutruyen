package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhur extends zziep implements zziga {
    private static final zzhur zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhuv zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zzhur zzhurVar = new zzhur();
        zze = zzhurVar;
        zziep.zzbu(zzhur.class, zzhurVar);
    }

    private zzhur() {
    }

    public static zzhur zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhur) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhuq zze() {
        return (zzhuq) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuv zzb() {
        zzhuv zzhuvVar = this.zzc;
        return zzhuvVar == null ? zzhuv.zzc() : zzhuvVar;
    }

    public final zzidl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhur();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuq(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhur.class) {
            zziekVar = zzf;
            if (zziekVar == null) {
                zziekVar = new zziek(zze);
                zzf = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zzg(zzhuv zzhuvVar) {
        zzhuvVar.getClass();
        this.zzc = zzhuvVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }
}
