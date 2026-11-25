package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhtj extends zziep implements zziga {
    private static final zzhtj zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzhtb zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhtj zzhtjVar = new zzhtj();
        zzf = zzhtjVar;
        zziep.zzbu(zzhtj.class, zzhtjVar);
    }

    private zzhtj() {
    }

    public static zzhti zze() {
        return (zzhti) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhtb zzb() {
        zzhtb zzhtbVar = this.zzb;
        return zzhtbVar == null ? zzhtb.zze() : zzhtbVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhtx zzd() {
        zzhtx zzhtxVarZzb = zzhtx.zzb(this.zze);
        return zzhtxVarZzb == null ? zzhtx.UNRECOGNIZED : zzhtxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhtj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhti(bArr);
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
        synchronized (zzhtj.class) {
            zziekVar = zzg;
            if (zziekVar == null) {
                zziekVar = new zziek(zzf);
                zzg = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zzg(zzhtb zzhtbVar) {
        zzhtbVar.getClass();
        this.zzb = zzhtbVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzd = i;
    }

    final /* synthetic */ void zzi(zzhtx zzhtxVar) {
        this.zze = zzhtxVar.zza();
    }

    public final int zzk() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzc = zzhtc.zza(i);
    }
}
