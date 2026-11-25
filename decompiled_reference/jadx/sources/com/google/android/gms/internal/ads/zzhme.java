package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhme {
    private final zzibk zza;
    private final Class zzb;

    /* synthetic */ zzhme(zzibk zzibkVar, Class cls, byte[] bArr) {
        this.zza = zzibkVar;
        this.zzb = cls;
    }

    public static zzhme zzd(zzhmd zzhmdVar, zzibk zzibkVar, Class cls) {
        return new zzhmc(zzibkVar, cls, zzhmdVar);
    }

    public abstract zzhdz zza(zzhod zzhodVar, @Nullable zzhey zzheyVar) throws GeneralSecurityException;

    public final zzibk zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
