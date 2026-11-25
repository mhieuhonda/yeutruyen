package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzchv {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzbjj zze;
    private final zzbjm zzf;
    private final com.google.android.gms.ads.internal.util.zzbf zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcha zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzos)).intValue();
    }

    public zzchv(Context context, VersionInfoParcel versionInfoParcel, String str, zzbjm zzbjmVar, zzbjj zzbjjVar) {
        com.google.android.gms.ads.internal.util.zzbe zzbeVar = new com.google.android.gms.ads.internal.util.zzbe();
        zzbeVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbeVar.zza("1_5", 1.0d, 5.0d);
        zzbeVar.zza("5_10", 5.0d, 10.0d);
        zzbeVar.zza("10_20", 10.0d, 20.0d);
        zzbeVar.zza("20_30", 20.0d, 30.0d);
        zzbeVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbeVar.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbjmVar;
        this.zze = zzbjjVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzat);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.zzh[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse frame hash target time number.", e);
                this.zzh[i] = -1;
            }
        }
    }

    public final void zza(zzcha zzchaVar) {
        zzbjm zzbjmVar = this.zzf;
        zzbje.zza(zzbjmVar, this.zze, "vpc2");
        this.zzj = true;
        zzbjmVar.zzd("vpn", zzchaVar.zza());
        this.zzo = zzchaVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbje.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zza());
        for (com.google.android.gms.ads.internal.util.zzbd zzbdVar : this.zzg.zzb()) {
            String str = zzbdVar.zza;
            String.valueOf(str);
            String strValueOf = String.valueOf(str);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbdVar.zze));
            String.valueOf(str);
            String strValueOf2 = String.valueOf(str);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbdVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzc().zzg(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                this.zzp = true;
                return;
            }
            String str2 = this.zzi[i];
            if (str2 != null) {
                Long lValueOf = Long.valueOf(jArr[i]);
                StringBuilder sb = new StringBuilder(lValueOf.toString().length() + 3);
                sb.append("fh_");
                sb.append(lValueOf);
                bundle.putString("fh_".concat(lValueOf.toString()), str2);
            }
            i++;
        }
    }

    public final void zzd(zzcha zzchaVar) {
        int i = 0;
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbje.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long jNanoTime = com.google.android.gms.ads.internal.zzt.zzk().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zza(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = jNanoTime;
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzau)).longValue();
        long jZzh = zzchaVar.zzh();
        int i2 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && jLongValue > Math.abs(jZzh - this.zzh[i2])) {
                int i3 = 8;
                Bitmap bitmap = zzchaVar.getBitmap(8, 8);
                long j = 63;
                int i4 = i;
                long j2 = 0;
                while (i4 < i3) {
                    while (i < i3) {
                        int pixel = bitmap.getPixel(i, i4);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i++;
                        i3 = 8;
                    }
                    i4++;
                    i = 0;
                    i3 = 8;
                }
                strArr[i2] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i2++;
            i = 0;
        }
    }

    public final void zze() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbje.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzf() {
        this.zzn = false;
    }
}
