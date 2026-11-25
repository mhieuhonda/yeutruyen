package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhvw extends zzhxv {
    private final zzhvp zza;
    private final zzibk zzb;
    private final zzibk zzc;

    @Nullable
    private final Integer zzd;

    private zzhvw(zzhvp zzhvpVar, zzibk zzibkVar, zzibk zzibkVar2, @Nullable Integer num) {
        this.zza = zzhvpVar;
        this.zzb = zzibkVar;
        this.zzc = zzibkVar2;
        this.zzd = num;
    }

    public static zzhvw zzc(zzhvo zzhvoVar, zzibk zzibkVar, @Nullable Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZza;
        zzhvp zzhvpVarZzb = zzhvp.zzb(zzhvoVar);
        zzhvo zzhvoVar2 = zzhvo.zzd;
        if (!zzhvoVar.equals(zzhvoVar2) && num == null) {
            String string = zzhvoVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhvoVar.equals(zzhvoVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibkVar.zzd() != 32) {
            int iZzd = zzibkVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 65);
            sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhvpVarZzb.zzc() == zzhvoVar2) {
            zzibkVarZza = zzhnf.zza;
        } else if (zzhvpVarZzb.zzc() == zzhvo.zzb || zzhvpVarZzb.zzc() == zzhvo.zzc) {
            zzibkVarZza = zzhnf.zza(num.intValue());
        } else {
            if (zzhvpVarZzb.zzc() != zzhvo.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhvpVarZzb.zzc().toString()));
            }
            zzibkVarZza = zzhnf.zzb(num.intValue());
        }
        return new zzhvw(zzhvpVarZzb, zzibkVar, zzibkVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhxv, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzibk zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxv
    public final zzibk zze() {
        return this.zzc;
    }

    public final zzhvp zzf() {
        return this.zza;
    }
}
