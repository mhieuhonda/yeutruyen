package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdla extends zzdix implements zzbex {
    private final Map zzb;
    private final Context zzc;
    private final zzfkn zzd;

    public zzdla(Context context, Set set, zzfkn zzfknVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfknVar;
    }

    public final synchronized void zza(View view) {
        Map map = this.zzb;
        zzbez zzbezVar = (zzbez) map.get(view);
        if (zzbezVar == null) {
            zzbez zzbezVar2 = new zzbez(this.zzc, view);
            zzbezVar2.zza(this);
            map.put(view, zzbezVar2);
            zzbezVar = zzbezVar2;
        }
        if (this.zzd.zzX) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcf)).booleanValue()) {
                zzbezVar.zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzce)).longValue());
                return;
            }
        }
        zzbezVar.zze();
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbez) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final synchronized void zzdj(final zzbew zzbewVar) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzbex) obj).zzdj(zzbewVar);
            }
        });
    }
}
