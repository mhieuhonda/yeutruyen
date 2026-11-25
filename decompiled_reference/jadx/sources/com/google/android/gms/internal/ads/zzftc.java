package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzftc {
    private final Map zza;
    private final zzfum zzb;
    private final zzftn zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;
    private final zzfsx zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;

    zzftc(zzfum zzfumVar, zzftn zzftnVar, Context context, Clock clock, zzfsx zzfsxVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfumVar;
        this.zzc = zzftnVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzfsxVar;
        this.zzj = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzl(boolean z) {
        ArrayList arrayList = new ArrayList();
        Map map = this.zza;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(((Map) it.next()).values());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzful zzfulVar = (zzful) arrayList.get(i);
            if (z) {
                zzfulVar.zzj();
            } else {
                zzfulVar.zzi();
            }
        }
    }

    private final Object zzn(Class cls, AdFormat adFormat, String str) {
        zzftn zzftnVar = this.zzc;
        Clock clock = this.zzg;
        zzftnVar.zze(clock.currentTimeMillis(), ExifInterface.GPS_MEASUREMENT_2D);
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return null;
            }
            zzful zzfulVar = (zzful) ((Map) map.get(adFormat)).get(str);
            if (zzfulVar != null && adFormat.equals(zzfulVar.zzq())) {
                zzftt zzfttVar = new zzftt(zzfulVar.zzr(), zzfulVar.zzq());
                zzfttVar.zza(str);
                zzftu zzftuVar = new zzftu(zzfttVar, null);
                zzftnVar.zzf(clock.currentTimeMillis(), zzftuVar, zzfulVar.zzs(), zzfulVar.zzt(), ExifInterface.GPS_MEASUREMENT_2D);
                try {
                    String strZzl = zzfulVar.zzl();
                    Object objZzg = zzfulVar.zzg();
                    Object objCast = objZzg == null ? null : cls.cast(objZzg);
                    if (objCast != null) {
                        zzftnVar.zzh(clock.currentTimeMillis(), zzfulVar.zzs(), zzfulVar.zzt(), strZzl, zzftuVar, ExifInterface.GPS_MEASUREMENT_2D);
                    }
                    return objCast;
                } catch (ClassCastException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PreloadAdManager.pollAd");
                    String name = cls.getName();
                    String.valueOf(name);
                    com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(name)), e);
                }
            }
            return null;
        }
    }

    private final boolean zzo(AdFormat adFormat) {
        int iMax;
        Map map = this.zza;
        int size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfB)).intValue(), 1);
        } else if (iOrdinal == 2) {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfC)).intValue(), 1);
        } else if (iOrdinal != 5) {
            iMax = 0;
        } else {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfD)).intValue(), 1);
        }
        return size < iMax;
    }

    public final boolean zza(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        int iZzT;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzL)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new zzfta(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzL)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzftb(this));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return false;
        }
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                if (!((Map) map.get(adFormat)).containsKey(str)) {
                    if (zzo(adFormat)) {
                        if (zzfpVar.zze) {
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzT)).booleanValue() && (iZzT = this.zzj.zzT()) > 0) {
                                zzfpVar = zzfpVar.zza(iZzT);
                            }
                        }
                        zzful zzfulVarZzb = this.zzb.zzb(str, zzfpVar, zzceVar);
                        if (zzfulVarZzb != null) {
                            AtomicInteger atomicInteger = this.zzh;
                            if (atomicInteger != null) {
                                zzfulVarZzb.zzn(atomicInteger.get());
                            }
                            zzftn zzftnVar = this.zzc;
                            zzfulVarZzb.zzm(zzftnVar);
                            synchronized (map) {
                                if (!((Map) map.get(adFormat)).containsKey(str) && zzo(adFormat)) {
                                    ((Map) map.get(adFormat)).put(str, zzfulVarZzb);
                                    zzfsx zzfsxVar = this.zzi;
                                    if (zzfsxVar != null) {
                                        zzfsxVar.zze(str, adFormat, zzfulVarZzb);
                                    } else {
                                        zzfulVarZzb.zzd();
                                    }
                                    zzftt zzfttVar = new zzftt(zzfpVar.zza, adFormat);
                                    zzfttVar.zza(str);
                                    zzftnVar.zza(zzfpVar.zzd, this.zzg.currentTimeMillis(), new zzftu(zzfttVar, null), ExifInterface.GPS_MEASUREMENT_2D);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb(AdFormat adFormat, String str) {
        zzftu zzftuVar;
        Clock clock = this.zzg;
        long jCurrentTimeMillis = clock.currentTimeMillis();
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzful zzfulVar = (zzful) ((Map) map.get(adFormat)).get(str);
            String strZzl = zzfulVar == null ? null : zzfulVar.zzl();
            boolean z = strZzl != null && adFormat.equals(zzfulVar.zzq());
            Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzfulVar == null) {
                zzftuVar = null;
            } else {
                zzftt zzfttVar = new zzftt(zzfulVar.zzr(), adFormat);
                zzfttVar.zza(str);
                zzftuVar = new zzftu(zzfttVar, null);
            }
            this.zzc.zzd(zzfulVar == null ? 0 : zzfulVar.zzs(), zzfulVar != null ? zzfulVar.zzt() : 0, jCurrentTimeMillis, lValueOf, strZzl, zzftuVar, ExifInterface.GPS_MEASUREMENT_2D);
            return z;
        }
    }

    public final zzccp zzc(String str) {
        return (zzccp) zzn(zzccp.class, AdFormat.REWARDED, str);
    }

    public final zzbgq zzd(String str) {
        return (zzbgq) zzn(zzbgq.class, AdFormat.APP_OPEN_AD, str);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzn(com.google.android.gms.ads.internal.client.zzbu.class, AdFormat.INTERSTITIAL, str);
    }

    public final com.google.android.gms.ads.internal.client.zzfp zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                zzful zzfulVar = (zzful) ((Map) map.get(adFormat)).get(str);
                this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfulVar == null ? null : zzfulVar.zzr(), adFormat, zzfulVar == null ? -1 : zzfulVar.zzs(), zzfulVar != null ? zzfulVar.zzt() : -1);
                if (zzfulVar != null) {
                    return zzfulVar.zzo();
                }
            }
        }
        return null;
    }

    public final int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return 0;
            }
            zzful zzfulVar = (zzful) ((Map) map.get(adFormat)).get(str);
            int iZzt = zzfulVar != null ? zzfulVar.zzt() : 0;
            this.zzc.zzp(iZzt, this.zzg.currentTimeMillis(), str, zzfulVar == null ? null : zzfulVar.zzr(), adFormat, zzfulVar == null ? -1 : zzfulVar.zzs());
            return iZzt;
        }
    }

    public final Map zzh(int i) {
        HashMap map = new HashMap();
        Map map2 = this.zza;
        AdFormat adFormat = AdFormat.getAdFormat(i);
        synchronized (map2) {
            if (adFormat != null) {
                if (map2.containsKey(adFormat)) {
                    for (zzful zzfulVar : ((Map) map2.get(adFormat)).values()) {
                        map.put(zzfulVar.zzp(), zzfulVar.zzo());
                    }
                    this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        }
    }

    public final boolean zzi(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzful zzfulVar = (zzful) ((Map) map.get(adFormat)).remove(str);
            if (zzfulVar == null) {
                return false;
            }
            zzfulVar.zzh();
            zzfsx zzfsxVar = this.zzi;
            if (zzfsxVar != null) {
                zzfsxVar.zzf(zzfulVar);
            }
            int iZzt = zzfulVar.zzt();
            zzfulVar.zzv();
            this.zzc.zzm(this.zzg.currentTimeMillis(), str, zzfulVar.zzr(), adFormat, zzfulVar.zzs(), iZzt);
            return true;
        }
    }

    public final void zzj(int i) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return;
        }
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                Map map2 = (Map) map.get(adFormat);
                int size = map2.size();
                if (size == 0) {
                    return;
                }
                zzgwt zzgwtVarZzq = zzgwt.zzq(map2.values());
                map2.clear();
                int size2 = zzgwtVarZzq.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zzful zzfulVar = (zzful) zzgwtVarZzq.get(i2);
                    if (zzfulVar != null) {
                        zzfulVar.zzh();
                        zzfsx zzfsxVar = this.zzi;
                        if (zzfsxVar != null) {
                            zzfsxVar.zzf(zzfulVar);
                        }
                        zzfulVar.zzv();
                        String strZzp = zzfulVar.zzp();
                        String.valueOf(strZzp);
                        String strValueOf = String.valueOf(strZzp);
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                    }
                }
                String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
                this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
            }
        }
    }

    final /* synthetic */ void zzk(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzC)).booleanValue()) {
            zzl(z);
        }
    }
}
