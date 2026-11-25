package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzm {
    final zzfzp zza;
    final boolean zzb;

    private zzfzm(zzfzp zzfzpVar) {
        this.zza = zzfzpVar;
        this.zzb = zzfzpVar != null;
    }

    public static zzfzm zzb(Context context, String str, String str2) {
        zzfzp zzfznVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    IBinder iBinder = iBinderInstantiate;
                    if (iBinderInstantiate == null) {
                        zzfznVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfznVar = iInterfaceQueryLocalInterface instanceof zzfzp ? (zzfzp) iInterfaceQueryLocalInterface : new zzfzn(iBinderInstantiate);
                    }
                    zzfzp zzfzpVar = zzfznVar;
                    zzfznVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfzm(zzfznVar);
                } catch (Exception e) {
                    throw new zzfyp(e);
                }
            } catch (RemoteException | zzfyp | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfzm(new zzfzq());
            }
        } catch (Exception e2) {
            throw new zzfyp(e2);
        }
    }

    public static zzfzm zzc() {
        zzfzq zzfzqVar = new zzfzq();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfzm(zzfzqVar);
    }

    public final zzfzl zza(byte[] bArr) {
        return new zzfzl(this, bArr, null);
    }
}
