package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhrh extends zziep implements zziga {
    private static final zzhrh zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhrj zzb;
    private int zzc;

    static {
        zzhrh zzhrhVar = new zzhrh();
        zzd = zzhrhVar;
        zziep.zzbu(zzhrh.class, zzhrhVar);
    }

    private zzhrh() {
    }

    public static zzhrg zzc() {
        return (zzhrg) zzd.zzbn();
    }

    public static zzhrh zzd() {
        return zzd;
    }

    public final zzhrj zza() {
        zzhrj zzhrjVar = this.zzb;
        return zzhrjVar == null ? zzhrj.zzc() : zzhrjVar;
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
            return new zzhrh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrg(bArr);
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
        synchronized (zzhrh.class) {
            zziekVar = zze;
            if (zziekVar == null) {
                zziekVar = new zziek(zzd);
                zze = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(zzhrj zzhrjVar) {
        zzhrjVar.getClass();
        this.zzb = zzhrjVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
