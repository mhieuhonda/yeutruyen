package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbup {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbun();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbuo();
    private final zzbub zzc;

    public zzbup(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfqt zzfqtVar) {
        this.zzc = new zzbub(context, versionInfoParcel, str, zza, zzb, zzfqtVar);
    }

    public final zzbuf zza(String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        return new zzbut(this.zzc, str, zzbuiVar, zzbuhVar);
    }

    public final zzbuy zzb() {
        return new zzbuy(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
