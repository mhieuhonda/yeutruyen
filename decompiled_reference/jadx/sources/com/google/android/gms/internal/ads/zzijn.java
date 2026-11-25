package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzijn extends zziep implements zziga {
    private static final zzijn zzi;
    private static volatile zzigh zzj;
    private int zza;
    private zzijm zzb;
    private zzidl zzd;
    private zzidl zze;
    private int zzf;
    private zzidl zzg;
    private byte zzh = 2;
    private zzifb zzc = zzbM();

    static {
        zzijn zzijnVar = new zzijn();
        zzi = zzijnVar;
        zziep.zzbu(zzijn.class, zzijnVar);
    }

    private zzijn() {
        zzidl zzidlVar = zzidl.zza;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
        this.zzg = zzidlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        byte[] bArr = null;
        switch (zzieoVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzijf.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzijn();
            case NEW_BUILDER:
                return new zzijk(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzigh zzighVar = zzj;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzijn.class) {
                    zziekVar = zzj;
                    if (zziekVar == null) {
                        zziekVar = new zziek(zzi);
                        zzj = zziekVar;
                    }
                    break;
                }
                return zziekVar;
            default:
                throw null;
        }
    }
}
