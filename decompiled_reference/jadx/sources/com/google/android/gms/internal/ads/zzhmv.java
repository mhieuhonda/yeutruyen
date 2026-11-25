package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhmv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhma zzc = zzhmu.zza;
    private static final zzhmv zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhmv zza() {
        return zzd;
    }

    private static zzhmv zzd() {
        zzhmv zzhmvVar = new zzhmv();
        try {
            zzhmvVar.zzb(zzc, zzhmn.class);
            return zzhmvVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    private final synchronized zzhdz zze(zzheq zzheqVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhma zzhmaVar;
        zzhmaVar = (zzhma) this.zzb.get(zzheqVar.getClass());
        if (zzhmaVar == null) {
            String string = zzheqVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(string);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzhmaVar.zza(zzheqVar, num);
    }

    public final synchronized void zzb(zzhma zzhmaVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        zzhma zzhmaVar2 = (zzhma) map.get(cls);
        if (zzhmaVar2 != null && !zzhmaVar2.equals(zzhmaVar)) {
            String string = cls.toString();
            StringBuilder sb = new StringBuilder(string.length() + 60);
            sb.append("Different key creator for parameters class ");
            sb.append(string);
            sb.append(" already inserted");
            throw new GeneralSecurityException(sb.toString());
        }
        map.put(cls, zzhmaVar);
    }

    public final zzhdz zzc(zzheq zzheqVar, @Nullable Integer num) throws GeneralSecurityException {
        return zze(zzheqVar, num);
    }
}
