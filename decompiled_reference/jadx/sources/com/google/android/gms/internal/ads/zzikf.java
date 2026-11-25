package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzikf extends zziep implements zziga {
    private static final zzikf zzj;
    private static volatile zzigh zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzikf zzikfVar = new zzikf();
        zzj = zzikfVar;
        zziep.zzbu(zzikf.class, zzikfVar);
    }

    private zzikf() {
    }

    public static zzike zzc() {
        return (zzike) zzj.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzikg.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzikf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzike(bArr);
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
        synchronized (zzikf.class) {
            zziekVar = zzk;
            if (zziekVar == null) {
                zziekVar = new zziek(zzj);
                zzk = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }
}
