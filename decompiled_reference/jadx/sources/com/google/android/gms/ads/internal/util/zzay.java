package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatu;
import com.google.android.gms.internal.ads.zzatz;
import com.google.android.gms.internal.ads.zzaua;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzfzu;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzay extends zzaua {
    private final Context zzb;

    private zzay(Context context, zzatz zzatzVar) {
        super(zzatzVar);
        this.zzb = context;
    }

    public static zzato zzb(Context context) {
        zzato zzatoVar = new zzato(new zzauh(new File(zzfzu.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new zzay(context, new zzaum(null, null)), 4);
        zzatoVar.zza();
        return zzatoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaua, com.google.android.gms.internal.ads.zzate
    public final zzath zza(zzatl zzatlVar) throws zzatu {
        if (zzatlVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfz), zzatlVar.zzh())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzay.zza();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 13400000)) {
                    zzath zzathVarZza = new zzbrv(context).zza(zzatlVar);
                    if (zzathVarZza != null) {
                        String strZzh = zzatlVar.zzh();
                        String.valueOf(strZzh);
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(strZzh)));
                        return zzathVarZza;
                    }
                    String strZzh2 = zzatlVar.zzh();
                    String.valueOf(strZzh2);
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(strZzh2)));
                }
            }
        }
        return super.zza(zzatlVar);
    }
}
