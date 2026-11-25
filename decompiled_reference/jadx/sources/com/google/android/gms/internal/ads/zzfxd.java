package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfxd extends zzfxe {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfxd(zzfww zzfwwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfwwVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
