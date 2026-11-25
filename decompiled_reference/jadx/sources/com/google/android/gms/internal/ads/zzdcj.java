package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcj {
    private final Context zza;
    private final zzflg zzb;
    private final Bundle zzc;
    private final zzfkz zzd;
    private final zzdcc zze;
    private final zzemf zzf;

    /* synthetic */ zzdcj(zzdci zzdciVar, byte[] bArr) {
        this.zza = zzdciVar.zzh();
        this.zzb = zzdciVar.zzi();
        this.zzc = zzdciVar.zzj();
        this.zzd = zzdciVar.zzk();
        this.zze = zzdciVar.zzl();
        this.zzf = zzdciVar.zzm();
    }

    final zzdci zza() {
        zzdci zzdciVar = new zzdci();
        zzdciVar.zza(this.zza);
        zzdciVar.zzb(this.zzb);
        zzdciVar.zzc(this.zzc);
        zzdciVar.zzd(this.zze);
        zzdciVar.zzg(this.zzf);
        return zzdciVar;
    }

    final zzflg zzb() {
        return this.zzb;
    }

    final zzfkz zzc() {
        return this.zzd;
    }

    final Bundle zzd() {
        return this.zzc;
    }

    final zzdcc zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final zzemf zzg(String str) {
        zzemf zzemfVar = this.zzf;
        return zzemfVar != null ? zzemfVar : new zzemf(str);
    }
}
