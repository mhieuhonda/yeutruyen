package com.google.android.gms.internal.ads;

import com.tekartik.sqflite.Constant;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzebv extends zzbrz {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfqg zzd;
    final /* synthetic */ zzcgd zze;
    final /* synthetic */ zzece zzf;

    zzebv(zzece zzeceVar, Object obj, String str, long j, zzfqg zzfqgVar, zzcgd zzcgdVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfqgVar;
        this.zze = zzcgdVar;
        Objects.requireNonNull(zzeceVar);
        this.zzf = zzeceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zze() {
        synchronized (this.zza) {
            zzece zzeceVar = this.zzf;
            String str = this.zzb;
            zzeceVar.zzm(str, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzeceVar.zzr().zzb(str);
            zzeceVar.zzs().zzb(str);
            zzfqt zzfqtVarZzt = zzeceVar.zzt();
            zzfqg zzfqgVar = this.zzd;
            zzfqgVar.zzd(true);
            zzfqtVarZzt.zzb(zzfqgVar.zzm());
            this.zze.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzece zzeceVar = this.zzf;
            String str2 = this.zzb;
            zzeceVar.zzm(str2, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzeceVar.zzr().zzc(str2, Constant.PARAM_ERROR);
            zzeceVar.zzs().zzc(str2, Constant.PARAM_ERROR);
            zzfqt zzfqtVarZzt = zzeceVar.zzt();
            zzfqg zzfqgVar = this.zzd;
            zzfqgVar.zzk(str);
            zzfqgVar.zzd(false);
            zzfqtVarZzt.zzb(zzfqgVar.zzm());
            this.zze.zzc(false);
        }
    }
}
