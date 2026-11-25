package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class CsiParamDefaults_Factory implements zzimz<CsiParamDefaults> {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private CsiParamDefaults_Factory(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
    }

    public static CsiParamDefaults_Factory create(zzini<Context> zziniVar, zzini<VersionInfoParcel> zziniVar2, zzini<PackageInfo> zziniVar3, zzini<String> zziniVar4, zzini<DeviceTierManager> zziniVar5) {
        return new CsiParamDefaults_Factory(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel, PackageInfo packageInfo, String str, DeviceTierManager deviceTierManager) {
        return new CsiParamDefaults(context, versionInfoParcel, packageInfo, str, deviceTierManager);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb(), (PackageInfo) this.zzc.zzb(), (String) this.zzd.zzb(), (DeviceTierManager) this.zze.zzb());
    }
}
