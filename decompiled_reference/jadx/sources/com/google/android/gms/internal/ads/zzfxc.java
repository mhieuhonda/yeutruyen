package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxc implements zzfwd {
    private static final zzfxc zza = new zzfxc();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfwy();
    private static final Runnable zzl = new zzfwz();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfwv zzh = new zzfwv();
    private final zzfwf zzg = new zzfwf();
    private final zzfww zzi = new zzfww(new zzfxf());

    zzfxc() {
    }

    public static zzfxc zzb() {
        return zza;
    }

    private final void zzk(View view, zzfwe zzfweVar, JSONObject jSONObject, int i, boolean z) {
        zzfweVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final void zza(View view, zzfwe zzfweVar, JSONObject jSONObject, boolean z) {
        zzfwv zzfwvVar;
        int iZzl;
        boolean z2;
        if (zzfwt.zza(view) != null || (iZzl = (zzfwvVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfweVar.zza(view);
        zzfwo.zze(jSONObject, jSONObjectZza);
        String strZzg = zzfwvVar.zzg(view);
        if (strZzg != null) {
            zzfwo.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e) {
                zzfwp.zza("Error with setting has window focus", e);
            }
            Boolean boolValueOf = Boolean.valueOf(this.zzh.zzk(strZzg));
            if (boolValueOf.booleanValue()) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e2) {
                    zzfwp.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzh.zzf();
            this = this;
        } else {
            zzfwu zzfwuVarZzi = zzfwvVar.zzi(view);
            if (zzfwuVarZzi != null) {
                zzfvv zzfvvVarZzb = zzfwuVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfwuVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzc.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfvvVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfvvVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfvvVarZzb.zzd());
                } catch (JSONException e3) {
                    zzfwp.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfweVar, jSONObjectZza, iZzl, z || z2);
        }
        this.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfwx(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        zzfxc zzfxcVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfuy zzfuyVar : zzfvs.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfwv zzfwvVar = this.zzh;
        zzfwvVar.zzd();
        zzfwf zzfwfVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfwe zzfweVarZza = zzfwfVar.zza();
        if (zzfwvVar.zzb().size() > 0) {
            for (String str : zzfwvVar.zzb()) {
                JSONObject jSONObjectZza = zzfweVarZza.zza(null);
                View viewZzh = zzfwvVar.zzh(str);
                zzfwe zzfweVarZzb = zzfwfVar.zzb();
                String strZzc = zzfwvVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfweVarZzb.zza(viewZzh);
                    zzfwo.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfwp.zza("Error with setting not visible reason", e);
                    }
                    zzfwo.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfwo.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfwv zzfwvVar2 = this.zzh;
        if (zzfwvVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfweVarZza.zza(null);
            zzfxcVar = this;
            zzfxcVar.zzk(null, zzfweVarZza, jSONObjectZza3, 1, false);
            zzfwo.zzf(jSONObjectZza3);
            zzfxcVar.zzi.zza(jSONObjectZza3, zzfwvVar2.zza(), jNanoTime);
        } else {
            zzfxcVar = this;
            zzfxcVar.zzi.zzc();
        }
        zzfwvVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzfxcVar.zzj;
        List<zzfxb> list = zzfxcVar.zzd;
        if (list.size() > 0) {
            for (zzfxb zzfxbVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfxbVar.zzb();
                if (zzfxbVar instanceof zzfxa) {
                    ((zzfxa) zzfxbVar).zza();
                }
            }
        }
        zzfwc.zza().zzc();
    }

    final /* synthetic */ zzfww zzh() {
        return this.zzi;
    }
}
