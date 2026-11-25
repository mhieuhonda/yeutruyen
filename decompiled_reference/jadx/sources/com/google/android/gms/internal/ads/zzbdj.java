package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdj extends zzbdm {
    private final View zzh;

    public zzbdj(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2, View view) {
        super(zzbbzVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", zzaxtVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeu);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmD);
            zzbcd zzbcdVar = new zzbcd((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzayr zzayrVarZza = zzays.zza();
            zzayrVarZza.zzb(zzbcdVar.zza.longValue());
            zzayrVarZza.zzc(zzbcdVar.zzb.longValue());
            zzayrVarZza.zzd(zzbcdVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzayrVarZza.zza(zzbcdVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzayrVarZza.zze(zzbcdVar.zzd.longValue());
            }
            this.zzd.zzM((zzays) zzayrVarZza.zzbu());
        }
    }
}
