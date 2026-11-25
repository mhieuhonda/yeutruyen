package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewn implements zzfcq {

    @Nullable
    private final Integer zza;

    private zzewn(@Nullable Integer num) {
        this.zza = num;
    }

    static /* synthetic */ zzewn zzb(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlH)).booleanValue()) {
            return new zzewn(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int extensionVersion = 0;
        try {
            if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlK)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlJ)).intValue() && Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzewn(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
