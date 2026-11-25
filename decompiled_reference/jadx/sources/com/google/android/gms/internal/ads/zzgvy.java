package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgvy extends zzgvk {
    final /* synthetic */ zzgwa zza;
    private final Object zzb;
    private int zzc;

    zzgvy(zzgwa zzgwaVar, int i) {
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
        this.zzb = zzgwaVar.zzo(i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzgwa zzgwaVar = this.zza;
            if (i < zzgwaVar.size() && Objects.equals(this.zzb, zzgwaVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.Map.Entry
    public final Object getValue() {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgwaVar.zzp(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzgwaVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgwaVar.zzp(i);
        zzgwaVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
