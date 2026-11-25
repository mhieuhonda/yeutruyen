package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcvv extends zzcvs {
    private final Context zzc;
    private final View zzd;
    private final zzclb zze;
    private final zzfko zzf;
    private final zzcxy zzg;
    private final zzdql zzh;
    private final zzdli zzi;
    private final zzimt zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    zzcvv(zzcxz zzcxzVar, Context context, zzfko zzfkoVar, View view, zzclb zzclbVar, zzcxy zzcxyVar, zzdql zzdqlVar, zzdli zzdliVar, zzimt zzimtVar, Executor executor) {
        super(zzcxzVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzclbVar;
        this.zzf = zzfkoVar;
        this.zzg = zzcxyVar;
        this.zzh = zzdqlVar;
        this.zzi = zzdliVar;
        this.zzj = zzimtVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzclb zzclbVar;
        if (viewGroup == null || (zzclbVar = this.zze) == null) {
            return;
        }
        zzclbVar.zzaf(zzcnl.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final com.google.android.gms.ads.internal.client.zzea zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfln unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final zzfko zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzflm.zzb(zzrVar);
        }
        zzfkn zzfknVar = this.zzb;
        if (zzfknVar.zzac) {
            for (String str : zzfknVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfko(view.getWidth(), view.getHeight(), false);
        }
        return (zzfko) zzfknVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final zzfko zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjf)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjg)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    final /* synthetic */ void zzk() {
        zzbnt zzbntVarZzd = this.zzh.zzd();
        if (zzbntVarZzd == null) {
            return;
        }
        try {
            zzbntVarZzd.zze((com.google.android.gms.ads.internal.client.zzbu) this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
