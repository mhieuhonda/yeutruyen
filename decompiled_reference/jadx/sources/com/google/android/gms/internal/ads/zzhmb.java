package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhmb {
    private static final Logger zza = Logger.getLogger(zzhmb.class.getName());
    private static final zzhmb zzd = new zzhmb();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhmb zza() {
        return zzd;
    }

    private final synchronized zzhea zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhea) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhea zzheaVar, boolean z, boolean z2) throws GeneralSecurityException {
        String strZzb = zzheaVar.zzb();
        if (z2) {
            ConcurrentMap concurrentMap = this.zzc;
            if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
            }
        }
        ConcurrentMap concurrentMap2 = this.zzb;
        zzhea zzheaVar2 = (zzhea) concurrentMap2.get(strZzb);
        if (zzheaVar2 != null && !zzheaVar2.getClass().equals(zzheaVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzheaVar2.getClass().getName(), zzheaVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(strZzb, zzheaVar);
        this.zzc.put(strZzb, Boolean.valueOf(z2));
    }

    public final synchronized void zzb(zzhea zzheaVar, boolean z) throws GeneralSecurityException {
        zzf(zzheaVar, 1, z);
    }

    public final zzhea zzc(String str, Class cls) throws GeneralSecurityException {
        zzhea zzheaVarZzg = zzg(str);
        if (zzheaVarZzg.zzc().equals(cls)) {
            return zzheaVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzheaVarZzg.getClass());
        String string = zzheaVarZzg.zzc().toString();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 53 + String.valueOf(strValueOf).length() + 23 + string.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(strValueOf);
        sb.append(", which only supports: ");
        sb.append(string);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhea zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhea zzheaVar, int i, boolean z) throws GeneralSecurityException {
        if (!zzhle.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzheaVar, false, z);
    }
}
