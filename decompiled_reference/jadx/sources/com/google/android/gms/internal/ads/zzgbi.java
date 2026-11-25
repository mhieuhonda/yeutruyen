package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbi extends zziep implements zziga {
    private static final zzgbi zzb;
    private static volatile zzigh zzc;
    private zzift zza = zzift.zza();

    static {
        zzgbi zzgbiVar = new zzgbi();
        zzb = zzgbiVar;
        zziep.zzbu(zzgbi.class, zzgbiVar);
    }

    private zzgbi() {
    }

    public static zzgbi zzc(InputStream inputStream) throws IOException {
        return (zzgbi) zziep.zzbW(zzb, inputStream);
    }

    public static zzgbi zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    protected final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzgbh.zza});
        }
        if (iOrdinal == 3) {
            return new zzgbi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgbg(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzgbi.class) {
            zziekVar = zzc;
            if (zziekVar == null) {
                zziekVar = new zziek(zzb);
                zzc = zziekVar;
            }
        }
        return zziekVar;
    }

    final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
