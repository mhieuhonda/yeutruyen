package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzijf extends zziep implements zziga {
    private static final zzijf zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzidl zzb;
    private zzidl zzc;
    private byte zzd = 2;

    static {
        zzijf zzijfVar = new zzijf();
        zze = zzijfVar;
        zziep.zzbu(zzijf.class, zzijfVar);
    }

    private zzijf() {
        zzidl zzidlVar = zzidl.zza;
        this.zzb = zzidlVar;
        this.zzc = zzidlVar;
    }

    public static zzije zzc() {
        return (zzije) zze.zzbn();
    }

    final /* synthetic */ void zzd(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzb = zzidlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        byte[] bArr = null;
        switch (zzieoVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzijf();
            case NEW_BUILDER:
                return new zzije(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzigh zzighVar = zzf;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzijf.class) {
                    zziekVar = zzf;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zze);
                        zzf = zziekVar;
                    }
                    break;
                }
                return zziekVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zze(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 2;
        this.zzc = zzidlVar;
    }
}
