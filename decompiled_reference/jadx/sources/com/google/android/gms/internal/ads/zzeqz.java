package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeqz implements zzdei {
    boolean zza;
    final /* synthetic */ zzemd zzb;
    final /* synthetic */ zzcgd zzc;

    zzeqz(zzerc zzercVar, zzemd zzemdVar, zzcgd zzcgdVar) {
        this.zzb = zzemdVar;
        this.zzc = zzcgdVar;
        Objects.requireNonNull(zzercVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgF)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzeme(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzb(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzerc.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzerc.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}
