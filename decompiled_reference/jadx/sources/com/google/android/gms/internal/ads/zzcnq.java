package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcnq implements zzcrx {

    @Nullable
    private static zzcnq zza;

    private static synchronized zzcnq zzH(Context context, @Nullable zzbvj zzbvjVar, int i, boolean z, int i2, zzcpa zzcpaVar) {
        zzcnq zzcnqVar = zza;
        if (zzcnqVar != null) {
            return zzcnqVar;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        zzbix.zza(context);
        if (((Boolean) zzbkp.zze.zze()).booleanValue()) {
            zzbii.zza(context);
        }
        zzfmc zzfmcVarZza = zzfmc.zza(context);
        VersionInfoParcel versionInfoParcelZzb = zzfmcVarZza.zzb(261710000, false, i2);
        zzfmcVarZza.zzc(zzbvjVar);
        zzcpp zzcppVar = new zzcpp(null);
        zzcnr zzcnrVar = new zzcnr();
        zzcnrVar.zza(versionInfoParcelZzb);
        zzcnrVar.zzb(context);
        zzcnrVar.zzc(jCurrentTimeMillis);
        zzcppVar.zza(new zzcns(zzcnrVar, null));
        zzcppVar.zzb(new zzcqm(zzcpaVar));
        zzcnq zzcnqVarZzc = zzcppVar.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpw)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zze().zza(zzfoi.zzc(), zzcnqVarZzc.zzD(), context);
            com.google.android.gms.ads.internal.zzt.zze().zzb();
        }
        ((zzeej) ((zzcpe) zzcnqVarZzc).zzs.zzb()).zza();
        ((zzcnj) ((zzcpe) zzcnqVarZzc).zzr.zzb()).zza(context, versionInfoParcelZzb);
        com.google.android.gms.ads.internal.zzt.zzh().zzf(context, versionInfoParcelZzb, zzcnqVarZzc.zzD());
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
        com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzt.zzg().zza(context);
        com.google.android.gms.ads.internal.zzt.zzA().zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpS)).booleanValue()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpT);
            if (!str.isEmpty()) {
                if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                    zzcnqVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpR)).booleanValue()) {
                zzcnqVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzqc)).booleanValue()) {
            ((DeviceTierManager) ((zzcpe) zzcnqVarZzc).zzm.zzb()).initialize();
        }
        ((com.google.android.gms.ads.internal.util.zzbz) ((zzcpe) zzcnqVarZzc).zzay.zzb()).zza();
        zzceh.zzb(context);
        com.google.android.gms.ads.internal.zzt.zzD().zza(zzcnqVarZzc.zzD());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhn)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbn)).booleanValue()) {
                new zzekc(context, versionInfoParcelZzb, new zzbhw(new zzbib(context)), new zzejh(new zzejd(context), (zzhcp) ((zzcpe) zzcnqVarZzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpL)).booleanValue()) {
            zzcnqVarZzc.zzg().zza();
        }
        zza = zzcnqVarZzc;
        return zzcnqVarZzc;
    }

    public static zzcnq zza(Context context, @Nullable zzbvj zzbvjVar, int i) {
        return zzH(context, zzbvjVar, 261710000, false, i, new zzcpa());
    }

    public abstract zzebk zzA();

    public abstract zzflw zzB();

    public abstract zzedw zzC();

    public abstract zzdzt zzD();

    abstract zzdxc zzE();

    @Override // com.google.android.gms.internal.ads.zzcrx
    public final zzcfa zzF() {
        return zzG();
    }

    public abstract zzcfa zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdga zzd();

    public abstract zzcqy zze();

    public abstract zzftl zzf();

    public abstract zzeho zzg();

    public abstract zzehq zzh();

    public abstract zzcww zzi();

    public abstract zzfhc zzj();

    public abstract zzcvf zzk();

    public abstract zzffo zzl();

    public abstract zzdnn zzm();

    public abstract zzfis zzn();

    public abstract zzdoj zzo();

    public abstract zzdvy zzp();

    public abstract zzfkg zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzw zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzap zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzt();

    public abstract zzekz zzu();

    public abstract zzfmf zzv();

    public abstract zzecz zzw();

    public abstract zzfqt zzx();

    @Override // com.google.android.gms.internal.ads.zzcrx
    public final zzfdu zzy(zzcbk zzcbkVar, int i) {
        return zzz(new zzfex(zzcbkVar, i));
    }

    protected abstract zzfdu zzz(zzfex zzfexVar);
}
