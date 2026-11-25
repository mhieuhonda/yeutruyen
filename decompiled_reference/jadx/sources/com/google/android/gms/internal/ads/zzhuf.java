package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhuf extends zziep implements zziga {
    private static final zzhuf zzj;
    private static volatile zzigh zzk;
    private int zza;
    private int zzb;
    private zzhuh zzc;
    private zzidl zzd;
    private zzidl zze;
    private zzidl zzf;
    private zzidl zzg;
    private zzidl zzh;
    private zzidl zzi;

    static {
        zzhuf zzhufVar = new zzhuf();
        zzj = zzhufVar;
        zziep.zzbu(zzhuf.class, zzhufVar);
    }

    private zzhuf() {
        zzidl zzidlVar = zzidl.zza;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
        this.zzf = zzidlVar;
        this.zzg = zzidlVar;
        this.zzh = zzidlVar;
        this.zzi = zzidlVar;
    }

    public static zzhuf zzj(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhuf) zziep.zzbT(zzj, zzidlVar, zzidzVar);
    }

    public static zzhue zzk() {
        return (zzhue) zzj.zzbn();
    }

    public static zzigh zzl() {
        return zzj.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuh zzb() {
        zzhuh zzhuhVar = this.zzc;
        return zzhuhVar == null ? zzhuh.zzh() : zzhuhVar;
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
            return zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzhuf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhue(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzk;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhuf.class) {
            zziekVar = zzk;
            if (zziekVar == null) {
                zziekVar = new zziek(zzj);
                zzk = zziekVar;
            }
        }
        return zziekVar;
    }

    public final zzidl zze() {
        return this.zzf;
    }

    public final zzidl zzg() {
        return this.zzg;
    }

    public final zzidl zzh() {
        return this.zzh;
    }

    public final zzidl zzi() {
        return this.zzi;
    }

    final /* synthetic */ void zzm(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzn(zzhuh zzhuhVar) {
        zzhuhVar.getClass();
        this.zzc = zzhuhVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzo(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }

    final /* synthetic */ void zzp(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zze = zzidlVar;
    }

    final /* synthetic */ void zzq(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzf = zzidlVar;
    }

    final /* synthetic */ void zzr(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzg = zzidlVar;
    }

    final /* synthetic */ void zzs(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzh = zzidlVar;
    }

    final /* synthetic */ void zzt(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzi = zzidlVar;
    }
}
