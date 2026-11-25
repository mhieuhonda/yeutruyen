package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzdlv;
import com.google.android.gms.internal.ads.zzfoz;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzay implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzay(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzay zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzay(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfps zzfpsVar = (zzfps) this.zza.zzb();
        zzba zzbaVarZzb = ((zzbb) this.zzb).zzb();
        zzdce zzdceVarZzb = ((zzdcf) this.zzc).zzb();
        zzdlv zzdlvVar = (zzdlv) this.zzd.zzb();
        zzfoz zzfozVarZzi = zzfpsVar.zza(zzfpm.GENERATE_SIGNALS, zzdceVarZzb.zzb()).zzc(zzbaVarZzb).zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS).zzi();
        zzhcf.zzr(zzfozVarZzi, new zzar(zzdlvVar), zzcfy.zza);
        return zzfozVarZzi;
    }
}
