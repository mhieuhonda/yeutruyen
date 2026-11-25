package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeqj implements zzdnw {
    private final Context zza;
    private final zzdwq zzb;
    private final zzflg zzc;
    private final VersionInfoParcel zzd;
    private final zzfkn zze;
    private final ListenableFuture zzf;
    private final zzclb zzg;
    private final zzbqa zzh;
    private final boolean zzi;
    private final zzekz zzj;
    private final zzdzo zzk;
    private final zzdzt zzl;

    zzeqj(Context context, zzdwq zzdwqVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel, zzfkn zzfknVar, ListenableFuture listenableFuture, zzclb zzclbVar, zzbqa zzbqaVar, boolean z, zzekz zzekzVar, zzdzo zzdzoVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzdwqVar;
        this.zzc = zzflgVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfknVar;
        this.zzf = listenableFuture;
        this.zzg = zzclbVar;
        this.zzh = zzbqaVar;
        this.zzi = z;
        this.zzj = zzekzVar;
        this.zzk = zzdzoVar;
        this.zzl = zzdztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z, Context context, zzddm zzddmVar) {
        boolean z2;
        zzdvv zzdvvVar = (zzdvv) zzhcf.zzt(this.zzf);
        try {
            zzfkn zzfknVar = this.zze;
            final zzclb zzclbVarZza = this.zzg;
            if (zzclbVarZza.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbD)).booleanValue()) {
                    zzclbVarZza = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbqq.zzb(zzclbVarZza, zzdvvVar.zzk());
                    final zzdwu zzdwuVar = new zzdwu();
                    zzdvvVar.zzl().zzi(zzclbVarZza, true, this.zzi ? this.zzh : null, this.zzk);
                    zzclbVarZza.zzP().zzG(new zzcmx(zzdwuVar, zzclbVarZza) { // from class: com.google.android.gms.internal.ads.zzeqi
                        private final /* synthetic */ zzclb zza;

                        {
                            this.zza = zzclbVarZza;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcmx
                        public final /* synthetic */ void zza(boolean z3, int i, String str, String str2) {
                            zzclb zzclbVar = this.zza;
                            zzclbVar.zzJ();
                            zzclbVar.zzP().zzq();
                        }
                    });
                    zzcmz zzcmzVarZzP = zzclbVarZza.zzP();
                    Objects.requireNonNull(zzclbVarZza);
                    zzcmzVarZzP.zzH(new zzcmy() { // from class: com.google.android.gms.internal.ads.zzeqh
                        @Override // com.google.android.gms.internal.ads.zzcmy
                        public final /* synthetic */ void zza() {
                            zzclbVarZza.zzI();
                        }
                    });
                    zzfks zzfksVar = zzfknVar.zzs;
                    zzclbVarZza.zzau(zzfksVar.zzb, zzfksVar.zza, null);
                }
            }
            zzclb zzclbVar = zzclbVarZza;
            zzclbVar.zzag(true);
            boolean z3 = this.zzi;
            boolean z4 = false;
            boolean zZzc = z3 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
            if (!z3) {
                z2 = z4;
            } else if (this.zzh.zzd()) {
                z4 = true;
                z2 = z4;
            } else {
                z2 = false;
                z4 = true;
            }
            float fZze = z4 ? this.zzh.zze() : 0.0f;
            zzfkn zzfknVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzL, z2, fZze, -1, z, zzfknVar2.zzO, zzfknVar2.zzP);
            if (zzddmVar != null) {
                zzddmVar.zzb();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdnl zzdnlVarZzj = zzdvvVar.zzj();
            int i = zzfknVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfknVar2.zzB;
            zzfks zzfksVar2 = zzfknVar2.zzs;
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdnlVarZzj, null, zzclbVar, i, versionInfoParcel, str, zzlVar, zzfksVar2.zzb, zzfksVar2.zza, this.zzc.zzg, zzddmVar, zzfknVar2.zzb() ? this.zzj : null, zzclbVar.zzn()), true, this.zzl);
        } catch (zzclq e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zze;
    }
}
