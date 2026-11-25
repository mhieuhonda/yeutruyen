package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeps implements zzhbn {
    private final zzfps zza;
    private final zzddb zzb;
    private final zzfsi zzc;
    private final zzfsm zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcyd zzg;
    private final zzepl zzh;
    private final zzemf zzi;
    private final Context zzj;
    private final zzfqq zzk;
    private final zzeov zzl;
    private final zzdzo zzm;

    zzeps(Context context, zzfps zzfpsVar, zzepl zzeplVar, zzddb zzddbVar, zzfsi zzfsiVar, zzfsm zzfsmVar, zzcyd zzcydVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzemf zzemfVar, zzfqq zzfqqVar, zzeov zzeovVar, zzdzo zzdzoVar) {
        this.zzj = context;
        this.zza = zzfpsVar;
        this.zzh = zzeplVar;
        this.zzb = zzddbVar;
        this.zzc = zzfsiVar;
        this.zzd = zzfsmVar;
        this.zzg = zzcydVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzemfVar;
        this.zzk = zzfqqVar;
        this.zzl = zzeovVar;
        this.zzm = zzdzoVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    static String zzb(zzfky zzfkyVar) {
        String string = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgH)).booleanValue() ? "No ad config." : "No fill.";
        zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
        int i = zzfkqVar.zzf;
        if (i == 0) {
            string = str;
        } else if (i >= 200 && i < 300) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgG)).booleanValue()) {
                string = str;
            }
        } else if (i < 300 || i >= 400) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
            sb.append("Received error HTTP response code: ");
            sb.append(i);
            string = sb.toString();
        } else {
            string = "No location header to follow redirect or too many redirects.";
        }
        zzfkp zzfkpVar = zzfkqVar.zzj;
        return zzfkpVar != null ? zzfkpVar.zza() : string;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfky zzfkyVar = (zzfky) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() && (bundle = zzfkyVar.zzb.zzd) != null) {
            this.zzm.zzg(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcT)).booleanValue()) {
            this.zzm.zzf(zzdzc.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = zzb(zzfkyVar);
        zzemf zzemfVar = this.zzi;
        zzfkx zzfkxVar = zzfkyVar.zzb;
        zzfkq zzfkqVar = zzfkxVar.zzb;
        zzemfVar.zza(zzfkqVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjI)).booleanValue() && (i = zzfkqVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzhcf.zzc(new zzepp(3, strZzb));
        }
        String str = zzfkqVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeE)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfkn zzfknVar : zzfkxVar.zza) {
                zzemfVar.zzb(zzfknVar);
                Iterator it = zzfknVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzemfVar.zze(zzfknVar, 0L, zzfmi.zzd(1, null, null));
                        break;
                    }
                    zzema zzemaVarZza = this.zzg.zza(zzfknVar.zzb, (String) it.next());
                    if (zzemaVarZza != null && zzemaVarZza.zza(zzfkyVar, zzfknVar)) {
                        break;
                    }
                }
            }
        } else {
            zzemfVar.zzc(str, zzfkxVar.zza);
        }
        zzddb zzddbVar = this.zzb;
        zzctu zzctuVar = new zzctu(zzfkyVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzddbVar.zzq(zzctuVar, executor);
        if (zzfkqVar.zzr > 1) {
            return this.zzl.zza(zzfkyVar);
        }
        String strZzb2 = zzb(zzfkyVar);
        zzfps zzfpsVar = this.zza;
        zzfpm zzfpmVar = zzfpm.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfpsVar);
        zzfoz zzfozVarZzi = zzfpd.zza(zzhcf.zzc(new zzepp(3, strZzb2)), zzfpmVar, zzfpsVar).zzi();
        final zzepl zzeplVar = this.zzh;
        zzeplVar.zza();
        int i2 = 0;
        for (final zzfkn zzfknVar2 : zzfkxVar.zza) {
            for (String str2 : zzfknVar2.zza) {
                final zzema zzemaVarZza2 = this.zzg.zza(zzfknVar2.zzb, str2);
                if (zzemaVarZza2 != null && zzemaVarZza2.zza(zzfkyVar, zzfknVar2)) {
                    zzfpj zzfpjVarZza = zzfpsVar.zza(zzfpm.RENDER_CONFIG_WATERFALL, zzfozVarZzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzfozVarZzi = zzfpjVarZza.zza(sb.toString()).zzg(Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzepr
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return this.zza.zzc(zzfknVar2, zzfkyVar, zzemaVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzeplVar);
        zzfozVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeplVar.zzb();
            }
        }, executor);
        return zzfozVarZzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfkn zzfknVar, zzfky zzfkyVar, zzema zzemaVar, Throwable th) {
        zzfqg zzfqgVarZzn = zzfqg.zzn(this.zzj, 12);
        zzfqgVarZzn.zzi(zzfknVar.zzE);
        zzfqgVarZzn.zza();
        ListenableFuture listenableFutureZzi = zzhcf.zzi(zzemaVar.zzb(zzfkyVar, zzfknVar), zzfknVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfkyVar, zzfknVar, listenableFutureZzi, this.zzc);
        zzfqp.zzd(listenableFutureZzi, this.zzk, zzfqgVarZzn);
        return listenableFutureZzi;
    }
}
