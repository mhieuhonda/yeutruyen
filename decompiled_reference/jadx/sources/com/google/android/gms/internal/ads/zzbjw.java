package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbjw extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdzt zzd;
    private CustomTabsSession zze;
    private CustomTabsClient zzf;

    private final void zzf(Context context) {
        String packageName;
        if (this.zzf != null || context == null || (packageName = CustomTabsClient.getPackageName(context, null)) == null || packageName.equals(context.getPackageName())) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new zzbjt(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdzt zzdztVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdztVar;
        zzf(context);
    }

    public final CustomTabsSession zzb() {
        if (this.zze == null) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfH)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbju
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i);
            }
        });
    }

    final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zze(int i) {
        zzdzt zzdztVar = this.zzd;
        if (zzdztVar != null) {
            zzdzs zzdzsVarZza = zzdztVar.zza();
            zzdzsVarZza.zzc("action", "cct_nav");
            zzdzsVarZza.zzc("cct_navs", String.valueOf(i));
            zzdzsVarZza.zzd();
        }
    }
}
