package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbov implements zzbpx {
    zzbov() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgrz zzgrzVarZzl = zzgsa.zzl();
        zzgrzVarZzl.zzb((String) map.get("appId"));
        zzgrzVarZzl.zzg(zzclbVar.getWidth());
        zzgrzVarZzl.zza(zzclbVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgrzVarZzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzgrzVarZzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzgrzVarZzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzgrzVarZzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzgrzVarZzl.zzh((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzclbVar, zzgrzVarZzl.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
