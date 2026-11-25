package com.google.android.gms.internal.ads;

import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import androidx.core.os.BuildCompat;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasg extends zzase {
    private int zza = 0;
    private final Context zzb;
    private final String zzc;
    private zzbeq zzd;
    private ServiceConnection zze;

    public zzasg(Context context) {
        this.zzb = context.getApplicationContext();
        String packageName = (BuildCompat.isAtLeastU() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? ((SdkSandboxController) context.getSystemService(SdkSandboxController.class)).getClientPackageName() : context.getPackageName();
        this.zzc = packageName;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final boolean zza() {
        return (this.zza != 2 || this.zzd == null || this.zze == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzb(zzash zzashVar) {
        if (zza()) {
            zzasj.zza("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            zzashVar.zza(0);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            zzasj.zzb("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            zzashVar.zza(3);
            return;
        }
        if (i == 3) {
            zzasj.zzb("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            zzashVar.zza(3);
            return;
        }
        zzasj.zza("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.zzb;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    try {
                        if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                            Intent intent2 = new Intent(intent);
                            zzasf zzasfVar = new zzasf(this, zzashVar, null);
                            this.zze = zzasfVar;
                            try {
                                if (this.zzb.bindService(intent2, zzasfVar, 1)) {
                                    zzasj.zza("InstallReferrerClient", "Service was bonded successfully.");
                                    return;
                                }
                                zzasj.zzb("InstallReferrerClient", "Connection to service is blocked.");
                                this.zza = 0;
                                zzashVar.zza(1);
                                return;
                            } catch (SecurityException unused) {
                                zzasj.zzb("InstallReferrerClient", "No permission to connect to service.");
                                this.zza = 0;
                                zzashVar.zza(4);
                                return;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                zzasj.zzb("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.zza = 0;
                zzashVar.zza(2);
                return;
            }
        }
        this.zza = 0;
        zzasj.zza("InstallReferrerClient", "Install Referrer service unavailable on device.");
        zzashVar.zza(2);
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzc() {
        this.zza = 3;
        if (this.zze != null) {
            zzasj.zza("InstallReferrerClient", "Unbinding from service.");
            this.zzb.unbindService(this.zze);
            this.zze = null;
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final zzasi zzd() throws RemoteException {
        if (!zza()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.zzc);
        try {
            return new zzasi(this.zzd.zze(bundle));
        } catch (RemoteException e) {
            zzasj.zzb("InstallReferrerClient", "RemoteException getting install referrer information");
            this.zza = 0;
            throw e;
        }
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzf(zzbeq zzbeqVar) {
        this.zzd = zzbeqVar;
    }
}
