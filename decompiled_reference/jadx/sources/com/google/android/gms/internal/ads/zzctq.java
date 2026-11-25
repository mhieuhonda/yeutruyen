package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctq {
    zzcah zza;
    zzcah zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzelw zze;
    private final zzdwv zzf;
    private final zzhcp zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzctq(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzelw zzelwVar, zzdwv zzdwvVar, zzhcp zzhcpVar, zzhcp zzhcpVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzelwVar;
        this.zzf = zzdwvVar;
        this.zzg = zzhcpVar;
        this.zzh = zzhcpVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlO));
    }

    private final ListenableFuture zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlO)) || this.zzd.zzx()) {
                return zzhcf.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlP), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzj(zzhbx.zzw(this.zze.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctk
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctl
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlQ), "11");
            return zzhcf.zza(builderBuildUpon.toString());
        } catch (Exception e) {
            return zzhcf.zzc(e);
        }
    }

    public final void zza(String str, zzfsm zzfsmVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzhcf.zzr(zzhcf.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlU)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzctj(this, zzfsmVar, str, zzvVar), this.zzg);
    }

    public final ListenableFuture zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzhcf.zza(str) : zzhcf.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctp
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ ListenableFuture zzd(String str, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcto
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th);
            }
        });
        return zzhcf.zza(str);
    }

    final /* synthetic */ ListenableFuture zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlQ), "10");
            return zzhcf.zza(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlR), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlQ), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlS))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlT));
        }
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctm
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlQ);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzhcf.zza(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlQ), "9");
        return zzhcf.zza(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlV)).booleanValue();
        Context context = this.zzc;
        if (zBooleanValue) {
            zzcah zzcahVarZzc = zzcaf.zzc(context);
            this.zzb = zzcahVarZzc;
            zzcahVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzcah zzcahVarZza = zzcaf.zza(context);
            this.zza = zzcahVarZza;
            zzcahVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlV)).booleanValue();
        Context context = this.zzc;
        if (zBooleanValue) {
            zzcah zzcahVarZzc = zzcaf.zzc(context);
            this.zzb = zzcahVarZzc;
            zzcahVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzcah zzcahVarZza = zzcaf.zza(context);
            this.zza = zzcahVarZza;
            zzcahVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzhcp zzj() {
        return this.zzg;
    }
}
