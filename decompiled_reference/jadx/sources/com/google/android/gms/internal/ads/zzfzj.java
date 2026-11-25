package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzj {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfzk zzc;
    private final zzfxq zzd;
    private final zzfxl zze;
    private final boolean zzf;
    private zzfyy zzg;
    private final Object zzh = new Object();

    public zzfzj(Context context, zzfzk zzfzkVar, zzfxq zzfxqVar, zzfxl zzfxlVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfzkVar;
        this.zzd = zzfxqVar;
        this.zze = zzfxlVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(zzfyz zzfyzVar) throws zzfzi {
        if (zzfyzVar.zza() == null) {
            throw new zzfzi(4010, "mc");
        }
        String strZza = zzfyzVar.zza().zza();
        HashMap map = zza;
        Class cls = (Class) map.get(strZza);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfyzVar.zzb())) {
                throw new zzfzi(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzc = zzfyzVar.zzc();
                if (!fileZzc.exists()) {
                    fileZzc.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(zzfyzVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZza, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfzi(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfzi(2026, e2);
        }
    }

    public final boolean zza(zzfyz zzfyzVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfyy zzfyyVar = new zzfyy(zzd(zzfyzVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfyzVar.zzd(), null, new Bundle(), 2), zzfyzVar, this.zzc, this.zzd, this.zzf);
                if (!zzfyyVar.zzf()) {
                    throw new zzfzi(4000, "init failed");
                }
                int iZzh = zzfyyVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfzi(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfyy zzfyyVar2 = this.zzg;
                    if (zzfyyVar2 != null) {
                        try {
                            zzfyyVar2.zzg();
                        } catch (zzfzi e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzg = zzfyyVar;
                    } else {
                        this.zzg = zzfyyVar;
                    }
                    throw th;
                }
                this.zzd.zzb(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfzi(2004, e2);
            }
        } catch (zzfzi e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final zzfxt zzb() {
        zzfyy zzfyyVar;
        synchronized (this.zzh) {
            zzfyyVar = this.zzg;
        }
        return zzfyyVar;
    }

    public final zzfyz zzc() {
        synchronized (this.zzh) {
            zzfyy zzfyyVar = this.zzg;
            if (zzfyyVar == null) {
                return null;
            }
            return zzfyyVar.zze();
        }
    }
}
