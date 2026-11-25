package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzceb {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzceg zzd;

    private zzceb() {
        throw null;
    }

    /* synthetic */ zzceb(byte[] bArr) {
    }

    public final zzceb zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzceb zzd(zzceg zzcegVar) {
        this.zzd = zzcegVar;
        return this;
    }

    public final zzceh zze() {
        zzinh.zzc(this.zza, Context.class);
        zzinh.zzc(this.zzb, Clock.class);
        zzinh.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzinh.zzc(this.zzd, zzceg.class);
        return new zzcec(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final zzceb zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzceb zzb(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }
}
