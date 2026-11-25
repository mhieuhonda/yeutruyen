package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhom extends zzhpi {
    private final zzhot zza;
    private final zzibm zzb;
    private final zzibk zzc;

    @Nullable
    private final Integer zzd;

    /* synthetic */ zzhom(zzhot zzhotVar, zzibm zzibmVar, zzibk zzibkVar, Integer num, byte[] bArr) {
        this.zza = zzhotVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhol zzc() {
        return new zzhol(null);
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

    public final zzhot zzf() {
        return this.zza;
    }
}
