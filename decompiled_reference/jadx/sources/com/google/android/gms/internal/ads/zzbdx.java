package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdx extends zziep implements zziga {
    private static final zzbdx zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzifb zzb = zzbM();
    private zziib zzc;

    static {
        zzbdx zzbdxVar = new zzbdx();
        zzd = zzbdxVar;
        zziep.zzbu(zzbdx.class, zzbdxVar);
    }

    private zzbdx() {
    }

    public static zzbdw zza() {
        return (zzbdw) zzd.zzbn();
    }

    final /* synthetic */ void zzb(zzbdv zzbdvVar) {
        zzbdvVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzbdvVar);
    }

    final /* synthetic */ void zzc(zziib zziibVar) {
        zziibVar.getClass();
        this.zzc = zziibVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzbdv.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbdx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbdw(bArr);
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
        synchronized (zzbdx.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }
}
