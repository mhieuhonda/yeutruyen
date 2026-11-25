package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdob implements zzdcz, zzdkl {
    private final zzced zza;
    private final Context zzb;
    private final zzceg zzc;
    private final View zzd;
    private String zze;
    private final zzbic.zza.EnumC0012zza zzf;
    private final zzfkn zzg;

    public zzdob(zzced zzcedVar, Context context, zzceg zzcegVar, View view, zzbic.zza.EnumC0012zza enumC0012zza, zzfkn zzfknVar) {
        this.zza = zzcedVar;
        this.zzb = context;
        this.zzc = zzcegVar;
        this.zzd = view;
        this.zzf = enumC0012zza;
        this.zzg = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    @ParametersAreNonnullByDefault
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
        zzceg zzcegVar = this.zzc;
        Context context = this.zzb;
        if (zzcegVar.zzb(context) && this.zzg.zzaG) {
            try {
                zzcegVar.zzp(context, zzcegVar.zzk(context), this.zza.zzb(), zzcbwVar.zzb(), zzcbwVar.zzc());
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzh(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
        zzbic.zza.EnumC0012zza enumC0012zza = this.zzf;
        if (enumC0012zza != zzbic.zza.EnumC0012zza.APP_OPEN && this.zzg.zzaG) {
            String strZzg = this.zzc.zzg(this.zzb);
            this.zze = strZzg;
            zzbic.zza.EnumC0012zza enumC0012zza2 = zzbic.zza.EnumC0012zza.REWARD_BASED_VIDEO_AD;
            String.valueOf(strZzg);
            this.zze = String.valueOf(strZzg).concat(enumC0012zza == enumC0012zza2 ? "/Rewarded" : "/Interstitial");
        }
    }
}
