package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzczq implements zzden, com.google.android.gms.ads.internal.client.zza, zzdgf, zzddt, zzdcz, zzdiq {
    private final Clock zza;
    private final zzcfe zzb;

    public zzczq(Clock clock, zzcfe zzcfeVar) {
        this.zza = clock;
        this.zzb = zzcfeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzj(zzbic.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzk(zzbic.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzl(zzbic.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzm(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzo() {
    }

    public final String zzp() {
        return this.zzb.zzj();
    }
}
