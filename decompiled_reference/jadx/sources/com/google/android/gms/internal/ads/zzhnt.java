package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhnt {
    private final Map zza;
    private final Map zzb;

    private zzhnt() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzhnt zza(zzhns zzhnsVar) throws GeneralSecurityException {
        if (zzhnsVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhnu zzhnuVar = new zzhnu(zzhnsVar.zzb(), zzhnsVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhnuVar)) {
            map.put(zzhnuVar, zzhnsVar);
            return this;
        }
        zzhns zzhnsVar2 = (zzhns) map.get(zzhnuVar);
        if (zzhnsVar2.equals(zzhnsVar) && zzhnsVar.equals(zzhnsVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhnuVar.toString()));
    }

    public final zzhnt zzb(zzhny zzhnyVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZza = zzhnyVar.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzhnyVar);
            return this;
        }
        zzhny zzhnyVar2 = (zzhny) map.get(clsZza);
        if (zzhnyVar2.equals(zzhnyVar) && zzhnyVar.equals(zzhnyVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    final /* synthetic */ Map zzc() {
        return this.zza;
    }

    final /* synthetic */ Map zzd() {
        return this.zzb;
    }

    /* synthetic */ zzhnt(zzhnw zzhnwVar, byte[] bArr) {
        this.zza = new HashMap(zzhnwVar.zzc());
        this.zzb = new HashMap(zzhnwVar.zzd());
    }

    /* synthetic */ zzhnt(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
