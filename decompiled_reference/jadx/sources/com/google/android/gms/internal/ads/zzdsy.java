package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdsy implements zzhcc {
    final /* synthetic */ zzcgd zza;

    zzdsy(zzdtk zzdtkVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzclb zzclbVar = (zzclb) obj;
        final zzcgd zzcgdVar = this.zza;
        if (zzclbVar == null) {
            zzcgdVar.zzd(new zzepp(1, "Missing webview from video view future."));
        } else {
            zzclbVar.zzab("/video", new zzcit(new zzcis() { // from class: com.google.android.gms.internal.ads.zzdsx
                @Override // com.google.android.gms.internal.ads.zzcis
                public final /* synthetic */ void zza(String str) {
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaUrl", str);
                    zzcgdVar.zzc(bundle);
                }
            }));
            zzclbVar.zzI();
        }
    }
}
