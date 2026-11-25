package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftn {
    private final zzdzt zza;

    zzftn(zzdzt zzdztVar, Context context) {
        this.zza = zzdztVar;
    }

    private final void zzw(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", str);
        zzdzsVarZza.zzc("pat", Long.toString(j));
        zzdzsVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdzsVarZza.zzc("max_ads", Integer.toString(i));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i2));
        zzdzsVarZza.zzc("pas", Integer.toString(i3));
        zzdzsVarZza.zzc("pv", ExifInterface.GPS_MEASUREMENT_2D);
        zzdzsVarZza.zzc("ad_unit_id", str3);
        zzdzsVarZza.zzc("pid", str2);
        zzdzsVarZza.zzd();
    }

    private final void zzx(String str, String str2, long j, int i, int i2, String str3, zzftu zzftuVar, String str4) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(str2, Long.toString(j));
        if (zzftuVar != null) {
            zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
            zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
            zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        }
        zzdzsVarZza.zzc("action", str);
        if (str3 != null) {
            zzdzsVarZza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zzdzsVarZza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zzdzsVarZza.zzc("cache_size", Integer.toString(i2));
        }
        zzdzsVarZza.zzc("pv", str4);
        zzdzsVarZza.zzd();
    }

    private final void zzy(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", str);
        zzdzsVarZza.zzc("pat", Long.toString(j));
        zzdzsVarZza.zzc("pid", str2);
        zzdzsVarZza.zzc("ad_unit_id", str3);
        zzdzsVarZza.zzc("max_ads", Integer.toString(i));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i2));
        zzdzsVarZza.zzc("tpcnt", Integer.toString(i4));
        zzdzsVarZza.zzc("mpl", Integer.toString(i5));
        if (adFormat != null) {
            zzdzsVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            zzdzsVarZza.zzc("nptr", Integer.toString(i3));
        }
        zzdzsVarZza.zzd();
    }

    public final void zza(int i, long j, zzftu zzftuVar, String str) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "start_preload");
        zzdzsVarZza.zzc("sp_ts", Long.toString(j));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("max_ads", Integer.toString(i));
        zzdzsVarZza.zzc("pv", str);
        zzdzsVarZza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "start_preload");
        zzdzsVarZza.zzc("sp_ts", Long.toString(j));
        zzdzsVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String lowerCase = adFormat.name().toLowerCase(Locale.ENGLISH);
            String.valueOf(lowerCase);
            String strValueOf = String.valueOf(lowerCase);
            zzdzsVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdzsVarZza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzftu zzftuVar) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "cache_resize");
        zzdzsVarZza.zzc("cs_ts", Long.toString(j));
        zzdzsVarZza.zzc("orig_ma", Integer.toString(i));
        zzdzsVarZza.zzc("max_ads", Integer.toString(i2));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("pv", "1");
        zzdzsVarZza.zzd();
    }

    public final void zzd(int i, int i2, long j, Long l, String str, zzftu zzftuVar, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("plaac_ts", Long.toString(j));
        zzdzsVarZza.zzc("max_ads", Integer.toString(i));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i2));
        zzdzsVarZza.zzc("action", "is_ad_available");
        if (zzftuVar != null) {
            zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
            zzdzsVarZza.zzc("pid", zzftuVar.zzc());
            zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        }
        if (l != null) {
            zzdzsVarZza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zzdzsVarZza.zzc("gqi", str);
        }
        zzdzsVarZza.zzc("pv", str2);
        zzdzsVarZza.zzd();
    }

    public final void zze(long j, String str) {
        zzx("poll_ad", "ppacwe_ts", j, -1, -1, null, null, ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final void zzf(long j, zzftu zzftuVar, int i, int i2, String str) {
        zzx("poll_ad", "ppac_ts", j, i, i2, null, zzftuVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzftu zzftuVar, String str2) {
        zzx("poll_ad", "psvroc_ts", j, i, i2, str, zzftuVar, str2);
    }

    public final void zzh(long j, int i, int i2, String str, zzftu zzftuVar, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("ppla_ts", Long.toString(j));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("max_ads", Integer.toString(i));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i2));
        zzdzsVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdzsVarZza.zzc("gqi", str);
        }
        zzdzsVarZza.zzc("pv", str2);
        zzdzsVarZza.zzd();
    }

    public final void zzi(long j, String str, zzftu zzftuVar, int i, int i2, String str2) {
        zzx("paa", "pano_ts", j, i, i2, str, zzftuVar, str2);
    }

    public final void zzj(long j, zzftu zzftuVar, int i, String str) {
        zzx("pae", "paeo_ts", j, i, 0, null, zzftuVar, str);
    }

    public final void zzk(long j, zzftu zzftuVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, String str) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "pftla");
        zzdzsVarZza.zzc("pftlat_ts", Long.toString(j));
        zzdzsVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("max_ads", Integer.toString(i));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i2));
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("pv", str);
        zzdzsVarZza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i) {
        zzw("pda", j, null, null, adFormat, -1, -1, i, ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzw("pd", j, str, str2, adFormat, i, i2, 1, ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final void zzn(AdFormat adFormat, long j, int i) {
        zzw("pgcs", j, null, null, adFormat, -1, -1, i, ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final void zzo(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzw("pgc", j, str, str2, adFormat, i, i2, 1, ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final void zzp(int i, long j, String str, String str2, AdFormat adFormat, int i2) {
        zzw("pnav", j, str, str2, adFormat, i2, i, 1, ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final void zzq(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4) {
        zzy("acmpa", j, str, str2, adFormat, i, i2, 0, i3, i4);
    }

    public final void zzr(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzy("acmpr", j, str, str2, adFormat, i, i2, i3, i4, i5);
    }

    public final void zzs(long j, int i, int i2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "acmlr");
        zzdzsVarZza.zzc("pat", Long.toString(j));
        zzdzsVarZza.zzc("mpl", Integer.toString(i));
        zzdzsVarZza.zzc("pas", Integer.toString(i2));
        zzdzsVarZza.zzd();
    }

    public final void zzt(long j, long j2, long j3, long j4, long j5) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "iic");
        zzdzsVarZza.zzc("pat", Long.toString(j));
        zzdzsVarZza.zzc("bot", Long.toString(j2));
        zzdzsVarZza.zzc("cim", Long.toString(j3));
        zzdzsVarZza.zzc("mbot", Long.toString(j4));
        zzdzsVarZza.zzc("mim", Long.toString(j5));
        zzdzsVarZza.zzd();
    }

    public final void zzu(long j, AdFormat adFormat, String str, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "poact");
        zzdzsVarZza.zzc("ad_unit_id", str2);
        zzdzsVarZza.zzc("pid", str);
        zzdzsVarZza.zzc("poact_ts", Long.toString(j));
        if (adFormat != null) {
            zzdzsVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        zzdzsVarZza.zzd();
    }

    public final void zzv(long j, AdFormat adFormat, String str, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("action", "poac");
        zzdzsVarZza.zzc("ad_unit_id", str2);
        zzdzsVarZza.zzc("pid", str);
        if (adFormat != null) {
            zzdzsVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        zzdzsVarZza.zzd();
    }
}
