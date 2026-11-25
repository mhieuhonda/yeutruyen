package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzced implements zzbex {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzced(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z) {
        zzceg zzcegVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (zzcegVarZzD.zzb(context)) {
            synchronized (this.zzb) {
                if (this.zzd == z) {
                    return;
                }
                this.zzd = z;
                String str = this.zzc;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzt.zzD().zze(context, str);
                } else {
                    com.google.android.gms.ads.internal.zzt.zzD().zzf(context, str);
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        zza(zzbewVar.zzj);
    }
}
