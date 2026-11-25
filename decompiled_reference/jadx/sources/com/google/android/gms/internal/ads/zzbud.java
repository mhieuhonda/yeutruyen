package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbud implements zzbsu, zzbuc {
    private final zzbuc zza;
    private final HashSet zzb = new HashSet();

    public zzbud(zzbuc zzbucVar) {
        this.zza = zzbucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu, com.google.android.gms.internal.ads.zzbtf
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            String string = ((zzbpx) simpleEntry.getValue()).toString();
            String.valueOf(string);
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(string)));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbpx) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzm(String str, zzbpx zzbpxVar) {
        this.zza.zzm(str, zzbpxVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbpxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzn(String str, zzbpx zzbpxVar) {
        this.zza.zzn(str, zzbpxVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbpxVar));
    }
}
