package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzerf extends zzcvz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzerf(zzerj zzerjVar, View view, zzclb zzclbVar, zzcxy zzcxyVar, zzfko zzfkoVar) {
        super(view, null, zzcxyVar, zzfkoVar);
        Objects.requireNonNull(zzerjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvz
    public final zzdel zze(Set set) {
        return new zzdel(Collections.emptySet());
    }
}
