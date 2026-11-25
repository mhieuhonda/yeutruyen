package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhox extends zzhpi {
    private final zzhpg zza;
    private final zzibm zzb;
    private final zzibk zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhox(zzhpg zzhpgVar, zzibm zzibmVar, zzibk zzibkVar, Integer num, byte[] bArr) {
        this.zza = zzhpgVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhow zzc() {
        return new zzhow(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhpi, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzibm zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhpi
    public final zzibk zze() {
        return this.zzc;
    }

    public final zzhpg zzf() {
        return this.zza;
    }
}
