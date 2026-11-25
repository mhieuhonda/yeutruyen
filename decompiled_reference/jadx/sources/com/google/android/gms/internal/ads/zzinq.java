package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzinq extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzinq(zzbjy zzbjyVar) {
        this.zza = new WeakReference(zzbjyVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbjy zzbjyVar = (zzbjy) this.zza.get();
        if (zzbjyVar != null) {
            zzbjyVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjy zzbjyVar = (zzbjy) this.zza.get();
        if (zzbjyVar != null) {
            zzbjyVar.zzg();
        }
    }
}
