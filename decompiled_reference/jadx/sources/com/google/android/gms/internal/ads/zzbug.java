package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbug {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbup zzc;
    private zzbup zzd;

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(Context context) {
        if (((Boolean) zzbld.zzc.zze()).booleanValue()) {
            return false;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzk(zzd(context)).zza().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbup zza(Context context, VersionInfoParcel versionInfoParcel, zzfqt zzfqtVar) {
        zzbup zzbupVar;
        String str;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                Context contextZzd = zzd(context);
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzc);
                } else {
                    str = (String) zzblh.zza.zze();
                }
                this.zzd = new zzbup(contextZzd, versionInfoParcel, str, zzfqtVar);
            }
            zzbupVar = this.zzd;
        }
        return zzbupVar;
    }

    public final zzbup zzb(Context context, VersionInfoParcel versionInfoParcel, zzfqt zzfqtVar) {
        zzbup zzbupVar;
        String str;
        synchronized (this.zza) {
            if (this.zzc == null) {
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzc);
                } else if (((Boolean) zzbld.zzh.zze()).booleanValue()) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zza);
                } else {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzb);
                }
                this.zzc = new zzbup(zzd(context), versionInfoParcel, str, zzfqtVar);
            }
            zzbupVar = this.zzc;
        }
        return zzbupVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            zzbup zzbupVar = this.zzc;
            if (zzbupVar != null) {
                zzbupVar.zzc();
                this.zzc = null;
            }
        }
    }
}
