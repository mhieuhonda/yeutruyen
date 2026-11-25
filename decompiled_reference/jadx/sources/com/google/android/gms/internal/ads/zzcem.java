package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcem {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcdz zzd;

    zzcem(Context context, zzcdz zzcdzVar) {
        this.zzc = context;
        this.zzd = zzcdzVar;
    }

    final synchronized void zza(zzcek zzcekVar) {
        this.zzb.add(zzcekVar);
    }

    final synchronized void zzb(String str) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            return;
        }
        boolean zEquals = Objects.equals(str, "__default__");
        Context context = this.zzc;
        SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
        zzcej zzcejVar = new zzcej(this, str);
        map.put(str, zzcejVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcejVar);
    }

    final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
