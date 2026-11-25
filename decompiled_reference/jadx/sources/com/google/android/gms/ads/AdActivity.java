package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbzi zza;

    private final void zza() {
        zzbzi zzbziVar = this.zza;
        if (zzbziVar != null) {
            try {
                zzbziVar.zzs();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzm(i, i2, intent);
            }
        } catch (Exception e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null && !zzbziVar.zzg()) {
                return;
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbzi zzbziVar2 = this.zza;
            if (zzbziVar2 != null) {
                zzbziVar2.zze();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzn(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzo.zzd("AdActivity onCreate");
        zzbzi zzbziVarZzg = zzay.zzb().zzg(this);
        this.zza = zzbziVarZzg;
        if (zzbziVarZzg == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbziVarZzg.zzh(bundle);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        zzo.zzd("AdActivity onDestroy");
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzq();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        zzo.zzd("AdActivity onPause");
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzl();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzH(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        zzo.zzd("AdActivity onRestart");
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzi();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzk();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzo(bundle);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        zzo.zzd("AdActivity onStart");
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzj();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        zzo.zzd("AdActivity onStop");
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzp();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzi zzbziVar = this.zza;
            if (zzbziVar != null) {
                zzbziVar.zzf();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
