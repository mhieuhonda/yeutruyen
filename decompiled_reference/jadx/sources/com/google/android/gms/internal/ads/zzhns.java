package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhns {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhns(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhns zzd(zzhnr zzhnrVar, Class cls, Class cls2) {
        return new zzhnq(cls, cls2, zzhnrVar);
    }

    public abstract Object zza(zzhdz zzhdzVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
