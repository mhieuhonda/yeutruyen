package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfup extends zzccv {
    private zzccp zza;
    private zzfsz zzb;
    private String zzc;

    zzfup(zzccp zzccpVar, zzfsz zzfszVar, String str) {
        this.zza = zzccpVar;
        this.zzb = zzfszVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() {
        zzfsz zzfszVar = this.zzb;
        zzccp zzccpVar = this.zza;
        if (zzccpVar == null || zzfszVar == null) {
            return;
        }
        zzfszVar.zza(zzccpVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsz zzfszVar = this.zzb;
        if (this.zza == null || zzfszVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfty) zzfszVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
