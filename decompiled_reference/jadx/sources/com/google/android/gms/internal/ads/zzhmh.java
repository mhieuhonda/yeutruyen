package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhmh {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhmh(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhmh zzd(zzhmg zzhmgVar, Class cls, Class cls2) {
        return new zzhmf(cls, cls2, zzhmgVar);
    }

    public abstract zzhod zza(zzhdz zzhdzVar, @Nullable zzhey zzheyVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
