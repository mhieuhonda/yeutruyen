package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerx {
    private final zzdno zza;

    public zzerx(zzdno zzdnoVar) {
        this.zza = zzdnoVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfky zzfkyVar, zzfkn zzfknVar, View view, zzert zzertVar) {
        zzerv zzervVar = new zzerv(this, new zzeru(this, zzfknVar));
        zzdmi zzdmiVarZzd = this.zza.zzd(new zzcyq(zzfkyVar, zzfknVar, null), zzervVar);
        zzertVar.zzd(new zzerw(this, zzdmiVarZzd));
        return zzdmiVarZzd.zzh();
    }
}
