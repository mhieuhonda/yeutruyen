package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftj extends com.google.android.gms.ads.internal.client.zzbj {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private zzfsz zzb;
    private String zzc;

    zzftj(com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfsz zzfszVar, String str) {
        this.zza = zzbuVar;
        this.zzb = zzfszVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        zzfsz zzfszVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zza;
        if (zzbuVar == null || zzfszVar == null) {
            return;
        }
        zzfszVar.zza(zzbuVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsz zzfszVar = this.zzb;
        if (this.zza == null || zzfszVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzc;
        StringBuilder sb = new StringBuilder(string.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfty) zzfszVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
