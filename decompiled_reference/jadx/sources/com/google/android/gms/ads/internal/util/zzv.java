package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmq;
import com.google.android.gms.internal.ads.zzekz;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzt, com.google.android.gms.ads.internal.util.zzz
    public final zzclm zzb(zzclb zzclbVar, zzbhw zzbhwVar, boolean z, zzekz zzekzVar) {
        return new zzcmq(zzclbVar, zzbhwVar, z, zzekzVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final zzbic.zzq zzd(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzbic.zzq.ENUM_TRUE : zzbic.zzq.ENUM_FALSE;
        }
        return zzbic.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zze(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjS)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzf(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
