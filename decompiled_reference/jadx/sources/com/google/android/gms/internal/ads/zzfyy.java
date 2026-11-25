package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfyy implements zzfxt {
    private final Object zza;
    private final zzfyz zzb;
    private final zzfzk zzc;
    private final zzfxq zzd;
    private final boolean zze;

    zzfyy(Object obj, zzfyz zzfyzVar, zzfzk zzfzkVar, zzfxq zzfxqVar, boolean z) {
        this.zza = obj;
        this.zzb = zzfyzVar;
        this.zzc = zzfzkVar;
        this.zzd = zzfxqVar;
        this.zze = z;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzazl zzazlVarZza = zzazm.zza();
        zzazlVarZza.zzd(5);
        zzazlVarZza.zza(zzidl.zzt(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzazm) zzazlVarZza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        Map mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        bArrZzj = zzj(null, mapZzb);
        if (this.zze) {
            mapZzb.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        bArrZzj = zzj(null, mapZzc);
        if (this.zze) {
            mapZzc.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzd = this.zzc.zzd();
        mapZzd.put("f", "c");
        mapZzd.put("ctx", context);
        mapZzd.put("cs", str2);
        mapZzd.put("aid", null);
        mapZzd.put("view", view);
        mapZzd.put("act", activity);
        bArrZzj = zzj(null, mapZzd);
        if (this.zze) {
            mapZzd.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfzi {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put("aid", null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfzi(2005, e);
        }
    }

    final zzfyz zze() {
        return this.zzb;
    }

    final synchronized boolean zzf() throws zzfzi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfzi(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfzi {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfzi(2003, e);
        }
    }

    public final synchronized int zzh() throws zzfzi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfzi(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }
}
