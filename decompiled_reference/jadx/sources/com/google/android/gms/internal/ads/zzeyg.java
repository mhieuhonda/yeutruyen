package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyg implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzeyg(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzeyg zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzeyg(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcs zzfcsVarZzb = ((zzeuk) this.zza).zzb();
        zzexg zzexgVar = (zzexg) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains(ExifInterface.GPS_MEASUREMENT_2D)) {
            zzfcsVarZzb = zzexgVar;
        }
        zzinh.zzb(zzfcsVarZzb);
        return zzfcsVarZzb;
    }
}
