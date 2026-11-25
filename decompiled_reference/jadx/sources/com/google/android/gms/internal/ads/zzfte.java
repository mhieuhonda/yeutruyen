package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfte extends zzbgs {
    private zzfsz zza;
    private String zzb;

    zzfte(zzfsz zzfszVar, String str) {
        this.zza = zzfszVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzb(zzbgq zzbgqVar) {
        zzfsz zzfszVar = this.zza;
        if (zzfszVar == null) {
            return;
        }
        zzfszVar.zza(zzbgqVar);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzc(int i) {
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsz zzfszVar = this.zza;
        if (zzfszVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(string.length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfty) zzfszVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
    }
}
