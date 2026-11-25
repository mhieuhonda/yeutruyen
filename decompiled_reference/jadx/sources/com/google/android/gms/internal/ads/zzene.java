package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzene implements zzemg {
    private final Context zza;
    private final zzcwx zzb;
    private final Executor zzc;

    public zzene(Context context, zzcwx zzcwxVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcwxVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzflg zzflgVar = zzfkyVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzflgVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzflm.zza(this.zza, zzfknVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
            ((zzfme) zzemdVar.zzb).zzb(this.zza, zzrVar3, zzflgVar.zzd, zzfknVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfknVar.zzs), (zzbvp) zzemdVar.zzc);
        } else {
            ((zzfme) zzemdVar.zzb).zzg(this.zza, zzrVar3, zzflgVar.zzd, zzfknVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfknVar.zzs), (zzbvp) zzemdVar.zzc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, final zzfkn zzfknVar, zzemd zzemdVar) throws zzepp, zzfln {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
            zzbvs zzbvsVarZzc = ((zzfme) zzemdVar.zzb).zzc();
            if (zzbvsVarZzc == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfln(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbvsVarZzc.zze());
                boolean zZzf = zzbvsVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfln(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzenc
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfknVar, obj);
                            }
                        }, zzcfy.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfln(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfln(e2);
            }
        } else {
            viewZza = ((zzfme) zzemdVar.zzb).zza();
        }
        zzcwx zzcwxVar = this.zzb;
        zzcyq zzcyqVar = new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza);
        final zzfme zzfmeVar = (zzfme) zzemdVar.zzb;
        Objects.requireNonNull(zzfmeVar);
        zzcvt zzcvtVarZzf = zzcwxVar.zzf(zzcyqVar, new zzcvz(viewZza, null, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzend
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzfmeVar.zzt();
            }
        }, (zzfko) zzfknVar.zzu.get(0)));
        zzcvtVarZzf.zzk().zza(viewZza);
        zzcvtVarZzf.zza().zzq(new zzctg(zzfmeVar), this.zzc);
        ((zzenp) zzemdVar.zzc).zzc(zzcvtVarZzf.zzf());
        return zzcvtVarZzf.zzi();
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfkn zzfknVar, Object obj) {
        return zzhcf.zza(zzcxm.zza(this.zza, view, zzfknVar));
    }
}
