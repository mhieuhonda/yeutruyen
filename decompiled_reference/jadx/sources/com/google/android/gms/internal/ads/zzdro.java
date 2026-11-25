package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdro {
    private final zzdwq zza;
    private final zzdvf zzb;
    private final zzcux zzc;
    private final zzdqj zzd;

    public zzdro(zzdwq zzdwqVar, zzdvf zzdvfVar, zzcux zzcuxVar, zzdqj zzdqjVar) {
        this.zza = zzdwqVar;
        this.zzb = zzdvfVar;
        this.zzc = zzcuxVar;
        this.zzd = zzdqjVar;
    }

    public final View zza() throws zzclq {
        zzclb zzclbVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzclbVarZza.zzE().setVisibility(8);
        zzclbVarZza.zzab("/sendMessageToSdk", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzclb) obj, map);
            }
        });
        zzclbVarZza.zzab("/adMuted", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdri
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzclb) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zzclbVarZza);
        zzbpx zzbpxVar = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrj
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzclb zzclbVar = (zzclb) obj;
                zzcmz zzcmzVarZzP = zzclbVar.zzP();
                final zzdro zzdroVar = this.zza;
                zzcmzVarZzP.zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdrm
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    public final /* synthetic */ void zza(boolean z, int i, String str, String str2) {
                        zzdroVar.zzf(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzclbVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzclbVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdvf zzdvfVar = this.zzb;
        zzdvfVar.zzh(weakReference, "/loadHtml", zzbpxVar);
        zzdvfVar.zzh(new WeakReference(zzclbVarZza), "/showOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd((zzclb) obj, map);
            }
        });
        zzdvfVar.zzh(new WeakReference(zzclbVarZza), "/hideOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrl
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zze((zzclb) obj, map);
            }
        });
        return zzclbVarZza.zzE();
    }

    final /* synthetic */ void zzb(zzclb zzclbVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzclb zzclbVar, Map map) {
        this.zzd.zzt();
    }

    final /* synthetic */ void zzd(zzclb zzclbVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzclbVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zze(zzclb zzclbVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzclbVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    final /* synthetic */ void zzf(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", map2);
    }
}
