package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhip extends zzhfg {
    private final zzhiv zza;
    private final zzibm zzb;
    private final zzibk zzc;

    @Nullable
    private final Integer zzd;

    private zzhip(zzhiv zzhivVar, zzibm zzibmVar, zzibk zzibkVar, @Nullable Integer num) {
        this.zza = zzhivVar;
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

    public final zzhiv zzf() {
        return this.zza;
    }

    public static zzhip zzd(zzhiu zzhiuVar, zzibm zzibmVar, @Nullable Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        zzhiu zzhiuVar2 = zzhiu.zzc;
        if (zzhiuVar != zzhiuVar2 && num == null) {
            String string = zzhiuVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhiuVar == zzhiuVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibmVar.zzd() != 32) {
            int iZzd = zzibmVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 75);
            sb2.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        zzhiv zzhivVarZzb = zzhiv.zzb(zzhiuVar);
        if (zzhivVarZzb.zzc() == zzhiuVar2) {
            zzibkVarZzb = zzhnf.zza;
        } else if (zzhivVarZzb.zzc() == zzhiu.zzb) {
            zzibkVarZzb = zzhnf.zza(num.intValue());
        } else {
            if (zzhivVarZzb.zzc() != zzhiu.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhivVarZzb.zzc().toString()));
            }
            zzibkVarZzb = zzhnf.zzb(num.intValue());
        }
        return new zzhip(zzhivVarZzb, zzibmVar, zzibkVarZzb, num);
    }
}
