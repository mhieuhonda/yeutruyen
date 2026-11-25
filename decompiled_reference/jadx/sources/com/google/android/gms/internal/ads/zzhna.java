package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhna {
    private static final zzhna zzb = new zzhna();
    private final Map zza = new HashMap();

    zzhna() {
    }

    public static zzhna zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzheq zzheqVar) throws GeneralSecurityException {
        Map map = this.zza;
        if (!map.containsKey(str)) {
            map.put(str, zzheqVar);
            return;
        }
        if (((zzheq) map.get(str)).equals(zzheqVar)) {
            return;
        }
        String strValueOf = String.valueOf(map.get(str));
        String strValueOf2 = String.valueOf(zzheqVar);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(strValueOf).length() + 17 + String.valueOf(strValueOf2).length());
        sb.append("Parameters object with name ");
        sb.append(str);
        sb.append(" already exists (");
        sb.append(strValueOf);
        sb.append("), cannot insert ");
        sb.append(strValueOf2);
        throw new GeneralSecurityException(sb.toString());
    }

    public final synchronized zzheq zzc(String str) throws GeneralSecurityException {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzheq) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzheq) entry.getValue());
        }
    }
}
