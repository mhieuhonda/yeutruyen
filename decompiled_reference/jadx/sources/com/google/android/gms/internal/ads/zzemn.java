package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzemn implements zzdnw {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfkn zzc;
    private final zzclb zzd;
    private final zzflg zze;
    private final zzbqa zzf;
    private final boolean zzg;
    private final zzekz zzh;
    private final zzdzt zzi;

    zzemn(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfkn zzfknVar, zzclb zzclbVar, zzflg zzflgVar, boolean z, zzbqa zzbqaVar, zzekz zzekzVar, zzdzt zzdztVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfknVar;
        this.zzd = zzclbVar;
        this.zze = zzflgVar;
        this.zzg = z;
        this.zzf = zzbqaVar;
        this.zzh = zzekzVar;
        this.zzi = zzdztVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z, Context context, zzddm zzddmVar) {
        boolean z2;
        zzcvd zzcvdVar = (zzcvd) zzhcf.zzt(this.zzb);
        zzclb zzclbVar = this.zzd;
        zzclbVar.zzag(true);
        boolean z3 = this.zzg;
        boolean zZzc = z3 ? this.zzf.zzc(true) : true;
        boolean z4 = false;
        if (!z3) {
            z2 = z4;
        } else if (this.zzf.zzd()) {
            z4 = true;
            z2 = z4;
        } else {
            z2 = false;
            z4 = true;
        }
        float fZze = z4 ? this.zzf.zze() : 0.0f;
        zzfkn zzfknVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, true, z2, fZze, -1, z, zzfknVar.zzO, false);
        if (zzddmVar != null) {
            zzddmVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdnl zzdnlVarZzj = zzcvdVar.zzj();
        int i = zzfknVar.zzQ;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i3 = zzxVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfknVar.zzB;
        zzfks zzfksVar = zzfknVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdnlVarZzj, null, zzclbVar, i, versionInfoParcel, str, zzlVar, zzfksVar.zzb, zzfksVar.zza, this.zze.zzg, zzddmVar, zzfknVar.zzb() ? this.zzh : null, zzclbVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzc;
    }
}
