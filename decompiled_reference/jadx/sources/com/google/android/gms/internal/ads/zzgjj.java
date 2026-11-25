package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgjj extends zzgji {
    private final Map zza;
    private final zzgen zzb;

    zzgjj(zzaxt zzaxtVar, zzgie zzgieVar, zzgen zzgenVar, Map map, zzgqo zzgqoVar) {
        super("0llJphW+1AJxnxbH/gLXWqExBUUJf0DQ3WuxUSKByDNRS1LORshIg0jq004o4mzE", "HgFzVQOFBY50xlS1g5v9F7L61Tt5netYE+jncsHeWeQ=", zzaxtVar, zzgieVar, zzgqoVar.zza(122));
        this.zza = map;
        this.zzb = zzgenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzgto.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzgto.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzgto.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzgto.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzgto.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzgto.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzgto.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzgto.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzgto.zza((Long) map.get("tst"), -1L);
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        Long[] lArr3 = lArr2;
        synchronized (zzaxtVar) {
            zzaxtVar.zzac(lArr3[0].longValue());
            zzaxtVar.zzs(lArr3[1].longValue());
            zzaxtVar.zzn(lArr3[2].longValue());
            zzaxtVar.zzk(lArr3[3].longValue());
            zzaxtVar.zzY(lArr3[4].longValue());
            zzaxtVar.zzZ(lArr3[5].longValue());
            zzaxtVar.zzF(lArr3[6].longValue());
            zzaxtVar.zzG(lArr3[7].longValue());
        }
    }
}
