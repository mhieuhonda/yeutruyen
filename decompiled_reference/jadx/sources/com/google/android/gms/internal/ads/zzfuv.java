package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfuv {
    private final zzfvh zza;
    private final zzfvh zzb;
    private final boolean zzc;
    private final zzfuz zzd;
    private final zzfvc zze;

    private zzfuv(zzfuz zzfuzVar, zzfvc zzfvcVar, zzfvh zzfvhVar, zzfvh zzfvhVar2, boolean z) {
        this.zzd = zzfuzVar;
        this.zze = zzfvcVar;
        this.zza = zzfvhVar;
        if (zzfvhVar2 == null) {
            this.zzb = zzfvh.NONE;
        } else {
            this.zzb = zzfvhVar2;
        }
        this.zzc = z;
    }

    public static zzfuv zza(zzfuz zzfuzVar, zzfvc zzfvcVar, zzfvh zzfvhVar, zzfvh zzfvhVar2, boolean z) {
        zzfws.zzb(zzfuzVar, "CreativeType is null");
        zzfws.zzb(zzfvcVar, "ImpressionType is null");
        zzfws.zzb(zzfvhVar, "Impression owner is null");
        if (zzfvhVar == zzfvh.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfuzVar == zzfuz.DEFINED_BY_JAVASCRIPT && zzfvhVar == zzfvh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfvcVar == zzfvc.DEFINED_BY_JAVASCRIPT && zzfvhVar == zzfvh.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfuv(zzfuzVar, zzfvcVar, zzfvhVar, zzfvhVar2, z);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfwo.zzc(jSONObject, "impressionOwner", this.zza);
        zzfwo.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        zzfwo.zzc(jSONObject, "creativeType", this.zzd);
        zzfwo.zzc(jSONObject, "impressionType", this.zze);
        zzfwo.zzc(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
