package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhrd extends zziep implements zziga {
    private static final zzhrd zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhrh zzb;
    private zzhsw zzc;

    static {
        zzhrd zzhrdVar = new zzhrd();
        zzd = zzhrdVar;
        zziep.zzbu(zzhrd.class, zzhrdVar);
    }

    private zzhrd() {
    }

    public static zzhrd zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhrd) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhrc zzd() {
        return (zzhrc) zzd.zzbn();
    }

    public final zzhrh zza() {
        zzhrh zzhrhVar = this.zzb;
        return zzhrhVar == null ? zzhrh.zzd() : zzhrhVar;
    }

    public final zzhsw zzb() {
        zzhsw zzhswVar = this.zzc;
        return zzhswVar == null ? zzhsw.zzg() : zzhswVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrc(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhrd.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(zzhrh zzhrhVar) {
        zzhrhVar.getClass();
        this.zzb = zzhrhVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhsw zzhswVar) {
        zzhswVar.getClass();
        this.zzc = zzhswVar;
        this.zza |= 2;
    }
}
