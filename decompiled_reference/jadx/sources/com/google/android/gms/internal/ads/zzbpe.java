package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpe implements zzbpx {
    zzbpe() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (zzclbVar.zzaz() != null) {
            zzclbVar.zzaz().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzclbVar.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzM = zzclbVar.zzM();
        if (zzmVarZzM != null) {
            zzmVarZzM.zzb();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
