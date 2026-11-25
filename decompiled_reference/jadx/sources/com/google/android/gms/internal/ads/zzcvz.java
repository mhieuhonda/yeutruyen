package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzcvz {
    private final zzcxy zza;
    private final View zzb;
    private final zzfko zzc;
    private final zzclb zzd;

    public zzcvz(View view, zzclb zzclbVar, zzcxy zzcxyVar, zzfko zzfkoVar) {
        this.zzb = view;
        this.zzd = zzclbVar;
        this.zza = zzcxyVar;
        this.zzc = zzfkoVar;
    }

    public final zzclb zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcxy zzc() {
        return this.zza;
    }

    public final zzfko zzd() {
        return this.zzc;
    }

    public zzdel zze(Set set) {
        return new zzdel(set);
    }
}
