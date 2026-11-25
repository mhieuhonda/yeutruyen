package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbg implements zzdgf, zzdls {
    private final Context zza;
    private final zzflg zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzece zze;
    private final zzfqt zzf;
    private final zzecz zzg;

    public zzdbg(Context context, zzflg zzflgVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzece zzeceVar, zzfqt zzfqtVar, zzecz zzeczVar) {
        this.zza = context;
        this.zzb = zzflgVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzeceVar;
        this.zzf = zzfqtVar;
        this.zzg = zzeczVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfb)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzflg zzflgVar = this.zzb;
            zzfqt zzfqtVar = this.zzf;
            zzecz zzeczVar = this.zzg;
            com.google.android.gms.ads.internal.zzt.zzl().zzb(context, versionInfoParcel, zzflgVar.zzg, zzgVar.zzi(), zzfqtVar, zzeczVar.zzs());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfc)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
    }
}
