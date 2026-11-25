package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehv {
    private final Context zza;
    private final zzhcp zzb;
    private final zzhcp zzc;
    private final zzimt zzd;
    private final VersionInfoParcel zze;
    private final zzehr zzf;
    private final zzdzt zzg;

    zzehv(Context context, zzhcp zzhcpVar, zzhcp zzhcpVar2, zzimt zzimtVar, VersionInfoParcel versionInfoParcel, zzehr zzehrVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzhcpVar;
        this.zzc = zzhcpVar2;
        this.zzd = zzimtVar;
        this.zze = versionInfoParcel;
        this.zzf = zzehrVar;
        this.zzg = zzdztVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzeiq) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpN)).booleanValue()) {
                zzdzs zzdzsVarZza = this.zzg.zza();
                zzdzsVarZza.zzc("action", "ptard");
                zzdzsVarZza.zzc("ptard", "l");
                zzdzsVarZza.zzd();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpO)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeht
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
            return;
        }
        zzehs zzehsVar = new zzehs(this);
        zzehx zzehxVarZzb = this.zzf.zzb();
        zzehxVarZzb.zzb(zzehsVar);
        final zzegf zzegfVarZza = zzehxVarZzb.zza().zza();
        zzhcp zzhcpVar = this.zzb;
        Objects.requireNonNull(zzegfVarZza);
        zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzegfVarZza.zza();
            }
        });
    }

    final /* synthetic */ zzdzt zzd() {
        return this.zzg;
    }
}
