package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzenu implements zzdnw {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfkn zzd;
    private final zzclb zze;
    private final zzflg zzf;
    private final zzbqa zzg;
    private final boolean zzh;
    private final zzekz zzi;
    private final zzdzt zzj;

    zzenu(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfkn zzfknVar, zzclb zzclbVar, zzflg zzflgVar, boolean z, zzbqa zzbqaVar, zzekz zzekzVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfknVar;
        this.zze = zzclbVar;
        this.zzf = zzflgVar;
        this.zzg = zzbqaVar;
        this.zzh = z;
        this.zzi = zzekzVar;
        this.zzj = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z, Context context, zzddm zzddmVar) {
        boolean z2;
        zzdmi zzdmiVar = (zzdmi) zzhcf.zzt(this.zzc);
        zzclb zzclbVar = this.zze;
        zzclbVar.zzag(true);
        boolean z3 = this.zzh;
        boolean z4 = false;
        boolean zZzc = z3 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
        if (!z3) {
            z2 = z4;
        } else if (this.zzg.zzd()) {
            z4 = true;
            z2 = z4;
        } else {
            z2 = false;
            z4 = true;
        }
        float fZze = z4 ? this.zzg.zze() : 0.0f;
        zzfkn zzfknVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzL, z2, fZze, -1, z, zzfknVar.zzO, false);
        if (zzddmVar != null) {
            zzddmVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdnl zzdnlVarZzj = zzdmiVar.zzj();
        int i = zzfknVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfknVar.zzB;
        zzfks zzfksVar = zzfknVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdnlVarZzj, null, zzclbVar, i, versionInfoParcel, str, zzlVar, zzfksVar.zzb, zzfksVar.zza, this.zzf.zzg, zzddmVar, zzfknVar.zzb() ? this.zzi : null, zzclbVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzd;
    }
}
