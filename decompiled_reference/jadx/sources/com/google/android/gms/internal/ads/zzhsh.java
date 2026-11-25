package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhsh extends zziep implements zziga {
    private static final zzhsh zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhsj zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zzhsh zzhshVar = new zzhsh();
        zze = zzhshVar;
        zziep.zzbu(zzhsh.class, zzhshVar);
    }

    private zzhsh() {
    }

    public static zzhsh zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhsh) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhsg zze() {
        return (zzhsg) zze.zzbn();
    }

    public static zzigh zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsj zzb() {
        zzhsj zzhsjVar = this.zzc;
        return zzhsjVar == null ? zzhsj.zzh() : zzhsjVar;
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
            return new zzhsh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsg(bArr);
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
        synchronized (zzhsh.class) {
            zziekVar = zzf;
            if (zziekVar == null) {
                zziekVar = new zziek(zze);
                zzf = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zzh(zzhsj zzhsjVar) {
        zzhsjVar.getClass();
        this.zzc = zzhsjVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }
}
