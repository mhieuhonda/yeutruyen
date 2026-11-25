package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwa implements zzfvt {
    private static zzfwa zza;
    private float zzb = 0.0f;
    private zzfvo zzc;
    private zzfvs zzd;

    public zzfwa(zzfvp zzfvpVar, zzfvl zzfvlVar) {
    }

    public static zzfwa zza() {
        if (zza == null) {
            zza = new zzfwa(new zzfvp(), new zzfvl());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zzc = new zzfvo(new Handler(), context, new zzfvk(), this);
    }

    public final void zzc() {
        zzfvr.zza().zzg(this);
        zzfvr.zza().zze();
        zzfxc.zzb().zzc();
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfvt
    public final void zzd(boolean z) {
        if (z) {
            zzfxc.zzb().zzc();
        } else {
            zzfxc.zzb().zze();
        }
    }

    public final void zze() {
        zzfxc.zzb().zzd();
        zzfvr.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = zzfvs.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfuy) it.next()).zzg().zzo(f);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
