package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhrn extends zziep implements zziga {
    private static final zzhrn zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhrp zzb;
    private int zzc;

    static {
        zzhrn zzhrnVar = new zzhrn();
        zzd = zzhrnVar;
        zziep.zzbu(zzhrn.class, zzhrnVar);
    }

    private zzhrn() {
    }

    public static zzhrn zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhrn) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhrm zzd() {
        return (zzhrm) zzd.zzbn();
    }

    public final zzhrp zza() {
        zzhrp zzhrpVar = this.zzb;
        return zzhrpVar == null ? zzhrp.zzc() : zzhrpVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrm(bArr);
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
        synchronized (zzhrn.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(zzhrp zzhrpVar) {
        zzhrpVar.getClass();
        this.zzb = zzhrpVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
