package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzawv extends zziep implements zziga {
    private static final zzawv zzj;
    private static volatile zzigh zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzaxm zzg;
    private zzaxs zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzawv zzawvVar = new zzawv();
        zzj = zzawvVar;
        zziep.zzbu(zzawv.class, zzawvVar);
    }

    private zzawv() {
    }

    public static zzawu zze() {
        return (zzawu) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzaxm zzc() {
        zzaxm zzaxmVar = this.zzg;
        return zzaxmVar == null ? zzaxm.zzd() : zzaxmVar;
    }

    public final zzaxs zzd() {
        zzaxs zzaxsVar = this.zzh;
        return zzaxsVar == null ? zzaxs.zza() : zzaxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzawy.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzawv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawu(bArr);
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
        synchronized (zzawv.class) {
            zziekVar = zzk;
            if (zziekVar == null) {
                zziekVar = new zziek(zzj);
                zzk = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }
}
