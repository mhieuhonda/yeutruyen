package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgu extends zzhfg {
    private final zzhgz zza;
    private final zzibm zzb;
    private final zzibk zzc;

    @Nullable
    private final Integer zzd;

    private zzhgu(zzhgz zzhgzVar, zzibm zzibmVar, zzibk zzibkVar, @Nullable Integer num) {
        this.zza = zzhgzVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    public final zzibk zzc() {
        return this.zzc;
    }

    public final zzibm zze() {
        return this.zzb;
    }

    public final zzhgz zzf() {
        return this.zza;
    }

    public static zzhgu zzd(zzhgy zzhgyVar, zzibm zzibmVar, @Nullable Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        zzhgy zzhgyVar2 = zzhgy.zzc;
        if (zzhgyVar != zzhgyVar2 && num == null) {
            String string = zzhgyVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhgyVar == zzhgyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibmVar.zzd() != 32) {
            int iZzd = zzibmVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 74);
            sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhgz zzhgzVarZzb = zzhgz.zzb(zzhgyVar);
        if (zzhgzVarZzb.zzc() == zzhgyVar2) {
            zzibkVarZzb = zzhnf.zza;
        } else if (zzhgzVarZzb.zzc() == zzhgy.zzb) {
            zzibkVarZzb = zzhnf.zza(num.intValue());
        } else {
            if (zzhgzVarZzb.zzc() != zzhgy.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhgzVarZzb.zzc().toString()));
            }
            zzibkVarZzb = zzhnf.zzb(num.intValue());
        }
        return new zzhgu(zzhgzVarZzb, zzibmVar, zzibkVarZzb, num);
    }
}
