package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesl extends com.google.android.gms.ads.internal.client.zzbp {
    final zzflf zza;
    final zzdqk zzb;
    private final Context zzc;
    private final zzcnq zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzesl(zzcnq zzcnqVar, Context context, String str) {
        zzflf zzflfVar = new zzflf();
        this.zza = zzflfVar;
        this.zzb = new zzdqk();
        this.zzd = zzcnqVar;
        zzflfVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdql zzdqlVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdqlVarZzg.zzh();
        zzflf zzflfVar = this.zza;
        zzflfVar.zzm(arrayListZzh);
        zzflfVar.zzn(zzdqlVarZzg.zzi());
        if (zzflfVar.zzf() == null) {
            zzflfVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new zzesm(this.zzc, this.zzd, zzflfVar, zzdqlVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbng zzbngVar) {
        this.zzb.zzb(zzbngVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbnj zzbnjVar) {
        this.zzb.zza(zzbnjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) {
        this.zzb.zzf(str, zzbnpVar, zzbnmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbma zzbmaVar) {
        this.zza.zzo(zzbmaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbnt zzbntVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbntVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbnw zzbnwVar) {
        this.zzb.zzc(zzbnwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbsi zzbsiVar) {
        this.zza.zzq(zzbsiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbsr zzbsrVar) {
        this.zzb.zze(zzbsrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zza.zzab(zzcpVar);
    }
}
