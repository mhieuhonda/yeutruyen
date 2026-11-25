package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatu;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbg implements zzatp {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final void zza(zzatu zzatuVar) {
        String str = this.zza;
        String string = zzatuVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        String string2 = sb.toString();
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
        this.zzb.zza((Object) null);
    }
}
