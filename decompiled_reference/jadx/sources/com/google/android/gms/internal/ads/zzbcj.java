package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcj extends zzbdm {
    private final Activity zzh;
    private final View zzi;

    public zzbcj(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2, View view, Activity activity) {
        super(zzbbzVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", zzaxtVar, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdD)).booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, Boolean.valueOf(zBooleanValue));
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzS(((Long) objArr[0]).longValue());
            zzaxtVar.zzT(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                zzaxtVar.zzU((String) objArr[2]);
            }
        }
    }
}
