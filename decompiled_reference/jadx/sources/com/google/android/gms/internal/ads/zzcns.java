package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcns {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzcns(zzcnr zzcnrVar, byte[] bArr) {
        this.zza = zzcnrVar.zzd();
        this.zzb = zzcnrVar.zze();
        this.zzd = zzcnrVar.zzg();
        this.zzc = zzcnrVar.zzf();
    }

    final Context zza() {
        return this.zzb;
    }

    final Context zzb() {
        return this.zzb;
    }

    final WeakReference zzc() {
        return this.zzd;
    }

    final VersionInfoParcel zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }

    final zzcnp zzf() {
        return new zzcnp(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    final zzblr zzh() {
        return new zzblr(this.zzb);
    }

    final long zzi() {
        return this.zzc;
    }
}
