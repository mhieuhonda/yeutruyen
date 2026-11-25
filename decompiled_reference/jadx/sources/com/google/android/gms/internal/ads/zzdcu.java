package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcu {
    public static final zzcdu zza(Context context, VersionInfoParcel versionInfoParcel, zzfkn zzfknVar, zzcdq zzcdqVar) {
        zzcdr zzcdrVar = zzfknVar.zzA;
        if (zzcdrVar == null) {
            return null;
        }
        zzfks zzfksVar = zzfknVar.zzs;
        return new zzcdp(context, versionInfoParcel, zzcdrVar, zzfksVar != null ? zzfksVar.zzb : null, zzcdqVar);
    }
}
