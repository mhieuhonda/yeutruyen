package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhij extends zzhfg {
    private final zzhio zza;
    private final zzibm zzb;
    private final zzibk zzc;

    @Nullable
    private final Integer zzd;

    private zzhij(zzhio zzhioVar, zzibm zzibmVar, zzibk zzibkVar, @Nullable Integer num) {
        this.zza = zzhioVar;
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

    public final zzhio zzf() {
        return this.zza;
    }

    public static zzhij zzd(zzhio zzhioVar, zzibm zzibmVar, @Nullable Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        zzhin zzhinVarZzc = zzhioVar.zzc();
        zzhin zzhinVar = zzhin.zzb;
        if (zzhinVarZzc != zzhinVar && num == null) {
            String string = zzhioVar.zzc().toString();
            StringBuilder sb = new StringBuilder(string.length() + 62);
            sb.append("For given Variant ");
            sb.append(string);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (zzhioVar.zzc() == zzhinVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibmVar.zzd() != 32) {
            int iZzd = zzibmVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 68);
            sb2.append("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(iZzd);
            throw new GeneralSecurityException(sb2.toString());
        }
        if (zzhioVar.zzc() == zzhinVar) {
            zzibkVarZzb = zzhnf.zza;
        } else {
            if (zzhioVar.zzc() != zzhin.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhioVar.zzc().toString()));
            }
            zzibkVarZzb = zzhnf.zzb(num.intValue());
        }
        return new zzhij(zzhioVar, zzibmVar, zzibkVarZzb, num);
    }
}
