package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzawx extends zziep implements zziga {
    private static final zzawx zzu;
    private static volatile zzigh zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private zzifb zzb = zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zziex zzn = zzbC();

    static {
        zzawx zzawxVar = new zzawx();
        zzu = zzawxVar;
        zziep.zzbu(zzawx.class, zzawxVar);
    }

    private zzawx() {
    }

    public static zzaww zza() {
        return (zzaww) zzu.zzbn();
    }

    final /* synthetic */ void zzb(zzaxp zzaxpVar) {
        zzaxpVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzaxpVar);
    }

    final /* synthetic */ void zzc() {
        this.zzb = zzbM();
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", zzaxp.class, "zzc", "zzd", "zze", "zzf", "zzg", zzaxn.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (iOrdinal == 3) {
            return new zzawx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaww(bArr);
        }
        if (iOrdinal == 5) {
            return zzu;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzv;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzawx.class) {
            zziekVar = zzv;
            if (zziekVar == null) {
                zziekVar = new zziek(zzu);
                zzv = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    final /* synthetic */ void zzm(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    final /* synthetic */ void zzn(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    final /* synthetic */ void zzo(Iterable iterable) {
        zziex zziexVar = this.zzn;
        if (!zziexVar.zza()) {
            this.zzn = zziep.zzbD(zziexVar);
        }
        zzicu.zzaW(iterable, this.zzn);
    }

    final /* synthetic */ void zzq(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    final /* synthetic */ void zzr(int i) {
        this.zzo = zzbec.zza(i);
        this.zza |= 2048;
    }

    final /* synthetic */ void zzs(int i) {
        this.zzp = 1;
        this.zza |= 4096;
    }
}
