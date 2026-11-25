package com.google.android.gms.internal.ads;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzebu implements zzhcc {
    final /* synthetic */ zzece zza;

    zzebu(zzece zzeceVar) {
        Objects.requireNonNull(zzeceVar);
        this.zza = zzeceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        synchronized (this) {
            zzece zzeceVar = this.zza;
            zzeceVar.zzn(true);
            zzeceVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeceVar.zzo()));
            zzeceVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzece zzeceVar = this.zza;
            zzeceVar.zzn(true);
            zzeceVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeceVar.zzo()));
            zzeceVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}
