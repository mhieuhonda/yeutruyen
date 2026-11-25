package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeuq implements zzfcq {
    final zzflg zza;
    private final long zzb;
    private final long zzc;

    public zzeuq(zzflg zzflgVar, long j, long j2) {
        this.zza = zzflgVar;
        this.zzb = j;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflg zzflgVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzflgVar.zzg);
        int i = zzflgVar.zzp.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.zzb;
        bundle.putLong("start_signals_timestamp", j);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpi)).booleanValue()) {
            bundle.putLong("tsi", j - this.zzc);
        }
        zzflv.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzflv.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j2 = zzmVar.zzb;
        zzflv.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j2)), j2 != -1);
        zzflv.zzf(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        zzflv.zzc(bundle, "cust_gender", i3, i3 != -1);
        zzflv.zzg(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        zzflv.zzc(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        zzflv.zzc(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzflv.zzb(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzflv.zze(bundle, ImagesContract.URL, zzmVar.zzl);
        zzflv.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzflv.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzflv.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzflv.zze(bundle, "request_agent", zzmVar.zzp);
        zzflv.zze(bundle, "request_pkg", zzmVar.zzq);
        zzflv.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 >= 8) {
            int i6 = zzmVar.zzt;
            zzflv.zzc(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            zzflv.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        int i7 = zzmVar.zzB;
        zzflv.zzc(bundle, "tfat", i7, i7 != -1);
        Bundle bundle3 = zzflgVar.zze;
        zzflv.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzflv.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzflv.zze(bundle, "plid", bundle3.getString("plid"));
        zzflv.zzc(bundle, "s2s_rr", 1, zzflgVar.zzv && !(zzmVar.zzs == null && zzmVar.zzx == null));
    }
}
