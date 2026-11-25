package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenj implements zzemg {
    private final Context zza;
    private final zzcwx zzb;
    private View zzc;
    private zzbvs zzd;

    public zzenj(Context context, zzcwx zzcwxVar) {
        this.zza = context;
        this.zzb = zzcwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final void zza(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.zzb;
            zzbxiVar.zzo(zzfknVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
                String str = zzfknVar.zzU;
                String string = zzfknVar.zzv.toString();
                zzflg zzflgVar = zzfkyVar.zza.zza;
                zzbxiVar.zzq(str, string, zzflgVar.zzd, ObjectWrapper.wrap(this.zza), new zzeni(this, zzemdVar, null), (zzbvp) zzemdVar.zzc, zzflgVar.zzf);
                return;
            }
            String str2 = zzfknVar.zzU;
            String string2 = zzfknVar.zzv.toString();
            zzflg zzflgVar2 = zzfkyVar.zza.zza;
            zzbxiVar.zzi(str2, string2, zzflgVar2.zzd, ObjectWrapper.wrap(this.zza), new zzeni(this, zzemdVar, null), (zzbvp) zzemdVar.zzc, zzflgVar2.zzf);
        } catch (RemoteException e) {
            throw new zzfln(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzemg
    public final /* bridge */ /* synthetic */ Object zzb(zzfky zzfkyVar, final zzfkn zzfknVar, final zzemd zzemdVar) throws zzepp, zzfln {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjf)).booleanValue() && zzfknVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfln(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeng
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zzc(view, zzfknVar, obj);
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
            view = this.zzc;
        }
        zzcvt zzcvtVarZzf = this.zzb.zzf(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.zza), new zzcvz(view, null, new zzcxy() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // com.google.android.gms.internal.ads.zzcxy
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() throws zzfln {
                try {
                    return ((zzbxi) zzemdVar.zzb).zzh();
                } catch (RemoteException e3) {
                    throw new zzfln(e3);
                }
            }
        }, (zzfko) zzfknVar.zzu.get(0)));
        zzcvtVarZzf.zzk().zza(view);
        ((zzenp) zzemdVar.zzc).zzc(zzcvtVarZzf.zzg());
        return zzcvtVarZzf.zzi();
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfkn zzfknVar, Object obj) {
        return zzhcf.zza(zzcxm.zza(this.zza, view, zzfknVar));
    }

    final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    final /* synthetic */ void zze(zzbvs zzbvsVar) {
        this.zzd = zzbvsVar;
    }
}
