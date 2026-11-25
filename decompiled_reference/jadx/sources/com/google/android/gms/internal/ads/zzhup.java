package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhup extends zziep implements zziga {
    private static final zzhup zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private zzhul zzc;
    private zzidl zzd;
    private zzidl zze;

    static {
        zzhup zzhupVar = new zzhup();
        zzf = zzhupVar;
        zziep.zzbu(zzhup.class, zzhupVar);
    }

    private zzhup() {
        zzidl zzidlVar = zzidl.zza;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    public static zzhup zze(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhup) zziep.zzbT(zzf, zzidlVar, zzidzVar);
    }

    public static zzhuo zzg() {
        return (zzhuo) zzf.zzbn();
    }

    public static zzhup zzh() {
        return zzf;
    }

    public static zzigh zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhul zzb() {
        zzhul zzhulVar = this.zzc;
        return zzhulVar == null ? zzhul.zze() : zzhulVar;
    }

    public final zzidl zzc() {
        return this.zzd;
    }

    public final zzidl zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhup();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhuo(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhup.class) {
            zziekVar = zzg;
            if (zziekVar == null) {
                zziekVar = new zziek(zzf);
                zzg = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzk(zzhul zzhulVar) {
        zzhulVar.getClass();
        this.zzc = zzhulVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzl(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }

    final /* synthetic */ void zzm(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zze = zzidlVar;
    }
}
