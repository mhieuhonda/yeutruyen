package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqq implements zzbpx {
    private final zzbqp zza;

    public zzbqq(zzbqp zzbqpVar) {
        this.zza = zzbqpVar;
    }

    public static void zzb(zzclb zzclbVar, zzbqp zzbqpVar) {
        zzclbVar.zzab("/reward", new zzbqq(zzbqpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzcci zzcciVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (!TextUtils.isEmpty(str2)) {
                zzcciVar = new zzcci(str2, i);
            }
        } catch (NumberFormatException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e);
        }
        this.zza.zzb(zzcciVar);
    }
}
