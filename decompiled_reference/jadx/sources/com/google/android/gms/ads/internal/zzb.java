package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcdu;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzcdu zzc;
    private final zzcar zzd = new zzcar(false, Collections.emptyList());

    public zzb(Context context, zzcdu zzcduVar, zzcar zzcarVar) {
        this.zza = context;
        this.zzc = zzcduVar;
    }

    private final boolean zzd() {
        zzcdu zzcduVar = this.zzc;
        return (zzcduVar != null && zzcduVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcdu zzcduVar = this.zzc;
            if (zzcduVar != null) {
                zzcduVar.zze(str, null, 3);
                return;
            }
            zzcar zzcarVar = this.zzd;
            if (!zzcarVar.zza || (list = zzcarVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzO(context, "", strReplace);
                }
            }
        }
    }
}
