package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.lifecycle.AtomicReference$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfmc {
    private static zzfmc zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcv zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfmc(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzb = context;
        this.zzc = zzcvVar;
    }

    public static zzfmc zza(Context context) {
        synchronized (zzfmc.class) {
            zzfmc zzfmcVar = zza;
            if (zzfmcVar != null) {
                return zzfmcVar;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) zzbky.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcv zzcvVarZzf = null;
            if (jLongValue > 0 && jLongValue <= 254730000) {
                zzcvVarZzf = zzf(applicationContext);
            }
            zzfmc zzfmcVar2 = new zzfmc(applicationContext, zzcvVarZzf);
            zza = zzfmcVar2;
            return zzfmcVar2;
        }
    }

    static com.google.android.gms.ads.internal.client.zzcv zzf(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcu.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzez zzg() {
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar != null) {
            try {
                return zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzez zzezVarZzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(261710000, i2, true, zZzH);
        return (((Boolean) zzbky.zzc.zze()).booleanValue() && (zzezVarZzg = zzg()) != null) ? new VersionInfoParcel(261710000, zzezVarZzg.zza(), true, zZzH) : versionInfoParcel;
    }

    public final void zzc(zzbvj zzbvjVar) {
        zzbvj adapterCreator;
        if (!((Boolean) zzbky.zza.zze()).booleanValue()) {
            AtomicReference$$ExternalSyntheticBackportWithForwarding0.m(this.zzd, null, zzbvjVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbvjVar = adapterCreator;
        }
        AtomicReference$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zzbvjVar);
    }

    public final zzbvj zzd() {
        return (zzbvj) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzez zzezVarZzg = zzg();
        if (zzezVarZzg != null) {
            return zzezVarZzg.zzb();
        }
        return null;
    }
}
