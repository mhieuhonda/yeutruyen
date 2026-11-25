package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgd extends zzhfg {
    private final zzhgk zza;
    private final zzibm zzb;
    private final zzibk zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhgd(zzhgk zzhgkVar, zzibm zzibmVar, zzibk zzibkVar, Integer num, byte[] bArr) {
        this.zza = zzhgkVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhgc zzd() {
        return new zzhgc(null);
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

    public final zzhgk zzf() {
        return this.zza;
    }
}
