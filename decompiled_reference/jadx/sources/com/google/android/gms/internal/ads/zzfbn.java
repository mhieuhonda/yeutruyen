package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbn implements zzfcq {
    private zzgcr zza;
    private zzgcr zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzfbn(zzgcr zzgcrVar, zzgcr zzgcrVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzgcrVar;
        this.zzb = zzgcrVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    public zzfbn(boolean z) {
        this.zzf = z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[DONT_INVERT] */
    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zze) {
            return;
        }
        Bundle bundleZza = zzflv.zza(bundle, "pii");
        boolean z = this.zzf;
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzed)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zza());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zzb());
                }
            } else if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzef)).booleanValue()) {
                    if (this.zza.zzc()) {
                        bundleZza.putString("paidv1_id_android", this.zza.zza());
                        bundleZza.putLong("paidv1_creation_time_android", this.zza.zzb());
                    }
                }
            }
        } else if (z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzef)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zza());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zzb());
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzee)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zza());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zzb());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            } else if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeg)).booleanValue()) {
                    if (this.zzb.zzc()) {
                        bundleZza.putString("paidv2_id_android", this.zzb.zza());
                        bundleZza.putLong("paidv2_creation_time_android", this.zzb.zzb());
                    }
                    bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                    bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
                }
            }
        } else if (z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeg)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zza());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zzb());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            }
        }
        if (bundleZza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleZza);
    }
}
