package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhsf extends zziep implements zziga {
    private static final zzhsf zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhsf zzhsfVar = new zzhsf();
        zzd = zzhsfVar;
        zziep.zzbu(zzhsf.class, zzhsfVar);
    }

    private zzhsf() {
    }

    public static zzhse zzb() {
        return (zzhse) zzd.zzbn();
    }

    public static zzhsf zzc() {
        return zzd;
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
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhse(bArr);
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
        synchronized (zzhsf.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = 2;
        if (i != 0) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? 0 : 7;
            } else {
                i2 = 6;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb = zzhsr.zza(i);
    }

    final /* synthetic */ void zzj(int i) {
        this.zzc = zzhsk.zza(i);
    }
}
