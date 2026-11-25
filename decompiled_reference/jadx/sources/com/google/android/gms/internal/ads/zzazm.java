package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzazm extends zziep implements zziga {
    private static final zzazm zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzifb zzb = zzbM();
    private zzidl zzc = zzidl.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzazm zzazmVar = new zzazm();
        zzf = zzazmVar;
        zziep.zzbu(zzazm.class, zzazmVar);
    }

    private zzazm() {
    }

    public static zzazl zza() {
        return (zzazl) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzidl zzidlVar) {
        zzidlVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzidlVar);
    }

    final /* synthetic */ void zzc(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzc = zzidlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzazg.zza, "zze", zzazc.zza});
        }
        if (iOrdinal == 3) {
            return new zzazm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzazl(bArr);
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
        synchronized (zzazm.class) {
            zziekVar = zzg;
            if (zziekVar == null) {
                zziekVar = new zziek(zzf);
                zzg = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }
}
