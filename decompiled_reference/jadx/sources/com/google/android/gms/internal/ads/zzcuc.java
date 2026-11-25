package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcuc implements zzdcz, zzden, zzddt, com.google.android.gms.ads.internal.client.zza, zzddp, zzdkx, zzdfu {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfky zze;
    private final zzfkn zzf;
    private final zzfsi zzg;
    private final zzflt zzh;
    private final zzbaw zzi;
    private final zzbke zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzdcc zzm;
    private final zzdfo zzn;
    private final zzdbv zzo;
    private final Set zzp;
    private boolean zzq;
    private final AtomicBoolean zzr = new AtomicBoolean();
    private zzcfl zzs = null;

    zzcuc(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfky zzfkyVar, zzfkn zzfknVar, zzfsi zzfsiVar, zzflt zzfltVar, View view, zzclb zzclbVar, zzbaw zzbawVar, zzbke zzbkeVar, zzbkg zzbkgVar, zzfqq zzfqqVar, zzdcc zzdccVar, zzdfo zzdfoVar, zzdbv zzdbvVar, Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfkyVar;
        this.zzf = zzfknVar;
        this.zzg = zzfsiVar;
        this.zzh = zzfltVar;
        this.zzi = zzbawVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzclbVar);
        this.zzj = zzbkeVar;
        this.zzm = zzdccVar;
        this.zzn = zzdfoVar;
        this.zzo = zzdbvVar;
        this.zzp = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmZ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzE(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer numZzu = com.google.android.gms.ads.internal.util.zzs.zzu(context);
                if (numZzu != null) {
                    Integer numValueOf = Integer.valueOf(Math.min(numZzu.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(numValueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcty
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String strZzj;
        int i;
        zzfkn zzfknVar = this.zzf;
        List list = zzfknVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpv)).booleanValue() && this.zzs == null) {
            this.zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs().zzm(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeB)).booleanValue()) {
            strZzj = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzj = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbi)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbkw.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfknVar, false, strZzj, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((Boolean) zzbkw.zzg.zze()).booleanValue() && ((i = zzfknVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzhcf.zzr((zzhbx) zzhcf.zzi(zzhbx.zzw(zzhcf.zza(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbM)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzctw(this, strZzj), this.zzb);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbi)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbkw.zzd.zze()).booleanValue()) {
            zzhcf.zzr((zzhbx) zzhcf.zzg(zzhbx.zzw(this.zzj.zzb()), Throwable.class, zzcub.zza, zzcfy.zzh), new zzctv(this), this.zzb);
            return;
        }
        zzflt zzfltVar = this.zzh;
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zzb(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzt(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
        zzfsi zzfsiVar = this.zzg;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zzc(zzfknVar, zzfknVar.zzh, zzcbwVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeK)).intValue();
            if (iIntValue > 0) {
                zzy(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeL)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeJ)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzg() {
        zzdcc zzdccVar;
        if (this.zzq) {
            ArrayList arrayList = new ArrayList(zzp());
            zzfkn zzfknVar = this.zzf;
            arrayList.addAll(zzfknVar.zzf);
            this.zzh.zza(this.zzg.zzb(this.zze, zzfknVar, true, null, null, arrayList, null, null), null);
        } else {
            zzflt zzfltVar = this.zzh;
            zzfsi zzfsiVar = this.zzg;
            zzfky zzfkyVar = this.zze;
            zzfkn zzfknVar2 = this.zzf;
            zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar2, zzfknVar2.zzm), null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeG)).booleanValue() && (zzdccVar = this.zzm) != null) {
                List list = zzdccVar.zzb().zzm;
                String strZzg = zzdccVar.zzc().zzg();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(zzfsi.zzd((String) it.next(), "@gw_adnetstatus@", strZzg));
                }
                long jZzh = zzdccVar.zzc().zzh();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(zzfsi.zzd((String) it2.next(), "@gw_ttr@", Long.toString(jZzh, 10)));
                }
                zzfltVar.zza(zzfsiVar.zza(zzdccVar.zza(), zzdccVar.zzb(), arrayList3), null);
            }
            zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar2, zzfknVar2.zzf), null);
        }
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzi() {
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcl)).booleanValue()) {
            int i = zzeVar.zza;
            zzfkn zzfknVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfknVar.zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(zzfsi.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfknVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfu
    public final void zzk() {
        zzfkn zzfknVar = this.zzf;
        if (zzfknVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfknVar, zzfknVar.zzaA), null);
        }
    }

    final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcua
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo();
            }
        });
    }

    final /* synthetic */ void zzm(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(i, i2);
            }
        });
    }

    final /* synthetic */ void zzn(int i, int i2) {
        zzy(i - 1, i2);
    }

    final /* synthetic */ Context zzq() {
        return this.zza;
    }

    final /* synthetic */ zzfky zzr() {
        return this.zze;
    }

    final /* synthetic */ zzfkn zzs() {
        return this.zzf;
    }

    final /* synthetic */ zzfsi zzt() {
        return this.zzg;
    }

    final /* synthetic */ zzflt zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzdfo zzv() {
        return this.zzn;
    }

    final /* synthetic */ zzdbv zzw() {
        return this.zzo;
    }

    final /* synthetic */ zzcfl zzx() {
        return this.zzs;
    }
}
