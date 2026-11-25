package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhez {
    public static zzhek zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhtk zzhtkVarZze = zzhtk.zze(zzhdy.zza(str).zzb().zzaN(), zzidz.zzb());
                    for (zzhtj zzhtjVar : zzhtkVarZze.zzb()) {
                        if (zzhtjVar.zzb().zzc() == zzhta.UNKNOWN_KEYMATERIAL || zzhtjVar.zzb().zzc() == zzhta.SYMMETRIC || zzhtjVar.zzb().zzc() == zzhta.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzhtjVar.zzb().zzc().name(), zzhtjVar.zzb().zza()));
                        }
                    }
                    return zzhek.zza(zzhtkVarZze);
                } catch (zzifh unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzifh unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
