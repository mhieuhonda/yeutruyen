package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfum {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final zzfow zzd;
    private final ClientApi zze = new ClientApi();
    private final zzfmc zzf;
    private final Clock zzg;
    private final zzfsx zzh;
    private final zzftn zzi;

    zzfum(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzfmc zzfmcVar, Clock clock, zzfsx zzfsxVar, zzftn zzftnVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfowVar;
        this.zzg = clock;
        this.zzf = zzfmcVar;
        this.zzh = zzfsxVar;
        this.zzi = zzftnVar;
    }

    private final zzftg zzc() {
        return new zzftg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzJ)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzK)).longValue(), 0.2d, this.zzg, this.zzi);
    }

    public final zzful zza(com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzftk(clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfuq(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzftf(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
    }

    public final zzful zzb(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzftk(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfuq(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzftf(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }
}
