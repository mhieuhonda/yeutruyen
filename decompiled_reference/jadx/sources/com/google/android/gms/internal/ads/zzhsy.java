package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhsy extends zziep implements zziga {
    private static final zzhsy zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb;

    static {
        zzhsy zzhsyVar = new zzhsy();
        zzc = zzhsyVar;
        zziep.zzbu(zzhsy.class, zzhsyVar);
    }

    private zzhsy() {
    }

    public static zzhsx zzc() {
        return (zzhsx) zzc.zzbn();
    }

    public static zzhsy zzd() {
        return zzc;
    }

    public final zzhss zza() {
        zzhss zzhssVarZzb = zzhss.zzb(this.zza);
        return zzhssVarZzb == null ? zzhss.UNRECOGNIZED : zzhssVarZzb;
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
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhsy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsx(bArr);
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
        synchronized (zzhsy.class) {
            zziekVar = zzd;
            if (zziekVar == null) {
                zziekVar = new zziek(zzc);
                zzd = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = i;
    }
}
