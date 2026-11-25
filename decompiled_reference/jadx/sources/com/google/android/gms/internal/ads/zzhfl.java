package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhfl extends zzhfg {
    private final zzhft zza;
    private final zzibm zzb;
    private final zzibm zzc;
    private final zzibk zzd;

    @Nullable
    private final Integer zze;

    /* synthetic */ zzhfl(zzhft zzhftVar, zzibm zzibmVar, zzibm zzibmVar2, zzibk zzibkVar, Integer num, byte[] bArr) {
        this.zza = zzhftVar;
        this.zzb = zzibmVar;
        this.zzc = zzibmVar2;
        this.zzd = zzibkVar;
        this.zze = num;
    }

    public static zzhfk zzd() {
        return new zzhfk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    @Nullable
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    public final zzibk zzc() {
        return this.zzd;
    }

    public final zzibm zze() {
        return this.zzb;
    }

    public final zzibm zzf() {
        return this.zzc;
    }

    public final zzhft zzg() {
        return this.zza;
    }
}
