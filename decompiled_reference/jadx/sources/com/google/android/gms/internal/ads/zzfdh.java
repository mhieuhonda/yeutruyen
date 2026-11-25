package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdh implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;

    public zzfdh(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 39;
    }

    final /* synthetic */ zzfdf zzc() {
        boolean zIsActiveNetworkMetered;
        int i;
        Context context = this.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzc();
        int i2 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = iOrdinal;
            } else {
                i = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i = -2;
        }
        return new zzfdf(networkOperator, i, com.google.android.gms.ads.internal.zzt.zzf().zzk(context), phoneType, zIsActiveNetworkMetered, i2);
    }
}
