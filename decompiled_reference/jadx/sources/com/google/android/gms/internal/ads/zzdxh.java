package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxh {
    private final Map zza = new HashMap();

    zzdxh() {
    }

    final synchronized void zza(String str, @Nullable zzfme zzfmeVar) {
        zzbxx zzbxxVarZzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbxx zzbxxVarZzC = null;
        if (zzfmeVar == null) {
            zzbxxVarZzB = null;
        } else {
            try {
                zzbxxVarZzB = zzfmeVar.zzB();
            } catch (zzfln unused) {
                zzbxxVarZzB = null;
            }
        }
        if (zzfmeVar != null) {
            try {
                zzbxxVarZzC = zzfmeVar.zzC();
            } catch (zzfln unused2) {
            }
        }
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkS)).booleanValue()) {
            if (zzfmeVar == null) {
                z = false;
            } else {
                try {
                    zzfmeVar.zzn();
                } catch (zzfln unused3) {
                    z = false;
                }
            }
        }
        this.zza.put(str, new zzdxg(str, zzbxxVarZzB, zzbxxVarZzC, z));
    }

    final synchronized void zzb(String str, zzbxi zzbxiVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdxg(str, zzbxiVar.zzf(), zzbxiVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdxg zzc(String str) {
        return (zzdxg) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbxx zzbxxVar;
        zzdxg zzdxgVarZzc = zzc(str);
        return (zzdxgVarZzc == null || (zzbxxVar = zzdxgVarZzc.zzb) == null) ? "" : zzbxxVar.toString();
    }
}
